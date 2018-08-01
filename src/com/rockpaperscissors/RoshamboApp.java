package com.rockpaperscissors;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String usersChoice = null; 
		Roshambo userRoshambo = null; 
		Roshambo jetsRoshambo = null;
		Roshambo sharksRoshambo = null;
		int jetsWins = 0;
		int sharksWins = 0;
		int userWins = 0;
		int draw = 0;
		String response = "n";

		RockPlayer rockPlayer = new RockPlayer("The Jets");
		RandomPlayer randomPlayer = new RandomPlayer("The Sharks");

		System.out.println("Welcome to Rock Paper Scissors!");

		HumanPlayer humanPlayer = new HumanPlayer(Validator.getString(scan, "Enter your name: "));

		//It will loop while the user says "y"
		do {
			System.out.println("Would you like to play against " + rockPlayer.getPlayerName() + " or "
					+ randomPlayer.getPlayerName() + " (j/s)");
			usersChoice = scan.nextLine().toLowerCase();

			userRoshambo = humanPlayer.generateRoshambo();

			System.out.println(humanPlayer.getPlayerName() + ": " + userRoshambo);

			//Keeping the choices so it can be used to define the winner
			if (usersChoice.equals("j")) {
				jetsRoshambo = rockPlayer.generateRoshambo();
				System.out.println(rockPlayer.getPlayerName() + ": " + jetsRoshambo);
			} else {
				sharksRoshambo = randomPlayer.generateRoshambo();
				System.out.println(randomPlayer.getPlayerName() + ": " + sharksRoshambo);
			}
			
			// Defining who won and giving a point to it.
			if (userRoshambo == jetsRoshambo || userRoshambo == sharksRoshambo) {
				System.out.println("Draw");
				draw += 1;
			} else if( usersChoice.equals("s")) {
				if ((sharksRoshambo == Roshambo.ROCK && userRoshambo == Roshambo.SCISSORS) ||
					(sharksRoshambo == Roshambo.SCISSORS && userRoshambo == Roshambo.PAPER) ||
					(sharksRoshambo == Roshambo.PAPER && userRoshambo == Roshambo.ROCK)) {
					sharksWins += 1;
					System.out.println("The Sharks Wins!");
				} else {
					userWins += 1;
					System.out.println("You win!");
				}
			} else {
				// The Jets can only play rock, so that's the only possibility of winning.
				if (jetsRoshambo == Roshambo.ROCK && userRoshambo == Roshambo.SCISSORS) {
					jetsWins += 1;
					System.out.println("The Jets Wins!");
				} else {
					userWins += 1;
					System.out.println("You win!");
				}
			}
			
			System.out.println("Play again? (y/n)");
			response = scan.nextLine();

		} while (response.equalsIgnoreCase("y"));

		System.out.println(rockPlayer.getPlayerName() + " won " + jetsWins + " times.");
		System.out.println(randomPlayer.getPlayerName() + " won " + sharksWins + " times.");
		System.out.println(humanPlayer.getPlayerName() + " won " + userWins + " times.");
		System.out.println("Draw " + draw + " times.");
		
		System.out.println("Tchau!");
		
	}

}
