/**
 * 
 */
package co.com.patrones.proyecto.patrones.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.patrones.proyecto.patrones.entidades.Usuario;
import co.com.patrones.proyecto.patrones.log.Log;
import co.com.patrones.proyecto.patrones.repositorios.UsuarioRepository;
import org.slf4j.Logger;

/**
 * @author asus
 *
 */
@Component
public class UsuarioImpl {
	
	@Log
	private Logger log;
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void registrarUsuario(String nombre, String apellidos, String username, String email, String password) {
		 Usuario usuarioNuevo = new Usuario();
		 
		 usuarioNuevo.setUsername(username);
		 usuarioNuevo.setPassword(password);
		 usuarioNuevo.setEmail(email);
		 
		 usuarioRepository.save(usuarioNuevo);
	}
	
}
