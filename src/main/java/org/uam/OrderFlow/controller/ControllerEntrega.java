package org.uam.OrderFlow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.uam.OrderFlow.config.OnCreate;
import org.uam.OrderFlow.config.OnUpdate;
import org.uam.OrderFlow.dto.EntregaDTO;
import org.uam.OrderFlow.mapper.EntregaMapper;
import org.uam.OrderFlow.model.Entrega;
import org.uam.OrderFlow.service.ServiceEntrega;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/entrega")
public class ControllerEntrega {

    private final ServiceEntrega serviceEntrega;
    private final EntregaMapper entregaMapper;

    public ControllerEntrega(ServiceEntrega serviceEntrega, EntregaMapper entregaMapper) {
        this.serviceEntrega = serviceEntrega;
        this.entregaMapper = entregaMapper;
    }

    @GetMapping("/all")
    public ResponseEntity<List<EntregaDTO>> listAllEntrega() {
        return ResponseEntity.ok(serviceEntrega.findAll()
                .stream()
                .map(entregaMapper::entregatoEntregaDto)
                .toList());
    }

    @PostMapping("/create")
    public ResponseEntity<EntregaDTO> createEntrega(@RequestBody
                                                    @Validated(OnCreate.class) Entrega entrega) {
        Entrega entity = serviceEntrega.create(entrega);
        return ResponseEntity.ok(entregaMapper.entregatoEntregaDto(entity));
    }

    @PutMapping("/update")
    public ResponseEntity<EntregaDTO> update(@RequestBody
                                             @Validated(OnUpdate.class) Entrega entrega) {
        Entrega entity = serviceEntrega.update(entrega.getId(), entrega);
        return ResponseEntity.ok(entregaMapper.entregatoEntregaDto(entity));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        serviceEntrega.delete(id);
        return ResponseEntity.noContent().build();
    }
}