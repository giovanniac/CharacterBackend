package br.com.paxtecnologia.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.paxtecnologia.backend.entity.CharacterEntity;

@Repository
public interface CharacterRepository extends CrudRepository<CharacterEntity, Integer>{
 
}
