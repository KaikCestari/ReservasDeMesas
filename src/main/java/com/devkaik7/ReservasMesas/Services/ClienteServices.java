package com.devkaik7.ReservasMesas.Services;

import com.devkaik7.ReservasMesas.Dtos.ClienteDto;
import com.devkaik7.ReservasMesas.Entity.Cliente;
import com.devkaik7.ReservasMesas.Entity.Reserva;
import com.devkaik7.ReservasMesas.Repository.ClienteRepository;
import com.devkaik7.ReservasMesas.Status.StatusMesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class ClienteServices {

    @Autowired
    public ClienteRepository clienteRepository;

    public Cliente registrarCliente(ClienteDto dto) {
        if (dto.getName() == null || dto.getEmail() == null) {
            throw new IllegalArgumentException("Nome e e-mail são obrigatórios");
        }

        Cliente clienteNovo = new Cliente();
        clienteNovo.setName(dto.getName());
        clienteNovo.setEmail(dto.getEmail());
        clienteNovo.setTelefone(dto.getTelefone());
        return clienteRepository.save(clienteNovo);
    }


}
