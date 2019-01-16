package com.qa.business.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.repository.domain.Users;
import com.qa.repository.persistence.UsersRepository;
import com.qa.util.Constants;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository repo;

	@Override
	public String createUser(Users user) {
		repo.save(user);
		return user.toString();
	}
	
	@Override
	public List<Users> login(Users user) {
		List<Users> match = repo.login(user.getUsername(), user.getPassword());
		return match;
	}

}
