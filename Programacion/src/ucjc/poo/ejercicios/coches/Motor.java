package ucjc.poo.ejercicios.coches;

public class Motor {
	private String marca;
	private int numCaballos;
	private Piston pistonMotor;
	
	public Motor(String marca, int numCaballos, Piston pistonMotor) {
		super();
		this.marca = marca;
		this.numCaballos = numCaballos;
		this.pistonMotor = pistonMotor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumCaballos() {
		return numCaballos;
	}

	public void setNumCaballos(int numCaballos) {
		this.numCaballos = numCaballos;
	}

	public Piston getPistonMotor() {
		return pistonMotor;
	}

	public void setPistonMotor(Piston pistonMotor) {
		this.pistonMotor = pistonMotor;
	}
}
