package com.example.MartesProfe.services;

import com.example.MartesProfe.dtos.CursoEditarPorNombre;
import com.example.MartesProfe.dtos.CursoParaCrearDto;
import org.springframework.http.ResponseEntity;

public interface CursoService {

    public ResponseEntity<?> crear(CursoParaCrearDto dto);

    public ResponseEntity<?> consultarTodos();

    public ResponseEntity<?> consultarPorId(Long id);

    public ResponseEntity<?> modificar(Long idAModificar,CursoParaCrearDto data);

    public ResponseEntity<?> eliminar(Long idAEliminar);


    public ResponseEntity<?> modificarPorNombre(CursoEditarPorNombre dataEntrante);
}