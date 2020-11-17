package com.talentodigital.laser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentodigital.laser.model.Usuario;

public interface iUsuarioRepository extends JpaRepository<Usuario, String> {

	public Usuario findByUsername(String username);
	
}
