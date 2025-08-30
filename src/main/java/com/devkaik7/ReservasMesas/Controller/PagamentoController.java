package com.devkaik7.ReservasMesas.Controller;

import com.devkaik7.ReservasMesas.Dtos.PagamentoDto;
import com.devkaik7.ReservasMesas.Entity.Pagamentos;
import com.devkaik7.ReservasMesas.Services.PagamentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ("/pagamento"))
@CrossOrigin(origins = "http://localhost:3000")
public class PagamentoController {

    @Autowired
    public PagamentoServices services;

    @PostMapping()
    public ResponseEntity<Pagamentos> newPagamento(@RequestBody PagamentoDto dto){
        Pagamentos pagamentos = services.postarPagamento(dto);
        return ResponseEntity.ok(pagamentos);
    }
    @GetMapping
    public List<PagamentoDto> listarPagamentos(){
        return services.listarPagamentos();
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarPagamentos(Long id){
  services.deletarPagamentos(id);
  return  ResponseEntity.noContent().build();
    }
}
