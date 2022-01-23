package com.exemplo.FeignAPI2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "usuario", url = "http://localhost:8080")
public interface ConectaAPI {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Usuario buscarUsuario();

}
