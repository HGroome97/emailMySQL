package com.qa.business.service;

import java.util.List;
import java.util.Optional;

import com.qa.repository.domain.Emails;

public interface EmailsService {

	List<Emails> getAllEmails();

	Optional<Emails> getEmail(int emailId);
	
	String sendEmail(Emails email);
	
	String deleteEmail(int emailId);
	
	String markEmailRead(int emailId);
	
	List<Emails> getSent(String username);
	
	List<Emails> getInbox(String username);
	
}
