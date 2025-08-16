package com.devkaik7.ReservasMesas.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @NotBlank(message = "Email Obrigatorio")
    private String email;
    @NotBlank(message = "Digite seu telefone")
    private String telefone;
    @OneToOne(mappedBy = "cliente")
    private Reserva reserva;


    public Cliente() {
    }

    public Cliente(Long id, String name, String email, String telefone, Reserva reserva) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
        this.reserva = reserva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
