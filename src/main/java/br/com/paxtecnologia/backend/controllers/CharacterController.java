package br.com.paxtecnologia.backend.controllers;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.paxtecnologia.backend.entity.CharacterEntity;
import br.com.paxtecnologia.backend.services.CharacterService;
import lombok.NonNull;

@RestController
public class CharacterController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CharacterService service;

	// Salvar personagem
	@PostMapping(value = "/personagem/")
	public @NonNull Long save(final @RequestBody @Valid CharacterEntity character) {
		log.info("Salvando personagem na database");
		service.save(character);
		return character.getId();
	}

}
