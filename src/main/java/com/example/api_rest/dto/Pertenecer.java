package com.example.api_rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pertenecer")
public class Pertenecer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="usuarioId")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="grupoId")
	private Grupo grupo;

	/**
	 * 
	 */
	public Pertenecer() {
	}

	/**
	 * @param id
	 * @param usuario
	 * @param grupo
	 */
	public Pertenecer(Long id, Usuario usuario, Grupo grupo) {
		this.id = id;
		this.usuario = usuario;
		this.grupo = grupo;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the grupo
	 */
	public Grupo getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Pertenecer [id=" + id + ", usuario=" + usuario + ", grupo=" + grupo + "]";
	}
	
}
