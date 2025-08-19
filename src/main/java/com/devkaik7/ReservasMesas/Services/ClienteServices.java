package com.devkaik7.ReservasMesas.Services;

import com.devkaik7.ReservasMesas.Dtos.ClienteDto;
import com.devkaik7.ReservasMesas.Entity.Cliente;
import com.devkaik7.ReservasMesas.Entity.Reserva;
import com.devkaik7.ReservasMesas.Repository.ClienteRepository;
import com.devkaik7.ReservasMesas.Repository.ReservaRepository;
import com.devkaik7.ReservasMesas.Status.StatusMesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class ClienteServices {

    @Autowired
    public ClienteRepository clienteRepository;
    @Autowired
    public ReservaRepository reservaRepository;

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

    public List<ClienteDto> listarCliente() {
       List<Cliente> cliente = clienteRepository.findAll();
       return cliente.stream()
               .map(p-> new ClienteDto(p.getId(),p.getName(),p.getEmail(),p.getTelefone()))
               .toList();
    }
    public void deletar(Long id){
        if (id == null){
            throw new RuntimeException("Id nao pode ser nulo");
        }
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Impossivel encontrar cliente"));
        clienteRepository.delete(cliente);
    }



}
