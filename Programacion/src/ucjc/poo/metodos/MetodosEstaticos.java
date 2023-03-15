package ucjc.poo.metodos;

import java.security.PublicKey;

public class MetodosEstaticos {

	public static String dato = "dato1";
	
	public static void metodo1() {
		System.out.println("Metodo1 Estatico");
		metodo2();
	}
	
	public static void metodo2() {
		dato = "Hola";
		System.out.println("Metodo2 Estatico");
	}
	
	public static void metodo3() {
		metodo1();
		System.out.println("Metodo3 Estatico");
	}
		
	public void metodo4() {
		metodo1();
		System.out.println("Metodo2 no estatico");
	}
	
	public void metodo4(int num) {
		System.out.println(num);
	}
	
	public void metodo4(String texto) {
		System.out.println(texto);
	}
}
