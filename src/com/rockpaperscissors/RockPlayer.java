package com.rockpaperscissors;

public class RockPlayer extends Player {
	
	public RockPlayer(String playerName) {
		super(playerName);
		
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	@Override
	public String toString() {
		return super.toString() + ": " + generateRoshambo();
	}
	
	

}
