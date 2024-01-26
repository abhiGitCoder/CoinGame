package com.ideaexe.coingame.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ideaexe.coingame.entity.GameHistory;
import com.ideaexe.coingame.entity.User;
import com.ideaexe.coingame.service.HistoryService;
import com.ideaexe.coingame.service.UserService;


@Controller
public class HistoryController {

    @Autowired
    private HistoryService historyService;
    
    @Autowired
    private UserService userService;

    @GetMapping("/history")
    public String history(Model model, Principal principal) {
        String username = principal.getName();
        User currentUser = userService.findByUsername(username);

        List<GameHistory> history = historyService.getHistoryForUser(currentUser);
        model.addAttribute("history", history);

        return "history";
    }
}

