package antonio.solitario;

public class Carta {
	public Carta(int numero, Palo palo){
		this(numero, palo, Estado.BOCA_ABAJO);
	}
	public Carta(int numero, Palo palo, Estado estado){
		this.numero=numero;
		this.palo = palo;
		this.estado = estado;
	}
//	public String paloToString(){
//		switch(palo){
//		case DIAMANTES:
//			return "diamantes";
//		case PICAS:
//			return "picas";
//		case CORAZONES:
//			return "corazones";
//		case TREBOL:
//			return "trebol";
//		default:
//			return "ERROR";
//		}
//	}
	@Override
	public String toString() {
		return ""+numero + " de " + getPalo();
	}

	public Estado getEstado(){
		return estado;
	}
	public void setEstado(Estado estado){
		this.estado = estado;
	}
	public Palo getPalo() {
		return palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	public Color getColor() {
//		switch(palo){
//		case DIAMANTES:
//		case CORAZONES:
//			return Color.ROJO;
//		case PICAS:
//		case TREBOL:
//			return Color.NEGRO;	
//		default:
//			return Color.NEGRO;
//		}
//		if(palo == Palo.DIAMANTES || palo == Palo.CORAZONES){
//			return Color.ROJO;
//		}
//		return Color.NEGRO;
		return (palo == Palo.DIAMANTES|| palo == Palo.CORAZONES)?
				Color.ROJO
				:Color.NEGRO
		;
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	private Estado estado;
	private Palo palo;
	private int numero;
}
