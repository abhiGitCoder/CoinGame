package com.ideaexe.coingame.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideaexe.coingame.entity.Game;
import com.ideaexe.coingame.repository.GameRepository;
import com.ideaexe.coingame.service.GameService;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameRepository gameRepository;

    @Override
    public Game createNewGame() {
        Game game = new Game();
        game.setCoins(21);
        return gameRepository.save(game);
    }

    @Override
    public void updateGame(Game game) {
        gameRepository.save(game);
    }
}
