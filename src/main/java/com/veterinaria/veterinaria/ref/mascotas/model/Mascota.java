package com.veterinaria.veterinaria.ref.mascotas.model;
import com.veterinaria.veterinaria.ref.especie.model.Especie;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int edad;

    // Relación "muchas mascotas -> una especie"
    @ManyToOne
    @JoinColumn(name = "especie_id") // Nombre de la columna FK en Mascota
    private Especie especie;
}
