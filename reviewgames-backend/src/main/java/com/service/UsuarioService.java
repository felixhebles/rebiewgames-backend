package com.service;

import com.dto.UsuarioDTO;

public interface UsuarioService {

	void createUsuario(UsuarioDTO usuario);

	UsuarioDTO login(UsuarioDTO usuario) throws Exception;

}
