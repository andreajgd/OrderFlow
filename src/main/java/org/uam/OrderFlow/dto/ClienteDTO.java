package org.uam.OrderFlow.dto;

import java.math.BigDecimal;
import java.util.UUID;

//Data Transfer Object
//patrón de diseño utilizado para transportar datos entre capas
public record ClienteDTO(
        UUID id,
        UsuarioDTO usuario,           //anidamos el usuario
        String codigoCliente,
        BigDecimal limiteCredito,
        BigDecimal saldoDisponible,
        BigDecimal totalCompras,
        String observaciones,
        Boolean activo
) {
}