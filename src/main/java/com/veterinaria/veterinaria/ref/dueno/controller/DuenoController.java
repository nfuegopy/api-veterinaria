package com.veterinaria.veterinaria.ref.dueno.controller;

import com.veterinaria.veterinaria.ref.dueno.model.Dueno;
import com.veterinaria.veterinaria.ref.dueno.service.DuenoService;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/duenos")
public class DuenoController {

    private final DuenoService duenoService;

    public DuenoController(DuenoService duenoService) {
        this.duenoService = duenoService;
    }

    // [GET] /api/duenos - Listar todos los dueños
    @GetMapping
    public List<Dueno> listar() {
        return duenoService.findAll();
    }

    // [GET] /api/duenos/{id} - Obtener un dueño por ID
    @GetMapping("/{id}")
    public Dueno obtener(@PathVariable Long id) {
        return duenoService.findById(id).orElse(null);
    }

    // [POST] /api/duenos - Crear nuevo dueño (valida campos obligatorios)
    @PostMapping
    public Dueno crear(@RequestBody @Valid Dueno dueno) {
        return duenoService.save(dueno);
    }

    // [PUT] /api/duenos/{id} - Actualizar datos del dueño
    @PutMapping("/{id}")
    public Dueno actualizar(@PathVariable Long id, @RequestBody Dueno duenoData) {
        return duenoService.findById(id)
                .map(dueno -> {
                    // Campos obligatorios:
                    dueno.setNombre(duenoData.getNombre());
                    dueno.setTelefono(duenoData.getTelefono());

                    // Campos opcionales:
                    dueno.setEmail(duenoData.getEmail());
                    dueno.setTelefonoAlternativo(duenoData.getTelefonoAlternativo());
                    dueno.setDireccion(duenoData.getDireccion());

                    return duenoService.save(dueno);
                })
                .orElse(null);
    }

    // [DELETE] /api/duenos/{id} - Eliminar un dueño por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        duenoService.deleteById(id);
    }
}
