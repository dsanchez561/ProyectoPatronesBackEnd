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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.patrones.proyecto.patrones.log.Log;
import co.com.patrones.proyecto.patrones.implement.UsuarioImpl;

/**
 * @author asus
 *
 */
@CrossOrigin(allowCredentials="false")
@RestController
@RequestMapping("/usuario")
public class RestUsuario {

	@Autowired
	private UsuarioImpl usuarioImpl;

	@Log
	private Logger log;

	/**
	 * Metodo que permite listar los eventos a los que esta suscrito el usuario
	 * actual
	 * 
	 * @return devuelve la estado del servidor
	 * @throws IOException
	 */
	@RequestMapping(value = "/registrarUsuario/{nombre}/{apellidos}/{username}/{email}/{password}", method = RequestMethod.GET)
	public ResponseEntity<List<String>> registrarUsuario(@PathVariable("nombre") String nombre,
			@PathVariable("apellidos") String apellidos, @PathVariable("username") String username,
			@PathVariable("email") String email, @PathVariable("password") String password) {
		try {
			usuarioImpl.registrarUsuario(nombre, apellidos, username, email, password);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
