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

import com.example.api_rest.dto.Mensaje;
import com.example.api_rest.service.MensajeServiceImpl;

@RestController
@RequestMapping("/api")
public class MensajeController {
	@Autowired
	MensajeServiceImpl  mensajeServiceImpl;
	
	@GetMapping("/mensajes")
	public List<Mensaje> listarMensajes(){
		return mensajeServiceImpl.listarMensajes();
	}
	
	@GetMapping("/mensajes/{id}")
	public Mensaje mensajeXId(@PathVariable(name="id")Long id) {
		return mensajeServiceImpl.mensajeXId(id);
	}
	
	@PostMapping("/mensajes")
	public Mensaje guardarMensaje(@RequestBody Mensaje pertenecer) {
		return mensajeServiceImpl.guardarMensaje(pertenecer);
	}
	
	@PutMapping("/mensajes/{id}")
	public Mensaje actualizarMensaje(@PathVariable(name="id")Long id,@RequestBody Mensaje mensaje) {
		Mensaje mensajeActualizado = mensajeServiceImpl.mensajeXId(id);
		mensajeActualizado.setUsuario(mensaje.getUsuario());
		mensajeActualizado.setGrupo(mensaje.getGrupo());
		mensajeActualizado.setBody(mensaje.getBody());
		
		return mensajeServiceImpl.guardarMensaje(mensajeActualizado);
	}
	
	@DeleteMapping("/mensajes/{id}")
	public void elimniarMensaje(@PathVariable(name="id")Long id) {
		mensajeServiceImpl.eliminarMensaje(id);
	}
}
