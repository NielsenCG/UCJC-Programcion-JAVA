package ucjc.poo.ejercicios.coches;

public class Coche {
	private String marca;
	private String matricula;
	private Motor motorCoche;
	private Volante volanteCoche;
	private int velocidad;

	
	public Coche(String marca, String matricula, Motor motorCoche, Volante volanteCoche, int velocidad) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.motorCoche = motorCoche;
		this.volanteCoche = volanteCoche;
		this.velocidad = velocidad;
	}

	public Coche(String marca, String matricula, Motor motorCoche, Volante volanteCoche) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.motorCoche = motorCoche;
		this.volanteCoche = volanteCoche;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Motor getMotorCoche() {
		return motorCoche;
	}

	public void setMotorCoche(Motor motorCoche) {
		this.motorCoche = motorCoche;
	}

	public Volante getVolanteCoche() {
		return volanteCoche;
	}

	public void setVolanteCoche(Volante volanteCoche) {
		this.volanteCoche = volanteCoche;
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int velocidadCoche() {
		velocidad = (int) (Math.random()*0.5*getMotorCoche().getNumCaballos());
		return this.velocidad;
	}
	
	public void conducir() {
		velocidad = (int) (Math.random()*0.5*getMotorCoche().getNumCaballos());
		System.out.println("La velocidad del "+marca+" es "+velocidad);
	}
}
