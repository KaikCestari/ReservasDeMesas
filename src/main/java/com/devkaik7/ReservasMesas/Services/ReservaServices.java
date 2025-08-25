package com.devkaik7.ReservasMesas.Services;

import com.devkaik7.ReservasMesas.Dtos.ClienteDto;
import com.devkaik7.ReservasMesas.Dtos.ReservaDto;
import com.devkaik7.ReservasMesas.Entity.Cliente;

import com.devkaik7.ReservasMesas.Entity.Mesas;
import com.devkaik7.ReservasMesas.Entity.Reserva;
import com.devkaik7.ReservasMesas.Repository.ClienteRepository;
import com.devkaik7.ReservasMesas.Repository.MesaRepository;
import com.devkaik7.ReservasMesas.Repository.ReservaRepository;
import com.devkaik7.ReservasMesas.Status.StatusMesa;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class  ReservaServices {
    @Autowired
    public ReservaRepository reservaRepository;
    @Autowired
    public ClienteRepository clienteRepository;
    @Autowired
    public MesaRepository mesaRepository;
   public Reserva adicionarReserva(ReservaDto dto) {
       Reserva reserva = new Reserva();
       Cliente cliente = clienteRepository.findById(dto.getClienteId())
                       .orElseThrow(()-> new IllegalArgumentException("Cliente nao encontrado" + dto.getClienteId()));
       Mesas mesas = mesaRepository.findById(dto.getMesaId())
                       .orElseThrow(()-> new IllegalArgumentException("Mesa nao encontada" + dto.getMesaId()));
       reserva.setHorario(LocalTime.parse(dto.getHorario()));
       reserva.setCliente(cliente);
       reserva.setMesas(mesas);
       reserva.setStatusMesa(StatusMesa.valueOf(dto.getStatusMesa().toUpperCase()));
       return reservaRepository.save(reserva);
   }

    public List<ReservaDto> listarReservas() {
        List<Reserva> reservas = reservaRepository.findAll();
        return reservas.stream()
                .map(r -> new ReservaDto(
                        r.getHorario().toString(),
                        r.getStatusMesa().name(),
                        r.getCliente() != null ? r.getCliente().getName() : null,
                        r.getMesas()!= null ? r.getMesas().getId() : null,
                        r.getCliente() != null ? r.getCliente().getId() : null
                ))
                .toList();
    }
    @Transactional
    public void deletarReserva(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID não pode ser nulo.");
        }
        Reserva reserva = reservaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Reserva não encontrada com ID: " + id));

        Cliente cliente = reserva.getCliente();
        if (cliente != null) {
            cliente.setReserva(null);
        }

        reservaRepository.delete(reserva);
    }
}

