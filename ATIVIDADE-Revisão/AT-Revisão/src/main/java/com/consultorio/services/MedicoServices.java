package com.consultorio.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.consultorio.entities.MedicoEntities;
import com.consultorio.repository.MedicoRepository;



public class MedicoServices {

	@Autowired
	private MedicoRepository medicoRepository;
	
	public MedicoEntities saveMedico(MedicoEntities medico) {
		return medicoRepository.save(medico);
	}
	
	
	public MedicoEntities getAllMedico(Long id) {
		return medicoRepository.findById(id).orElse(null);
	}
	
	public MedicoEntities getMedicoById(Long id) {
		return medicoRepository.findById(id).orElse(null);
	}
	
	public void deleteMedico(Long id) {
		medicoRepository.deleteById(id);
	}
}
