package org.uam.OrderFlow.mapper;

import java.util.List;

public interface GenericMapper<E,D>{
    E toEntity(D dto);
    D toDto(E dto);
    List<D> toDtoList (List<E> entities);
    List<E> toEntitylist (List<D> dtos);
}
