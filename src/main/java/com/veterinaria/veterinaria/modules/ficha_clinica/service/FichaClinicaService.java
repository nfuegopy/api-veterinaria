package com.veterinaria.veterinaria.modules.ficha_clinica.service;

import com.veterinaria.veterinaria.modules.ficha_clinica.model.FichaClinica;
import com.veterinaria.veterinaria.modules.ficha_clinica.repository.FichaClinicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FichaClinicaService {

    private final FichaClinicaRepository repository;

    public FichaClinicaService(FichaClinicaRepository repository) {
        this.repository = repository;
    }

    public FichaClinica guardar(FichaClinica fichaClinica) {
        return repository.save(fichaClinica);
    }

    public FichaClinica buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<FichaClinica> buscarPorMascota(Long mascotaId) {
        return repository.findByMascotaId(mascotaId);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}