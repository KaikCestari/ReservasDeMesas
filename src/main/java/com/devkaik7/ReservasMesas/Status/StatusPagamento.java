package com.devkaik7.ReservasMesas.Status;

public enum StatusPagamento {
    PENDENTE, PAGO,CANCELADO;

    @Override
    public String toString() {
        return "StatusPagamento{}";
    }
}
