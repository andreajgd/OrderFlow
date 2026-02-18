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

    @NotBlank(message = "Primer nombre no puede estar vacío")
    private String primerNombre;

    private String segundoNombre;

    @NotBlank(message = "Primer apellido no puede estar vacío")
    private String primerApellido;

    private String segundoApellido;

    @Email(message = "El correo no es válido")
    private String email;

    @NotBlank(message = "Teléfono no puede estar vacío")
    private String telefono;

    @NotBlank(message = "Dirección no puede estar vacío")
    private String direccion;

    @CedulaValida(message = "La cédula no es válida")
    private String cedula;

    @Enumerated(EnumType.STRING)
    private CargoEmpleado cargo;

    private BigDecimal sueldo = BigDecimal.ZERO;

    private LocalDate fechaIngreso;

    private LocalDate fechaSalida;

    private Boolean activoLaboral = true;

    @Column(length = 500)
    private String observaciones;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}