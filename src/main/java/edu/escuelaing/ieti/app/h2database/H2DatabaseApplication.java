package edu.escuelaing.ieti.app.h2database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DatabaseApplication.class, args);
		// Necessary to keep running the service, otherwise it will shutdown
		while(true){

		}
	}

}
