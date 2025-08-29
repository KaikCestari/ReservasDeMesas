package com.devkaik7.ReservasMesas.Entity;

import com.devkaik7.ReservasMesas.Status.MetodoPagamento;
import com.devkaik7.ReservasMesas.Status.StatusPagamento;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.time.LocalTime;

@Entity
@Table(name = "tb_pagamento")
public class Pagamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;
    @Enumerated(EnumType.STRING)
    private MetodoPagamento metodo;
@Enumerated(EnumType.STRING)
    private StatusPagamento statusPagamento;
private LocalTime data;

private Long valor;

    public Pagamentos() {
    }

    public Pagamentos(Long id, Reserva reserva, MetodoPagamento metodo, StatusPagamento statusPagamento, LocalTime data, Long valor) {
        this.id = id;
        this.reserva = reserva;
        this.metodo = metodo;
        this.statusPagamento = statusPagamento;
        this.data = data;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPagamento metodo) {
        this.metodo = metodo;
    }


    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public LocalTime getData() {
        return data;
    }

    public void setData(LocalTime data) {
        this.data = data;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }
}
