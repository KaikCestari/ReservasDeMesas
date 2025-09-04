package com.devkaik7.ReservasMesas.Dtos;

import com.devkaik7.ReservasMesas.Status.UsuarioStatus;

public class UsuarioDto {

    private String email;
    private  String name;
    private UsuarioStatus roles;

    public UsuarioDto() {
    }

    public UsuarioDto(String email, String name, UsuarioStatus roles) {
        this.email = email;
        this.name = name;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsuarioStatus getRoles() {
        return roles;
    }

    public void setRoles(UsuarioStatus roles) {
        this.roles = roles;
    }
}
