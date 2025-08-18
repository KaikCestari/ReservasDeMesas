package com.devkaik7.ReservasMesas.Controller;

import com.devkaik7.ReservasMesas.Dtos.ReservaDto;
import com.devkaik7.ReservasMesas.Entity.Reserva;
import com.devkaik7.ReservasMesas.Services.ReservaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ("/reservas"))
public class ReservaController {

    @Autowired
    public ReservaServices services;

    @PostMapping
    public ResponseEntity<Reserva> adicionarReserva(@RequestBody ReservaDto dto){
        Reserva reserva = services.adicionarReserva(dto);
        return ResponseEntity.ok(reserva);
    }
}
