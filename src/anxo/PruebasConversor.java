package anxo;

public class PruebasConversor {

	public static void main(String[] args) {
	
		Conversor conversor = new Conversor();
		
		System.out.println("C->F "+conversor.cToF(100));
		System.out.println("F->C "+conversor.fToC(100));
		
		System.out.println("C->F "+conversor.cToF(-274));
		System.out.println("F->C "+conversor.fToC(743));
		
		assert(conversor.fToC(743.0)==347);
		
	}
}
