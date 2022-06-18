package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "videojuego")
public class Videojuego {
	
	@Id
	@Column(name = "id_videojuego")
	@GeneratedValue
	private Integer idVideojuego;

	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "plataforma")
	private String plataforma;
	
	
	public Videojuego(Integer idVideojuego, String descripcion, String imagen, String nombre, String plataforma) {
		super();
		this.idVideojuego = idVideojuego;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.nombre = nombre;
		this.plataforma = plataforma;
	}


	public Videojuego() {
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
