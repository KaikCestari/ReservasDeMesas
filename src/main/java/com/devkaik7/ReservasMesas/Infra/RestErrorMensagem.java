package com.devkaik7.ReservasMesas.Infra;

import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;

public class RestErrorMensagem {
    private String messagem;
    private HttpStatus status;

    public RestErrorMensagem() {
    }

    public RestErrorMensagem(String messagem, HttpStatus status) {
        this.messagem = messagem;
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessagem() {
        return messagem;
    }

    public void setMessagem(String messagem) {
        this.messagem = messagem;
    }
}
