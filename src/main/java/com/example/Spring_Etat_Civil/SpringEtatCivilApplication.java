package com.example.Spring_Etat_Civil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringEtatCivilApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEtatCivilApplication.class, args);
	}
	@GetMapping("/run")
	public String Affichage(){
		return "Never Give Up"; 
	}

}
