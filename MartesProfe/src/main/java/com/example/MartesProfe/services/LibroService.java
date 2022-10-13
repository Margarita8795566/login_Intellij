package com.example.MartesProfe.services;
import com.example.MartesProfe.dtos.LibroParaGuardarDto;
import org.springframework.http.ResponseEntity;

public interface LibroService {

    public ResponseEntity<?> guardar(LibroParaGuardarDto dto);

}