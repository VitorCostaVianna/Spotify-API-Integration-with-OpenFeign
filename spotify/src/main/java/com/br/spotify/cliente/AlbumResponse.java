package com.br.spotify.cliente;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AlbumResponse {
    
    private AlbumWrapper albums;

    public AlbumResponse() {
    }

    public AlbumResponse(AlbumWrapper albums) {
        this.setAlbums(albums);
    }

    public AlbumWrapper getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumWrapper albums) {
        this.albums = albums;
    }
}
