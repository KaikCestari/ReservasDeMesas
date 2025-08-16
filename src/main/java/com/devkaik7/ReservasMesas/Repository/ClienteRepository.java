package com.devkaik7.ReservasMesas.Repository;
import com.devkaik7.ReservasMesas.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
