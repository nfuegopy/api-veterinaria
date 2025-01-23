package com.veterinaria.veterinaria.modules.consulta.controller;

import com.veterinaria.veterinaria.modules.consulta.model.Consulta;
import com.veterinaria.veterinaria.modules.consulta.service.ConsultaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    private final ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    // Listar todas las consultas
    @GetMapping
    public List<Consulta> listar() {
        return consultaService.findAll();
    }

    // Obtener una consulta por ID
    @GetMapping("/{id}")
    public Consulta obtener(@PathVariable Long id) {
        return consultaService.findById(id).orElse(null);
    }

    @PostMapping
    public Consulta crear(@RequestBody Consulta consulta) {

        return consultaService.save(consulta);
    }

    @PutMapping("/{id}")
    public Consulta actualizar(@PathVariable Long id, @RequestBody Consulta consultaData) {
        return consultaService.findById(id)
                .map(consulta -> {
                    consulta.setFecha(consultaData.getFecha());
                    consulta.setMotivo(consultaData.getMotivo());
                    consulta.setDiagnostico(consultaData.getDiagnostico());
                    consulta.setTratamiento(consultaData.getTratamiento());
                    consulta.setObservaciones(consultaData.getObservaciones());
                    consulta.setMascota(consultaData.getMascota());
                    return consultaService.save(consulta);
                })
                .orElse(null);
    }

    // Eliminar una consulta
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        consultaService.deleteById(id);
    }
}