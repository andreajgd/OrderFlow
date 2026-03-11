package org.uam.OrderFlow.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.uam.OrderFlow.dto.EntregaDTO;
import org.uam.OrderFlow.model.Entrega;

@Mapper(componentModel = "spring", uses = {PaqueteMapper.class, RutaRepartoMapper.class})
public interface EntregaMapper {
    EntregaMapper INSTANCE = Mappers.getMapper(EntregaMapper.class);

    EntregaDTO entregatoEntregaDto(Entrega entity);

    Entrega entregaDTOtoEntrega(EntregaDTO dto);
}