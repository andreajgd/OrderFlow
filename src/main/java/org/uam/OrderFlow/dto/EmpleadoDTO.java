package org.uam.OrderFlow.dto;

import java.util.UUID;

public record EmpleadoDTO(
        UUID id,
        String primerNombre,
        String primerApellido,
        String segundoNombre,
        String segundoApellido,
        String email,
        String telefono,
        String direccion,
        String cedula,
        String cargo,
        String departamento,
        Double sueldo,
        Boolean activoLaboral,
        Boolean activo
) {
}