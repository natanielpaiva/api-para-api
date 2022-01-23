package com.exemplo.FeignAPI1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @GetMapping
    public Usuario getUsuario(){
        return Usuario.builder()
                .nome("Nataniel")
                .idade(30L)
                .instagram("@nataniel.paiva")
                .build();
    }


}
