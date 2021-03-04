package myFirstMethod.Practica3ClassesAlex;

public class LlibreDigital extends Llibre{
	private String urlDescarrega;
	private int tamanyMB;
	
	public LlibreDigital(String autor, float preuCost, float preuVenta, String titol, int numPags,String urlDescarrega, int tamanyMB){
		super(autor, preuCost, preuVenta, titol, numPags);
		this.urlDescarrega = urlDescarrega;
		this.tamanyMB = tamanyMB;
	}
	
	public String getUrlDescarrega() {
		return urlDescarrega;
	}
	
	public int getTamanyMB() {
		return tamanyMB;
	}
	
	public void setUrlDescarrega(String urlDescarrega) {
		this.urlDescarrega = urlDescarrega;
	}
	
	public void setTamanyMB(int tamanyMB) {
		this.tamanyMB = tamanyMB;
	}
	
	public float tamanyPag() {
		float tamany = 0.0f;
		tamany = tamanyMB / super.getNumPags();
		return tamany;
	}
	
	
}
