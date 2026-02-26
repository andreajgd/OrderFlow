package org.uam.OrderFlow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.uam.OrderFlow.model.enums.EstadoPaquete;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "paquetes")
@Getter
@Setter
public class Paquete extends EntityBase{
    private String codigoPaquete;
    private String numeroTracking;
    private String descripcion;
    private BigDecimal pesoKg;
    private String dimensiones;

    @ManyToOne
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    private EstadoPaquete estadoActual;

    private String bodegaActual; // "MIAMI", "MANAGUA", "TRANSITO"

    @OneToMany(mappedBy = "paquete", cascade = CascadeType.ALL)
    private List<EventoLogistico> eventos;

    private LocalDateTime fechaDisponibleRetiro;
}
