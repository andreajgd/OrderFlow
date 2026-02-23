package org.uam.OrderFlow.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record CotizacionDTO(
        UUID id,
        String codigo,
        String nombreCliente,
        String contactoCliente,
        BigDecimal totalEstimadoUsd,
        BigDecimal totalEstimadoNio,
        LocalDateTime fechaCreacion,
        LocalDateTime validezHasta,
        String estado,
        List<ProductoDTO> items
) {
}
