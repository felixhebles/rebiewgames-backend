package com.service;

import java.util.List;

import com.dto.VotacionDTO;

public interface VotacionService {
	
	List<VotacionDTO> getVotacion(Integer idVideojuego);

	void addVotacion(VotacionDTO votacion);

	void removeVotacion(VotacionDTO votacion);

}
