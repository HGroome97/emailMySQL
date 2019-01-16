package com.qa.business.service;

import java.util.List;

import com.qa.repository.domain.Users;

public interface UsersService {

	String createUser(Users user);

	List<Users> login(Users user);
}
