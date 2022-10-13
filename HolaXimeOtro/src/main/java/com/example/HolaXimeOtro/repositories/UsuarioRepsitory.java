package com.example.HolaXimeOtro.repositories;

import com.example.HolaXimeOtro.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepsitory extends JpaRepository <Usuario,Long> {
}
