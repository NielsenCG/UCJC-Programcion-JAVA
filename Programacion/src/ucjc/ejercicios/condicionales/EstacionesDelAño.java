package ucjc.ejercicios.condicionales;

public class EstacionesDelAño {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes = "Abril";
		
		if (mes == "Enero" || mes == "Febrero" || mes == "Marzo") {
			System.out.println("Estamos en invierno");
		}
		if (mes == "Abril" || mes == "Mayo" || mes == "Junio") {
			System.out.println("Estamos en primavera");	
		}
		if (mes == "Julio" || mes == "Agosto" || mes == "Septiembre") {
			System.out.println("Estamos en invierno");
		}
		if (mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre") {
			System.out.println("Estamos en invierno");
		}
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
		}
	}
}
