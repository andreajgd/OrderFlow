package org.uam.OrderFlow.dto;

import java.time.LocalDate;
import java.util.UUID;

public record RutaRepartoDTO(
        UUID id,
        String codigoRuta,
        LocalDate fecha,
        String estado,                //proxima, en curso, completada
        UUID motorizadoId,            //ID del empleado motorizado
        UUID despachadorId
) {
}
