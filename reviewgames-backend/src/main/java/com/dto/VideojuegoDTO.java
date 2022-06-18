package com.dto;

public class VideojuegoDTO {
	
	private Integer idVideojuego;

	private String descripcion;
	private String imagen;
	private String nombre;
	private String plataforma;
	
	
	public VideojuegoDTO(Integer idVideojuego, String descripcion, String imagen, String nombre, String plataforma) {
		super();
		this.idVideojuego = idVideojuego;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.nombre = nombre;
		this.plataforma = plataforma;
	}


	public VideojuegoDTO() {
		super();
	}


	public Integer getIdVideojuego() {
		return idVideojuego;
	}


	public void setIdVideojuego(Integer idVideojuego) {
		this.idVideojuego = idVideojuego;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	} 

}
