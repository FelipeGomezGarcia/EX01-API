package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IPertenecerDAO;
import com.example.api_rest.dto.Pertenecer;

@Service
public class PertenecerServiceImpl implements IPertenecerService{

	@Autowired
	IPertenecerDAO iPertenecerDAO;
	
	@Override
	public List<Pertenecer> listarPertenecer() {
		// TODO Auto-generated method stub
		return iPertenecerDAO.findAll();
	}

	@Override
	public Pertenecer guardarPertenecer(Pertenecer pertenecer) {
		// TODO Auto-generated method stub
		return iPertenecerDAO.save(pertenecer);
	}

	@Override
	public void eliminarPertenecer(Long id) {
		// TODO Auto-generated method stub
		iPertenecerDAO.deleteById(id);
	}

	@Override
	public Pertenecer pertencerXId(Long id) {
		// TODO Auto-generated method stub
		return iPertenecerDAO.findById(id).get();
	}

}
