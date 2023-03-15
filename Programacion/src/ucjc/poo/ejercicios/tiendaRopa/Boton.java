package ucjc.poo.ejercicios.tiendaRopa;

public class Boton {
	private String color;
	private String forma;
	private String tamaño;
	
	public Boton(String color, String forma, String tamaño) {
		super();
		this.color = color;
		this.forma = forma;
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
}
