package JoseAntonio.solitario;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MazoIntermedioTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MazoIntermedio mazointermedio = new MazoIntermedio();
		
		Carta carta = new Carta (5,Palo.PICAS);
		assert(mazointermedio.agregarCarta(carta));
		assertTrue(mazointermedio.estaVacio());
		
		carta = new Carta (1,Palo.PICAS);
		assertTrue(mazointermedio.agregarCarta(carta));
		assertFalse(MazoIntermedio.estaVacio());
		
		carta = new Carta (7,Palo.PICAS);
		assertTrue(MazoIntermedio.agregarCarta(carta));
	
		
		carta = new Carta (2,Palo.PICAS);
		assertTrue(MazoIntermedio.agregarCarta(carta));
		
		
		carta = new Carta (3,Palo.DIAMANTES);
		assertTrue(MazoIntermedio.agregarCarta(carta));
	}

}
