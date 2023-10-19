package proyecto2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("proyecto2.repository")
@EntityScan("proyecto2.model")
@SpringBootApplication
public class ProyectoTIC2 {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoTIC2.class, args);
	}

}
