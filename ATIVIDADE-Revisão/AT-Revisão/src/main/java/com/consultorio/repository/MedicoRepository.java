package com.consultorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultorio.entities.MedicoEntities;

public interface MedicoRepository extends JpaRepository<MedicoEntities, Long>{

}
