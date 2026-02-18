package org.uam.OrderFlow.dto;

import java.util.UUID;

public record UsuarioDTO(
        UUID id,
        String primerNombre,
        String primerApellido,
        String segundoNombre,
        String segundoApellido,
        String email,
        String telefono,
        String direccion,
        String cedula,
        String username,
        String rol,
        Boolean cuentaActiva,
        Boolean bloqueado
) {
}