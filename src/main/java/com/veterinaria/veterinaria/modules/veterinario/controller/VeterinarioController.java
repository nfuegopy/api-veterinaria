package com.veterinaria.veterinaria.modules.veterinario.controller;

import com.veterinaria.veterinaria.modules.veterinario.model.Veterinario;
import com.veterinaria.veterinaria.modules.veterinario.service.VeterinarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veterinarios")
public class VeterinarioController {

    private final VeterinarioService service;

    public VeterinarioController(VeterinarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Veterinario> crearVeterinario(@RequestBody Veterinario veterinario) {
        return ResponseEntity.ok(service.guardar(veterinario));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veterinario> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<Veterinario>> listarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVeterinario(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
