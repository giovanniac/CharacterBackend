package br.com.paxtecnologia.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paxtecnologia.backend.entity.Character;
import br.com.paxtecnologia.backend.repository.CharacterRepository;

@Service
public class CharacterService {

	@Autowired
	CharacterRepository repository;

	public void save(final Character character) {
		repository.save(character);
	}

	public Optional<Character> findById(Integer id) {
		return repository.findById(id);
	}

	public List<Character> getAll() {
		return repository.findAll();
	}

	public Character getOne(Integer id) {
		return repository.getOne(id);
	}

}