package com.parser;

import com.dto.UsuarioDTO;
import com.entities.Usuario;

public class ParserUsuario {
	
	public static Usuario parserUsuarioDTOToEntity(UsuarioDTO usuarioDTO)  {
		Usuario usuario = new Usuario();
		
		usuario.setIdUsuario(usuarioDTO.getIdUsuario());
		usuario.setPassword(usuarioDTO.getPassword());
		usuario.setUsuario(usuarioDTO.getUsuario());
		return usuario;
		
	}
	
	public static UsuarioDTO parserUsuarioEntityToDTO(Usuario usuario)  {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		
		usuarioDTO.setIdUsuario(usuario.getIdUsuario());
		usuarioDTO.setPassword(usuario.getPassword());
		usuarioDTO.setUsuario(usuario.getUsuario());
		return usuarioDTO;
		
	}
}
