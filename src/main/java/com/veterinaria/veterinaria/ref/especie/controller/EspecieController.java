package com.veterinaria.veterinaria.ref.especie.controller;

import com.veterinaria.veterinaria.ref.especie.model.Especie;
import com.veterinaria.veterinaria.ref.especie.service.EspecieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/especies")
public class EspecieController {

    private final EspecieService especieService;

    public EspecieController(EspecieService especieService) {
        this.especieService = especieService;
    }

    @GetMapping
    public List<Especie> listar() {
        return especieService.findAll();
    }

    @GetMapping("/{id}")
    public Especie obtener(@PathVariable Long id) {
        return especieService.findById(id)
                .orElse(null);
    }

    @PostMapping
    public Especie crear(@RequestBody Especie especie) {
        return especieService.save(especie);
    }

    @PutMapping("/{id}")
    public Especie actualizar(@PathVariable Long id, @RequestBody Especie especieData) {
        return especieService.findById(id)
                .map(especie -> {
                    especie.setNombre(especieData.getNombre());
                    // Actualiza más campos si tuvieras
                    return especieService.save(especie);
                }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        especieService.deleteById(id);
    }
}
