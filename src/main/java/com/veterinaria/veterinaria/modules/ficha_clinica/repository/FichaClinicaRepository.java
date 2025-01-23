package com.veterinaria.veterinaria.modules.ficha_clinica.repository;

import com.veterinaria.veterinaria.modules.ficha_clinica.model.FichaClinica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FichaClinicaRepository extends JpaRepository<FichaClinica, Long> {
    List<FichaClinica> findByMascotaId(Long mascotaId);
}