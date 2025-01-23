package com.veterinaria.veterinaria.ref.mascotas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.veterinaria.ref.mascotas.model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
