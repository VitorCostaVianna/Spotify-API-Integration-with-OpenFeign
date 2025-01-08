package com.br.spotify.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
    name = "albumSpotifyClient",
    url = "https://api.spotify.com"
)
public interface AlbumSpotifyCliente {
    
    @GetMapping(value = "v1/browse/new-releases")
    AlbumResponse getNewReleases(@RequestHeader("Authorization") String authorization);
}
