package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "votacion")
public class Votacion {
	
	@Id
	@GeneratedValue
	@Column(name = "id_votacion")
	private Integer idVotacion;
	
	@Column(name = "votacion")
	private Integer votacion;

	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "id_videojuego")
	private Integer idVideojuego;
	
	
	public Votacion(Integer idVotacion, Integer votacion, Integer idUsuario, Integer idVideojuego) {
		super();
		this.idVotacion = idVotacion;
		this.votacion = votacion;
		this.idUsuario = idUsuario;
		this.idVideojuego = idVideojuego;
	}

	public Votacion() {
		super();
	}

	public Integer getVotacion() {
		return votacion;
	}

	public void setVotacion(Integer votacion) {
		this.votacion = votacion;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdVideojuego() {
		return idVideojuego;
	}

	public void setIdVideojuego(Integer idVideojuego) {
		this.idVideojuego = idVideojuego;
	}

	public Integer getIdVotacion() {
		return idVotacion;
	}

	public void setIdVotacion(Integer idVotacion) {
		this.idVotacion = idVotacion;
	}
	
	
}
