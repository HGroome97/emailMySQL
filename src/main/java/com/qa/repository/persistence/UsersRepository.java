package com.qa.repository.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qa.repository.domain.Users;

public interface UsersRepository extends JpaRepository<Users, String>{
	@Query(value = "SELECT * FROM users u WHERE (u.username, u.password) = (?1, ?2) ", nativeQuery = true)
		List<Users> login(String username, String password);
}
