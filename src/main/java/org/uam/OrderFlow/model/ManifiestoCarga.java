package org.uam.OrderFlow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "manifiestos_carga")
public class ManifiestoCarga extends EntityBase {
    @ManyToOne
    private Carga carga;

    @ManyToOne
    private Paquete paquete;

    private Integer posicion;
}