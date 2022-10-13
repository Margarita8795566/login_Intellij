package com.example.MartesProfe.services;

import com.example.MartesProfe.dtos.AutorParaGuardar;
import org.springframework.http.ResponseEntity;

public interface AutorService {

    public ResponseEntity<?> crear(AutorParaGuardar dto);

    public ResponseEntity<?> consultarTodos();

    public ResponseEntity<?> consultarPorId(Long id);

    public ResponseEntity<?> modificar(Long idAModificar,AutorParaGuardar data);

    public ResponseEntity<?> eliminar(Long idAEliminar);
}
