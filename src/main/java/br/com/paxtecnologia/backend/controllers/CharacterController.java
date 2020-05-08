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
import br.com.paxtecnologia.backend.repository.CharacterRepository;

@RestController
@RequestMapping("/")
public class CharacterController {

	@Autowired
	private CharacterRepository repository;

	@GetMapping("/characters")
	public List<Character> getAllEmployees() {
		return repository.findAll();

	}
	
	@PostMapping("/characters")
	public List<Character> saveEmployee(@RequestBody Character character) {
		repository.save(character);
		return repository.findAll();

	}
	
	@GetMapping("/characters/{id}")
	public ResponseEntity<Character> getCharacterById(@PathVariable(name = "id") Integer id) {

		Optional<Character> optional = repository.findById(id);

		if (optional.isPresent()) {
			Character employee = repository.getOne(id);
			return new ResponseEntity<>(employee, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
