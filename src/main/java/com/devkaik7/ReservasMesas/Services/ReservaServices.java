package com.devkaik7.ReservasMesas.Services;

import com.devkaik7.ReservasMesas.Dtos.ReservaDto;
import com.devkaik7.ReservasMesas.Entity.Cliente;
import com.devkaik7.ReservasMesas.Entity.Reserva;
import com.devkaik7.ReservasMesas.Repository.ClienteRepository;
import com.devkaik7.ReservasMesas.Repository.ReservaRepository;
import com.devkaik7.ReservasMesas.Status.StatusMesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class ReservaServices {
    @Autowired
    public ReservaRepository reservaRepository;
    @Autowired
    public ClienteRepository clienteRepository;

   public Reserva adicionarReserva(ReservaDto dto) {
       Reserva reserva = new Reserva();
       Cliente cliente = clienteRepository.findById(dto.getClienteId())
                       .orElseThrow(()-> new IllegalArgumentException("Cliente nao encontrado" + dto.getClienteId()));
       reserva.setHorario(LocalTime.parse(dto.getHorario()));
       reserva.setCliente(cliente);
       reserva.setStatusMesa(StatusMesa.valueOf(dto.getStatusMesa().toUpperCase()));
       return reservaRepository.save(reserva);
   }
}
