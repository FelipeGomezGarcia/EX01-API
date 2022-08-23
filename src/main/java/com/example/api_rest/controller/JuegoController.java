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

import com.example.api_rest.dto.Juego;
import com.example.api_rest.service.JuegoServiceImpl;

@RestController
@RequestMapping("/api")
public class JuegoController {

	@Autowired
	JuegoServiceImpl  juegoServiceImpl;
	
	@GetMapping("/juegos")
	public List<Juego> listarJuegos(){
		return juegoServiceImpl.listarJuegos();
	}
	
	@GetMapping("/juegos/{id}")
	public Juego juegoXId(@PathVariable(name="id")Long id) {
		return juegoServiceImpl.juegoXId(id);
	}
	
	@PostMapping("/juegos")
	public Juego guardarJuego(@RequestBody Juego juego) {
		return juegoServiceImpl.guardarJuego(juego);
	}
	
	@PutMapping("/juegos/{id}")
	public Juego actualizarJuego(@PathVariable(name="id")Long id,@RequestBody Juego juego) {
		Juego juegoActualizado = juegoServiceImpl.juegoXId(id);
		juegoActualizado.setNombre(juego.getNombre());
		juegoActualizado.setEdad(juego.getEdad());
		juegoActualizado.setCategoria(juego.getCategoria());
		juegoActualizado.setGrupos(juego.getGrupos());
		
		return juegoServiceImpl.guardarJuego(juegoActualizado);
	}
	
	@DeleteMapping("/juegos/{id}")
	public void elimniarJuego(@PathVariable(name="id")Long id) {
		juegoServiceImpl.elimniarJuego(id);
	}
	
	@GetMapping("/juegos/nombre/{nombre}")
	public Juego buscarXNombre(@PathVariable(name="nombre")String nombre) {
		return juegoServiceImpl.buscarXNombre(nombre);
	}
}
