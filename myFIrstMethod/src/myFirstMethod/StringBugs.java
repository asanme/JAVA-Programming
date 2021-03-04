package myFirstMethod;

import java.util.Scanner;

/**
 * Aquest programa implementa dos mètodes amb errors que processen cadenes.
 *
 */
public class StringBugs {

    /**
     * Programa principal per provar els mètodes.
     *
     * @bugs no n'hi ha.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Entra una cadena: ");
        String str = in.nextLine();

        System.out.println("Entra un caràcter: ");
        char ch = in.next().charAt(0);

        System.out.println("El caràcter " + ch + " apareix "
                + countOccurrences(str, ch) + " vegades a la cadena \""
                + str + "\".");

        System.out.println("\n\nEntra una altra cadena: ");
        str = in.next();

        System.out.println("La cadena invertida de \""
                + str + "\" és " + reverseString(str));
    }

    /**
     * Compta el nombre d'aparicions del caràcter ch a la cadena str.
     *
     * @param s - String on buscar ch
     * @param c - char caràcter que s'està buscant
     * @return int - el nombre d'aparicions.
     *
     * @prova: cadena -> abracadabra lletra -> b OK
     * @bugs: cadena -> abracadabra lletra -> a KO
     */
    public static int countOccurrences(String s, char c) {
        int count = 0;
        
        if (s != null) {
            for (int i = 0; i <= s.length() - 1; i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
        }
        
        return count;
    }

    /**
     * Inverteix la cadena
     *
     * @param s - String a invertir
     * @return String - la cadena invertida
     *
     * @bugs Peta sempre.
     */
    public static String reverseString(String s) {
        char[] swap = s.toCharArray();

        //els errors estan a dins del for
        for (int i = 1; i < swap.length - 1; i++) {
            char aux = swap[i - 1];
            swap[i - 1] = swap[swap.length - i];
            swap[swap.length -i] = aux;
        }

        //torna a convertir la cadena de caràcters en una cadena
        return String.valueOf(swap);
    }
}