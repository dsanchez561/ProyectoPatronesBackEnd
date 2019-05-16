package co.com.patrones.proyecto.patrones.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import co.com.patrones.proyecto.patrones.entidades.Usuario;
import co.com.patrones.proyecto.patrones.repositorios.UsuarioRepository;


@Service
public class RESTUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario loadUserByUsername(String username) {
		return usuarioRepository.findUsuarioByUsername(username);
	}

}
