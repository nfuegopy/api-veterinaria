package com.veterinaria.veterinaria.ref.tratamiento.service;

import com.veterinaria.veterinaria.ref.tratamiento.model.Tratamiento;
import com.veterinaria.veterinaria.ref.tratamiento.repository.TratamientoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TratamientoService {

    private final TratamientoRepository repository;

    public TratamientoService(TratamientoRepository repository) {
        this.repository = repository;
    }

    public Tratamiento guardar(Tratamiento tratamiento) {
        return repository.save(tratamiento);
    }

    public Tratamiento buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Tratamiento> buscarTodos() {
        return repository.findAll();
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
