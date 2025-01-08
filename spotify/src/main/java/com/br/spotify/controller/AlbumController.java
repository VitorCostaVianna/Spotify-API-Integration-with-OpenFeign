package com.br.spotify.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.spotify.cliente.AuthSpotifyClient;
import com.br.spotify.cliente.LoginRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
    
    private final AuthSpotifyClient authSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<String> helloWorld(){
        
        var request = new LoginRequest(
            "client_credentials",
            "10bf31ded0d74a6c8e69e7f8a748290e",
            "0eed604d7a5e4748a8cfee6756c7f49c"
        );
        
        return ResponseEntity.ok(authSpotifyClient.login(request).getAccessToken());     
    }
    
}
