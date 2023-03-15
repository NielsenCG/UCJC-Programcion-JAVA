package ucjc.poo.encapsulacion;

public class Alumno {
	// Variables de instancia
	private String nombre;
	private String apellidos;
	private double notaMedia;
	private Asignatura asignaturaAlumno;
	
	// Constructor
	public Alumno(String nombre, String apellidos, double notaMedia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;	
	}
	
	public Alumno(String nombre, String apellidos, double notaMedia, Asignatura asignaturaAlumno) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
		this.asignaturaAlumno = asignaturaAlumno;
	}

	public Alumno(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	// Getter y setter
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public double getNotaMedia() {
		return this.notaMedia;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public Asignatura getAsignaturaAlumno() {
		return asignaturaAlumno;
	}

	public void setAsignaturaAlumno(Asignatura asignaturaAlumno) {
		this.asignaturaAlumno = asignaturaAlumno;
	}
	
	// Metodo o función
	public void estudiar() {
		System.out.println("El alumno "+nombre+" "+apellidos+" esta estudiando y tiene una nota de "+notaMedia);
	}
}
