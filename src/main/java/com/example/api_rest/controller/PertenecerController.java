package com.example.api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_rest.dto.Pertenecer;
import com.example.api_rest.service.PertenecerServiceImpl;

@RestController
@RequestMapping("/api")
public class PertenecerController {

	@Autowired
	PertenecerServiceImpl  pertenecerServiceImpl;
	
	@GetMapping("/pertences")
	public List<Pertenecer> listarPerteneces(){
		return pertenecerServiceImpl.listarPertenecer();
	}
	
	@GetMapping("/pertences/{id}")
	public Pertenecer pertenecerXId(@PathVariable(name="id")Long id) {
		return pertenecerServiceImpl.pertencerXId(id);
	}
	
	@PostMapping("/pertences")
	public Pertenecer guardarPertenecer(@RequestBody Pertenecer pertenecer) {
		return pertenecerServiceImpl.guardarPertenecer(pertenecer);
	}
	
	@PutMapping("/pertences/{id}")
	public Pertenecer actualizarPertenecer(@PathVariable(name="id")Long id,@RequestBody Pertenecer pertenecer) {
		Pertenecer perteneceActualizado = pertenecerServiceImpl.pertencerXId(id);
		perteneceActualizado.setUsuario(pertenecer.getUsuario());
		perteneceActualizado.setGrupo(pertenecer.getGrupo());
		
		return pertenecerServiceImpl.guardarPertenecer(perteneceActualizado);
	}
	
	@DeleteMapping("/pertences/{id}")
	public void elimniarPertenecer(@PathVariable(name="id")Long id) {
		pertenecerServiceImpl.eliminarPertenecer(id);
	}
}
