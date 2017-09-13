package com.libertymutual.goforcode.invoicify.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.libertymutual.goforcode.invoicify.repositories.UserRepository;

@Service
public class InvoicifyUserDetailsService implements UserDetailsService{
	
	private UserRepository usersRepo;
	public InvoicifyUserDetailsService(UserRepository usersRepo) {
		this.usersRepo = usersRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return usersRepo.findByUsername(username);
		
	}

}
