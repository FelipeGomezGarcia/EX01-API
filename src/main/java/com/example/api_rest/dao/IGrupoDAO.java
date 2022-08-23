package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Grupo;

public interface IGrupoDAO extends JpaRepository<Grupo,Long>{

	public Grupo findByNombre(String nombre);
}
