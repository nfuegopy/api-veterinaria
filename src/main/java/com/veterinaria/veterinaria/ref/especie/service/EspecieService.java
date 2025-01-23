package com.veterinaria.veterinaria.ref.especie.service;

import com.veterinaria.veterinaria.ref.especie.model.Especie;
import com.veterinaria.veterinaria.ref.especie.repository.EspecieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EspecieService {

    private final EspecieRepository especieRepository;

    public EspecieService(EspecieRepository especieRepository) {
        this.especieRepository = especieRepository;
    }

    public List<Especie> findAll() {
        return especieRepository.findAll();
    }

    public Optional<Especie> findById(Long id) {
        return especieRepository.findById(id);
    }

    public Especie save(Especie especie) {
        return especieRepository.save(especie);
    }

    public void deleteById(Long id) {
        especieRepository.deleteById(id);
    }
}
