package com.example.api_rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Mensaje;

public interface IMensajeDAO extends JpaRepository<Mensaje, Long>{

	public List<Mensaje> findByGrupo (Long id);
}
