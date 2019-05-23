/**
 * 
 */
package co.com.patrones.proyecto.patrones.implement;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import co.com.patrones.proyecto.patrones.entidades.Libro;
import co.com.patrones.proyecto.patrones.entidades.LibroComprarPojo;
import co.com.patrones.proyecto.patrones.repositorios.LibroRepository;

/**
 * @author asus
 *
 */
@Component
public class LibroImpl {

	@Autowired
	private LibroRepository libroRepository;

	public List<Libro> getLibros() {
		return libroRepository.getLibrosDisponibles(new Sort(Direction.ASC, "id"));
	}

	public void cargarImagenes() {
		try {
			for(Libro libro:libroRepository.findAll()) {
				libro.setImagen(getImagenLibro("imagenes/"+libro.getNombreArchivo()));
				libroRepository.save(libro);
			}
		} catch (IOException e) {
//			log.error(e.getMessage(), e);
		}
	}
	
	public byte[] getImagenLibro(final String ruta) throws IOException {
		final ClassPathResource resource = new ClassPathResource(ruta);
	    BufferedImage imageOnDisk = ImageIO.read(resource.getFile());
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(imageOnDisk, "jpg", baos);
        baos.flush();
	    return baos.toByteArray();
	}

	public void pagar(List<LibroComprarPojo> lista){
		for(LibroComprarPojo lcp:lista) {
			Libro libro = libroRepository.findById(lcp.getId()).get();
			libro.setCantidad(libro.getCantidad()-lcp.getCantidad());
			libroRepository.save(libro);
		}
	}

	
}
