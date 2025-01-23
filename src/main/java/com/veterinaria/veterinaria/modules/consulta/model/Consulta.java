package com.veterinaria.veterinaria.modules.consulta.model;

import com.veterinaria.veterinaria.ref.mascotas.model.Mascota;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private String motivo;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "mascota_id")
    private Mascota mascota;
}
