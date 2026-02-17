package org.uam.OrderFlow.anotacion;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.uam.OrderFlow.validadores.CedulaValidador;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CedulaValidador.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CedulaValida {
    String message() default "La cedula no es valida.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
