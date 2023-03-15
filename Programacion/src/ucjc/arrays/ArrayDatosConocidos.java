package ucjc.arrays;

public class ArrayDatosConocidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] colores = {"Rojo","Azul","Amarillo"};
		String [] [] alumnosAula = {{"Felipe", "Bol", "Azu"},{"Ivanov", "Franchute"}};
		System.out.println(colores.length);
		System.out.println(colores[0]);
		
		// Recorremos array con for tradicional
		for (int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
		}
		
		// Recorremos array con bucle foreach
		for (String color : colores) {
			System.out.println(color);
		}
	}
}