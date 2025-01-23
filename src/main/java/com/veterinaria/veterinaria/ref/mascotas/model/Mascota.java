package com.veterinaria.veterinaria.ref.mascotas.model;
import com.veterinaria.veterinaria.ref.dueno.model.Dueno;
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


    @ManyToOne
    @JoinColumn(name = "dueno_id")
    private Dueno dueno;
    @ManyToOne
    @JoinColumn(name = "especie_id")
    private Especie especie;


}
