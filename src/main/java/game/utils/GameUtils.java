package game.utils;

import java.util.Scanner;

/**
 * 
 * UIutils contains the game application most common functions to use the
 * console in smart way to print results in good way
 * 
 * @author Osama ElGebaly
 * @version 1.0
 * 
 */
public class GameUtils {

	public static void printDashes(int numberOfDashes) {
		for (int i = 0; i < numberOfDashes; i++) {
			System.out.print("-");
		}
	}

	public static boolean playAgain(char answer) {

		// return true if the user press y
		return answer == 'Y' || answer == 'y';
	}

	/**
	 * This method is used to return the player move which one of the
	 * {@code Move.java} values
	 * 
	 * @param userScore
	 *            final user score
	 * @param computerScore
	 *            final computer score
	 * @param numberOfGames
	 *            number of games the user played
	 */
	public static void printResults(int userScore, int computerScore,
			int numberOfGames) {
		int wins = userScore;
		int losses = computerScore;
		int ties = numberOfGames - userScore - computerScore;

		// print Line
		System.out.print("+");
		printDashes(50);
		System.out.println("+");

		// Print titles
		System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |\n", "WINS",
				"LOSSES", "TIES", "GAMES PLAYED");

		// Line
		System.out.print("|");
		printDashes(10);
		System.out.print("+");
		printDashes(10);
		System.out.print("+");
		printDashes(10);
		System.out.print("+");
		printDashes(16);
		System.out.print("+");
		System.out.println();

		// Print values
		System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d |\n", wins, losses,
				ties, numberOfGames);

		// Line
		System.out.print("+");
		printDashes(50);
		System.out.println("+");
	}

}
