package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ComentarioDTO;
import com.dto.UsuarioDTO;
import com.service.ComentarioService;
import com.service.UsuarioService;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
		
		@Autowired
		private ComentarioService comentarioService;

		@RequestMapping(value = "/createComentario",method = RequestMethod.POST,consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
		public void createComentario(@ModelAttribute ComentarioDTO comentario) {
			comentarioService.createComentario(comentario);
		}
		
		@RequestMapping(value = "/deleteComentario",method = RequestMethod.POST,consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
		public void deleteComentario(@ModelAttribute ComentarioDTO comentario) {
			comentarioService.deleteComentario(comentario);
		}
		
		@RequestMapping(value = "/getComentario",method = RequestMethod.POST,consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
		public List<ComentarioDTO> getComentario(@ModelAttribute ComentarioDTO comentario) {
			return comentarioService.getComentarios(comentario.getIdVideojuego());
		}

}
