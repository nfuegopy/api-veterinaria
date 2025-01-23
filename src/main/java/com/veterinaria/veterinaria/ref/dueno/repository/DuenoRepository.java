package com.veterinaria.veterinaria.ref.dueno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.veterinaria.ref.dueno.model.Dueno;

public interface DuenoRepository extends JpaRepository<Dueno, Long> {
    // Métodos de búsqueda custom si los necesitas
}
