package br.com.paxtecnologia.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paxtecnologia.backend.entity.CharacterEntity;
import br.com.paxtecnologia.backend.repository.CharacterRepository;

@Service
public class CharacterService {

	@Autowired
	CharacterRepository repository;

	public void save(final CharacterEntity character) {
		repository.save(character);
	}

	public Object findById(Integer id) {
		return repository.findById(id);
	}

}