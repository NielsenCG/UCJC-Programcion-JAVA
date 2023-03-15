package ucjc.poo.ejercicios.clase;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura asignatura1 = new Asignatura("Programación",9);
		Asignatura asignatura2 = new Asignatura("POO", 1);
		Asignatura asignatura3 = new Asignatura("Programación", 6);
		Asignatura asignatura4 = new Asignatura("Interfaces", 5);
		Asignatura [] asignaturasJosefino= {asignatura1, asignatura2};
		Asignatura [] asignaturasIman= {asignatura3, asignatura4};
		Alumno alumno1 = new Alumno("Josefino","Fuentes", asignaturasJosefino);
		Alumno alumno2 = new Alumno("Iman", "Abdulhassim", asignaturasIman);
		notaMasAlta(alumno1, alumno2);
	}
	public static void notaMasAlta(Alumno A, Alumno B) {
		if (A.notaMedia() > B.notaMedia()) {
			System.out.println("El alumno "+A.getNombre()+" tiene la nota media mas alta");
		} else if (A.notaMedia() == B.notaMedia()){
			System.out.println("Ambos tienen la misma media");
		} else {
			System.out.println("El alumno "+B.getNombre()+" tiene la nota media mas alta");
		}
	}
}
