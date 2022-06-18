package com.parser;

import com.dto.ComentarioDTO;
import com.entities.Comentario;

public class ParserComentario {

	
	public static Comentario parserComentarioDTOToEntity(ComentarioDTO comentarioDTO)  {
		Comentario comentario = new Comentario();
		
		comentario.setIdComentario(comentarioDTO.getIdComentario());
		comentario.setDescripcion(comentarioDTO.getDescripcion());
		comentario.setIdUsuario(comentarioDTO.getIdUsuario());
		comentario.setIdVideojuego(comentarioDTO.getIdVideojuego());
		comentario.setIdVideojuego(comentarioDTO.getIdVideojuego());
		
		return comentario;
		
	}
	
	public static ComentarioDTO parserComentarioEntityToDTO(Comentario comentario)  {
		ComentarioDTO comentarioDTO = new ComentarioDTO();
		
		comentarioDTO.setIdComentario(comentario.getIdComentario());
		comentarioDTO.setDescripcion(comentario.getDescripcion());
		comentarioDTO.setIdUsuario(comentario.getIdUsuario());
		comentarioDTO.setIdVideojuego(comentario.getIdVideojuego());
		comentarioDTO.setIdVideojuego(comentario.getIdVideojuego());
		
		return comentarioDTO;
		
	}
	
}
