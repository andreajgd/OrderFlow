package org.uam.OrderFlow.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "eventos_logisticos")
public class EventoLogistico extends EntityBase {
    @ManyToOne
    private Paquete paquete;

    @ManyToOne
    private Empleado empleadoRegistrador;

    private String tipoEvento;
    private String descripcion;
    private LocalDateTime fechaEvento;
    private String ubicacion;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Evidencia> evidencias;
}