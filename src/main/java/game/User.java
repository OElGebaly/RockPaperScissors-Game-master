package game;

import java.util.Scanner;

public class User extends Player {

	/**
	 * Class constructor
	 * */
	public User() {
	}



	@Override
	public Move getMove() {
		System.out.print("Enter your move , R(Rock),P(Paper),S(Scissors)");
		/*
		 * to handle all user moves as the original game senario *
		 */
		/*
		 * // Get the user input 
		 * String userInput = inputScanner.nextLine();
		 * userInput = userInput.toUpperCase(); char firstLetter =
		 * userInput.charAt(0);
		 * 
		 * 
		 * if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
		 * // User has entered a valid input switch (firstLetter) { case 'R':
		 * return Move.ROCK; case 'P': return Move.PAPER; case 'S': return
		 * Move.SCISSORS; } }
		 */

		// as mentioned in the task pdf that Player A always chooses Paper

		return Move.PAPER;
		// User has not entered a valid input. Prompt again.
		// return getMove();
	}

}
