package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dto.UsuarioDTO;
import com.service.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;


	@RequestMapping(value = "/createUsuario",method = RequestMethod.POST,consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public void createUsuario(@ModelAttribute UsuarioDTO usuario) {
		usuarioService.createUsuario(usuario);
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@ResponseBody
	public UsuarioDTO login(@ModelAttribute UsuarioDTO usuario) throws Exception {
		return usuarioService.login(usuario);
	}

}
