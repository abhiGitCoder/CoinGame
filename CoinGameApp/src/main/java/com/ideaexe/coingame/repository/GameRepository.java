package com.ideaexe.coingame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ideaexe.coingame.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}

