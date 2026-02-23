package org.uam.OrderFlow.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record EntregaDTO(
        UUID id,
        UUID paqueteId,
        UUID rutaId,
        LocalDateTime fechaProgramada,
        LocalDateTime fechaReal,
        String estado,                  // "pendiente", "exitosa", "fallida"
        String nombreReceptor,
        String cedulaReceptor,
        String firmaUrl,
        String fotoUrl
) {
}
