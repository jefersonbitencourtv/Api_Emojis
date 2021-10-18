package com.request;

import com.entities.CampoAlterar;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@Getter
@Setter
@ToString
@CrossOrigin(origins="*")
public class JsonRequest {
    List<CampoAlterar> alterarCampo;
    JsonNode json;

}
