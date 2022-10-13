package com.example.ProyectoEjemploLogin.repositories;

import com.example.ProyectoEjemploLogin.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
