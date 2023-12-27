package com.example.EstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class EstAppApplication {



	public static void main(String[] args) {
		SpringApplication.run(EstAppApplication.class, args);
	}

	@GetMapping(path = "/nominative/{word}")
	public String getNominative(@PathVariable String word) {

	}
}
