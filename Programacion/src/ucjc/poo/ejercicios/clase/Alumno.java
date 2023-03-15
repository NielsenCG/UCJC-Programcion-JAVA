package ucjc.poo.ejercicios.clase;

public class Alumno {
	private String nombre;
	private String apellidos;
	private Asignatura [] asignaturas;
	
	public Alumno(String nombre, String apellidos, Asignatura[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = asignaturas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public double notaMedia() {
		double notaMediaA = 0;
		for (Asignatura asignatura : asignaturas) {
			notaMediaA = notaMediaA + asignatura.getNota();
		}
			return notaMediaA/asignaturas.length;
			
	
	}
}
