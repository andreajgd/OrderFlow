package org.uam.OrderFlow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.uam.OrderFlow.config.OnCreate;
import org.uam.OrderFlow.config.OnUpdate;
import org.uam.OrderFlow.dto.CotizacionDTO;
import org.uam.OrderFlow.mapper.CotizacionMapper;
import org.uam.OrderFlow.model.Cotizacion;
import org.uam.OrderFlow.service.ServiceCotizacion;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cotizacion")
public class ControllerCotizacion {

    private final ServiceCotizacion serviceCotizacion;
    private final CotizacionMapper cotizacionMapper;

    public ControllerCotizacion(ServiceCotizacion serviceCotizacion, CotizacionMapper cotizacionMapper) {
        this.serviceCotizacion = serviceCotizacion;
        this.cotizacionMapper = cotizacionMapper;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CotizacionDTO>> listAllCotizacion() {
        return ResponseEntity.ok(serviceCotizacion.findAll()
                .stream()
                .map(cotizacionMapper::cotizacionToCotizacionDTO)
                .toList());
    }

    @PostMapping("/create")
    public ResponseEntity<CotizacionDTO> createCotizacion(@RequestBody
                                                          @Validated(OnCreate.class) Cotizacion cotizacion) {
        Cotizacion entity = serviceCotizacion.create(cotizacion);
        return ResponseEntity.ok(cotizacionMapper.cotizacionToCotizacionDTO(entity));
    }

    @PutMapping("/update")
    public ResponseEntity<CotizacionDTO> update(@RequestBody
                                                @Validated(OnUpdate.class) Cotizacion cotizacion) {
        Cotizacion entity = serviceCotizacion.update(cotizacion.getId(), cotizacion);
        return ResponseEntity.ok(cotizacionMapper.cotizacionToCotizacionDTO(entity));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        serviceCotizacion.delete(id);
        return ResponseEntity.noContent().build();
    }
}