package com.example.MartesProfe.services.impl;

import com.example.MartesProfe.dtos.LibroParaGuardarDto;
import com.example.MartesProfe.repositories.LibroRepository;
import com.example.MartesProfe.services.LibroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl implements LibroService {

    private final LibroRepository repository;

    public LibroServiceImpl(LibroRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<?> guardar(LibroParaGuardarDto dto) {
        //Crear una Nueva Instancia de Libro
        Libro entidad = new Libro();
        //Setear el nombre a "Nuevo Libro"
        entidad.setNombre(dto.getNombre());
        //Guardar en BD y Leer lo Emitido por el Repository
        Libro guardado=repository.save(entidad);

        return ResponseEntity.status(HttpStatus.OK).body(guardado);
    }

}
