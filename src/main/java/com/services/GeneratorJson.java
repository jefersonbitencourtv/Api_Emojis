package com.services;

import com.entities.Emoji;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GeneratorJson {

    public void generatedJson() throws IOException {
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

}
