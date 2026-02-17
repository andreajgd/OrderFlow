package org.uam.OrderFlow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.uam.OrderFlow.anotacion.CedulaValida;

import java.math.BigDecimal;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente extends EntityBase {

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

    private String codigoCliente;

    private BigDecimal limiteCredito = BigDecimal.ZERO;

    private BigDecimal saldoDisponible = BigDecimal.ZERO;

    private BigDecimal totalCompras = BigDecimal.ZERO;

    @Column(length = 500)
    private String observaciones;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}