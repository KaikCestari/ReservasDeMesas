package com.devkaik7.ReservasMesas.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mesas")
public class Mesas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numero;
    private Long capacidade;
    @OneToMany(mappedBy = "mesas")
    private List<Reserva> reservas;

    public Mesas() {
    }

    public Mesas(Long id, Long numero, Long capacidade) {
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Long capacidade) {
        this.capacidade = capacidade;
    }
}
