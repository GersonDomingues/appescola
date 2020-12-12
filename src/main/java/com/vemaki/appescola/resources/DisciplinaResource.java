package com.vemaki.appescola.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vemaki.appescola.domain.Disciplina;
import com.vemaki.appescola.services.DisciplinaService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/disciplinas")
public class DisciplinaResource {
	
	
	@Autowired
	private DisciplinaService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Disciplina>> findAll() {
		List<Disciplina> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Disciplina> find(@PathVariable Integer id) {
		Disciplina obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Disciplina obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	

}
