package com.veterinaria.veterinaria.modules.veterinario.service;

import com.veterinaria.veterinaria.modules.veterinario.model.Veterinario;
import com.veterinaria.veterinaria.modules.veterinario.repository.VeterinarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioService {

    private final VeterinarioRepository repository;

    public VeterinarioService(VeterinarioRepository repository) {
        this.repository = repository;
    }

    public Veterinario guardar(Veterinario veterinario) {
        return repository.save(veterinario);
    }

    public Veterinario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Veterinario> buscarTodos() {
        return repository.findAll();
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
