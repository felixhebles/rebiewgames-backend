package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.entities.Votacion;

public interface VotacionRepository extends JpaRepository<Votacion, Long>, JpaSpecificationExecutor<Votacion>  {

	
	public List<Votacion> findByIdVideojuego(Integer idVideojuego);

	public List<Votacion> findByIdUsuarioAndIdVideojuego(Integer idUsuario, Integer idVideojuego);


}
