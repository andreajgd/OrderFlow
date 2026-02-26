package org.uam.OrderFlow.service;

import org.springframework.stereotype.Service;
import org.uam.OrderFlow.model.RutaReparto;
import org.uam.OrderFlow.repository.RepositoryRutaReparto;

@Service
public class ServiceRutaReparto extends GenericService<RutaReparto, RepositoryRutaReparto> {
    public ServiceRutaReparto(RepositoryRutaReparto repository) {super(repository);}
}
