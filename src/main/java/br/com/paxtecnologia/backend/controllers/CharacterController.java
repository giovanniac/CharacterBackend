package br.com.paxtecnologia.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paxtecnologia.backend.entity.CharacterEntity;
import br.com.paxtecnologia.backend.services.CharacterService;

@RestController
@RequestMapping("/characters")
public class CharacterController {

	@Autowired
	private CharacterService service;

	@GetMapping
	public List<CharacterEntity> getAllCharacters() {
		return service.getAll();

	}

	@PostMapping
	public List<CharacterEntity> saveCharacter(@RequestBody CharacterEntity character) {
		service.save(character);
		return service.getAll();

	}

	@GetMapping("/{id}")
	public ResponseEntity<CharacterEntity> getCharacterById(@PathVariable(name = "id") Integer id) {

		Optional<CharacterEntity> optional = service.findById(id);

		if (optional.isPresent()) {
			CharacterEntity character = service.getOne(id);
			return new ResponseEntity<>(character, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
