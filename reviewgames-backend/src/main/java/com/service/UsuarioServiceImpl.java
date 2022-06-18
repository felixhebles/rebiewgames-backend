package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.UsuarioDTO;
import com.entities.Usuario;
import com.parser.ParserUsuario;
import com.repository.UsuarioRepository;
import com.repository.VideojuegoRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void createUsuario(UsuarioDTO usuario) {
		usuarioRepository.save(ParserUsuario.parserUsuarioDTOToEntity(usuario));
	}

	@Override
	public UsuarioDTO login(UsuarioDTO usuario) throws Exception {
		List<Usuario> usuarios = usuarioRepository.findByUsuarioAndPassword(usuario.getUsuario(), usuario.getPassword());
		
		if (usuarios == null || usuarios.isEmpty()) {
			throw new Exception();
		}
		
		return ParserUsuario.parserUsuarioEntityToDTO(usuarios.get(0));
		
	}

}
