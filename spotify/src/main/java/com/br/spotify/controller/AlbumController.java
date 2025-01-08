package com.br.spotify.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.spotify.cliente.Album;
import com.br.spotify.cliente.AlbumResponse;
import com.br.spotify.cliente.AlbumSpotifyCliente;
import com.br.spotify.cliente.AuthSpotifyClient;
import com.br.spotify.cliente.LoginRequest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
    
    private final AuthSpotifyClient authSpotifyClient;

    private final AlbumSpotifyCliente albumSpotifyCliente;

    public AlbumController(AuthSpotifyClient authSpotifyClient,
                           AlbumSpotifyCliente albumSpotifyCliente) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyCliente = albumSpotifyCliente;
    }

    @GetMapping("/albums")
    public ResponseEntity<List<Album>> helloWorld(){
        
        var request = new LoginRequest(
            "client_credentials",
            "your_client_id",
            "your_client_secret"
        );

        var token = authSpotifyClient.login(request).getAccessToken();

        var response = albumSpotifyCliente.getNewReleases("Bearer " + token);
        
        return ResponseEntity.ok(response.getAlbums().getItems());     
    }
    
}
