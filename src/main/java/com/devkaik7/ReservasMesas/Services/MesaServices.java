package com.devkaik7.ReservasMesas.Services;

import com.devkaik7.ReservasMesas.Entity.Mesas;
import com.devkaik7.ReservasMesas.Repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaServices {

    @Autowired
    MesaRepository mesaRepository;

    public Mesas postarMesas()
}
