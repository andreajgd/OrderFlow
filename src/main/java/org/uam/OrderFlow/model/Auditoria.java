package org.uam.OrderFlow.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Auditoria {
    private UUID id;
    private String usuarioId;
    private String accion;
    private String entidad;
    private String idEntidad;
    private String valoresAnteriores;
    private String valoresNuevos;
    private LocalDateTime fecha;
}
