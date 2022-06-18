package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dto.VotacionDTO;
import com.service.VotacionService;

@RestController
@RequestMapping("/votacion")
public class VotacionController {
	
	@Autowired
	private VotacionService votacionService;

	@RequestMapping(value = "/getVotacion",method = RequestMethod.POST,consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public List<VotacionDTO> getVotacion(@ModelAttribute VotacionDTO votacion) {
		return votacionService.getVotacion(votacion.getIdVideojuego());
	}
	
	@RequestMapping(value = "/addVotacion",method = RequestMethod.POST,consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public void addVotacion(@ModelAttribute VotacionDTO votacion) {
		votacionService.addVotacion(votacion);
	}
	
	@RequestMapping(value = "/removeVotacion",method = RequestMethod.POST,consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public void removeVotacion(@ModelAttribute VotacionDTO votacion) {
		votacionService.removeVotacion(votacion);
	}


}
