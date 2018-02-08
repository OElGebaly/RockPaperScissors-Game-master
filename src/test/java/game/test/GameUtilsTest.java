package game.test;
import static org.junit.Assert.*;
import game.utils.GameUtils;

import org.junit.Test;

public class GameUtilsTest {

	@Test
	public void testPrintDashes() {
		// assertEquals("---", GameUtils.printDashes(3));

	}

	@Test
	public void testPlayAgain() {
		assertEquals(true, GameUtils.playAgain('y'));
	}

	@Test
	public void testPrintResults() {
	}

}
