package com.devkaik7.ReservasMesas.Dtos;

import java.time.LocalTime;

public class PagamentoDto {
    private Long valor;
    private String statusPagamento;
    private String metodoPagamento;
    private LocalTime data;
    private Long reservaId;

    public PagamentoDto() {
    }

    public PagamentoDto(Long valor, String statusPagamento, String metodoPagamento, LocalTime data, Long reservaId) {
        this.valor = valor;
        this.statusPagamento = statusPagamento;
        this.metodoPagamento = metodoPagamento;
        this.data = data;
        this.reservaId = reservaId;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }


    public Long getReservaId() {
        return reservaId;
    }

    public void setReservaId(Long reservaId) {
        this.reservaId = reservaId;
    }

    public LocalTime getData() {
        return data;
    }

    public void setData(LocalTime data) {
        this.data = data;
    }
}
