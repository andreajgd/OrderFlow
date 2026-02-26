package org.uam.OrderFlow.service;

import org.springframework.stereotype.Service;
import org.uam.OrderFlow.model.Cotizacion;
import org.uam.OrderFlow.repository.RepositoryCotizacion;

@Service
public class ServiceCotizacion extends GenericService<Cotizacion, RepositoryCotizacion> {
    public  ServiceCotizacion(RepositoryCotizacion repository) {
        super(repository);
    }
}
