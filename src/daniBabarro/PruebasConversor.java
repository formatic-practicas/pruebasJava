package daniBabarro;

public class PruebasConversor {

	public static void main(String[] args) {
Conversor conversor = new Conversor();
assert(conversor.cToF(4.5) == 40.1);
assert(conversor.fToC(40.1) == 4.500000000000001);
	}

}
