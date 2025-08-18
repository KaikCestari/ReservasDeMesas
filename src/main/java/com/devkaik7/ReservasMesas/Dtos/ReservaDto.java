package com.devkaik7.ReservasMesas.Dtos;

import com.devkaik7.ReservasMesas.Entity.Cliente;
import com.devkaik7.ReservasMesas.Status.StatusMesa;

import java.time.LocalTime;

public class ReservaDto {

        private String horario;
        private String statusMesa;
        private ClienteDto cliente;
      private Long clienteId;

    public ReservaDto() {
    }

    public ReservaDto(String horario, String statusMesa) {
        this.horario = horario;
        this.statusMesa = statusMesa;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(String statusMesa) {
        this.statusMesa = statusMesa;
    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
}



