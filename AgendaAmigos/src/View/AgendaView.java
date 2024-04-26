package View;
import java.util.Scanner;

import Model.Amigo;

public class AgendaView {
    private Scanner scanner;

    public AgendaView() {
        scanner = new Scanner(System.in);
    }

    public Amigo crearAmigo() {
        System.out.println("Ingrese el nombre del amigo:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el teléfono del amigo:");
        String telefono = scanner.nextLine();
        
        System.out.println("Ingrese el correo del amigo:");
        String correo = scanner.nextLine();
        
        return new Amigo(nombre, telefono, correo);
    }

    public String buscarNombreAmigo() {
        System.out.println("Ingrese el nombre a buscar:");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
