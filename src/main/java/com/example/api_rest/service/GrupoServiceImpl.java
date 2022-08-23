package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IGrupoDAO;
import com.example.api_rest.dto.Grupo;

@Service
public class GrupoServiceImpl implements IGrupoService{

	@Autowired
	IGrupoDAO iGrupoDAO;
	
	@Override
	public List<Grupo> listarGrupos() {
		// TODO Auto-generated method stub
		return iGrupoDAO.findAll();
	}

	@Override
	public Grupo guardarGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		return iGrupoDAO.save(grupo);
	}

	@Override
	public void eliminarGrupo(Long id) {
		// TODO Auto-generated method stub
		iGrupoDAO.deleteById(id);
	}

	@Override
	public Grupo buscarXNombre(String nombre) {
		// TODO Auto-generated method stub
		return iGrupoDAO.findByNombre(nombre);
	}

	@Override
	public Grupo grupoXId(Long id) {
		// TODO Auto-generated method stub
		return iGrupoDAO.findById(id).get();
	}


}
