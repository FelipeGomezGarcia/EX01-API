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

import com.example.api_rest.dto.Usuario;
import com.example.api_rest.service.UsuarioServiceImpl;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioServiceImpl  usuarioServiceImpl;
	
	@GetMapping("/users")
	public List<Usuario> listarUsuarios(){
		return usuarioServiceImpl.listarUsuarios();
	}
	
	@GetMapping("/users/{id}")
	public Usuario usuarioXId(@PathVariable(name="id")Long id) {
		return usuarioServiceImpl.usuarioXId(id);
	}
	
	@PostMapping("/users")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.guardarUsuario(usuario);
	}
	
	@PutMapping("/users/{id}")
	public Usuario actualizarUsuario(@PathVariable(name="id")Long id,@RequestBody Usuario usuario) {
		Usuario usuarioActualizado = usuarioServiceImpl.usuarioXId(id);
		usuarioActualizado.setUsername(usuario.getUsername());
		usuarioActualizado.setPass(usuario.getPass());
		usuarioActualizado.setGrupos(usuario.getGrupos());
		
		return usuarioServiceImpl.guardarUsuario(usuarioActualizado);
	}
	
	@DeleteMapping("/users/{id}")
	public void elimniarUsuario(@PathVariable(name="id")Long id) {
		usuarioServiceImpl.eliminarUsuario(id);
	}
	
	@GetMapping("/users/username/{username}")
	public Usuario buscarXUsername(@PathVariable(name="username")String username) {
		return usuarioServiceImpl.buscarXUsername(username);
	}
}
