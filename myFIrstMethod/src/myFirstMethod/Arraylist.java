package myFirstMethod;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> positive = new ArrayList<Integer>();
		ArrayList<Integer> negative = new ArrayList<Integer>();
		ArrayList<Integer> ordered = new ArrayList<Integer>();

		int number = -1;
		while(number != 0) {		
			System.out.print("Introdueix un nombre positiu o negatiu (0 per sortir): ");
			number = input.nextInt();
			
			if(number > 0 && number != 0) {
				positive.add(number);
			} else if (number < 0 && number != 0){
				negative.add(number);
			}
		}
		System.out.println();
		System.out.print("Nombres negatius: [ ");
		for(Integer count: negative) {
			System.out.print(count + "  ");
		}
		System.out.print("] ");

		
		System.out.println();
		System.out.print("Nombres positius: [ ");
		for(Integer count: positive) {
			System.out.print(count + "  ");
		}
		System.out.print("] ");

		ordered.addAll(negative);
		ordered.addAll(positive);
		Collections.sort(ordered);

		System.out.println();
		System.out.print("Llista ordenada de tots els nombres: [ ");
		for(Integer count: ordered) {
			System.out.print(count + " , ");
		}
		System.out.print("] ");
	}
}
