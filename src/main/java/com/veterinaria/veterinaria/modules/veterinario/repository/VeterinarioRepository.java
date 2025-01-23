package com.veterinaria.veterinaria.modules.veterinario.repository;

import com.veterinaria.veterinaria.modules.veterinario.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
}
