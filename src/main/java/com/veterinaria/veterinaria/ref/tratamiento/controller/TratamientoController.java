package com.veterinaria.veterinaria.ref.tratamiento.controller;

import com.veterinaria.veterinaria.ref.tratamiento.model.Tratamiento;
import com.veterinaria.veterinaria.ref.tratamiento.service.TratamientoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tratamientos")
public class TratamientoController {

    private final TratamientoService service;

    public TratamientoController(TratamientoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Tratamiento> crearTratamiento(@RequestBody Tratamiento tratamiento) {
        return ResponseEntity.ok(service.guardar(tratamiento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tratamiento> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<Tratamiento>> listarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTratamiento(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
