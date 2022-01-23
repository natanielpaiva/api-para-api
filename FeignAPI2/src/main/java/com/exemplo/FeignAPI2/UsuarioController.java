package com.exemplo.FeignAPI2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    ConectaAPI conectaAPI;

    @GetMapping
    public Usuario getUsuario(){
        return  conectaAPI.buscarUsuario();
    }

}
