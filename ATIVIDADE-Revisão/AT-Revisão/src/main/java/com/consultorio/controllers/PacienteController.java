package com.consultorio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.consultorio.entities.PacienteEntities;
import com.consultorio.services.PacienteServices;

public class PacienteController {

	@Autowired
	private PacienteServices PacienteServices;
	
	@PostMapping
	public PacienteEntities createPaciente(PacienteEntities paciente) {
		
		return PacienteServices.savePaciente(paciente);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PacienteEntities> getAllPaciente(Long id) {
		
		PacienteEntities paciente = PacienteServices.getPacienteById(id);
		
		if(paciente != null) {
			return ResponseEntity.ok(paciente);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/{id}")
	public PacienteEntities getPaciente(@PathVariable Long id) {
		
		return PacienteServices.getPacienteById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletePaciente(@PathVariable Long id) {
		PacienteServices.deletePaciente(id);
	}
}
