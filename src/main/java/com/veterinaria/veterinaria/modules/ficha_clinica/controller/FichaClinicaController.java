package com.veterinaria.veterinaria.modules.ficha_clinica.controller;

import com.veterinaria.veterinaria.modules.ficha_clinica.model.FichaClinica;
import com.veterinaria.veterinaria.modules.ficha_clinica.service.FichaClinicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ficha-clinica")
public class FichaClinicaController {

    private final FichaClinicaService service;

    public FichaClinicaController(FichaClinicaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FichaClinica> crearFichaClinica(@RequestBody FichaClinica fichaClinica) {
        return ResponseEntity.ok(service.guardar(fichaClinica));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FichaClinica> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping("/mascota/{mascotaId}")
    public ResponseEntity<List<FichaClinica>> obtenerPorMascota(@PathVariable Long mascotaId) {
        return ResponseEntity.ok(service.buscarPorMascota(mascotaId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFichaClinica(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
