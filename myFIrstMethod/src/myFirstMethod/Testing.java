package myFirstMethod;
import java.util.Random;
import java.util.Scanner;
public class Testing {
	public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introdueix la longitud que desitjes de la contrasenya: ");
		int length = input.nextInt();
		System.out.print("Introdueix quantes contrasenyes desitjes: ");
		int number = input.nextInt();
		Password[] contrasenya = new Password[number];
		
		for(int i = 0; i < number; i++) {
			Password pass = new Password(length);
			contrasenya[i] = pass;
			System.out.println(pass.toString());
			System.out.print("La contrasenya ");
			if(pass.esForta() == true) {
				System.out.print("és forta.");
			} else {
				System.out.print("no és forta. ");
			}
			System.out.println();
		}
	}
}