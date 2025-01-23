package com.veterinaria.veterinaria.ref.mascotas.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.veterinaria.veterinaria.ref.mascotas.model.Mascota;
import com.veterinaria.veterinaria.ref.mascotas.repository.MascotaRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    public List<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    public Optional<Mascota> findById(Long id) {
        return mascotaRepository.findById(id);
    }

    public Mascota save(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    public void deleteById(Long id) {
        mascotaRepository.deleteById(id);
    }
}
