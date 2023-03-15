package ucjc.poo.metodos;

public class TestEstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodosEstaticos.metodo2();
		
		MetodosEstaticos.dato = "Cambio";
		
		MetodosEstaticos me = new MetodosEstaticos();
		me.metodo4();
		me.metodo4(1);
		me.metodo4("En un lugar de la mancha...");
	}

}
