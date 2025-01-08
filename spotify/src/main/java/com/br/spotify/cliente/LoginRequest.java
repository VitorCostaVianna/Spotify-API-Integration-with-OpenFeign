package com.br.spotify.cliente;

import feign.form.FormProperty;

public class LoginRequest {

    // FormProperty is used to specify the name of the form field

    @FormProperty("grant_type")
    private String grantType;

    @FormProperty("client_id")
    private String clientId;

    @FormProperty("client_secret")
    private String clientSecret;

    public LoginRequest(String grantType, String clientId, String clientSecret) {
        this.setGrantType(grantType);
        this.setClientId(clientId);
        this.setClientSecret(clientSecret);
    }

    public LoginRequest() {
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    
}
