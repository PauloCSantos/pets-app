package com.multistack.petsapi.petsapi.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multistack.petsapi.petsapi.core.models.Adocao;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

}