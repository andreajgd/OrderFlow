package org.uam.OrderFlow.mapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;
import org.uam.OrderFlow.model.EntityBase;

import java.util.UUID;

@Component
public class EntityIdMapper {

    @PersistenceContext
    private EntityManager entityManager;

    @Named("entityToId")
    public UUID entityToId(EntityBase entity) {
        return entity != null ? entity.getId() : null;
    }

    @Named("idToEntity")
    public <T extends EntityBase> T idToEntity(UUID id, Class<T> entityClass) {
        if (id == null) {
            return null;
        }
        //devuelve un proxy sin consultar la base de datos
        return entityManager.getReference(entityClass, id);
    }
}
