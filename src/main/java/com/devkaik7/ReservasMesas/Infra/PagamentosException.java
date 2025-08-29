package com.devkaik7.ReservasMesas.Infra;

public class PagamentosException extends RuntimeException{

    public PagamentosException() {
        super("Impossivel Encontrar Pagamento");
    }

    public PagamentosException(String message) {
        super(message);
    }
}
