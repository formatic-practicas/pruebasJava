package JoseAntonio.solitario;

public interface PilaDeCartas {

	public abstract int getNumCartas();

	public abstract void barajar();

	public abstract Carta extraerCarta();

	public abstract void agregarCarta(Carta carta);

	public abstract Carta getUltimaCarta();

	public abstract boolean estaVacio();

}