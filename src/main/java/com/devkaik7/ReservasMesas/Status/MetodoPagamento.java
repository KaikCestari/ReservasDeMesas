package com.devkaik7.ReservasMesas.Status;

public enum MetodoPagamento {
    DINHEIRO,
    CARTAO,
    PIX;

    @Override
    public String toString() {
        return "MetodoPagamento{}";
    }
}
