package org.uam.OrderFlow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "rutas_reparto")
public class RutaReparto extends EntityBase {
    private String codigoRuta;
    private LocalDate fecha;
    private String estado; //proxima, en curso, completada

    @ManyToOne
    private Empleado motorizado;

    @ManyToOne
    private Empleado despachador;

    @OneToMany(mappedBy = "ruta")
    private List<Entrega> entregas;
}