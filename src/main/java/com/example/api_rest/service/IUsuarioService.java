package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Usuario;

public interface IUsuarioService {

	public List<Usuario> listarUsuarios();
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public void eliminarUsuario(Long id);
	
	public Usuario buscarXUsername(String username);
	
	public Usuario usuarioXId(Long id);
}
