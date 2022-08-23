package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Mensaje> mensajes;

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
	 * @param mensajes
	 */
	public Grupo(Long id, String nombre, Juego juego, Usuario usuarioCreador, List<Mensaje> mensajes) {
		this.id = id;
		this.nombre = nombre;
		this.juego = juego;
		this.usuarioCreador = usuarioCreador;
		this.mensajes = mensajes;
	}


	/**
	 * @return the mensajes
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mensajes")
	public List<Mensaje> getMensajes() {
		return mensajes;
	}


	/**
	 * @param mensajes the mensajes to set
	 */
	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
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
				+ ", mensajes=" + mensajes + "]";
	}	
	
}
