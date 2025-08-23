package com.devkaik7.ReservasMesas.Controller;

import com.devkaik7.ReservasMesas.Dtos.PagamentoDto;
import com.devkaik7.ReservasMesas.Entity.Pagamentos;
import com.devkaik7.ReservasMesas.Services.PagamentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ("/pagamento"))
public class PagamentoController {

    @Autowired
    public PagamentoServices services;

    @PostMapping()
    public ResponseEntity<Pagamentos> newPagamento(@RequestBody PagamentoDto dto){
        Pagamentos pagamentos = services.postarPagamento(dto);
        return ResponseEntity.ok(pagamentos);
    }
}
