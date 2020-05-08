package br.com.paxtecnologia.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.paxtecnologia.backend.entity.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {

}
