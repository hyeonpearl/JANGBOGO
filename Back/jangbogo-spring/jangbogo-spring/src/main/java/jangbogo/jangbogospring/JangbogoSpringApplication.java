package jangbogo.jangbogospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class 	JangbogoSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(JangbogoSpringApplication.class, args);
	}
}
