package ucjc.poo.ejercicios.coches;

public class Circuito {
	public static void main(String[]args) {
		Piston piston1 = new Piston("F26", "Ferrari");
		Piston piston2 = new Piston("AM12", "Aston Martin");
		Motor motor1 = new Motor("Ferrari", 550, piston1);
		Motor motor2 = new Motor("McLaren", 700, piston2);
		Volante volante1 = new Volante("AR", "Alfa Romeo", "Negro");
		Volante volante2 = new Volante("McLaren", "McLaren Sport", "Naranja Melocoton");
		Coche coche1 = new Coche("Alfa Romeo", "7589JCK", motor1, volante1);
		Coche coche2 = new Coche("McLaren", "1395MBC", motor2, volante2);
		System.out.println("La marca del piston del coche "+coche1.getMarca()+" es "+coche1.getMotorCoche().getPistonMotor().getMarca());
		System.out.println("El color del volante del coche "+coche1.getMarca()+" es "+coche1.getVolanteCoche().getColor());
		System.out.println("La marca del piston del coche "+coche2.getMarca()+" es "+coche2.getMotorCoche().getPistonMotor().getMarca());
		System.out.println("El color del volante del coche "+coche2.getMarca()+" es "+coche2.getVolanteCoche().getColor());
		coche1.conducir();
		coche2.conducir();
	}
}
