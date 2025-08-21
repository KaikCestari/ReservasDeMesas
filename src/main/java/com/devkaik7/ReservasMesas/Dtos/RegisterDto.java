package com.devkaik7.ReservasMesas.Dtos;

import com.devkaik7.ReservasMesas.Status.UsuarioRoles;

public record RegisterDto(String login, String senha, UsuarioRoles role) {
}
