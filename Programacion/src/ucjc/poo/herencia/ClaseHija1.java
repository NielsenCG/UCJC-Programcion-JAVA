package ucjc.poo.herencia;

public class ClaseHija1 extends ClasePadre{

	private int valor3;
	
	public ClaseHija1(String valor1, String valor2, int valor3) {
		super(valor1, valor2);
		this.valor3 = valor3;
		
	}

	public int getValor3() {
		return valor3;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}

	@Override
	public String toString() {
		return "ClaseHija1 [valor3=" + valor3 + ", valor1=" + getValor1() + ", valor2=" + getValor2() + "]";
	}
	
	

}
