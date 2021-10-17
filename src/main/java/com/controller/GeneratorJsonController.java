package com.controller;

import com.services.GeneratorJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/json/v1")
public class GeneratorJsonController {
    @Autowired
    private GeneratorJsonService service;


    @PostMapping
    public ResponseEntity<String> postJson(@RequestBody String json) throws IOException {
        service.generatedJsonUsingUrl(json);
        return ResponseEntity.ok("Sucesso");
    }

    @GetMapping
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok("Ola");
    }

}
