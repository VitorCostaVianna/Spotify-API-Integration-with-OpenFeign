package com.br.spotify.cliente;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Album {

    private String id;

    private String name;

    @JsonProperty("release_date")
    private String release_date;

    public Album() {
    }

    public Album(String id, String name, String release_date) {
        this.setId(id);
        this.setName(name);
        this.setRelease_date(release_date);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    

}
