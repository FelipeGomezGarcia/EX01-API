package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="username")
	private String username;
	@Column(name="pass")
	private String pass;
	@Column(name="role")
	private String role;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Grupo> grupos;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Pertenecer> pertence;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Mensaje> mensajes;
	
	/**
	 * 
	 */
	public Usuario() {
		
	}

	
	/**
	 * @param id
	 * @param username
	 * @param pass
	 * @param role
	 * @param grupos
	 * @param pertence
	 * @param mensajes
	 */
	public Usuario(Long id, String username, String pass, String role, List<Grupo> grupos, List<Pertenecer> pertence,
			List<Mensaje> mensajes) {
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.role = role;
		this.grupos = grupos;
		this.pertence = pertence;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the grupos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grupos")
	public List<Grupo> getGrupos() {
		return grupos;
	}

	/**
	 * @param grupos the grupos to set
	 */
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	/**
	 * @return the pertence
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pertenecer")
	public List<Pertenecer> getPertence() {
		return pertence;
	}

	/**
	 * @param pertence the pertence to set
	 */
	public void setPertence(List<Pertenecer> pertence) {
		this.pertence = pertence;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", pass=" + pass + ", role=" + role + "]";
	}
	
	
	
}
