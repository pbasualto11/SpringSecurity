package com.talentodigital.laser.model;

import javax.persistence.*;

@Entity
public class Rol {

	@Id
	private int idRol;
	
	@Column(length=50, nullable=false)
	private String nombreRol;

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	
	
	
}
