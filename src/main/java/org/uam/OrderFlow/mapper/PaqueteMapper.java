package org.uam.OrderFlow.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.uam.OrderFlow.dto.PaqueteDTO;
import org.uam.OrderFlow.model.Paquete;

@Mapper(componentModel = "spring", uses = ClienteMapper.class)
public interface PaqueteMapper {
    PaqueteMapper INSTANCE = Mappers.getMapper(PaqueteMapper.class);

    PaqueteDTO paquetetoPaqueteDto(Paquete entity);

    Paquete paqueteDTOtoPaquete(PaqueteDTO dto);
}