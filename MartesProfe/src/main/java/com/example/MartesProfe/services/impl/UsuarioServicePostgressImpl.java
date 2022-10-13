package com.example.MartesProfe.services.impl;

import com.example.MartesProfe.dtos.UsuarioParaCrear;
import com.example.MartesProfe.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UsuarioServicePostgressImpl implements UsuarioService {
    @Override
    public ResponseEntity<?> crearDesdeElService(UsuarioParaCrear dataEntrante) {
        return ResponseEntity.status(HttpStatus.OK).body("Estoy guardando en Postgress");
    }

    @Override
    public ResponseEntity<?> consultarTodo() {
        return ResponseEntity.status(HttpStatus.OK).body("Estoy guardando en Postgress");
    }

    @Override
    public ResponseEntity<?> consultarUno(Long id) {
        return ResponseEntity.status(HttpStatus.OK).body("Estoy guardando en Postgress");
    }

    @Override
    public ResponseEntity<?> actualizar(Long idActualizar, UsuarioParaCrear data) {
        return ResponseEntity.status(HttpStatus.OK).body("Estoy guardando en Postgress");
    }

    @Override
    public ResponseEntity<?> borrar(Long id) {
        return ResponseEntity.status(HttpStatus.OK).body("Estoy guardando en Postgress");
    }

    @Override
    public ResponseEntity<?> buscarPorNombre(String nombre,String clave) {
        return ResponseEntity.status(HttpStatus.OK).body("Estoy guardando en Postgress");
    }
}
