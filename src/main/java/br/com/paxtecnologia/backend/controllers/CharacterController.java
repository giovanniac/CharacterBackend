package br.com.paxtecnologia.backend.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@RequestMapping(value = "/personagem/", method = RequestMethod.POST)
	@ResponseBody
	public @NonNull void save(final @RequestBody @Valid CharacterEntity character) {
		log.info("Incluindo personagem");
		service.save(character);
	}

	// Buscar por ID
	@RequestMapping(value = "/personagem/{id}", method = RequestMethod.GET)
	@ResponseBody
	public void findById(@PathVariable("id") int id) {
		service.findById(id);
	}

}
