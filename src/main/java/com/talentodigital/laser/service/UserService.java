package com.talentodigital.laser.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.talentodigital.laser.model.Usuario;
import com.talentodigital.laser.repository.iUsuarioRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private iUsuarioRepository repouser;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario u = repouser.findByUsername(username);
		ArrayList<GrantedAuthority> rol = new ArrayList<GrantedAuthority>();
		rol.add(new SimpleGrantedAuthority(u.getRol().getNombreRol()));
		UserDetails userdet = new User(u.getUsername(), u.getPassword(), rol);
		
		return userdet;
	}
	
	

}
