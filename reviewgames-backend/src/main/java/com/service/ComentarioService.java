package com.service;

import java.util.List;

import com.dto.ComentarioDTO;

public interface ComentarioService {

	List<ComentarioDTO> getComentarios(Integer idVideojuego);
	
	void createComentario(ComentarioDTO comentario);

	void deleteComentario(ComentarioDTO comentario);

	
}
