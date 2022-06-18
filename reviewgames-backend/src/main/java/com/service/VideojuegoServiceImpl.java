package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dto.VideojuegoDTO;
import com.entities.Videojuego;
import com.parser.ParserVideojuego;
import com.repository.VideojuegoRepository;

@Service
public class VideojuegoServiceImpl implements VideojuegoService {

	private VideojuegoRepository videojuegoRepository;

	@Override
	public List<VideojuegoDTO> getVideojuegos() {
		
		List<Videojuego> videojuegos = videojuegoRepository.findAllByOrderByNombreAsc();
		List<VideojuegoDTO> videojuegosDTO = new ArrayList<>();
		
		for (Videojuego v : videojuegos) {
			videojuegosDTO.add(ParserVideojuego.parserVideojuegoEntityToDTO(v));
		}
		
		return videojuegosDTO;
	}

	@Autowired
	public VideojuegoServiceImpl(final VideojuegoRepository videojuegoRepository) {
		this.videojuegoRepository = videojuegoRepository;
	}
	
}
