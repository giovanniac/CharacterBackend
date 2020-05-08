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

import br.com.paxtecnologia.backend.entity.Character;
import br.com.paxtecnologia.backend.services.CharacterService;

@RestController
@RequestMapping("/")
public class CharacterController {

	@Autowired
	private CharacterService service;

	@GetMapping("/characters")
	public List<Character> getAllCharacters() {
		return service.getAll();

	}

	@PostMapping("/characters")
	public List<Character> saveCharacter(@RequestBody Character character) {
		service.save(character);
		return service.getAll();

	}

	@GetMapping("/characters/{id}")
	public ResponseEntity<Character> getCharacterById(@PathVariable(name = "id") Integer id) {

		Optional<Character> optional = service.findById(id);

		if (optional.isPresent()) {
			Character character = service.getOne(id);
			return new ResponseEntity<>(character, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
