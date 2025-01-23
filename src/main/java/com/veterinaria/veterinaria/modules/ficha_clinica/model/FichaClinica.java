package com.veterinaria.veterinaria.modules.ficha_clinica.model;

import com.veterinaria.veterinaria.modules.veterinario.model.Veterinario;
import com.veterinaria.veterinaria.ref.mascotas.model.Mascota;
import com.veterinaria.veterinaria.ref.tratamiento.model.Tratamiento;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class FichaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false, length = 1000)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "mascota_id", nullable = false)
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "veterinario_id", nullable = false)
    private Veterinario veterinario;

    @ManyToOne
    @JoinColumn(name = "tratamiento_id", nullable = true)
    private Tratamiento tratamiento;

      private Double peso;

    private LocalDate proximaVisita;
}
