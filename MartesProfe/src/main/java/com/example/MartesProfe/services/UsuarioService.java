package com.example.MartesProfe.services;

import com.example.MartesProfe.dtos.UsuarioParaCrear;
import org.springframework.http.ResponseEntity;

public interface UsuarioService {

    public ResponseEntity<?> crearDesdeElService(UsuarioParaCrear dataEntrante);

    public ResponseEntity<?> consultarTodo();

    public ResponseEntity<?> consultarUno(Long id);

    public ResponseEntity<?> actualizar(Long idActualizar, UsuarioParaCrear data);

    public ResponseEntity<?> borrar(Long id);

    public ResponseEntity<?> buscarPorNombre(String nombre,String clave);
}
