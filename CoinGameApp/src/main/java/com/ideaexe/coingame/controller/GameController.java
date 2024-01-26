package com.ideaexe.coingame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ideaexe.coingame.entity.Game;
import com.ideaexe.coingame.service.GameService;

@Controller
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping("/game")
	public String game(Model model) {
		Game game = gameService.createNewGame();
		model.addAttribute("game", game);
		return "game";
	}

	@PostMapping("/play")
	public String play(@ModelAttribute("game") Game game, @RequestParam("coinsPicked") int coinsPicked) {
		if (coinsPicked < 1 || coinsPicked > 4 || coinsPicked > game.getCoins()) {
			return "redirect:/game";
		}
		game.setCoins(game.getCoins() - coinsPicked);
		if (game.getCoins() == 0) {
			return "redirect:/lost";
		}
		int aiMove = 5 - coinsPicked;
		game.setCoins(game.getCoins() - aiMove);

		if (game.getCoins() == 0) {
			return "redirect:/game";
		}

		gameService.updateGame(game);
		return "redirect:/game";
	}
}
