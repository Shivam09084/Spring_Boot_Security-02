package com.coder.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.coder.entity.Student;
import com.coder.repository.StudentRepository;


@Component
public class CustomUserDetailsSerivice implements UserDetailsService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username)  {
		
		Student student = studentRepo.findByEmail(username);
		
		if(student == null) {
			throw new UsernameNotFoundException("Usernam is invalid");
		}else {
			return new CustomUserDetails(student);
		}
		
	}

}
