package org.uam.OrderFlow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "cotizaciones")
@Getter
@Setter
public class Cotizacion extends EntityBase{
    @Column(unique = true)
    private String codigo;
    @NotBlank(message = "El nombre no puede estar vacío.")
    private String nombreCliente;
    @Column(length = 1000)
    private String descripcion;
    private String contactoCliente;

    @NotNull @Positive
    private BigDecimal totalEstimadoUsd;
    @NotNull @Positive
    private BigDecimal totalEstimadoNio;
    private LocalDateTime fechaCreacion;
    private LocalDateTime validezHasta;
    private String estado;

    @OneToMany(mappedBy = "cotizacion", cascade = CascadeType.ALL)
    private List<ProductoCotizacion> items;
}
