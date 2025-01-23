package com.veterinaria.veterinaria.ref.tratamiento.repository;

import com.veterinaria.veterinaria.ref.tratamiento.model.Tratamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TratamientoRepository extends JpaRepository<Tratamiento, Long> {
}
