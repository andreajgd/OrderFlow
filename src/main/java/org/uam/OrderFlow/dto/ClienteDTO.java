package org.uam.OrderFlow.dto;

import java.util.UUID;

public record ClienteDTO(
        UUID id,
        String primerNombre,
        String primerApellido,
        String segundoNombre,
        String segundoApellido,
        String email,
        String telefono,
        String direccion,
        String cedula,
        String codigoCliente,
        Double limiteCredito,
        Double saldoDisponible,
        String tipoCliente,
        Boolean activo
) {
}