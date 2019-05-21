package co.com.patrones.proyecto.patrones;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import co.com.patrones.proyecto.patrones.entidades.Libro;
import co.com.patrones.proyecto.patrones.repositorios.LibroRepository;


/**
 * Clase Singleton encargada de ejecutar logica requerida al iniciar la
 * aplicación.
 * 
 * @author Javeriana
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StartUpInit {
	
	@Autowired
	private LibroRepository libroRepository;

	/**
	 * Método encargado de ejecutar los procesos que deben ser procesados al
	 * desplegar la aplicación
	 */
	@PostConstruct
	public void init() {
		cargarImagenes();
	}
	
	/**
	 * Método encargado de cargar las imagenes del sistema en la Base de Datos.
	 */
	private void cargarImagenes() {
//		log.info("Inicia la carga de las imagenes del sistema en la Base de Datos");
//		libroImpl.cargarImagenes();
		try {
			for(Libro libro:libroRepository.findAll()) {
				libro.setImagen(getImagenLibro("imagenes/"+libro.getNombreArchivo()));
				libroRepository.save(libro);
			}
		} catch (IOException e) {
//			log.error(e.getMessage(), e);
		}
//		log.info("Finaliza la carga de las imagenes del sistema en la Base de Datos");
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