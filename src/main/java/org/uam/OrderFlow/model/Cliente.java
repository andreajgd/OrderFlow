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
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String codigoCliente;

    private BigDecimal limiteCredito = BigDecimal.ZERO;

    private BigDecimal saldoDisponible = BigDecimal.ZERO;

    private BigDecimal totalCompras = BigDecimal.ZERO;

    @Column(length = 500)
    private String observaciones;

}