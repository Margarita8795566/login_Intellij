package com.example.ProyectoEjemploLogin.services.Impl;

import com.example.ProyectoEjemploLogin.dtos.UsuarioLogin;
import com.example.ProyectoEjemploLogin.entities.Usuario;
import com.example.ProyectoEjemploLogin.repositories.UsuarioRepository;
import com.example.ProyectoEjemploLogin.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<?> crearLoginService(UsuarioLogin data) {
        Usuario usu = new Usuario();
        usu.setNombre(data.getNombre());
        usu.setClave(data.getClave());
        data.getClave();
        Usuario usuarioListo=repository.save(usu);

        return ResponseEntity.status(HttpStatus.OK).body("Datos requistrados correctamente");
    }

    @Override
    public ResponseEntity<?> consultarUno() {
        List<Usuario> usu = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(usu);
    }
}
