package org.uam.OrderFlow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.uam.OrderFlow.anotacion.CedulaValida;
import org.uam.OrderFlow.model.enums.CargoEmpleado;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "empleados")
@Getter
@Setter
public class Empleado extends EntityBase {

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private CargoEmpleado cargo;

    private BigDecimal sueldo = BigDecimal.ZERO;

    private LocalDate fechaIngreso;

    private LocalDate fechaSalida;

    private Boolean activoLaboral = true;

    @Column(length = 500)
    private String observaciones;

}