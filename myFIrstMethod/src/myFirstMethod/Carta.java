package myFirstMethod;

public class Carta {
	private int numero;
	private String pal;
	private static final String[] PALS = ["espases", "bastos", "oros", "copes"];
	private static final int LIMIT_CARTA_PAL = 12;
	
	public Carta(int numero, String pal) {
		this.numero = numero;
		this.pal = pal;
	}
	
	private String toString() {
		return "Carta " + this.numero + " de " + this.pal;
	}
}
