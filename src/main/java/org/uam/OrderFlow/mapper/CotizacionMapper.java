package org.uam.OrderFlow.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.uam.OrderFlow.dto.ClienteDTO;
import org.uam.OrderFlow.dto.CotizacionDTO;
import org.uam.OrderFlow.model.Cliente;
import org.uam.OrderFlow.model.Cotizacion;

@Mapper(componentModel = "spring")
public interface CotizacionMapper {
    CotizacionMapper INSTANCE = Mappers.getMapper(CotizacionMapper.class);

    CotizacionDTO cotizacionToCotizacionDTO(Cotizacion entity);

    Cotizacion cotizacionDTOToCotizacion(CotizacionDTO dto);
}
