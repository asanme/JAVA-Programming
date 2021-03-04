package myFirstMethod;

public class Rectangle {
	private double alcada;
	private double amplada;

	public Rectangle() {
		this.alcada = 1.0;
		this.amplada = 1.0;
	}

	public Rectangle(double alcada, double amplada) {
		this.alcada = alcada;
		this.amplada = amplada;
	}

	public double getArea() {
		return this.alcada*this.amplada;
	}

	public double getPerimetre() {
		return (2*this.alcada) + (2 * this.amplada);
	}

	/** 		GETTERS			**/
	public double getAlcada() {
		return alcada;
	}

	public double getAmplada() {
		return amplada;
	}
	/** 	 					**/



	/**			SETTERS			**/
	public void setAlcada(double alcada) {
		if (alcada < 0) {
			System.out.println("No pot ser un nombre negatiu!");
		} else {
			this.alcada = alcada;

		}
	}

	public void setAmplada(double amplada) {
		if(amplada < 0) {
			System.out.println("No pot ser un nombre negatiu!");
		} else {
			this.amplada = amplada;
		}
	}
	/**  	  					**/


	/** 		MÈTODES 		**/
	public Rectangle majorRect(Rectangle[] rectangle){
		int cont;
		double areaMajor;
		Rectangle resultat = null;

		if(rectangle.length>0){
			resultat = new Rectangle();
			areaMajor = rectangle[0].getArea();
			cont = 0;
			for (int i = 0; i < rectangle.length; i++){
				if (rectangle[i].getArea() > areaMajor){
					areaMajor = rectangle[i].getArea();
					cont = i;
				}
			}
			resultat = rectangle[cont];
		}
		return resultat;
	}
	/**  	  					**/
}
