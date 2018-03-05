package br.com.security.jtw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class JtwApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtwApplication.class, args);
	}

	public String hello(){
		return "INICIALIZANDO A APLICAÇÃO";
	}
}
