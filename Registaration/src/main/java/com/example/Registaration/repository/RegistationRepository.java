package com.example.Registaration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Registaration.entity.registrationEntity;

public interface RegistationRepository extends JpaRepository<registrationEntity, Integer>{
	
}
