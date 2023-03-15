package ucjc.bucles;

public class BuclesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bucle for
		for ( int i=0  ;  i<10  ; i+=2 ) {
			if (i%2==0 && i<8) {
				continue;
			}else if (i%3==0) {
				break;	
			}
			System.out.println(i);
		}
		//Bucle foreach
		
		
	}
}
