package com.example.api_rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="grupos")
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="juego")
	private Juego juego;
	
	@ManyToOne
	@JoinColumn(name="usuarioCreador")
	private Usuario usuarioCreador;

	/**
	 * 
	 */
	public Grupo() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param juego
	 * @param usuarioCreador
	 */
	public Grupo(Long id, String nombre, Juego juego, Usuario usuarioCreador) {
		this.id = id;
		this.nombre = nombre;
		this.juego = juego;
		this.usuarioCreador = usuarioCreador;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the juego
	 */
	public Juego getJuego() {
		return juego;
	}

	/**
	 * @param juego the juego to set
	 */
	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	/**
	 * @return the usuarioCreador
	 */
	public Usuario getUsuarioCreador() {
		return usuarioCreador;
	}

	/**
	 * @param usuarioCreador the usuarioCreador to set
	 */
	public void setUsuarioCreador(Usuario usuarioCreador) {
		this.usuarioCreador = usuarioCreador;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nombre=" + nombre + ", juego=" + juego + ", usuarioCreador=" + usuarioCreador
				+ "]";
	}
	
	
}
