package com.parser;

import com.dto.VotacionDTO;
import com.entities.Votacion;

public class ParserVotacion {

	public static Votacion parserVotacionDTOToEntity(VotacionDTO votacionDTO)  {
		Votacion votacion = new Votacion();
		
		votacion.setVotacion(votacionDTO.getVotacion());
		votacion.setIdUsuario(votacionDTO.getIdUsuario());
		votacion.setIdVideojuego(votacionDTO.getIdVideojuego());
		
		return votacion;
		
	}
	
	public static VotacionDTO parserVotacionEntityToDTO(Votacion votacion)  {
		VotacionDTO votacionDTO = new VotacionDTO();
		
		votacionDTO.setIdVotacion(votacion.getIdVotacion());
		votacionDTO.setVotacion(votacion.getVotacion());
		votacionDTO.setIdUsuario(votacion.getIdUsuario());
		votacionDTO.setIdVideojuego(votacion.getIdVideojuego());
		
		return votacionDTO;
		
	}
	
	
}
