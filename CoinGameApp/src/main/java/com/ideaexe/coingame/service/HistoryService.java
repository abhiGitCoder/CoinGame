package com.ideaexe.coingame.service;

import java.util.List;

import com.ideaexe.coingame.entity.GameHistory;
import com.ideaexe.coingame.entity.User;

public interface HistoryService {
    List<GameHistory> getHistoryForUser(User user);
}

