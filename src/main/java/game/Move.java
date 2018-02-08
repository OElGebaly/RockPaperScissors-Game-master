package game;

/**
 * 
 * Move Enum define the available player moves in the RockPaperScissors game
 * 
 * @author Ahmed Gamal
 * @version 1.0
 * @since 2016-8-4
 */
public enum Move {
	ROCK, PAPER, SCISSORS;

	/**
	 * Compares this move with another move to determining a tie, a win, or a
	 * loss.
	 * 
	 * @param otherMove
	 *            move to compare to
	 * @return 1 if this move beats the other move, -1 if this move loses to the
	 *         other move, 0 if these moves tie
	 */
	public int whoWin(Move otherMove) {
		// Tie
		if (this == otherMove)
			return 0;

		switch (this) {
		case ROCK:
			return (otherMove == SCISSORS ? 1 : -1);
		case PAPER:
			return (otherMove == ROCK ? 1 : -1);
		case SCISSORS:
			return (otherMove == PAPER ? 1 : -1);
		}

		// Should never reach here
		return 0;
	}
}
