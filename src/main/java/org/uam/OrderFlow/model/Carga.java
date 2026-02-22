package org.uam.OrderFlow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.uam.OrderFlow.anotacion.CedulaValida;
import org.uam.OrderFlow.model.enums.TipoTransportes;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "carga")
@Getter
@Setter
public class Carga extends EntityBase {
    @NotBlank(message = "Ingrese código de carga. No puede estar vacío." )
    private String codigoCarga;
    @NotBlank(message = "Ingrese el tipo de transporte. No puede estar vacío.")
    private TipoTransportes tipoTransporte;
    @NotBlank(message = "El nombre no puede estar vacío.")
    private String nombreTransportista;
    @CedulaValida(message = "La cédula no es válida.")
    private String cedula;
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "Formato inválido, debe ser dd/MM/yyyy")
    private LocalDate fechaSalida;
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "Formato inválido, debe ser dd/MM/yyyy")
    private LocalDate fechaEstimadaLlegada;
    @ManyToOne
    private Empleado creador;

    @OneToMany(mappedBy = "carga")
    private List<ManifiestoCarga> manifiestos;
}
