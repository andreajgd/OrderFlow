package org.uam.OrderFlow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.uam.OrderFlow.dto.CargaDTO;
import org.uam.OrderFlow.mapper.CargaMapper;
import org.uam.OrderFlow.model.Carga;
import org.uam.OrderFlow.service.ServiceCarga;

import java.util.List;

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
    public ResponseEntity<List<CargaDTO>> all() {
        return ResponseEntity.ok(serviceCarga.findAll().stream().map(cargaMapper::toDto).toList());
    }

    @PostMapping("/create")
    public ResponseEntity<CargaDTO> create(@RequestBody CargaDTO cargaDTO) {
        Carga carga = cargaMapper.toEntity(cargaDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cargaMapper.toDto(serviceCarga.create(carga)));
    }
}
