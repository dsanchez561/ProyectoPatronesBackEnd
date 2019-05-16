package co.com.patrones.proyecto.patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("co.com.patrones.proyecto.patrones.entidades")
@EnableJpaRepositories("co.com.patrones.proyecto.patrones.repositorios")
@ComponentScan("co.com.patrones.proyecto.patrones.seguridad")
@ComponentScan("co.com.patrones.proyecto.patrones.rest")
public class PatronesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}

}
