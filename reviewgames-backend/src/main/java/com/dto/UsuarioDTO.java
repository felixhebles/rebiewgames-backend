package com.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {
	
	private Integer  idUsuario;
	private String password;
	private String usuario;
	
	
	public UsuarioDTO(Integer idUsuario, String password, String usuario) {
		super();
		this.idUsuario = idUsuario;
		this.password = password;
		this.usuario = usuario;
	}


	public UsuarioDTO() {
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
