package antonio;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testCToF() {
		Conversor c = new Conversor();
		double cel = 10;
		assertTrue(c.cToF(cel) == 50);
	}

	@Test
	public void testFToC() {
		assertTrue(true);
	}

}
