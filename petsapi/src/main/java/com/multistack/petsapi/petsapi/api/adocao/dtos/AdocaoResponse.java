package com.multistack.petsapi.petsapi.api.adocao.dtos;

import java.math.BigDecimal;

import com.multistack.petsapi.petsapi.api.pet.dtos.PetResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdocaoResponse {

	private Long id;
	private String email;
	private BigDecimal valor;
	private PetResponse pet;

}