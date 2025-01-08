package com.br.spotify.cliente;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {
    
    @JsonProperty("access_token")
    private String accessToken;

    public LoginResponse(String accessToken) {
        this.setAccessToken(accessToken);
    }

    public LoginResponse() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    
}
