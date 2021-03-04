package myFirstMethod;
import java.util.Random;

public class Password {

	private String contrasenya;
	private int longitud;


	public Password() {
		this.longitud = 8;
		this.contrasenya = generarPassword(longitud);
	}	

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasenya = generarPassword(longitud);
	}

	/**				SETTERS				**/
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**				GETTERS				**/
	public String getContrasenya() {
		return contrasenya;
	}

	public int getLongitud() {
		return longitud;
	}

	public String toString() {
		this.contrasenya = contrasenya;
		return "La contrasenya generada és: " + contrasenya;
	}
	
	public boolean esForta() {
		int countUpper= 0;
		int countLower = 0;
		int countNum = 0;
		boolean esForta = false;
		
		for(int i = 0; i < contrasenya.length(); i++) {	
			if(Character.isDigit(contrasenya.charAt(i))) {
				countNum++;
			} else if (Character.isUpperCase(contrasenya.charAt(i))) {
				countUpper++;
			} else if (Character.isLowerCase(contrasenya.charAt(i))) {
				countLower++;
			}
			
			if(countNum >= 5 && countLower >= 1 && countUpper >= 2) {
				esForta = true;
			}
		}
		
		return esForta;
	}
	
	private String generarPassword(int longitud) {
		Random rng = new Random();
		String passwordResult ="";
		int majCount = 0;
		int minCount = 0;
		int numCount = 0;
		int random;
		char a = ' ';
		
		for(int i = 0; i < longitud; i++) {
			random = rng.nextInt(3) + 1;
			//majuscules
			if(random == 1) {
				a = (char) (rng.nextInt(25) + 65);
				passwordResult += a; 
			}
			
			//minuscules
			else if(random == 2) {
				a = (char) (rng.nextInt(25) + 97);
				passwordResult += a;  
			} 
			
			//nombres
			else if(random ==3) {
				a = (char) (rng.nextInt(10) + 48);
				passwordResult += a;
			}
		}
		return passwordResult;
	}
}
