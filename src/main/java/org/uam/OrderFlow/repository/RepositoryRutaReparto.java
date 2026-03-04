package org.uam.OrderFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uam.OrderFlow.model.RutaReparto;

import java.util.UUID;

@Repository
public interface RepositoryRutaReparto extends JpaRepository<RutaReparto, UUID> {
}
