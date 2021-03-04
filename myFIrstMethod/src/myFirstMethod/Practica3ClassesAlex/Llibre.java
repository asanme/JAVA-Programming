package myFirstMethod.Practica3ClassesAlex;

public class Llibre {
	private String autor;
	private float preuCost;
	private float preuVenta;
	private String titol;
	private int numPags;
	
	public Llibre(String autor, float preuCost, float preuVenta, String titol, int numPags){
		this.autor = autor;
		this.preuCost =preuCost;
		this.preuVenta = preuVenta;
		this.titol = titol;
		this.numPags = numPags;
	}
	
	
	//			GETTERS 			//
	public String getAutor() {
		return autor;
	}
	
	public float getPreuCost() {
		return preuCost;
	}
	
	public float getPreuVenta() {
		return preuVenta;
	}
	
	public String getTitol() {
		return titol;
	}
	
	public int getNumPags() {
		return numPags;
	}
	
	//				SETTERS 			//
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}
	
	public void setPreuCost(float preuCost) {
		this.preuCost = preuCost;
	}
	
	public void setPreuVenta(float preuVenta) {
		this.preuVenta = preuVenta;
	}
	
	public void setTitol(String titol) {
		this.titol = titol;
	}
	
	//			METODES 			//
	public float obtenirBenefici() {
		float benefici = 0.0f;
		benefici = preuVenta - preuCost - obtenirIva();
		return benefici;
	}
	
	public float obtenirIva() {
		float iva = 0.0f;
		iva = (4*preuVenta)/100;
		return iva;
	}	
	
	public void titolToString() {
		System.out.println("El titol del llibre és " + titol);
	}
}
