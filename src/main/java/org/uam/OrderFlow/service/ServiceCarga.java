package org.uam.OrderFlow.service;

import org.springframework.stereotype.Service;
import org.uam.OrderFlow.model.Carga;
import org.uam.OrderFlow.repository.RepositoryCarga;

@Service
public class ServiceCarga extends GenericService<Carga, RepositoryCarga>{
    public ServiceCarga(RepositoryCarga repository) {
        super(repository);
    }
}
