package org.uam.OrderFlow.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;
import org.uam.OrderFlow.dto.RutaRepartoDTO;
import org.uam.OrderFlow.model.RutaReparto;

@Mapper(componentModel = "spring", uses = EmpleadoMapper.class)
public interface RutaRepartoMapper {
    RutaRepartoMapper INSTANCE = Mappers.getMapper(RutaRepartoMapper.class);

    RutaRepartoDTO rutaRepartotoRutaRepartoDto(RutaReparto entity);

    RutaReparto rutaRepartoDTOtoRutaReparto(RutaRepartoDTO dto);
}