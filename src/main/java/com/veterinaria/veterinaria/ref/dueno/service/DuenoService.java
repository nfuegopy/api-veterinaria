package com.veterinaria.veterinaria.ref.dueno.service;

import com.veterinaria.veterinaria.ref.dueno.model.Dueno;
import com.veterinaria.veterinaria.ref.dueno.repository.DuenoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DuenoService {

    private final DuenoRepository duenoRepository;

    public DuenoService(DuenoRepository duenoRepository) {
        this.duenoRepository = duenoRepository;
    }

    public List<Dueno> findAll() {
        return duenoRepository.findAll();
    }

    public Optional<Dueno> findById(Long id) {
        return duenoRepository.findById(id);
    }

    public Dueno save(Dueno dueno) {
        return duenoRepository.save(dueno);
    }

    public void deleteById(Long id) {
        duenoRepository.deleteById(id);
    }
}
