package com.libertymutual.goforcode.invoicify.controllers;

import javax.validation.ConstraintViolationException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.invoicify.models.User;
import com.libertymutual.goforcode.invoicify.repositories.UserRepository;

@Controller
@RequestMapping("")
public class HomeController {
	
	private UserRepository userRepository;
	private PasswordEncoder encoder;
	
	public HomeController(UserRepository userRepository, PasswordEncoder encoder) {
		this.userRepository = userRepository;
		this.encoder = encoder;
	}
	
	@GetMapping ("")
	public String homePage() {
		return "home/default";
	}
	
	
	@GetMapping ("loginalot")
	public String login() {
		return "home/loginalot";
	}
	
	@GetMapping ("signup") 
		public ModelAndView signup() {
	ModelAndView mv = new ModelAndView ("home/signup");
	return mv;
	
	}
	
	@PostMapping ("signup")
	public ModelAndView handleSignup(User user) {
		//TODO this is really dumb needs refectorign
		String password = user.getPassword();
		String encryptedPassed = encoder.encode(password);
		user.setPassword(encryptedPassed);
		
		ModelAndView mv = new ModelAndView ();
		
		try {
		userRepository.save(user);
		mv.setViewName("redirect:/loginalot");
		
		} catch (DataIntegrityViolationException dive) {
		mv.setViewName("home/signup");
		mv.addObject("message", "PLEASE PICK A UNIQUE NAME");
		}
		return mv;
		
	}
	
	
}
