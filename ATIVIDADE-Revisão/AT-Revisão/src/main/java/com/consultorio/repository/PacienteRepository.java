package com.consultorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultorio.entities.PacienteEntities;

public interface PacienteRepository extends JpaRepository<PacienteEntities, Long>{

}
