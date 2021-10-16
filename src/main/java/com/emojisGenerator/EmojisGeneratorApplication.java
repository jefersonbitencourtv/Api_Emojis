package com.emojisGenerator;

import com.services.GeneratorJson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class EmojisGeneratorApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(EmojisGeneratorApplication.class, args);
		GeneratorJson generatorJson = new GeneratorJson();
		generatorJson.generatedJson();
	}

}
