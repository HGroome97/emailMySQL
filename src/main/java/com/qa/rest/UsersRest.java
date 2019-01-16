package com.qa.rest;

import java.util.List;

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

import com.qa.business.service.UsersService;
import com.qa.repository.domain.Users;
import com.qa.util.Constants;

@CrossOrigin
@RequestMapping(Constants.URL_USERS_BASE)
@RestController
public class UsersRest {

    @Autowired
    private UsersService usersService;

    @PostMapping(Constants.CREATE_BASE)
    public String createUser(@RequestBody Users user) {
        return usersService.createUser(user);
    }
    
    @PostMapping(Constants.LOGIN_BASE)
    public List<Users> login(@RequestBody Users user) {
        return usersService.login(user);
    }
    
}
