package com.devkaik7.ReservasMesas.Repository;

import com.devkaik7.ReservasMesas.Entity.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamentos,Long> {
}
