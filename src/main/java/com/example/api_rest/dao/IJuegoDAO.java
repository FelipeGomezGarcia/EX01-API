package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Juego;

public interface IJuegoDAO extends JpaRepository<Juego, Long>{

	public Juego buscarXNombre(String nombre);
}
