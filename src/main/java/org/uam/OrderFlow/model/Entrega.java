package org.uam.OrderFlow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "entregas")
public class Entrega extends EntityBase {
    @OneToOne
    private Paquete paquete;

    @ManyToOne
    private RutaReparto ruta;

    private LocalDateTime fechaProgramada;
    private LocalDateTime fechaReal;
    private String estado; // pendiente, fallida, finalizada

    private String nombreReceptor;
    private String cedulaReceptor;
    private String firmaUrl;
    private String fotoUrl;
}