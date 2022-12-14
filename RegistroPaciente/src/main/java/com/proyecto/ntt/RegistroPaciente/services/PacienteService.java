package com.proyecto.ntt.RegistroPaciente.services;

import com.proyecto.ntt.RegistroPaciente.dtos.PacienteCrear;
import org.springframework.http.ResponseEntity;

public interface PacienteService {

    public ResponseEntity<?> crearPaciente(PacienteCrear data);

    public ResponseEntity<?> consultaTodo();
}
