package anxo;

public class Conversor {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Conversor conversor = new Conversor();
		/*
		 System.out.println("El resultado C->F es " + conversor.cToF(34));		 
		System.out.println("El resultado F->C es " + conversor.fToC(34));
		*/

	}

	public double cToF(double c) {
		if (c < -273 || c > 273) {
			//System.out.println(c+" error en el rango de grados");
			return 0;
		}
		return (c * (9.0 / 5.0)) + 32;
	}

	public double fToC(double f) {
		if (f < -459.69 || f > 523) {
			//System.out.println(f+" error en el rango de grados");
			return 0;
		}
		return (f - 32) * (5.0 / 9.0);
	}

}
