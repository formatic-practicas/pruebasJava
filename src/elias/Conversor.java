package elias;

public class Conversor {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		Conversor conversor =new Conversor();
		System.out.println("El resultado es: " + conversor.cToF(10));
		System.out.println("El resultado es: " + conversor.fToC(10));
	}
	public double cToF(double c){
		if(c < -273){
			System.out.println("Demasiado frío");
			return 0;
		}
		if(c > 273){
			System.out.println("Demasiado calor");
			return 0;
		}
		return (c*9.0/5.0)+32;
	}
	public double fToC(double f){
		if(f< -459.67){
			System.out.println("Demasiado frío");
		}
		if(f > 523){
			System.out.println("Demasiado calor");
		}
		return (f - 32) * (5.0/9.0);
	}
}
