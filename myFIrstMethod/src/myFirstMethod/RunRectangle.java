package myFirstMethod;

public class RunRectangle {
	public static void main(String[] args) {
		//Provem els dos constructors
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(10.0, 11.0);
		//Provem setters
		rect1.setAlcada(15.0);
		rect1.setAmplada(10);
		//Provem getters i verifiquem
		System.out.println("Rectangle 1: " + rect1.getAlcada() + " " +
				rect1.getAmplada());
		System.out.println("Rectangle 2: " + rect2.getAlcada() + " " +
				rect2.getAmplada());
		//Provem els mètodes
		System.out.println("Àrea Rectangle 1: " + rect1.getArea() );
		System.out.println("Perímetre Rectangle 1:" + rect1.getPerimetre() );
		Rectangle[] rects = new Rectangle[2];
		rects[0] = rect1;
		rects[1] = rect2;
		Rectangle rect3 = new Rectangle();
		rect3 = rect3.majorRect(rects);
		System.out.println("El rectangle més gran és: " + rect3.getAlcada() +" "+
				rect3.getAmplada());
	}
}