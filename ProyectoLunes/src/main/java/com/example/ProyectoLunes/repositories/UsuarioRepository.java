package com.example.ProyectoLunes.repositories;

import com.example.ProyectoLunes.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

//se utiliza paar ir a guardad a la base de datos
//nombre de la clase que viene de entities y el tipo de dato primary key nos provee todas las consultas de sql CRud etc
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    @Query("SELECT u FROM Usuario u where u.nombre=?1")
    Optional<Usuario> buscarPorNombre(String nombre);
}
