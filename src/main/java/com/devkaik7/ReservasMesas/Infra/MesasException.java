package com.devkaik7.ReservasMesas.Infra;

public class MesasException extends RuntimeException{
    public MesasException() {
        super("Capacidade MAxima Atigida");
    }

    public MesasException(String message) {
        super(message);
    }
}
