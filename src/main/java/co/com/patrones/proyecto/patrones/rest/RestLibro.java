/**
 * 
 */
package co.com.patrones.proyecto.patrones.rest;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.patrones.proyecto.patrones.entidades.Libro;
import co.com.patrones.proyecto.patrones.implement.LibroImpl;
import co.com.patrones.proyecto.patrones.log.Log;

/**
 * @author asus
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/libro")
public class RestLibro {
	
	@Log
	private Logger log;
	
	@Autowired
	private LibroImpl libroImpl;

	/**
	 * Metodo que permite listar los eventos a los que esta suscrito el usuario
	 * actual
	 * 
	 * @return devuelve la estado del servidor
	 * @throws IOException
	 */
	@RequestMapping(value = "/getLibros", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Libro>> getLibros() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(libroImpl.getLibros());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
