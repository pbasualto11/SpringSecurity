package com.talentodigital.laser.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.talentodigital.laser.service.UserService;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userServ;
	
	@Autowired
	private BCryptPasswordEncoder bcpe;
	
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		return bcpe;
	}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.authorizeRequests()
		.antMatchers("/","/index", "/gallery").permitAll()
		.antMatchers("/servicioturismo").authenticated()
		.antMatchers("/serviciopremium").authenticated()
		.antMatchers("/indexlogueado").authenticated()
		.antMatchers("/gallerylogueado").authenticated()
		.antMatchers("/servicioturismo").hasAnyAuthority("usertur", "admin")
		.antMatchers("/serviciopremium").hasAnyAuthority("userpre", "admin")
		.antMatchers("/indexlogueado").hasAnyAuthority("usertur", "admin", "userpre")
		.antMatchers("/gallerylogueado").hasAnyAuthority("usertur", "admin", "userpre")
		.and()
		.formLogin().loginPage("/login").permitAll()
		.and()
		.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
		.and()
        .exceptionHandling().accessDeniedPage("/403");
	}


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(userServ).passwordEncoder(bcpe);
	}
	
	
	
	
}
