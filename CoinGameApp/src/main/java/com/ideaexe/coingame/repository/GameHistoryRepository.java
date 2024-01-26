package com.ideaexe.coingame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ideaexe.coingame.entity.GameHistory;
import com.ideaexe.coingame.entity.User;

public interface GameHistoryRepository extends JpaRepository<GameHistory, Long> {
    List<GameHistory> findByUser(User user);
}

