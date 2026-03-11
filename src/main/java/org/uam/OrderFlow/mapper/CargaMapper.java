package org.uam.OrderFlow.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.uam.OrderFlow.dto.CargaDTO;
import org.uam.OrderFlow.model.Carga;

@Mapper(config = CentralMapperConfig.class,
uses = {GenericFieldMapper.class,
        EntityIdMapper.class
})
public interface CargaMapper extends GenericMapper<Carga, CargaDTO> {
    @Override
    @Mapping(
            target = "id", source ="dto.generico.id"
    )

    Carga toEntity(CargaDTO dto);

    @Override
    CargaDTO toDto(Carga dto);
}
