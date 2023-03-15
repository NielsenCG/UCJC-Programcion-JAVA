package ucjc.poo.ejercicios.f1;

import java.util.Random;

public class Coche {

	private String escuderia;
	private String motor;
	private int numero;
	private Piloto piloto;
	private int velocidad;
	private int avance;
	
	public Coche(String escuderia, String motor, int numero, Piloto piloto, int velocidad, int avance) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
		this.avance = avance;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAvance() {
		return avance;
	}

	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	public void correr() {
		int avanzado = getVelocidad() + getPiloto().getExperiencia() + new Random().nextInt(10);	
		setAvance(avanzado+getAvance());
		System.out.println("El piloto "+ getPiloto().getNombre()+" ha avanzado "+avanzado+" kilometros");
		System.out.println("El piloto "+ getPiloto().getNombre()+" ha recorrido "+getAvance()+" kilometros");
	}
}
