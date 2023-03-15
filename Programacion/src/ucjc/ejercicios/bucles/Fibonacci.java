package ucjc.ejercicios.bucles;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		long n1 = 0;
		long n2 = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números que quieres que tenga la secuencía de fibonacci");
		int numero = scan.nextInt();
		
		for (int x=0 ; x<numero ; x++) {
			if (x == 0) {
				System.out.println("1");
			}else {
			long suma = n2 + n1;
			System.out.println(+suma);
			n1 = n2;
			n2 = suma;
			}
		}
	}
}
