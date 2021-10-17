package com.controller;

import com.request.JsonRequest;
import com.services.GeneratorJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/json/v1")
public class GeneratorJsonController {
    @Autowired
    private GeneratorJsonService service;


    @PostMapping
    public ResponseEntity<String> postJson(@RequestBody JsonRequest json) throws IOException {
        /*String nome = "emojis.json";
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Disposition", "attachment; filename=\"" + nome + "\"");
        /*var blob = new Blob([data], {type: "text/plain;charset=utf-8"});
        saveAs(blob, "corpus_download.json", true);
        return ResponseEntity.ok().headers(responseHeaders).body(service.generatedJsonUsingUrl(json));*/
        service.generatedJsonUsingUrl(json);

        //System.out.println(json);
        return ResponseEntity.ok("Sucesso");
    }

    @GetMapping
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok("Ola");
    }

}
