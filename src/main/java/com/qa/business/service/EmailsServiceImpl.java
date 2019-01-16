package com.qa.business.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.repository.domain.Emails;
import com.qa.repository.domain.Users;
import com.qa.repository.persistence.EmailsRepository;
import com.qa.repository.persistence.UsersRepository;
import com.qa.util.Constants;

@Service
public class EmailsServiceImpl implements EmailsService {

	@Autowired
	private EmailsRepository repo;

	@Override
	public List<Emails> getAllEmails() {
		return repo.findAll();
	}

	@Override
	public Optional<Emails> getEmail(int emailId) {
		return repo.findById(emailId);
	}

	@Override
	public String sendEmail(Emails email) {
		repo.save(email);
		return email.toString();
	}

	@Override
	public String deleteEmail(int emailId) {
		if (emailExists(emailId)) {
			Emails emailInDb = repo.findById(emailId).get();
			emailInDb.setDeleted("Y");
			repo.save(emailInDb);
			return "Email Deleted";
		}else {
			return "Email not found";
		}
	}

	@Override
	public String markEmailRead(int emailId) {
		if (emailExists(emailId)) {
			Emails emailInDb = repo.findById(emailId).get();
			emailInDb.setStatus("R");;
			repo.save(emailInDb);
			return "Email Marked Read";
		}else {
			return "Email not found";
		}
	}
	
	private boolean emailExists(Integer emailId) {
		Optional<Emails> emailOptional = repo.findById(emailId);
		return emailOptional.isPresent();
	}

	@Override
	public List<Emails> getSent(String username) {
		return repo.getSent(username);
	}

	@Override
	public List<Emails> getInbox(String username) {
		return repo.getInbox(username);
	}

}
