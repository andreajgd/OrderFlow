package org.uam.OrderFlow.service;

import org.springframework.stereotype.Service;
import org.uam.OrderFlow.model.Paquete;
import org.uam.OrderFlow.repository.RepositoryCarga;
import org.uam.OrderFlow.repository.RepositoryPaquete;

@Service
public class ServicePaquete extends GenericService<Paquete, RepositoryPaquete> {
    public  ServicePaquete(RepositoryPaquete repository) {super(repository);
    }
}
