package com.qa.repository.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qa.repository.domain.Emails;
import com.qa.repository.domain.Users;

public interface EmailsRepository extends JpaRepository<Emails, Integer>{
	@Query(value = "SELECT * FROM emails e WHERE e.from1 = ?1", nativeQuery = true)
	List<Emails> getSent(String username);
	
	@Query(value = "SELECT * FROM emails e WHERE e.to1 = ?1", nativeQuery = true)
	List<Emails> getInbox(String username);
}
