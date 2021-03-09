package br.com.paxtecnologia.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "character")
@EqualsAndHashCode(callSuper = false)
public class CharacterEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2693127870255042702L;
	
	private String name;
	
}
