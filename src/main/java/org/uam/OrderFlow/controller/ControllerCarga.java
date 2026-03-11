package org.uam.OrderFlow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.uam.OrderFlow.config.OnCreate;
import org.uam.OrderFlow.config.OnUpdate;
import org.uam.OrderFlow.dto.CargaDTO;
import org.uam.OrderFlow.mapper.CargaMapper;
import org.uam.OrderFlow.model.Carga;
import org.uam.OrderFlow.service.ServiceCarga;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/carga")
public class ControllerCarga {

    private final ServiceCarga serviceCarga;
    private final CargaMapper cargaMapper;

    public ControllerCarga(ServiceCarga serviceCarga, CargaMapper cargaMapper) {
        this.serviceCarga = serviceCarga;
        this.cargaMapper = cargaMapper;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CargaDTO>> listAllCarga() {
        return ResponseEntity.ok(serviceCarga.findAll()
                .stream()
                .map(cargaMapper::toDto)
                .toList());
    }

    @PostMapping("/create")
    public ResponseEntity<CargaDTO> createCarga(@RequestBody
                                                @Validated(OnCreate.class) Carga carga) {
        Carga entity = serviceCarga.create(carga);
        return ResponseEntity.ok(cargaMapper.toDto(entity));
    }

    @PutMapping("/update")
    public ResponseEntity<CargaDTO> update(@RequestBody
                                           @Validated(OnUpdate.class) Carga carga) {
        Carga entity = serviceCarga.update(carga.getId(), carga);
        return ResponseEntity.ok(cargaMapper.toDto(entity));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        serviceCarga.delete(id);
        return ResponseEntity.noContent().build();
    }
}