package com.veterinaria.veterinaria.ref.especie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.veterinaria.ref.especie.model.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long> {
}
