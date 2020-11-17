package com.talentodigital.laser;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.talentodigital.laser.model.Rol;
import com.talentodigital.laser.model.Usuario;
import com.talentodigital.laser.repository.iRolRepository;
import com.talentodigital.laser.repository.iUsuarioRepository;

@SpringBootTest
class Prueba2Modulo5Grupo2ApplicationTests {

	@Autowired
	private iUsuarioRepository repouser;
	
	@Autowired
	private iRolRepository reporol;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void contextLoads() {
		
		Rol r1 = new Rol();
		r1.setIdRol(1);
		r1.setNombreRol("admin");
		reporol.save(r1);
		
		Rol r2 = new Rol();
		r2.setIdRol(2);
		r2.setNombreRol("usertur");
		reporol.save(r2);
		
		Rol r3 = new Rol();
		r3.setIdRol(3);
		r3.setNombreRol("userpre");
		reporol.save(r3);
		
		Usuario u1 = new Usuario();
		u1.setId(1);
		u1.setUsername("admin");
		u1.setPassword(encoder.encode("123"));
		u1.setRol(r1);
		repouser.save(u1);
		
		Usuario u2 = new Usuario();
		u2.setId(2);
		u2.setUsername("usertur");
		u2.setPassword(encoder.encode("123"));
		u2.setRol(r2);
		repouser.save(u2);
		
		Usuario u3 = new Usuario();
		u3.setId(3);
		u3.setUsername("userpre");
		u3.setPassword(encoder.encode("123"));
		u3.setRol(r3);
		repouser.save(u3);
		
		
	}

}
