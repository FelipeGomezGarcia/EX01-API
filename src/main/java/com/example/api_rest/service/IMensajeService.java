package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Mensaje;

public interface IMensajeService {

	public List<Mensaje> listarMensajes();
	
	public Mensaje mensajeXId(Long id);
	
	public Mensaje guardarMensaje(Mensaje mensaje);
	
	public void eliminarMensaje(Long id);
}
