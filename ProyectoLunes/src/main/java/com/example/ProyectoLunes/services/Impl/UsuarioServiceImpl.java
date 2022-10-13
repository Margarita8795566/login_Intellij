package com.example.ProyectoLunes.services.Impl;

import com.example.ProyectoLunes.dtos.UsuarioParaCrear;
import com.example.ProyectoLunes.entities.Usuario;
import com.example.ProyectoLunes.repositories.UsuarioRepository;
import com.example.ProyectoLunes.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<?> crearDesdeElService(UsuarioParaCrear dataEntrante) {
        //ingresar nuevo usuario
        Usuario usuarioNoGuardado = new Usuario();
        usuarioNoGuardado.setNombre(dataEntrante.getNombre());
        usuarioNoGuardado.setClave(dataEntrante.getClave());
        Usuario usuarioCreado=repository.save(usuarioNoGuardado);
        return ResponseEntity.status(HttpStatus.OK).body("Estoy guardando  en Mysql");
    }

    @Override
    public ResponseEntity<?> consultarTodo() {
        //con el list los muestra en una lista
        //con el.find All metodo que muestra too
        List<Usuario> usuarios = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(usuarios);
    }

    @Override
    public ResponseEntity<?> consultarUno(Long id) {

        Usuario usuarioEnBD = (Usuario) repository.findById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(usuarioEnBD);
    }

    @Override
    public ResponseEntity<?> actualizar(Long idActualizar, UsuarioParaCrear data) {
        Usuario usuarioEnBD = (Usuario) repository.findById(idActualizar).orElse(null);
        usuarioEnBD.setNombre(data.getNombre());
        usuarioEnBD.setClave(data.getClave());
        Usuario usuarioActualizado =repository.save(usuarioEnBD);
        return ResponseEntity.status(HttpStatus.OK).body(usuarioActualizado);
    }
    @Override
    public ResponseEntity<?> borrar(Long id) {
        repository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
    }

    @Override
   public ResponseEntity<?> buscarPorNombre(String nombre, String clave) {
        Usuario usuarioEnBD =repository.buscarPorNombre(nombre).orElse(null);
        boolean claveOK=usuarioEnBD.getClave().equals(clave);
        return ResponseEntity.status(HttpStatus.OK).body(claveOK);

    }
   /* public ResponseEntity<?> buscarPorNombre(String nombre, String clave) {
        Usuario usuarioEnBD = repository.buscarPorNombre(nombre).orElse(null);
         boolean claveEnBDesIgualAClaveEntrante=usuarioEnBD.getClave().equals(clave);

        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("la clave Ok",claveEnBDesIgualAClaveEntrante);
        respuesta.put("Nombre",nombre);
        respuesta.put("la clave en BD",usuarioEnBD.getClave());
        respuesta.put("la clave entrante",clave);

         return ResponseEntity.status(HttpStatus.OK).body(respuesta);
    }*/

}
