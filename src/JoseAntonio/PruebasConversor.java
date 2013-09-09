package JoseAntonio;


public class PruebasConversor {

	public static void main(String[] args) {
			Conversor conversor = new Conversor();
			
		assert (conversor.cToF(10)== 50);
		assert (conversor.fTOc(10)==-15.277777777777779);
		assert	(conversor.cToF(-459.68)==0);
		assert (conversor.fTOc(254)==0);

	}

}
