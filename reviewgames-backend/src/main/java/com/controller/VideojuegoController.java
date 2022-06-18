package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dto.VideojuegoDTO;
import com.service.VideojuegoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/videojuego")
public class VideojuegoController {
	
	@Autowired
	private VideojuegoService videojuegoService;


	@GetMapping("/getVideojuegos")
	public List<VideojuegoDTO> getVideojuegos() {
		return videojuegoService.getVideojuegos();
	}

}
