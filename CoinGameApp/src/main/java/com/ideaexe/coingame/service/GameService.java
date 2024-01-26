package com.ideaexe.coingame.service;

import com.ideaexe.coingame.entity.Game;

public interface GameService {
    Game createNewGame();
    void updateGame(Game game);
}
