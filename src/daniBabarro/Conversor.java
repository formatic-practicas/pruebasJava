package daniBabarro;

public class Conversor {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		Conversor conversor = new Conversor();
		System.out.println("El resultado en F es: "+ conversor.cToF(4.5));
		System.out.println("El resultado en C es: "+ conversor.fToC(40.1));
	}
	public double cToF(double c){
		if(c < -273){
			System.out.println("Error en el rango de grados, demasiado frio.");
			return 0.0;
		}
		if(c > 273){
			System.out.println("Error en el rango de grados, demasiado calor.");
			return 0.0;
		}
		return (c * 9.0/5.0) + 32;
	}
	public double fToC(double f){
		if(f < -459.67){
			System.out.println("Error en el rango de grados, demasiado frio.");
			return 0.0;
		}
		if(f > 459.67){
			System.out.println("Error en el rango de grados, demasiado calor.");
			return 0.0;
		}
		return (f - 32) * (5.0/9.0);
	}
}
