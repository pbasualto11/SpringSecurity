package com.talentodigital.laser.model;

import javax.persistence.*;

@Entity
public class Usuario {

	@Id
	private int id;
	
	@Column(length=10, unique = true, nullable=false)
	private String username;
	
	@Column(length=100, nullable=false)
	private String password;
	
	@ManyToOne
	private Rol rol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	
	
}
