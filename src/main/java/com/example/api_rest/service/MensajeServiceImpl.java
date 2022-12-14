package com.example.api_rest.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IMensajeDAO;
import com.example.api_rest.dto.Mensaje;

@Service
public class MensajeServiceImpl implements IMensajeService{

	@Autowired
	IMensajeDAO iMensajeDAO;

	@Override
	public List<Mensaje> listarMensajes() {
		// TODO Auto-generated method stub
		return iMensajeDAO.findAll();
	}

	@Override
	public Mensaje mensajeXId(Long id) {
		// TODO Auto-generated method stub
		return iMensajeDAO.findById(id).get();
	}

	@Override
	public Mensaje guardarMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		Long milisecond = System.currentTimeMillis();
		Date fecha = new Date(milisecond);
		mensaje.setFecha(fecha);
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public void eliminarMensaje(Long id) {
		// TODO Auto-generated method stub
		iMensajeDAO.deleteById(id);
	}

	@Override
	public List<Mensaje> mensajesXGrupo(Long id) {
		// TODO Auto-generated method stub
		return iMensajeDAO.findByGrupo(id);
	}
}
