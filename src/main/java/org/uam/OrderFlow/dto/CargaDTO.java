package org.uam.OrderFlow.dto;

import java.time.LocalDate;

public record CargaDTO(
    GenericoDTO genericoDTO,
    String codigoCarga,
    String tipoTransporte,
    String nombreTransportista,
    String cedula,
    LocalDate fechaSalida,
    LocalDate fechaEstimadaLlegada
)
{}
