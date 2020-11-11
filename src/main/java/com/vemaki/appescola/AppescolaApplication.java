package com.vemaki.appescola;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vemaki.appescola.domain.Disciplina;
import com.vemaki.appescola.repositories.DisciplinaRepository;

@SpringBootApplication
public class AppescolaApplication implements CommandLineRunner  {
	
	@Autowired
	private DisciplinaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppescolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Disciplina di1 = new Disciplina(null, "Português");
		Disciplina di2 = new Disciplina(null, "Matemática");
		
		categoriaRepository.saveAll(Arrays.asList(di1, di2)); 
		
	}

}
