package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins="*")
public class EmojisGeneratorApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmojisGeneratorApplication.class, args);
		//GeneratorJsonService generatorJsonService = new GeneratorJsonService();
		//generatorJsonService.generatedJsonUsingArchive();
	}

}
