package com.devkaik7.ReservasMesas.Dtos;

import com.devkaik7.ReservasMesas.Entity.Cliente;
import com.devkaik7.ReservasMesas.Status.StatusMesa;

import java.time.LocalTime;

public class ReservaDto {
    private Long id;
    private LocalTime horario;
    private StatusMesa statusMesa;
    private Cliente cliente;

    public ReservaDto() {
    }

    public ReservaDto(Long id, LocalTime horario, StatusMesa statusMesa, Cliente cliente) {
        this.id = id;
        this.horario = horario;
        this.statusMesa = statusMesa;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public StatusMesa getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(StatusMesa statusMesa) {
        this.statusMesa = statusMesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
