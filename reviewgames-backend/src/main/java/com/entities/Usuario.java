package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue
	private Integer idUsuario;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "usuario")
	private String usuario;
	
	
	public Usuario(Integer idUsuario, String password, String usuario) {
		super();
		this.idUsuario = idUsuario;
		this.password = password;
		this.usuario = usuario;
	}


	public Usuario() {
		super();
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
