package com.devkaik7.ReservasMesas.Dtos;

public class MesasDto {
    private Long numero;
    private Long capacidade;


    public MesasDto() {
    }

    public MesasDto(Long numero, Long capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
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
