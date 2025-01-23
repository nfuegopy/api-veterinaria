package com.veterinaria.veterinaria.modules.consulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.veterinaria.modules.consulta.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
