package com.vemaki.appescola.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vemaki.appescola.domain.Disciplina;
import com.vemaki.appescola.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	@Autowired
	private DisciplinaRepository repo;
	
	
	public List<Disciplina> findAll() {
		return repo.findAll();
	}
	public Disciplina find(Integer id) {
		 Optional<Disciplina> obj = repo.findById(id);
		return obj.orElse(null);
		} 

	public Disciplina insert(Disciplina obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	public Disciplina update(Disciplina obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}
