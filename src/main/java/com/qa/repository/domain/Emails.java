package com.qa.repository.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "emails")
public class Emails {
	
	@Id
    private int email_id;

    private String from1;

    private String to1;

    private String subject;

    private String body;

    private String status;

    private String deleted;

	public int getEmailId() {
		return email_id;
	}

	public void setEmailId(int emailId) {
		this.email_id = emailId;
	}

	public String getFrom1() {
		return from1;
	}

	public void setFrom1(String from1) {
		this.from1 = from1;
	}

	public String getTo1() {
		return to1;
	}

	public void setTo1(String to1) {
		this.to1 = to1;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "Emails [emailId=" + email_id + ", from1=" + from1 + ", to1=" + to1 + ", subject=" + subject + ", body="
				+ body + ", status=" + status + ", deleted=" + deleted + "]";
	}

    
}
