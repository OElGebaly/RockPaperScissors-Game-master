package game;

/**
 * 
 * Player abstrac class to Define the structure of any player within the
 * RockPaperScissors game , identity and some default supported behaviour like
 * Score =0
 * 
 * @author Ahmed Gamal
 * @version 1.0
 * @since 2016-8-4
 */

public abstract class Player {

	/**
	 * this attribute determine the player score during the game tries and
	 * affect the final results of the game win or loss or tie .
	 * */
	public int score = 0;

	/**
	 * This method is used to return the player move which one of the
	 * {@code Move.java} values
	 * 
	 * 
	 * @return Move This returns the current player move
	 */
	public abstract Move getMove();
}
