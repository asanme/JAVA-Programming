package myFirstMethod;
import java.util.Scanner;
import java.util.Random;

/**
 * ERRORS:
 * La màquina generava un sol nombre random i no estaba ben generat, ja que incloia el nombre 0
 * El bucle while no acababa fins que el jugador feia les 3 tirades sense importar si habia acertat
 * El nombre d'intents no es reiniciaba al començar una nova ronda
 * Els punts del jugador i de la màquina estaven al revés
 * El nombre de la ronda incloia el número 0
 */


/**
 * La classe EndevinaBugs és una aplicació que utilitza un objecte Random per a
 * jugar a endevinar un número entre un jugador humà i l'ordinador.
 *
 * Per arreglar l'error només cal fer canvis MENORS!!
 *
 */
public class EndevinaBugs {

    // Podeu suposar que tots els comentaris són correctes
    public static void main(String[] args) {

        //Aquestes declaracions són correctes
        Random ranGen = new Random();	
        final int cares = 6;			// nombre de cares del dau
        Scanner in = new Scanner(System.in);
        int estimacioJugador = -1;				// estimació del jugador
        int tiradaDau = -1;				// tirada de dau
        int puntsOrdinador = 0;			// puntuació de l'ordinador, 0 - 5 max
        int puntsJugador = 0;			// puntuació del jugador, 0 - 5 max
        boolean esIntentCorrecte = false;		// boolea per indicar si s'ha encertat
        int numeroIntents = 0;				// conta el nombre d'intents per ronda

        //  ASSEGURA'T QUE EL PROGRAMA JUGA AMB AQUESTES REGLES!!!
        System.out.println("Benvingut al joc ENDEVINA EL DAU!\n\n REGLES:");
        System.out.println("1. Es jugaran 5 rondes.");
        System.out.println("2. A cada ronda hauràs d'endevinar el número aparegut en un dau de sis cares.");
        System.out.println("3. Si endevines el número aparegut en tres intents o menys\n"
                + "   guanyes un punt, en cas contrari, jo guanyo un punt.");
        System.out.println("4. Qui tingui més punts després de 5 rondes guanyarà el joc.");

        // juguem 5 rondes
        for (int ronda = 1; ronda <  6; ronda++) {

            // tirem el dau al principi de la ronda
            System.out.println("\n\nRONDA " + ronda);
            System.out.println("-------");
            tiradaDau = ranGen.nextInt(cares) + 1;
        	System.out.println("L'ordinador ha tirat el dau.");
            System.out.println("Tens tres intents.");
            esIntentCorrecte = false;
            numeroIntents = 0;	
            
            // el següent bucle gestiona els tres intents
            while (numeroIntents < 3 && !esIntentCorrecte) {

                
                // input i validació: ha de ser un valor entre 1 i 6 inclosos
                do {
                	
                    System.out.print("\nQuina tirada he tret [1-6]? ");

                    estimacioJugador = in.nextInt();

                    if ((estimacioJugador < 1) && (estimacioJugador > 6)) {
                        System.out.println("   Siusplau, entra un valor vàlid [1-6]!");
                    }
                } while (estimacioJugador < 1 || estimacioJugador > 6);

                // el jugador ha encertat?
                if (tiradaDau == estimacioJugador) {
                	esIntentCorrecte = true;
                    System.out.println("   Correcte!");
                   
                } else {
                	esIntentCorrecte = false;
                    System.out.println("   Aquesta no era la tirada.");
                }
                numeroIntents++;
            }

            // si el jugador ha encertat, guanya un punt
            // en cas contari l'ordinador rep un punt
            if (esIntentCorrecte) {
            	puntsJugador++;
                
            } else {
            	puntsOrdinador++;
            }

            // mostra la resposta i les puntuacions
            System.out.println("\n*** La resposta correcta era: " + tiradaDau + " ***\n");
            System.out.println("Punts:");
            System.out.println("  Tu: \t\t" + puntsJugador);
            System.out.println("  Ordinador: \t" + puntsOrdinador);
            System.out.println("");
        }

        // dir al jugador si ha guanyat o ha perdut
        if (puntsOrdinador > puntsJugador) {
            System.out.println("*** Has perdut! ***");
        } else {
            System.out.println("*** Has guanyat! ***");
        }

        System.out.println("Gràcies per jugar a endevina el dau!");
    }
}