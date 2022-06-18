package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.entities.Videojuego;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Long>, JpaSpecificationExecutor<Videojuego> {
	
//	@Query("select v from Videojuego v order by v.nombre")
	public List<Videojuego> findAllByOrderByNombreAsc();

}
