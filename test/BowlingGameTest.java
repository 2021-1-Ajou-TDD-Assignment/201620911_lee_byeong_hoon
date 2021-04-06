@@ -1,30 +1,33 @@
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BowlingGameTest {

	private Game g;
	protected Game g;

	@Before
	public void setUp(){
	public void setUp() {
		g = new Game();
	}

	private void rollMany(int n, int pins) {
		for(int i=0;i<n;i++) {
			g.roll(pins);
		}
	}

	@Test
	public void testGutterGame() {
		for (int i = 0; i < 20; i++)
			g.roll(0);

		assertEquals(0, g.score()); 
		rollMany(20, 0);
		assertEquals(0,g.score());
	}

	@Test
	public void testAllOnes(){
		for (int i = 0; i < 20; i++) 
			g.roll(1);

		assertEquals(20, g.score());
	public void testAllOnes() {
		rollMany(20, 1);
		assertEquals(20,g.score());
	}
}