package myFirstMethod;

import java.util.Scanner;
import java.

public class tresenraya {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] table;
		String fitxa = "";
		boolean hasPrinted = false;
		boolean draw = false;
		boolean correctInput = false;
		boolean turnX = false;
		boolean turnO = false;
		boolean finished = false;
		boolean winner = false;
		int turn = 0;
		int x = 0;
		int y = 0;
		int count = 0;
		
		
		
		//GENEREM LA TAULA
		table = createTable();
		//IMPRIMIM LA TAULA
		printTable(table);
		
		//COMPROVEM SI EL JOC HA ACABAT
		while (winner || !draw) {
			//PREGUNTEM A QUI LI TOCA POSSAR FITXA
			if (turn == 0) {
				fitxa = "X";
				turnX = true;
				turnO = false;
			} else {
				fitxa = "O";
				turnO = true;
				turnX = false;
			}
			
			//INTRODUIM LA FITXA AL EIX X
			System.out.print("Jugador " + fitxa + " INTRODUEIX LA UBICACIÓ (EIX X): ");

			while (!correctInput) {
				if (input.hasNextInt()) {
					x = input.nextInt();
					correctInput = true;
				} else {
					input.next();
					correctInput = false;
					System.out.print("Introdueix un valor vàlid: ");
				}
			}

			input.nextLine();
			correctInput = false;

			//INTRODUIM LA FITXA AL EIX Y
			System.out.print("Jugador " + fitxa + " INTRODUEIX LA UBICACIÓ (EIX Y): ");
			while (!correctInput) {
				if (input.hasNextInt()) {
					y = input.nextInt();
					correctInput = true;
				} else {
					input.next();
					correctInput = false;
					System.out.print("Introdueix un valor vàlid: ");
				}
			}
			

			input.nextLine();

			// COMPROVEM CASELLES
			// POSEM FITXES

			if (turnX && correctInput) {
				if (!table[x][y].contains("O") && !table[x][y].contains("X")) {
					table[x][y] = "X";
					hasPrinted = true;
				} else {
					System.out.println("Introdueix un eix que no estigui ocupat");
					hasPrinted = false;
				}
			}
			
			if (turnO && correctInput) {
				if (!table[x][y].contains("X") && !table[x][y].contains("O")) {
					table[x][y] = "O";
					hasPrinted = true;
				} else {
					System.out.println("Introdueix un eix que no estigui ocupat");
					hasPrinted = false;
				}
			}
			
		

			if (hasPrinted) {
				if (turn == 0) {
					turn++;
					count++;
					if (count >= 9) {
						draw = true;
						System.out.println("Empat!");
					}
				} else if (turn == 1) {
					turn = 0;
					count++;
					if (count >= 9) {
						draw = true;
						System.out.println("Empat!");
					}
				}
			}
			
			//COMPROVEM SI HI HA UN GUANYADOR I PRINTEM LA TAULA
			correctInput = false;
			hasPrinted = false;
			printTable(table);
			finished = checkWinner(table, fitxa, count);
			if(finished) {
				break;
			}
		}
		
	}

	public static String[][] createTable() {

		String[][] table = new String[3][3];

		for (int x = 0; x < table.length; x++) {
			for (int y = 0; y < table[0].length; y++) {
				table[x][y] = " ";
			}
		}

		return table;
	}

	public static void printTable(String[][] table) {

		System.out.println("-------------");
		System.out.println("| " + table[0][0] + " | " + table[0][1] + " | " + table[0][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + table[1][0] + " | " + table[1][1] + " | " + table[1][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + table[2][0] + " | " + table[2][1] + " | " + table[2][2] + " |");
		System.out.println("-------------");
	}

	//WINNER CASES
	public static boolean checkWinner(String[][] table, String fitxa, int count) {
		String winnerPlayer = "";
		boolean hasFinished = false;
		boolean winner = false;
		// HORIZONTAL
		if (table[0][0].contains(fitxa) && table[0][1].equals(fitxa) && table[0][2].contains(fitxa)) {
			winner = true;
			winnerPlayer = fitxa;
			announceWinner(winner, winnerPlayer);
		} else if (table[1][0].contains(fitxa) && table[1][1].equals(fitxa) && table[1][2].contains("X")) {
			winner = true;
			winnerPlayer = "X";
			announceWinner(winner, winnerPlayer);
		} else if (table[2][0].contains(fitxa) && table[2][1].equals(fitxa) && table[2][2].contains(fitxa)) {
			winner = true;
			winnerPlayer = fitxa;
			announceWinner(winner, winnerPlayer);
		}

		// VERTICAL
		else if (table[0][0].contains(fitxa) && table[1][0].equals(fitxa) && table[2][0].contains(fitxa)) {
			winner = true;
			winnerPlayer = fitxa;
			announceWinner(winner, winnerPlayer);
		} else if (table[0][1].contains(fitxa) && table[1][1].equals(fitxa) && table[2][1].contains(fitxa)) {
			winner = true;
			winnerPlayer = fitxa;
			announceWinner(winner, winnerPlayer);
		} else if (table[0][2].contains(fitxa) && table[1][2].equals(fitxa) && table[2][2].contains(fitxa)) {
			winner = true;
			winnerPlayer = fitxa;
			announceWinner(winner, winnerPlayer);
		}

		// DIAGONAL
		else if (table[0][0].contains(fitxa) && table[1][1].equals(fitxa) && table[2][2].contains(fitxa)) {
			winner = true;
			winnerPlayer = fitxa;
			announceWinner(winner, winnerPlayer);
		} else if (table[0][2].contains(fitxa) && table[1][1].equals(fitxa) && table[2][0].contains(fitxa)) {
			winner = true;
			winnerPlayer = fitxa;
			announceWinner(winner, winnerPlayer);
		}
		
		return winner;
	}

	public static boolean announceWinner(boolean w, String wPlayer) {
		boolean hasFinished = true;
		if (w) {
			System.out.print("El guanyador ha sigut el jugador " + wPlayer);
		} else {
			System.out.println("Empat");
		}
		
		return hasFinished;
	}
}