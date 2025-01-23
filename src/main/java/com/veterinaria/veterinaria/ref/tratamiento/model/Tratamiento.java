package com.veterinaria.veterinaria.ref.tratamiento.model;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

@Entity
@Data
public class Tratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "El nombre del tratamiento no puede estar vacío")
    private String nombre;

    @Column(nullable = false)
    @NotNull(message = "El costo del tratamiento es obligatorio")
    @Digits(integer = 10, fraction = 2, message = "El costo debe ser un número válido con hasta 2 decimales")
    private BigDecimal costo;

    @Column(length = 500)
    private String descripcion;
}
