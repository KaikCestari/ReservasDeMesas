package com.devkaik7.ReservasMesas.Controller;


import com.devkaik7.ReservasMesas.Dtos.ClienteDto;
import com.devkaik7.ReservasMesas.Dtos.ReservaDto;
import com.devkaik7.ReservasMesas.Entity.Cliente;
import com.devkaik7.ReservasMesas.Services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ("/cliente"))
public class ClienteController {
    @Autowired
    public ClienteServices services;


    @PostMapping
    public ResponseEntity<Cliente> registrarCliente(@RequestBody ClienteDto dto) {
        Cliente cliente = services.registrarCliente(dto);
        return ResponseEntity.ok(cliente);
    }

    @GetMapping
    public List<ClienteDto> listar(){
return  services.listarCliente();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        services.deletar(id);
        return ResponseEntity.noContent().build();
    }


}
