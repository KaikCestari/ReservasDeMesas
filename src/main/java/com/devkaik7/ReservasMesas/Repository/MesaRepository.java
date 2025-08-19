package com.devkaik7.ReservasMesas.Repository;

import com.devkaik7.ReservasMesas.Entity.Mesas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesas,Long> {
}
