package com.ideaexe.coingame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ideaexe.coingame.service.SecurityService;

@RestController
@RequestMapping("/api/security")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @PostMapping("/change-credentials")
    public ResponseEntity<String> changeCredentials(@RequestParam String newUsername, @RequestParam String newPassword) {
        securityService.changeCredentials(newUsername, newPassword);
        return ResponseEntity.ok("Credentials changed successfully");
    }
}
