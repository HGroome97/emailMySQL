package com.qa.util;

public class Constants {

	private Constants() {

	}

	public static final String ACCOUNT_DELETED_SUCCESSFULLY = "User successfully deleted";
	public static final String ACCOUNT_NOT_FOUND = "User not found";

	public static final String URL_USERS_BASE = "/users";
	public static final String CREATE_BASE = "/createUser";
	public static final String LOGIN_BASE = "/login";
	
	public static final String URL_EMAILS_BASE = "/emails";
	public static final String GET_ALL_BASE = "/getAllEmails";
	public static final String GET_SPECIFIC_BASE = "/getEmail/{emailId}";
	public static final String SEND_EMAIL_BASE = "/sendEmail";
	public static final String DELETE_EMAIL_BASE = "/deleteEmail/{emailId}";
	public static final String MARK_EMAIL_READ_BASE = "/markEmailRead/{emailId}";
	public static final String GET_SENT_BASE = "/getSent/{emailId}";
	public static final String GET_INBOX_BASE = "/getInbox/{emailId}";
	
	
	// Testing
//	public static final String EXAMPLE_USERNAME = "user1";
//	public static final String NONEXISTANT_USERNAME = "user2";
//	public static final String EXAMPLE_PASSWORD = "password";
//	public static final String EXAMPLE_ROLE = "ROLE_ADMIN";

}
