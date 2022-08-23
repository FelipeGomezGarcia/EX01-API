package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IJuegoDAO;
import com.example.api_rest.dto.Juego;

@Service
public class JuegoServiceImpl implements IJuegoService{

	@Autowired
	IJuegoDAO iJuegoDAO;

	@Override
	public List<Juego> listarJuegos() {
		// TODO Auto-generated method stub
		return iJuegoDAO.findAll();
	}

	@Override
	public Juego guardarJuego(Juego juego) {
		// TODO Auto-generated method stub
		return iJuegoDAO.save(juego);
	}

	@Override
	public void elimniarJuego(Long id) {
		// TODO Auto-generated method stub
		iJuegoDAO.deleteById(id);
	}

	@Override
	public Juego buscarXNombre(String nombre) {
		// TODO Auto-generated method stub
		return iJuegoDAO.findByNombre(nombre);
	}

	@Override
	public Juego juegoXId(Long id) {
		// TODO Auto-generated method stub
		return iJuegoDAO.findById(id).get();
	}
	
}
