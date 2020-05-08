package br.com.paxtecnologia.backend.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

//	private CharacterRepository characterRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		characterRepository.save(new Character(1,"Robert"));
//		characterRepository.save(new Character(2,"Iron Man"));	
//		characterRepository.save(new Character(3,"Shiryu"));	
//	}
//	

}
