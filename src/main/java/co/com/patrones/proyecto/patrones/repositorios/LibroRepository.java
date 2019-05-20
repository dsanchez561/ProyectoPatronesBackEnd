/**
 * 
 */
package co.com.patrones.proyecto.patrones.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.patrones.proyecto.patrones.entidades.Libro;

/**
 * @author asus
 *
 */
@Repository(value="Libro")
public interface LibroRepository extends JpaRepository<Libro, Long> {

	@Query("SELECT l FROM Libro l")
	List<Libro> getLibros();

}
