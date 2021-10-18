package com.controller;

import com.request.JsonRequest;
import com.services.GeneratorJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/json/v1")
public class GeneratorJsonController {
    @Autowired
    private GeneratorJsonService service;


    @PostMapping
    public ResponseEntity<String> postJson(@RequestBody JsonRequest json) throws IOException {
        String nome = "emojis.json";
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Disposition", "attachment; filename=\"" + nome + "\"");
        String resposta = service.generatedJsonUsingUrl(json);
        System.out.println(resposta);
        return ResponseEntity.ok().headers(responseHeaders).body(resposta);
        //service.generatedJsonUsingUrl(json);

        //return ResponseEntity.ok("Sucesso");
    }

    @GetMapping
    public ResponseEntity<String> teste(){
        System.out.println("Testando");
        return ResponseEntity.ok("Ola");
    }

}
