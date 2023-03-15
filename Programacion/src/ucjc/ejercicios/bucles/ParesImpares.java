package ucjc.ejercicios.bucles;

public class ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numPar = 0;
		int numImpar = 99;
		for ( int x=0 ; x < 50 ; x++ ) {
			System.out.print("Numero Par: " +numPar+ ",");
			System.out.println(" Numero Impar: " +numImpar);
			numPar += 2;
			numImpar -= 2;
		}
	}
}
