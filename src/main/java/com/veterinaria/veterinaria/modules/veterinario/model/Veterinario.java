package com.veterinaria.veterinaria.modules.veterinario.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefono;

    @Column(length = 500)
    private String especialidad;
}
