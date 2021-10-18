package com.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

@Getter
@Setter
@ToString
@CrossOrigin(origins="*")
public class CampoAlterar {
    private String entrada;
    private String saida;
}
