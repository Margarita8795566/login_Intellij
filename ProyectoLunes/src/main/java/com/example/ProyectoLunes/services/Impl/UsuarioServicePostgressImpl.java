package com.example.ProyectoLunes.services.Impl;

import com.example.ProyectoLunes.dtos.UsuarioParaCrear;
import com.example.ProyectoLunes.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UsuarioServicePostgressImpl implements UsuarioService {
    @Override
    public ResponseEntity<?> crearDesdeElService(UsuarioParaCrear dataEntrante) {
        return ResponseEntity.status(HttpStatus.OK).body("Estoy guardando  en Postgress");
    }

    @Override
    public ResponseEntity<?> consultarTodo() {
        return null;
    }

    @Override
    public ResponseEntity<?> consultarUno(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> actualizar(Long idActualizar, UsuarioParaCrear data) {
        return null;
    }

    @Override
    public ResponseEntity<?> borrar(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> buscarPorNombre(String nombre, String clave) {
        return null;
    }
}
