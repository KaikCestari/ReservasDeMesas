package com.devkaik7.ReservasMesas.Status;

public enum UsuarioRoles {
    ADMIN("admin"),
    ATENDENTE("atendente");

 private String role;

    UsuarioRoles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
