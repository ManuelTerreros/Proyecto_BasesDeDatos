package co.edu.unbosque;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeBosqueApplication {

	// Se debió cambiar el puerto del Tomcat debido a que generaba un error de puertos 
	// Porque el SGDB también usa el puerto 8080.
	// El nuevo Puerto del Tomacat el el 8090.
	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HomeBosqueApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
        app.run(args);
	}

}
