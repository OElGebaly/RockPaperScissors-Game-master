package game.test;

import static org.junit.Assert.*;
import game.Move;

import org.junit.Test;

public class MoveTest {

	@Test
	public void testWhoWin() {

		Move test = Move.PAPER;
		assertEquals(-1, test.whoWin(Move.SCISSORS));
	}

}
