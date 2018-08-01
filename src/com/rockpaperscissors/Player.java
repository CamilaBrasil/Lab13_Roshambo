package com.rockpaperscissors;

public abstract class Player {
	
	private Roshambo r;
	private String playerName;
	
	public abstract Roshambo generateRoshambo();

	public Player(String playerName) {
		super();
		this.playerName = playerName;
	}

	public void setR(Roshambo r) {
		this.r = r;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
	
}
