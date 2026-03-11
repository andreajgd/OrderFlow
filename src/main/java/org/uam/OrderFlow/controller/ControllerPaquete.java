package org.uam.OrderFlow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.uam.OrderFlow.config.OnCreate;
import org.uam.OrderFlow.config.OnUpdate;
import org.uam.OrderFlow.dto.PaqueteDTO;
import org.uam.OrderFlow.mapper.PaqueteMapper;
import org.uam.OrderFlow.model.Paquete;
import org.uam.OrderFlow.service.ServicePaquete;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/paquete")
public class ControllerPaquete {

    private final ServicePaquete servicePaquete;
    private final PaqueteMapper paqueteMapper;

    public ControllerPaquete(ServicePaquete servicePaquete, PaqueteMapper paqueteMapper) {
        this.servicePaquete = servicePaquete;
        this.paqueteMapper = paqueteMapper;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PaqueteDTO>> listAllPaquete() {
        return ResponseEntity.ok(servicePaquete.findAll()
                .stream()
                .map(paqueteMapper::paquetetoPaqueteDto)
                .toList());
    }

    @PostMapping("/create")
    public ResponseEntity<PaqueteDTO> createPaquete(@RequestBody
                                                    @Validated(OnCreate.class) Paquete paquete) {
        Paquete entity = servicePaquete.create(paquete);
        return ResponseEntity.ok(paqueteMapper.paquetetoPaqueteDto(entity));
    }

    @PutMapping("/update")
    public ResponseEntity<PaqueteDTO> update(@RequestBody
                                             @Validated(OnUpdate.class) Paquete paquete) {
        Paquete entity = servicePaquete.update(paquete.getId(), paquete);
        return ResponseEntity.ok(paqueteMapper.paquetetoPaqueteDto(entity));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        servicePaquete.delete(id);
        return ResponseEntity.noContent().build();
    }
}