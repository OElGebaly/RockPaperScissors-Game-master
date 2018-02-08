package game.utils;

/**
 * 
 * UIutils contains layout utils to use the console in smart way to print
 * results in good way
 * 
 * @author Ahmed Gamal
 * @version 1.0
 * @since 2016-8-4
 */
public class UIutils {
	public static void printDashes(int numberOfDashes) {
		for (int i = 0; i < numberOfDashes; i++) {
			System.out.print("-");
		}
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
		double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

		// Line
		System.out.print("+");
		printDashes(68);
		System.out.println("+");

		// Print titles
		System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
				"WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");

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
		printDashes(18);
		System.out.println("|");

		// Print values
		System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
				wins, losses, ties, numberOfGames, percentageWon * 100);

		// Line
		System.out.print("+");
		printDashes(68);
		System.out.println("+");
	}

}
