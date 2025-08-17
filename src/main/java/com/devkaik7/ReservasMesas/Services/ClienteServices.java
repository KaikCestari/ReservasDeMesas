package com.devkaik7.ReservasMesas.Services;

import com.devkaik7.ReservasMesas.Dtos.ClienteDto;
import com.devkaik7.ReservasMesas.Entity.Cliente;
import com.devkaik7.ReservasMesas.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices {

    @Autowired
    public ClienteRepository clienteRepository;


    public Cliente RegistrarCliente(ClienteDto dto){
        if (dto == null || dto.getEmail() == null || dto.getName() == null) {
            throw new IllegalArgumentException("Dados do cliente inválidos");
        }
        Cliente clienteNovo = new Cliente();
        clienteNovo.setEmail(dto.getEmail());
        clienteNovo.setId(dto.getId());
        clienteNovo.setReserva(dto.getReserva());
        clienteNovo.setTelefone(dto.getTelefone());
        clienteNovo.setName(dto.getName());
     return clienteRepository.save(clienteNovo);
    }

}
