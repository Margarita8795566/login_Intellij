package com.proyecto.ntt.RegistroPaciente.services.Impl;

import com.proyecto.ntt.RegistroPaciente.dtos.PacienteCrear;
import com.proyecto.ntt.RegistroPaciente.entities.Paciente;
import com.proyecto.ntt.RegistroPaciente.repositories.PacienteRepository;
import com.proyecto.ntt.RegistroPaciente.services.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class PacienteServiceImpl implements PacienteService {
    private final PacienteRepository repository;

    public PacienteServiceImpl(PacienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<?> crearPaciente(PacienteCrear data) {
        Paciente paciente = new Paciente();
        paciente.setNombre(data.getNombre());
        paciente.setRut(data.getRut());
        paciente.setTelefono(data.getTelefono());
        paciente.setEmail(data.getEmail());
        Paciente pacienteRegistrado=repository.save(paciente);
        return ResponseEntity.status(HttpStatus.OK).body("Datos requistrados correctamente");
    }


    @Override
    public ResponseEntity<?> consultaTodo() {
        return null;
    }
}
