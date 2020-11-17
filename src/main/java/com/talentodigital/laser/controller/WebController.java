package com.talentodigital.laser.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/")
	public String getIndex(Authentication auth, Model m) {
		
		if(auth != null) {
			
			String username = "";
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal instanceof UserDetails) {
				username = ((UserDetails)principal).getUsername();
			} else {
				 username = principal.toString();
			}
			m.addAttribute("username", username);
			return "indexlogueado";
			
		}else {
			return "index";
		}
		
		
	}
	
	@GetMapping("/index")
	public String getIndex2(Authentication auth, Model m) {
		if(auth != null) {
			String username = "";
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal instanceof UserDetails) {
				username = ((UserDetails)principal).getUsername();
			} else {
				 username = principal.toString();
			}
			m.addAttribute("username", username);
			return "indexlogueado";
			
		}else {
			return "index";
		}
	}
	
	@GetMapping("/indexlogueado")
	public String getIndexLogueado(Authentication auth, Model m) {
		
		if(auth != null) {
			
			String username = "";
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal instanceof UserDetails) {
				username = ((UserDetails)principal).getUsername();
			} else {
				 username = principal.toString();
			}
			m.addAttribute("username", username);
			return "indexlogueado";
			
		}else {
			return "index";
		}
		
		
	}
	
	@GetMapping("/gallerylogueado")
	public String getGalleryLogueado(Authentication auth, Model m) {
		
		if(auth != null) {
			
			String username = "";
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal instanceof UserDetails) {
				username = ((UserDetails)principal).getUsername();
			} else {
				 username = principal.toString();
			}
			m.addAttribute("username", username);
			return "gallerylogueado";
			
		}else {
			return "galleryindex";
		}
		
		
	}
	
	@GetMapping("/gallery")
	public String getGallery() {
		return "gallery";
	}
	
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/servicioturismo")
	public String getSerTur(Authentication auth, Model m) {
		
		if(auth != null) {
			
			String username = "";
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal instanceof UserDetails) {
				username = ((UserDetails)principal).getUsername();
			} else {
				 username = principal.toString();
			}
			m.addAttribute("username", username);
			return "servicioturismo";
			
		}else {
			return "index";
		}
	}
	
	@GetMapping("/serviciopremium")
	public String getSerPre(Authentication auth, Model m) {
		
		if(auth != null) {
			String username = "";
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal instanceof UserDetails) {
				username = ((UserDetails)principal).getUsername();
			} else {
				 username = principal.toString();
			}
			m.addAttribute("username", username);
			return "serviciopremium";
			
		}else {
			return "index";
		}
	}
	
	@GetMapping("/403")
	public String getError403() {
		return "403";
	}
	
	
}
