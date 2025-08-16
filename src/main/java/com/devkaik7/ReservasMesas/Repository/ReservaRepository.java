package com.devkaik7.ReservasMesas.Repository;

import com.devkaik7.ReservasMesas.Entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
}
