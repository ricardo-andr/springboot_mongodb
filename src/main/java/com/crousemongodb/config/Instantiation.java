package com.crousemongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.crousemongodb.domain.User;
import com.crousemongodb.repository.UserRepositoty;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepositoty  userRepository;			
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		userRepository.deleteAll();
		
		User maria= new User(null, "Maria Brown", "maria@gmail.com");
		User alex= new User(null, "Alex Green", "alex@gmail.com");
		User bob= new User(null, "BobGrey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,alex,bob));
	}
	
}
