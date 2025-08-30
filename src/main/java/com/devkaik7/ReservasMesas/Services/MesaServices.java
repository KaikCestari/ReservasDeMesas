package com.devkaik7.ReservasMesas.Services;

import com.devkaik7.ReservasMesas.Dtos.MesasDto;
import com.devkaik7.ReservasMesas.Entity.Mesas;
import com.devkaik7.ReservasMesas.Infra.MesasException;
import com.devkaik7.ReservasMesas.Repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaServices {

    @Autowired
    MesaRepository mesaRepository;

    public Mesas addMesas(MesasDto dto) {
        if (dto.getCapacidade() == null) {
            throw new MesasException("Precisa Adicionar Capacidade");
        }

        if (dto.getCapacidade() > 6) {
            throw new MesasException();
        }

        Mesas mesas = new Mesas();
        mesas.setCapacidade(dto.getCapacidade());
        mesas.setNumero(dto.getNumero());

        return mesaRepository.save(mesas);
    }


}
