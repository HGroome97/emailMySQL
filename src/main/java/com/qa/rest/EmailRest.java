package com.qa.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.service.EmailsService;
import com.qa.business.service.UsersService;
import com.qa.repository.domain.Emails;
import com.qa.repository.domain.Users;
import com.qa.util.Constants;

@CrossOrigin
@RequestMapping(Constants.URL_EMAILS_BASE)
@RestController
public class EmailRest {

    @Autowired
    private EmailsService emailsService;

    @GetMapping(Constants.GET_ALL_BASE)
    public List<Emails> getAllEmails() {
        return emailsService.getAllEmails();
    }
    
    @GetMapping(Constants.GET_SPECIFIC_BASE)
    public Optional<Emails> getEmail(@PathVariable int emailId) {
        return emailsService.getEmail(emailId);
    }
    
    @PostMapping(Constants.SEND_EMAIL_BASE)
    public String sendEmail(@RequestBody Emails email) {
        return emailsService.sendEmail(email);
    }
    
    @GetMapping(Constants.DELETE_EMAIL_BASE)
    public String deleteEmail(@PathVariable int emailId) {
        return emailsService.deleteEmail(emailId);
    }
    
    @GetMapping(Constants.MARK_EMAIL_READ_BASE)
    public String markEmailRead(@PathVariable int emailId) {
        return emailsService.markEmailRead(emailId);
    }
    
    @GetMapping(Constants.GET_SENT_BASE)
    public List<Emails> getSent(@PathVariable String username) {
        return emailsService.getSent(username);
    }
    
    @GetMapping(Constants.GET_INBOX_BASE)
    public List<Emails> getInbox(@PathVariable String username) {
        return emailsService.getInbox(username);
    }
}
