package com.crousemongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crousemongodb.domain.User;
import com.crousemongodb.repository.UserRepositoty;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoty repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
