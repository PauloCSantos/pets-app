package com.multistack.petsapi.petsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.multistack.petsapi.petsapi.core.models.Pet;
import com.multistack.petsapi.petsapi.core.repositories.PetRepository;

@SpringBootApplication
public class PetsapiApplication implements CommandLineRunner {
	
	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(PetsapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Joaozinho");
		pet.setHistoria("Historia emocionante");
		pet.setFoto("https://uploads.metropoles.com/wp-content/uploads/2022/02/22155152/sera_que_voce_tem_um_pet_guloso_descubra_e_saiba_como_lidar_widexl-600x400.jpg");
		petRepository.save(pet);
	}

}
