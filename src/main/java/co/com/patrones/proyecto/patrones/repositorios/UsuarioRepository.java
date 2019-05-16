/**
 * 
 */
package co.com.patrones.proyecto.patrones.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.patrones.proyecto.patrones.entidades.Usuario;


/**
 * @author Javeriana
 *
 */

@Repository(value="Usuario")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findByUsernameAndPassword(String username,String password);
	public Usuario findUsuarioByUsername(String username);
}
