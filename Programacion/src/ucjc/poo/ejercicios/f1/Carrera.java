package ucjc.poo.ejercicios.f1;

public class Carrera {
	private String nombre;
	private String circuito;
	private Coche [] parrilaSalida;
	private int distancia;
	
	public Carrera(String nombre, String circuito, Coche[] parrilaSalida, int distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrilaSalida = parrilaSalida;
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public Coche[] getParrilaSalida() {
		return parrilaSalida;
	}

	public void setParrilaSalida(Coche[] parrilaSalida) {
		this.parrilaSalida = parrilaSalida;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public void iniciarCarrera() {
		boolean x = true;
		while (x){
		for (Coche coche : parrilaSalida) {
			coche.correr();
			if (coche.getAvance() > getDistancia()) {
				System.out.println("El piloto "+coche.getPiloto().getNombre()+" ha ganado");
				x = false;
				break;
			}
		}
		}
	}
	
}
