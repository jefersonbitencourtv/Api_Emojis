package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmojisGeneratorApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmojisGeneratorApplication.class, args);
		//GeneratorJsonService generatorJsonService = new GeneratorJsonService();
		//generatorJsonService.generatedJsonUsingArchive();
	}

}
