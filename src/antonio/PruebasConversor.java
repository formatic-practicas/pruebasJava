package antonio;

public class PruebasConversor {
	public static void main(String[] args) {
		Conversor conversor= new Conversor();
		assert(conversor.cToF(10) == 50);
		assert(conversor.fToC(10) == -12.222222222222223);
		assert(conversor.cToF(-274) == 0);
		assert(conversor.cToF(274) == 0);
		assert(conversor.fToC(-459.68) == 0);
		assert(conversor.fToC(224) == 0);
	}
}
