package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entities.Usuario;
import com.entities.Videojuego;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>, JpaSpecificationExecutor<Usuario>  {
	
	public List<Usuario> findByUsuarioAndPassword(String username, String password);

	@Query("select v.usuario from Usuario v where v.idUsuario = :idUsuario")
	public String findUsuarioByIdUsuario(Integer idUsuario);

}
