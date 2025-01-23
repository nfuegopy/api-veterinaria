package com.veterinaria.veterinaria.modules.consulta.service;

import com.veterinaria.veterinaria.modules.consulta.model.Consulta;
import com.veterinaria.veterinaria.modules.consulta.repository.ConsultaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ConsultaService {

    private final ConsultaRepository consultaRepository;

    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public List<Consulta> findAll() {
        return consultaRepository.findAll();
    }

    public Optional<Consulta> findById(Long id) {
        return consultaRepository.findById(id);
    }

    public Consulta save(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public void deleteById(Long id) {
        consultaRepository.deleteById(id);
    }
}
