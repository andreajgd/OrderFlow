package org.uam.OrderFlow.service;

import org.springframework.stereotype.Service;
import org.uam.OrderFlow.model.Entrega;
import org.uam.OrderFlow.repository.RepositoryEntrega;

@Service
public class ServiceEntrega extends GenericService<Entrega, RepositoryEntrega> {
    public  ServiceEntrega(RepositoryEntrega repository) {super(repository);}
}
