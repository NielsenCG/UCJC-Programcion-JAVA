package ucjc.arrays;

import java.util.Scanner;

public class ArrayConDatosDesconocidos {

	public static void main(String[] args)  {
		
		int [] [] numeros = new int [2] [3];
		numeros [1] [1] = 8;
		System.out.println(numeros[1] [1]);
		System.out.println("Numero de filas " +numeros.length);
		System.out.println("Numero de columnas" +numeros[1].length);
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[1].length; j++) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce el valor de la matriz["+i+"],["+j+"]");
				numeros [i][j] = scan.nextInt();
				if (j < 2) {
					System.out.print(numeros[i][j]+" ");
				} else {
					System.out.println(numeros[i][j]);
					}
			}
		}
	}
}