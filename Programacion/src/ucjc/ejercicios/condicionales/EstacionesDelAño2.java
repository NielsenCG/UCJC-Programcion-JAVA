package ucjc.ejercicios.condicionales;

import java.util.Scanner;

/*
 * Declarar variable de tipo String para representar el nombre de un mes
 * A partir del mes indicar la estación del año
 */

public class EstacionesDelAño2 {

	public static void main(String[] args) {
		
		String mes = "Enero";
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el nombre de un mes: ");
		mes = scan.nextLine();
		System.out.println("Mes introducido: " +mes);
		
		// Realizamos con el if
		String estacion = "";
		if (mes.equals("Enero") || mes.equals("Febrero") || mes.equals("Marzo")) {
			estacion = "Invierno";
		}
		if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
			estacion = "Primavera";	
		}
		if (mes.equals("Julio") || mes.equals("Agosto") || mes.equals("Septiembre")) {
			estacion = "Verano";
		}
		if (mes.equals("Octubre") || mes.equals("Noviembre") || mes.equals("Diciembre")) {
			System.out.println("Estamos en invierno");
			estacion = "Otoño";
		}
		
		System.out.println("La estación del mes "+mes + " es "+estacion);
		
		switch (mes) {
		case "Enero":
		case "Febrero":
		case "Marzo": System.out.println("Estamos en invierno");
			break;
		case "Abril":
		case "Mayo":
		case "Junio": System.out.println("Estamos en primavera");
			break;
		case "Julio":
		case "Agosto":
		case "Septiembre": System.out.println("Estamos en verano");
			break;
		case "Octubre":
		case "Noviembre":
		case "Diciembre": System.out.println("Estamos en otoño");
			break;
		default: System.out.println("Te has equivocado no te sabes los meses como Bolacha");
		}
	}
}