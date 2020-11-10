package com.vemaki.appescola.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vemaki.appescola.domain.Disciplina;

@RestController
@RequestMapping(value="/disciplinas")
public class DisciplinaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Disciplina> listar() {
		
		Disciplina di1 = new Disciplina(1, "Português");
		Disciplina di2 = new Disciplina(1, "Matemática");
		
		List<Disciplina> lista = new ArrayList<>();
		lista.add(di1);
		lista.add(di2);
		
		return lista;
		
		
		
	}

}
