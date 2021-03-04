package myFirstMethod;

import java.util.Scanner;

public class Metodes2_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		while (number != -1) {
			if (number > 10000) {
				System.out.println("Introdueix un nombre positiu menor a 10.000! ");
			} else {
				System.out.print("Introdueix un nombre positiu < 10000: ");
				number = input.nextInt();
				System.out.println(conversion(number));
			}
		}

	}

	public static String conversion(int n) {
		String numericString = "";
		int conv = (n % 10);
		int firstNumber = n % 10;
		int secondNumber = ((n % 100)/10);
		int thirdNumber = ((n / 100)%10);
		
		System.out.println("FIRST NUMBER: " + firstNumber);
		System.out.println("SECOND NUMBER: " + secondNumber);
		System.out.println("THIRD NUMBER: " + thirdNumber);
		if (n < 21) {
			numericString += switchUnits(n);
		} else if (n > 20 && n < 30) {
			numericString += switchUnits(firstNumber ) + "-i-" + switchUnits(conv);
		} else if (n > 29 && n < 100) {
			if (conv == 0) {
				numericString += switchUnits(firstNumber ) + " " + switchUnits(conv);

			} else {
				numericString += switchUnits(firstNumber ) + "-" + switchUnits(conv);
			}

		}
		
		else if (n > 99 && n < 200) {
			if (conv == 0) {
				numericString += "cent " + switchUnits(firstNumber );
			} else {
				firstNumber  = (n % 100) - conv;
				if (firstNumber  > 19 && firstNumber  < 30) {
					numericString += "cent " + switchUnits(firstNumber ) + "-i-" + switchUnits(conv);
				} else {
					numericString += "cent " + switchUnits(firstNumber ) + "-" + switchUnits(conv);
				}

			}
		}
		
		else if (n > 199 && n < 1000) {
			if (conv == 0) {
				numericString += switchUnits(secondNumber) + "-cents " + switchUnits(firstNumber );
			} else {
				firstNumber  = (n % 100) - conv;
				if (firstNumber  > 19 && firstNumber  < 30) {
					numericString += switchUnits(secondNumber ) + "-cents " + switchUnits(firstNumber ) + "-i-"
							+ switchUnits(conv);
				} else {
					numericString += switchUnits(secondNumber ) + "-cents " + switchUnits(firstNumber ) + "-"
							+ switchUnits(conv);

				}

			}
		}
		
		else if (n > 999 && n < 2000) {
			if((n/100)%10 == 1) {
				if((n % 100) > 30 ) {
					numericString += "mil " + " cent " + switchUnits((n%100)/10);
				}
			} 
		}

		return numericString;
	}

	public static String switchUnits(int n) {
		String catalanNumbers = "";

		switch (n) {
		case 1:
			catalanNumbers += "u";
			break;
		case 2:
			catalanNumbers += "dos";
			break;
		case 3:
			catalanNumbers += "tres";
			break;
		case 4:
			catalanNumbers += "quatre";
			break;
		case 5:
			catalanNumbers += "cinc";
			break;
		case 6:
			catalanNumbers += "sis";
			break;
		case 7:
			catalanNumbers += "set";
			break;
		case 8:
			catalanNumbers += "vuit";
			break;
		case 9:
			catalanNumbers += "nou";
			break;
		case 10:
			catalanNumbers += "deu";
			break;
		case 11:
			catalanNumbers += "onze";
			break;
		case 12:
			catalanNumbers += "dotze";
			break;
		case 13:
			catalanNumbers += "tretze";
			break;
		case 14:
			catalanNumbers += "catorze";
			break;
		case 15:
			catalanNumbers += "quinze";
			break;
		case 16:
			catalanNumbers += "setze";
			break;
		case 17:
			catalanNumbers += "disset";
			break;
		case 18:
			catalanNumbers += "divuit";
			break;
		case 19:
			catalanNumbers += "dinou";
			break;
		case 20:
			catalanNumbers += "vint";
			break;
		case 30:
			catalanNumbers += "trenta";
			break;
		case 40:
			catalanNumbers += "quaranta";
			break;
		case 50:
			catalanNumbers += "cinquanta";
			break;
		case 60:
			catalanNumbers += "seixanta";
			break;
		case 70:
			catalanNumbers += "setanta";
			break;
		case 80:
			catalanNumbers += "vuitanta";
			break;
		case 90:
			catalanNumbers += "noranta";
			break;
		case 100:
			catalanNumbers += "cent";
			break;
		}
		return catalanNumbers;
	}
}
