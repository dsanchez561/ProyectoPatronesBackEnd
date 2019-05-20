/**
 * 
 */
package co.com.patrones.proyecto.patrones.implement;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import co.com.patrones.proyecto.patrones.entidades.Libro;
import co.com.patrones.proyecto.patrones.log.Log;
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
		return libroRepository.findAll();
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

	
}
