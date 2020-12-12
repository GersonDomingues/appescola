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
		Disciplina di3 = new Disciplina(null, "Química");
		Disciplina di4 = new Disciplina(null, "Fisica");
		Disciplina di5 = new Disciplina(null, "Historia");
		Disciplina di6 = new Disciplina(null, "Geografia");
		categoriaRepository.saveAll(Arrays.asList(di1, di2, di3, di4, di5, di6)); 
		
	}

}
