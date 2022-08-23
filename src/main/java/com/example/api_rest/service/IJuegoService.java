package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Juego;

public interface IJuegoService {

	public List<Juego> listarJuegos();
	
	public Juego guardarJuego(Juego juego);
	
	public void elimniarJuego(Long id);
	
	public Juego buscarXNombre(String nombre);
	
	public Juego juegoXId(Long id);
}
