package com.devkaik7.ReservasMesas.Controller;

import com.devkaik7.ReservasMesas.Dtos.MesasDto;
import com.devkaik7.ReservasMesas.Entity.Mesas;
import com.devkaik7.ReservasMesas.Services.MesaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ("/mesas"))
public class MesaController {

    @Autowired
    public MesaServices services;

@PostMapping()
    public ResponseEntity<Mesas> addMesas(@RequestBody MesasDto dto){
    Mesas mesas = services.addMesas(dto);
    return ResponseEntity.ok(mesas);
}
}
