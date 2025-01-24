package com.veterinaria.veterinaria.modules.empleado.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Data
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    private String apellido;

    @NotBlank(message = "El documento no puede estar vacío")
    private String documento;

    @NotNull(message = "La fecha de nacimiento no puede estar vacía")
    private LocalDate fechaNac;

    @NotBlank(message = "La dirección no puede estar vacía")
    private String direccion;

    @NotBlank(message = "El estado civil no puede estar vacío")
    private String estadoCivil;

    @Email(message = "Debe proporcionar un correo válido")
    private String email;

    @NotBlank(message = "El teléfono no puede estar vacío")
    private String telefono;

    private String telefonoSecundario;

    @Transient
    private Integer edad;

    // Calcula la edad basada en la fecha de nacimiento
    @PrePersist
    @PreUpdate
    private void calcularEdad() {
        if (this.fechaNac != null) {
            this.edad = Period.between(this.fechaNac, LocalDate.now()).getYears();
        }
    }

    public Integer getEdad() {
        if (this.fechaNac != null) {
            return Period.between(this.fechaNac, LocalDate.now()).getYears();
        }
        return null;
    }
}
