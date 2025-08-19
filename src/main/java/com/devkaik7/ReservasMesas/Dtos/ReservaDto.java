package com.devkaik7.ReservasMesas.Dtos;

import com.devkaik7.ReservasMesas.Entity.Cliente;
import com.devkaik7.ReservasMesas.Status.StatusMesa;

import java.time.LocalTime;

public class ReservaDto {

        private String horario;
        private String statusMesa;
        private String clienteName;
      private Long clienteId;

    public ReservaDto() {
    }

    public ReservaDto(String horario, String statusMesa, String clienteName, Long clienteId) {
        this.horario = horario;
        this.statusMesa = statusMesa;
        this.clienteName = clienteName;
        this.clienteId = clienteId;
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



    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteName() {
        return clienteName;
    }

    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }
}



