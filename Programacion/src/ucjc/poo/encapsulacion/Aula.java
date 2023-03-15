package ucjc.poo.encapsulacion;

public class Aula {
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Hero", "Montesinos", 8.9);
		alumno1.estudiar();
		System.out.println(alumno1.getNombre());
		Alumno alumno2 = new Alumno("Joseba", "Cordobes");
		alumno2.estudiar();
		Asignatura asignatura1 = new Asignatura("Programacion", 7);
		Alumno alumno3 = new Alumno ("Felipe", "Emesei", 9.0, asignatura1);
		alumno2.setAsignaturaAlumno(asignatura1);
		System.out.println(alumno2.getAsignaturaAlumno().getNota());
	}
}
