package JoseAntonio;

public class Conversor {
	public static void main(String[] args) {
		
		Conversor conversor =new Conversor();
				System.out.println("El resultado es: "+conversor.cToF(4.5));
				System.out.println("El resultado es: "+conversor.fTOc(4.5));
}
	
	
public double cToF(double c){
	if(c < -273){
		System.out.println("Demasiado Frio");
			return 0;
	}
	if(c < 273){
		System.out.println("Demasiado Calor");
			return 0;
	}
		return (c * 9 / 5)+32;
	}

public double fTOc(double f){
	if(f < -459.67){
		System.out.println("Demasiado Frio");
		return 0;
	}
	
	if (f > 523){
		System.out.println( "Demasiado Calor");
		return 0;
	}
		return (f-32) * (5.0/9.0);
	}

}
