package org.uam.OrderFlow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "evidencias")
public class Evidencia extends EntityBase {
    @ManyToOne
    private EventoLogistico evento;

    private String url;
    private String tipo; //imagen,pdf
    private String nombreArchivo;
}