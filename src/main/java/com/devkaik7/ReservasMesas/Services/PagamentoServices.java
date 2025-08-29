package com.devkaik7.ReservasMesas.Services;

import com.devkaik7.ReservasMesas.Dtos.PagamentoDto;
import com.devkaik7.ReservasMesas.Entity.Pagamentos;
import com.devkaik7.ReservasMesas.Entity.Reserva;
import com.devkaik7.ReservasMesas.Repository.PagamentoRepository;
import com.devkaik7.ReservasMesas.Repository.ReservaRepository;
import com.devkaik7.ReservasMesas.Status.MetodoPagamento;
import com.devkaik7.ReservasMesas.Status.StatusPagamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class PagamentoServices {

    @Autowired
    public PagamentoRepository repository;
    @Autowired
    public ReservaRepository reservaRepository;

    public Pagamentos postarPagamento(PagamentoDto dto) {

Pagamentos pagamentos = new Pagamentos();
        Reserva reserva = reservaRepository.findById(dto.getReservaId())
                        .orElseThrow(()-> new IllegalArgumentException("Reserva nao encontrada" + dto.getReservaId()));
pagamentos.setData(dto.getData());
pagamentos.setMetodo(MetodoPagamento.valueOf(dto.getMetodoPagamento()));
pagamentos.setReserva(reserva);
pagamentos.setStatusPagamento(StatusPagamento.valueOf(dto.getStatusPagamento()));
return repository.save(pagamentos);
    }
    public List<PagamentoDto> listarPagamentos() {
        List<Pagamentos> pagamentos = repository.findAll();
        if (pagamentos.isEmpty()){
            throw new IllegalArgumentException("Impossivel encontrar pagamento");
        }
        return pagamentos.stream()
                .map(p -> new PagamentoDto(p.getValor(), p.getStatusPagamento().name(), p.getMetodo().name(), p.getData(), p.getReserva().getId()))
                .toList();
    }

    }


