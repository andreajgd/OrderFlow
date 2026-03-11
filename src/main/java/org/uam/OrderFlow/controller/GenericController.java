package org.uam.OrderFlow.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.uam.OrderFlow.model.EntityBase;
import org.uam.OrderFlow.service.GenericService;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

public abstract class GenericController<E extends EntityBase, DTO> {

    protected final GenericService<E, ?> service;
    protected final Function<E, DTO> toDto;
    protected final Function<DTO, E> toEntity;

    public GenericController(GenericService<E, ?> service,
                             Function<E, DTO> toDto,
                             Function<DTO, E> toEntity) {
        this.service = service;
        this.toDto = toDto;
        this.toEntity = toEntity;
    }

    //obtener todos
    @GetMapping("/all")
    public ResponseEntity<List<DTO>> all() {
        return ResponseEntity.ok(service.findAll().stream()
                .map(toDto)
                .toList());
    }

    /*//obtener todos con paginación y ordenamiento
    @GetMapping("/all/paged")
    public ResponseEntity<Page<DTO>> allPaged(Pageable pageable) {
        Page<E> page = service.findAll(pageable);
        return ResponseEntity.ok(page.map(toDto));
    }*/

    //obtener por ID
    @GetMapping("/{id}")
    public ResponseEntity<DTO> getById(@PathVariable UUID id) {
        E entity = service.findById(id);
        return ResponseEntity.ok(toDto.apply(entity));
    }

    //verificar si existe un registro con ese ID
    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> exists(@PathVariable UUID id) {
        return ResponseEntity.ok(service.existsById(id));
    }

    //contar total de registros
    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(service.count());
    }

    //crear un nuevo registro
    @PostMapping("/create")
    public ResponseEntity<DTO> create(@RequestBody DTO dto) {
        E entity = toEntity.apply(dto);
        E saved = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(toDto.apply(saved));
    }

    //actualizar un registro existente
    @PutMapping("/{id}")
    public ResponseEntity<DTO> update(@PathVariable UUID id, @RequestBody DTO dto) {
        E entity = toEntity.apply(dto);
        E updated = service.update(id, entity);
        return ResponseEntity.ok(toDto.apply(updated));
    }

    //eliminar un registro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}