package com.consultorio.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.consultorio.entities.PacienteEntities;
import com.consultorio.repository.PacienteRepository;

public class PacienteServices {

	@Autowired
	private PacienteRepository pacienteRepository;

	public PacienteEntities savePaciente(PacienteEntities paciente) {
		return pacienteRepository.save(paciente);
	}

	public PacienteEntities getAllPaciente(Long id) {
		return pacienteRepository.findById(id).orElse(null);
	}

	public PacienteEntities getPacienteById(Long id) {
		return pacienteRepository.findById(id).orElse(null);
	}

	public void deletePaciente(Long id) {
		pacienteRepository.deleteById(id);
	}
}
