package com.ideaexe.coingame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ideaexe.coingame.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
