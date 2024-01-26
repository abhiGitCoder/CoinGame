package com.ideaexe.coingame.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideaexe.coingame.entity.GameHistory;
import com.ideaexe.coingame.entity.User;
import com.ideaexe.coingame.repository.GameHistoryRepository;
import com.ideaexe.coingame.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private GameHistoryRepository gameHistoryRepository;

    @Override
    public List<GameHistory> getHistoryForUser(User user) {
        return gameHistoryRepository.findByUser(user);
    }
}