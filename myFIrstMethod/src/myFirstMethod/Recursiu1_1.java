package myFirstMethod;
import java.util.Scanner;

public class Recursiu1_1 {
	public static double sum;
	public static void main(String[] args) {
		sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Quantes vegades vols fer el càlcul: ");
		double count = input.nextDouble();
		System.out.print("La suma és: ");
		test(1.0, count);
	}
	
	public static void test(double start, double end) {
		sum += (1 / start);
		System.out.print(sum + " + ");

		if(start <= end) {
			start++;
			test(start, end);
		}
	}	

}
