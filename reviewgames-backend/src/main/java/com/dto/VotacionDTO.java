package com.dto;

import java.io.Serializable;

public class VotacionDTO implements Serializable{


	public Integer votacion;
	public Integer idUsuario;
	public Integer idVideojuego;
	private Integer idVotacion;

	public VotacionDTO(Integer votacion, Integer idUsuario, Integer idVideojuego) {
		super();
		this.votacion = votacion;
		this.idUsuario = idUsuario;
		this.idVideojuego = idVideojuego;
	}

	public VotacionDTO() {
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
