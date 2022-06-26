package com.multistack.petsapi.petsapi.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multistack.petsapi.petsapi.core.exceptions.PetNotFoundException;
import com.multistack.petsapi.petsapi.core.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

	default Pet findByIdOrElseThrow(Long id) {
		return findById(id).orElseThrow(PetNotFoundException::new);
	}

}