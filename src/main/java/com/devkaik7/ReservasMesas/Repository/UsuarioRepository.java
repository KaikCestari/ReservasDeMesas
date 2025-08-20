package com.devkaik7.ReservasMesas.Repository;

import com.devkaik7.ReservasMesas.Entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuarios,Long> {
    UserDetails findByLogin(String email);
}
