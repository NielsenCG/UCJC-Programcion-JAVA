package ucjc.strings;

public class PruebaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Caperucita Roja";
		
		nombre = nombre.toUpperCase();
		
		System.out.println(nombre);
		
		String lobo1 = "Lobo";
		String lobo2 = "Lobo";
		
		System.out.println(lobo1 == lobo2);
		
		lobo2 = nombre.toLowerCase();
		
		System.out.println(lobo1);
		System.out.println(lobo2);
		
		System.out.println(nombre.endsWith("ja"));
		
		System.out.println(nombre.indexOf("A"));
		System.out.println(nombre.lastIndexOf("A"));
		
		System.out.println("    asd     asdasd    ".trim());
		System.out.println("    asd     asdasd    ".replace(" ", ""));
		
		System.out.println(nombre.substring(3));
		System.out.println(nombre.substring(3, 7));
		
		int posicion = nombre.indexOf("ROJA");
		System.out.println(nombre.substring(posicion));
		
		String cadena = "N1;A1;DNI;23;MADRID";
		String [] valores = cadena.split(cadena);
		System.out.println(nombre.contains("A"));
		System.out.println(lobo1.length());
	}
}
