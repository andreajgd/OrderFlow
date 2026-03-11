package org.uam.OrderFlow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.uam.OrderFlow.config.OnCreate;
import org.uam.OrderFlow.config.OnUpdate;
import org.uam.OrderFlow.dto.RutaRepartoDTO;
import org.uam.OrderFlow.mapper.RutaRepartoMapper;
import org.uam.OrderFlow.model.RutaReparto;
import org.uam.OrderFlow.service.ServiceRutaReparto;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/rutaReparto")
public class ControllerRutaReparto {

    private final ServiceRutaReparto serviceRutaReparto;
    private final RutaRepartoMapper rutaRepartoMapper;

    public ControllerRutaReparto(ServiceRutaReparto serviceRutaReparto, RutaRepartoMapper rutaRepartoMapper) {
        this.serviceRutaReparto = serviceRutaReparto;
        this.rutaRepartoMapper = rutaRepartoMapper;
    }

    @GetMapping("/all")
    public ResponseEntity<List<RutaRepartoDTO>> listAllRutaReparto() {
        return ResponseEntity.ok(serviceRutaReparto.findAll()
                .stream()
                .map(rutaRepartoMapper::rutaRepartotoRutaRepartoDto)
                .toList());
    }

    @PostMapping("/create")
    public ResponseEntity<RutaRepartoDTO> createRutaReparto(@RequestBody
                                                            @Validated(OnCreate.class) RutaReparto rutaReparto) {
        RutaReparto entity = serviceRutaReparto.create(rutaReparto);
        return ResponseEntity.ok(rutaRepartoMapper.rutaRepartotoRutaRepartoDto(entity));
    }

    @PutMapping("/update")
    public ResponseEntity<RutaRepartoDTO> update(@RequestBody
                                                 @Validated(OnUpdate.class) RutaReparto rutaReparto) {
        RutaReparto entity = serviceRutaReparto.update(rutaReparto.getId(), rutaReparto);
        return ResponseEntity.ok(rutaRepartoMapper.rutaRepartotoRutaRepartoDto(entity));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        serviceRutaReparto.delete(id);
        return ResponseEntity.noContent().build();
    }
}