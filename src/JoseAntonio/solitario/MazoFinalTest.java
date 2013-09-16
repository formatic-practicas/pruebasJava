package JoseAntonio.solitario;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

eimport com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;


public class MazoFinalTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgregarCarta() {
			MazoFinal mazofinal = new MazoFinal();
			assertTrue(mazofinal.estaVacio());
			
			Carta carta = new Carta (5,Palo.PICAS);
			assert(mazofinal.agregarCarta(carta));
			assertTrue(mazofinal.estaVacio());
			
			carta = new Carta (1,Palo.PICAS);
			assertTrue(mazofinal.agregarCarta(carta));
			assertFalse(mazofinal.estaVacio());
			
			carta = new Carta (7,Palo.PICAS);
			assertTrue(mazofinal.agregarCarta(carta));
		
			
			carta = new Carta (2,Palo.PICAS);
			assertTrue(mazofinal.agregarCarta(carta));
			
			
			carta = new Carta (3,Palo.DIAMANTES);
			assertTrue(mazofinal.agregarCarta(carta));
	
			
			
			
	}

}
