package br.com.paxtecnologia.backend.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paxtecnologia.backend.entity.CharacterEntity;
import br.com.paxtecnologia.backend.repository.CharacterRepository;

@Service
public class CharacterService implements ServicesInterface<CharacterEntity> {

	@Autowired
	CharacterRepository repository;

	@Override
	public void save(CharacterEntity character) {
		character.setId(UUID.randomUUID());
		repository.save(character);
	}

	@Override
	public Optional<CharacterEntity> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public List<CharacterEntity> getAll() {
		return repository.findAll();
	}

	@Override
	public CharacterEntity getOne(Integer id) {
		return repository.getOne(id);
	}

}