package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.ComentarioDTO;
import com.dto.VideojuegoDTO;
import com.entities.Comentario;
import com.entities.Videojuego;
import com.parser.ParserComentario;
import com.parser.ParserVideojuego;
import com.repository.ComentarioRepository;
import com.repository.UsuarioRepository;
import com.repository.VideojuegoRepository;

@Service
public class ComentarioServiceImpl implements ComentarioService{
	
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;


	@Override
	public List<ComentarioDTO> getComentarios(Integer idVideojuego) {
		
		List<Comentario> comentarios = comentarioRepository.findByIdVideojuego(idVideojuego);
		List<ComentarioDTO> comentarioDTO = new ArrayList<>();
		
		for (Comentario v : comentarios) {
			ComentarioDTO c = ParserComentario.parserComentarioEntityToDTO(v);
			c.setUsuario(usuarioRepository.findUsuarioByIdUsuario(v.getIdUsuario()));
			comentarioDTO.add(c);
		}
		
		return comentarioDTO;
	}

	@Autowired
	public ComentarioServiceImpl(final ComentarioRepository comentarioRepository) {
		this.comentarioRepository = comentarioRepository;
	}
	

	@Override
	public void createComentario(ComentarioDTO comentario) {
		comentarioRepository.save(ParserComentario.parserComentarioDTOToEntity(comentario));
	}

	@Override
	public void deleteComentario(ComentarioDTO comentario) {
		comentarioRepository.deleteById(Long.valueOf(comentario.getIdComentario()));
		
	}

}
