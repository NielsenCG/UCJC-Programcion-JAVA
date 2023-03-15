package ucjc.poo;

public class Universidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		persona1.nombre = "Lope";
		
		Persona persona2 = persona1;
		persona2.nombre = "Juan";
		
		System.out.println(persona1.nombre);
		
		Persona persona3 = new Persona();
		persona3.nombre = "Juna";
		System.out.println(persona3.nombre);
		persona3.correr();
		persona2 = persona3;
		persona3 = null;
		System.out.println(persona2.nombre);
	}
}
