package com.example.ProyectoLunes.services;

import com.example.ProyectoLunes.dtos.UsuarioParaCrear;
import org.springframework.http.ResponseEntity;

public interface UsuarioService {
    //inyeccion de dependencia o aruitectura por capas debe ir en el controllador como constructor
    //en las implementaciones debe estar la logica del negocio
    public ResponseEntity<?> crearDesdeElService(UsuarioParaCrear dataEntrante);

    public ResponseEntity<?> consultarTodo();

    public ResponseEntity<?> consultarUno(Long id);
//? para declarar cualquier tipo de elemento
    public ResponseEntity<?> actualizar(Long idActualizar,UsuarioParaCrear dataEntrante);

    public ResponseEntity<?> borrar(Long id);

    public ResponseEntity<?> buscarPorNombre(String nombre,String clave);

}
