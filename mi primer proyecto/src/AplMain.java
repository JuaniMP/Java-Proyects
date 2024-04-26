import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner screen = new Scanner(System.in);
		
		double radio,altura,pi,volumen;
		radio = 0;
		altura = 0;
		pi = 3.1416;
		volumen = 0;
		System.out.print("Dijite el radio: ");
		radio = screen.nextDouble();
		
		System.out.print("Dijite el altura: ");
		altura = screen.nextDouble();
		
		volumen= pi*radio*radio*altura;
		
		String mensaje ="el valor del volumen es:";
		System.out.print(mensaje + volumen);
		
	}

}
