package com.br.spotify.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    name = "googleClient",
    url = "https://www.google.com"
)
public interface GoogleCliente {
   
    @GetMapping
    String helloWorld();
}
