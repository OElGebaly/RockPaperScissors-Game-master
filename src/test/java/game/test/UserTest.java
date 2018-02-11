package game.test;

import static org.junit.Assert.*;
import game.Move;
import game.User;

import org.junit.Test;

/**
 * @author Osama ElGebalz
 *
 */
public class UserTest {

	/**
	 * Test method for {@link game.User#getMove()}.
	 */
	@Test
	public void testGetMove() {
		User user = new User();
		assertEquals(Move.PAPER, user.getMove());

	}

}
