package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Grupo;

public interface IGrupoService {

	public List<Grupo> listarGrupos();
	
	public Grupo guardarGrupo (Grupo grupo);
	
	public void eliminarGrupo(Long id);
	
	public Grupo buscarXNombre(String nombre);
}
