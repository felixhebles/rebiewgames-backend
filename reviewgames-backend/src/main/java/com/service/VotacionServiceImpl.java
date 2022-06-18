package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.VotacionDTO;
import com.entities.Votacion;
import com.parser.ParserVotacion;
import com.repository.VotacionRepository;

@Service
public class VotacionServiceImpl implements VotacionService{
	
	@Autowired
	private VotacionRepository votacionRepository;

	@Override
	public List<VotacionDTO> getVotacion(Integer idVideojuego) {
		List<Votacion> votaciones = votacionRepository.findByIdVideojuego(idVideojuego);
		List<VotacionDTO> vota = new ArrayList<VotacionDTO>();
		for (Votacion v : votaciones) {
			vota.add(ParserVotacion.parserVotacionEntityToDTO(v));
		}
		return vota;
	}

	@Override
	public void addVotacion(VotacionDTO votacion) {
		Votacion v = new Votacion();
		v.setIdUsuario(votacion.getIdUsuario());
		v.setIdVideojuego(votacion.getIdVideojuego());
		v.setVotacion(votacion.getVotacion());
		List<Votacion> votos = votacionRepository.findByIdUsuarioAndIdVideojuego(votacion.getIdUsuario(), votacion.getIdVideojuego());
		if (votos == null || votos.isEmpty()) {
			votacionRepository.save(v);			
		} else if (votos != null && !votos.isEmpty()){
			Integer votosPositivos = 0;
			Integer votosNegativos = 0;
			for (Votacion votacion2 : votos) {
				if (votacion2.getVotacion() > 0) {
					votosPositivos++;
				} else {
					votosNegativos++;
				}
			}
			
			if (votosPositivos < votosNegativos && votacion.getVotacion().equals(1)) {
				votacionRepository.save(v);
			} else if (votosPositivos > votosNegativos && votacion.getVotacion().equals(-1)) {
				votacionRepository.save(v);
			} else if (votosPositivos.equals(votosNegativos)) {
				votacionRepository.save(v);
			}
		}
		
	}

	@Override
	public void removeVotacion(VotacionDTO votacion) {
		votacionRepository.deleteById(Long.valueOf(votacion.getIdVotacion()));
		
	}
	
	
	

}
