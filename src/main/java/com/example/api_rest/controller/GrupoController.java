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

import com.example.api_rest.dto.Grupo;
import com.example.api_rest.service.GrupoServiceImpl;

@RestController
@RequestMapping("/api")
public class GrupoController {
	@Autowired
	GrupoServiceImpl  grupoServiceImpl;
	
	@GetMapping("/grupos")
	public List<Grupo> listarGrupos(){
		return grupoServiceImpl.listarGrupos();
	}
	
	@GetMapping("/grupos/{id}")
	public Grupo grupoXId(@PathVariable(name="id")Long id) {
		return grupoServiceImpl.grupoXId(id);
	}
	
	@PostMapping("/grupos")
	public Grupo guardarGrupo(@RequestBody Grupo grupo) {
		return grupoServiceImpl.guardarGrupo(grupo);
	}
	
	@PutMapping("/grupos/{id}")
	public Grupo actualizarGrupo(@PathVariable(name="id")Long id,@RequestBody Grupo grupo) {
		Grupo grupoActualizado = grupoServiceImpl.grupoXId(id);
		grupoActualizado.setNombre(grupo.getNombre());
		grupoActualizado.setJuego(grupo.getJuego());
		grupoActualizado.setUsuarioCreador(grupo.getUsuarioCreador());
		
		return grupoServiceImpl.guardarGrupo(grupoActualizado);
	}
	
	@DeleteMapping("/grupos/{id}")
	public void elimniarGrupo(@PathVariable(name="id")Long id) {
		grupoServiceImpl.eliminarGrupo(id);
	}
	
	@GetMapping("/grupos/nombre/{nombre}")
	public Grupo buscarXNombre(@PathVariable(name="nombre")String nombre) {
		return grupoServiceImpl.buscarXNombre(nombre);
	}
}
