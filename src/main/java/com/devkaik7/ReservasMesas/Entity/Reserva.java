package com.devkaik7.ReservasMesas.Entity;

import com.devkaik7.ReservasMesas.Status.StatusMesa;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tb_reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalTime horario;
    @Enumerated(EnumType.STRING) // <-- isso faz salvar como texto
    private StatusMesa statusMesa;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "cliente_id", unique = true)
    @JsonManagedReference
    private Cliente cliente;
   @ManyToOne
    @JoinColumn(name = "mesa_id")
   @JsonManagedReference
    private Mesas mesas;

    public Reserva() {
    }

    public Reserva(Long id, LocalTime horario, StatusMesa statusMesa, Cliente cliente) {
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

    public Mesas getMesas() {
        return mesas;
    }

    public void setMesas(Mesas mesas) {
        this.mesas = mesas;
    }
}
