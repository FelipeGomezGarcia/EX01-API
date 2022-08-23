package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Pertenecer;

public interface IPertenecerService {

	public List<Pertenecer> listarPertenecer();
	
	public Pertenecer guardarPertenecer(Pertenecer pertenecer);
	
	public void eliminarPertenecer(Long id);
	
	public Pertenecer pertencerXId(Long id);
}
