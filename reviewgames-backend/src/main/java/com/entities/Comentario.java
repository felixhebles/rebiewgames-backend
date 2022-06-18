package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario {

	@Id
	@Column(name = "id_comentario")
	@GeneratedValue
	private Long idComentario;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "id_videojuego")
	private Integer idVideojuego;
	
	
	public Comentario(Long idComentario, String descripcion, Integer idUsuario, Integer idVideojuego) {
		super();
		this.idComentario = idComentario;
		this.descripcion = descripcion;
		this.idUsuario = idUsuario;
		this.idVideojuego = idVideojuego;
	}


	public Comentario() {
		super();
	}


	public Long getIdComentario() {
		return idComentario;
	}


	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	
}
