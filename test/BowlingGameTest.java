import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BowlingGameTest {

	private Game g;
	@Before
	public void setUp(){
		g = new Game();
	}

	@Test
	public void testGutterGame() {
		Game g = new Game();
		for(int i=0;i<20;i++) {
		for (int i = 0; i < 20; i++)
			g.roll(0);
		}
		assertEquals(0,g.score());

		assertEquals(0, g.score()); 
	}

	@Test
	public void testAllOnes(){
		for (int i = 0; i < 20; i++) 
			g.roll(1);

		assertEquals(20, g.score());
	}
}