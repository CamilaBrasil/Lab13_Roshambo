package com.rockpaperscissors;

import java.util.Random;

public class RandomPlayer extends Player {

	public RandomPlayer(String playerName) {
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		int index = rand.nextInt(2);
		Roshambo randChoice;
		
		if (Roshambo.ROCK.ordinal() == index) {
			randChoice = Roshambo.ROCK;
		} else if (Roshambo.PAPER.ordinal() == index) {
			randChoice = Roshambo.PAPER;
		} else {
			randChoice = Roshambo.SCISSORS;
		}
		
		return randChoice;
	}
	
	

}
