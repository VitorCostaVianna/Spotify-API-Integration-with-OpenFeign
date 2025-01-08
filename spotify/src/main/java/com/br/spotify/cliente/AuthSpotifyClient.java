package com.br.spotify.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
    name = "authSpotifyClient",
    url = "https://accounts.spotify.com"
)
public interface AuthSpotifyClient {
   
    @PostMapping(value = "/api/token" , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE) // "application/x-www-form-urlencoded"
    LoginResponse login(@RequestBody LoginRequest loginRequest); 
}
