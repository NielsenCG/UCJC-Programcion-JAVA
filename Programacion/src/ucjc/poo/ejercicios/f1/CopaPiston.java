package ucjc.poo.ejercicios.f1;

public class CopaPiston {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piloto p1 = new Piloto("Max Verstappen", 10, "Red Bull", 36);
		Piloto p2 = new Piloto("Fernando Alonso", 10, "Aston Martin", 32);
		Piloto p3 = new Piloto("Charles Leclerc", 9, "Ferrari", 5);
		Coche c1 = new Coche("Red Bull", "Honda", 1, p1, 10, 0);
		Coche c2 = new Coche("Aston Martin", "Mecedes", 14, p2, 9, 0);
		Coche c3 = new Coche("Ferrari", "Ferrari", 16, p3, 9, 0);
		Coche [] parrilla = {c1, c2, c3};
		Carrera g1 = new Carrera("Sakhir", "Gran Premio de Bahrein", parrilla, 308);
		g1.iniciarCarrera();
	}

}
