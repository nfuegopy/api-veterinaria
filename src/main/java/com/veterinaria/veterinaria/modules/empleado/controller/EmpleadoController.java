package com.veterinaria.veterinaria.modules.empleado.controller;

import com.veterinaria.veterinaria.modules.empleado.model.Empleado;
import com.veterinaria.veterinaria.modules.empleado.service.EmpleadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> obtenerTodos() {
        return empleadoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerPorId(@PathVariable Long id) {
        Optional<Empleado> empleado = empleadoService.obtenerPorId(id);
        return empleado.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Empleado crearEmpleado(@Valid @RequestBody Empleado empleado) {
        return empleadoService.guardar(empleado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @Valid @RequestBody Empleado empleado) {
        if (!empleadoService.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        empleado.setId(id);
        return ResponseEntity.ok(empleadoService.guardar(empleado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleado(@PathVariable Long id) {
        if (!empleadoService.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        empleadoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
