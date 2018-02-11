package game;

import java.util.Random;

/**
 * 
 * this class used to simulate another player to play with the user , this
 * player make random moves from {@code Move.java}
 * 
 * @author Osama ElGebaly
 * @version 1.0
 * @since 2018-02-08
 */
public class Computer extends Player {

	@Override
	public Move getMove() {
		Move[] moves = Move.values();
		Random random = new Random();

		int index = random.nextInt(moves.length);
		return moves[index];
	}

}
