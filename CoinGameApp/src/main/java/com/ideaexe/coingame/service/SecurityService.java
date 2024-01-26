package com.ideaexe.coingame.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    @Value("${app.security.username}")
    private String username;

    @Value("${app.security.password}")
    private String password;

    public void changeCredentials(String newUsername, String newPassword) {
        this.username = newUsername;
        this.password = newPassword;
    }

}
