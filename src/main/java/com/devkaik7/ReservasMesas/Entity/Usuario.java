package com.devkaik7.ReservasMesas.Entity;

import com.devkaik7.ReservasMesas.Status.UsuarioStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String senha;
    @NotBlank(message = "Email Obrigatorio")
    private String email;
    @Enumerated(EnumType.STRING)
    private UsuarioStatus roles;


    public Usuario() {
    }

    public Usuario(Long id, String nome, String senha, String email, UsuarioStatus roles) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsuarioStatus getRoles() {
        return roles;
    }

    public void setRoles(UsuarioStatus roles) {
        this.roles = roles;
    }
}
