package com.parser;

import com.dto.UsuarioDTO;
import com.dto.VideojuegoDTO;
import com.entities.Usuario;
import com.entities.Videojuego;

public class ParserVideojuego {
	
	public static Videojuego parserVideojuegoDTOToEntity(VideojuegoDTO videojuego)  {
		Videojuego v = new Videojuego();
		
		v.setIdVideojuego(videojuego.getIdVideojuego());
		v.setDescripcion(videojuego.getDescripcion());
		v.setImagen(videojuego.getImagen());
		v.setNombre(videojuego.getNombre());
		v.setPlataforma(videojuego.getPlataforma());
		
		
		return v;
		
	}
	
	public static VideojuegoDTO parserVideojuegoEntityToDTO(Videojuego videojuego)  {
		VideojuegoDTO v = new VideojuegoDTO();
		
		v.setIdVideojuego(videojuego.getIdVideojuego());
		v.setDescripcion(videojuego.getDescripcion());
		v.setImagen(videojuego.getImagen());
		v.setNombre(videojuego.getNombre());
		v.setPlataforma(videojuego.getPlataforma());
		
		
		return v;
		
	}

}
