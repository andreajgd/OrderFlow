package org.uam.OrderFlow.service;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

@Service
@EnableCaching
public class UsuarioLookupService {
    private final UsuarioAdminRepository adminRepo;
    private final UsuarioEgresadoRepository egresadoRepo;


}
