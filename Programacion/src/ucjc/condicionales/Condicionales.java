package ucjc.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1 = 8;
		int numero2 = 10;
		
		if (numero1 > numero2 ) {
			System.out.println("Numero1 es mayor");
		}
		else if (numero2 > 0) {
			System.out.println("Numero2 es mayor de cero");
		}
		else {
			System.out.println("No se cumple ninguna condición");
		}
		// || or en condicionales
		// && and en condicionales
		
		//Condicionales con switch
		switch (numero1) {
		case 1: System.out.println("Valor 1");
			break;
		case 2: System.out.println("Valor 2");
			break;
		case 8: System.out.println("Valor 8");
			break;
		case 10: System.out.println("Valor 10");
			break;
		default: System.out.println("Otro valor");
			break;
		}
	}
	
	
}
