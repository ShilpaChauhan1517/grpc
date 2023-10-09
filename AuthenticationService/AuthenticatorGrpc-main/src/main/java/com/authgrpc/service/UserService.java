package com.authgrpc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authgrpc.model.User;
import com.authgrpc.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	boolean checkUserAvailable(String username)
	{
		return userRepository.existsByUserName(username);
	}

	User getUserByName(String username)
	{  
		
	
		return userRepository.findByUserName(username);
	}
	
	List<User> getAllUsers(String username)
	{
		return userRepository.findAll();
	}
	Optional<User> getUserById(Integer id)
	{  
		
	
		return userRepository.findById(id);
	}
}
