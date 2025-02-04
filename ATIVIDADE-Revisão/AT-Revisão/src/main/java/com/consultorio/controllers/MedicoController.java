package com.consultorio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.consultorio.entities.MedicoEntities;
import com.consultorio.services.MedicoServices;

public class MedicoController {

	@Autowired
	private MedicoServices MedicoServices;
	
	@PostMapping
	public MedicoEntities createMedico(MedicoEntities medico) {
		
		return MedicoServices.saveMedico(medico);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MedicoEntities> getAllMedico(Long id) {
		
		MedicoEntities medico = MedicoServices.getMedicoById(id);
		
		if(medico != null) {
			return ResponseEntity.ok(medico);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/{id}")
	public MedicoEntities getMedico(@PathVariable Long id) {
		
		return MedicoServices.getMedicoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMedico(@PathVariable Long id) {
		MedicoServices.deleteMedico(id);
	}
}
