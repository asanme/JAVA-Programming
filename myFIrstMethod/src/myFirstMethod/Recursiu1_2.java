package myFirstMethod;
import java.util.Scanner;

public class Recursiu1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Introdueix el valor que vols invertir: ");
		int number = input.nextInt();
		mostrarInvertit(number);
	}

	public static void mostrarInvertit(int valor) {
		if (valor < 10) {
			System.out.println(valor);
			return;
		} else {
			System.out.print(valor % 10);
			mostrarInvertit(valor/10);
		}
	}
}
