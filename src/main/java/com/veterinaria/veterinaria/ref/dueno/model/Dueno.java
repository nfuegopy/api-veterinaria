package com.veterinaria.veterinaria.ref.dueno.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre es obligatorio
    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    // Email opcional; si llega, podría validarse con @Email, pero no es obligatorio
    private String email;

    // Teléfono es obligatorio
    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;

    // Campo opcional
    private String telefonoAlternativo;

    // Campo opcional
    private String direccion;
}
