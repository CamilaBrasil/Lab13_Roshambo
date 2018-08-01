package com.rockpaperscissors;

import java.util.Scanner;

public class HumanPlayer extends Player {
	String playerName;

	public HumanPlayer(String playerName) {
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {
		Scanner scan = new Scanner(System.in);
		Roshambo randChoice = null;
		boolean error = false;

		do {
			System.out.println("Rock, paper or scissors? (R/P/S): ");
			String userInput = scan.nextLine();
			// TODO Talvez envolver o statement com um try and catch pra validar o input
			switch (userInput.toLowerCase()) {
			case "r":
				randChoice = Roshambo.ROCK;
				break;

			case "p":
				randChoice = Roshambo.PAPER;
				break;

			case "s":
				randChoice = Roshambo.SCISSORS;
				break;

			default:
				System.out.println("Please enter R - for Rock, P - for Paper or S -  for Scissors.");
				error = true;
			}
		} while (error);
		
		return randChoice;
	}

}
