package com.ideaexe.coingame.service;

import com.ideaexe.coingame.entity.User;

public interface UserService {
    User findByUsername(String username);
}
