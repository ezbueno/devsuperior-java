package com.buenoezandro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buenoezandro.entities.User;
import com.buenoezandro.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	public User findById(Long id) {
		return this.userRepository.findById(id).orElse(null);
	}
}
