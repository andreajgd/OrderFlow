package org.uam.OrderFlow.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Cotizacion {
    private UUID id;
    private String codigo;
    private Cliente cliente;
    private LocalDate fechaCreacion;
    private LocalDate validezHasta;
    private String tipoServicio;
    private String estado;
    private BigDecimal totalNio;
    private BigDecimal totalUsd;
}
