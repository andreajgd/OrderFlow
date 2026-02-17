package org.uam.OrderFlow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.uam.OrderFlow.anotacion.CedulaValida;
import org.uam.OrderFlow.model.enums.RolUsuario;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario extends EntityBase {

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

    @NotBlank(message = "Username no puede estar vacío")
    private String username;

    @NotBlank(message = "Password no puede estar vacío")
    private String password;

    @Enumerated(EnumType.STRING)
    private RolUsuario rol;

    private Boolean cuentaActiva = true;

    private Integer intentosFallidos = 0;

    private Boolean bloqueado = false;
}