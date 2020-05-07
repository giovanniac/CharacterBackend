package br.com.paxtecnologia.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CharacterEntity{
	
	@NonNull
	private Long id;
	
	@NonNull
	private String name;

}
