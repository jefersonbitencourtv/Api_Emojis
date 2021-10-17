package com.services;

import com.entities.CampoAlterar;
import com.entities.Emoji;
import com.google.gson.Gson;
import com.request.JsonRequest;
import org.springframework.stereotype.Service;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
@Service
public class GeneratorJsonService {

    public void generatedJsonUsingArchive() throws IOException {
        String json = String.join(" ",
                Files.readAllLines(
                        Paths.get("/Users/jvieira/Downloads/emojisGenerator/src/main/resources/emojis.json"),
                        StandardCharsets.UTF_8));

        //Campos que deseja alterar no arquivo json recebido
        json = json.replaceAll("emojis", "emoji");

        Emoji[] emojis = new Gson().fromJson(json, Emoji[].class);

        Gson gson = new Gson();

        String jsonArchive = gson.toJson(emojis);

        FileWriter file = new FileWriter("/Users/jvieira/Downloads/emojisGenerator/src/main/resources/emojis2.json");
        file.write(jsonArchive);
        file.flush();
        file.close();
    }

    public void generatedJsonUsingUrl(JsonRequest input) throws IOException {
        //Campos que deseja alterar no arquivo json recebido
        //input = input.replaceAll("emojis", "emoji");
        List<CampoAlterar> camposAlterar = input.getAlterarCampo();
        String json = input.getJson().toString();

        for(int i =0; i <= camposAlterar.size(); i= i+2){
            json = json.replaceAll(camposAlterar.get(i).getEntrada(),camposAlterar.get(i).getSaida());
        }

        Emoji[] emojis = new Gson().fromJson(json, Emoji[].class);
        Gson gson = new Gson();

        String jsonArchive = gson.toJson(emojis);

        FileWriter file = new FileWriter("/Users/jvieira/Downloads/emojisGenerator/src/main/resources/emojis2.json");
        file.write(jsonArchive);
        file.flush();
        file.close();
    }

}
