package com.dto;

public class ComentarioDTO {

	
	public Long idComentario;
	public String descripcion;
	public Integer idUsuario;
	public Integer idVideojuego;
	private String usuario;
	
	
	public ComentarioDTO(Long idComentario, String descripcion, Integer idUsuario, Integer idVideojuego,
			String usuario) {
		super();
		this.idComentario = idComentario;
		this.descripcion = descripcion;
		this.idUsuario = idUsuario;
		this.idVideojuego = idVideojuego;
		this.usuario = usuario;
	}

	public ComentarioDTO() {
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
