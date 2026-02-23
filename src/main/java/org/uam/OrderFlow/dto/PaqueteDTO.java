package org.uam.OrderFlow.dto;

import org.uam.OrderFlow.model.enums.EstadoPaquete;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record PaqueteDTO(
        UUID id,
        String codigoPaquete,
        String numeroTracking,
        String descripcion,
        BigDecimal pesoKg,
        String dimensiones,
        UUID clienteId,
        EstadoPaquete estadoActual,
        String bodegaActual,
        LocalDateTime fechaDisponibleRetiro
) {
}
