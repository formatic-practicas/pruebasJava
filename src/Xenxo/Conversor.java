package Xenxo;

public class Conversor {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		Conversor conversor = new Conversor();
		System.out.println("El resultado es: " + conversor.cToF(10));
		System.out.println("El resultado es: " + conversor.fToC(10));
	}

	public double cToF(double c) {
		if(c < - 273){
			System.out.println("¡¡¡DEMASIADO FRIO!!!");
			return 0;
			}
		if(c > 273){
			System.out.println("¡¡¡DEMASIADO CALOR!!!");
			return 0;
			}
		return (c*9.0/5.0)+32;
	}

	
	public double fToC(double f) {
		if(f < -459.67){
			System.out.println("¡¡¡DEMASIADO CALOR!!!");
			return 0;
		}

		if(f > 273){
		System.out.println("¡¡¡DEMASIADO FRIO!!!");
		return 0;
		}
		return (f-32)(5.0/9.0);
	}

