package org.uam.OrderFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uam.OrderFlow.model.Paquete;

import java.util.UUID;

@Repository
public interface RepositoryPaquete extends JpaRepository<Paquete, UUID> {
}
