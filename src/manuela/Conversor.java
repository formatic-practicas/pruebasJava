package manuela;

public class Conversor {

	public static void main(String[] args) {
		System.out.println("hola mundo");
		Conversor conversor = new Conversor();
		System.out.println("el resultado es: " + conversor.cToF(4.5));
		System.out.println("el resultado es: " + conversor.fToC(4.5));

	}

	public double cToF(double c) {
		if (c < -273) {
			System.out.println("demasiado frio");
			return 0;
		}
		if (c> 273) {
			System.out.println("demasiado calor");
			return 0;
		}
		return (c * 9.0 / 5.0) + 32;
	}

	public double fToC(double f) {
		if (f < -459.67) {
			System.out.println("demasiado frio");
			return 0;
		}
		if (f > 523) {
			System.out.println("demasiado calor");
			return 0;
		}
		return (f - 32) * (5.0 / 9.0);
	}
}
