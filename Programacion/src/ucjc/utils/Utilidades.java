package ucjc.utils;

import java.util.Scanner;

public class Utilidades {
	
	public void pintaMenu() {
		System.out.println("1. Validar e-mail");
		System.out.println("2. Pintar un cuadrado");
		System.out.println("3. Mostrar datos");
		System.out.println("4. Salir");
	}
	
	public static void pintaMenu(String menu) {
		menu = menu.replace("@", "\n");
		System.out.println(menu);
	}
	
	public static void pintaMenu(String [] menu) {
		for (String menuString : menu) {
			System.out.println(menuString);
		}
	}
	
	public static int elegirOpcion() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu opcion:");
		int OpcionElegida = scan.nextInt();
		return OpcionElegida;
	}
	
	public static void opcion(int opcionElegida) {
		if (opcionElegida == 1) {
			email();
		} else if (opcionElegida == 2) {
			pintarCuadrado();
		} else if (opcionElegida == 3) {
			mostrarDatos();
		} else if (opcionElegida == 4) {
			salir();
		} else {
			System.out.println("Elige un numero valido");

		}
		
	}
	
	public static void email() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Has elegido validar e-mail\nIntroduce el e-mail a validar:");
		String eMail = scan.nextLine();
		if (eMail.contains("@") && eMail.indexOf("@") == eMail.lastIndexOf("@")) {
			if (eMail.contains(" ") == false) {
				int posicionArroba = eMail.indexOf("@");
				String despuesArroba = eMail.substring(posicionArroba);
				if (despuesArroba.contains(".") && despuesArroba.indexOf(".") == despuesArroba.lastIndexOf(".")) {
					int posicionPunto = eMail.indexOf(".");
					String despuesPunto = eMail.substring(posicionPunto);
					if (2 <= despuesPunto.length() && despuesPunto.length() <= 6) {
						System.out.println("El e-Mail introducido es valido");
					} else {
						System.out.println("e-Mail no valido\nError 6: Menos de 2 o mas de 6 caracteres despues del .");
					}
				} else if (eMail.contains(".") == true){
					System.out.println("e-Mail no valido\nError 4: Mas de un .");
				} else {
					System.out.println("e-Mail no valido\nError 5: No contiene ningún .");
				}
			} else {
				System.out.println("e-Mail no valido\nError 3: Contiene un espacio");
			}
		} else if (eMail.contains("@") == true){
			System.out.println("e-Mail no valido\nError 2: Mas de un @");
		} else if (eMail.contains("@") == false){
			System.out.println("e-Mail no valido\nError 1: No contiene ningun @");
		}
	}
	
	public static void pintarCuadrado() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Has elegido pintar un cuadrado");
		System.out.println("Introduce el tamaño del cuadrado");
		int Tamaño = scan.nextInt();
		if (Tamaño == 1) {
		System.out.println("*");	
		}else {
		String lado;
		lado = "*".repeat(Tamaño);
		System.out.println(lado);
		for (int x=0; x<Tamaño-2; x++) {
			System.out.println("*" +" ".repeat(Tamaño-2)+"*");
		}
		System.out.println(lado);
		}
	}
	
	public static void mostrarDatos() {
		System.out.println("Has elegido mostrar datos");
	}
	
	public static void salir() {
		System.out.println("Has elegido salir del programa");

	}
}
