package com.veterinaria.veterinaria.ref.mascotas.controller;

import com.veterinaria.veterinaria.ref.mascotas.model.Mascota;
import com.veterinaria.veterinaria.ref.mascotas.service.MascotaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public List<Mascota> listar() {
        return mascotaService.findAll();
    }

    @GetMapping("/{id}")
    public Mascota obtenerPorId(@PathVariable Long id) {
        return mascotaService.findById(id)
                .orElse(null);  // O lanza excepción si no existe
    }

    @PostMapping
    public Mascota crear(@RequestBody Mascota mascota) {
        return mascotaService.save(mascota);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        mascotaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Mascota actualizar(@PathVariable Long id, @RequestBody Mascota mascotaData) {
        return mascotaService.findById(id)
                .map(mascota -> {
                    // Actualizamos atributos
                    mascota.setNombre(mascotaData.getNombre());
                    mascota.setEdad(mascotaData.getEdad());
                    // Actualizar la especie (si corresponde)
                    mascota.setEspecie(mascotaData.getEspecie());
                    return mascotaService.save(mascota);
                }).orElse(null);
    }


}
