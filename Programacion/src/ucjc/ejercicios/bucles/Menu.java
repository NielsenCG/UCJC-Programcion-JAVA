package ucjc.ejercicios.bucles;

import java.util.Scanner;

import ucjc.utils.Utilidades;

public class Menu {

	
	public static void main(String[] args) {
		while (true) {
			
			Utilidades utils = new Utilidades();
		
			utils.pintaMenu();
		
			int opcion = Utilidades.elegirOpcion();
		
			Utilidades.opcion(opcion);
		}
	}
}
