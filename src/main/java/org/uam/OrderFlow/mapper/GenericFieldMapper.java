package org.uam.OrderFlow.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.uam.OrderFlow.dto.GenericoDTO;
import org.uam.OrderFlow.model.EntityBase;

@Mapper(config= CentralMapperConfig.class)
public interface GenericFieldMapper {
    //entity->dto
    GenericoDTO toGenericoDTO(EntityBase entity);

    //dto -> entity
    void updateEntityFromGenericDTO(GenericoDTO dto, @MappingTarget EntityBase entity);
}
