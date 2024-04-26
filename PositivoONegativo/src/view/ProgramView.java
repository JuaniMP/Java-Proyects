package view;

import java.util.Scanner;

public class ProgramView {
    private Scanner leer = new Scanner(System.in);

    public int obtenerNumero() {
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println("Ingrese un número (0 para salir):");
            try {
                numero = Integer.parseInt(leer.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        } while (!valido);

        return numero;
    }

    public void mostrarResultado(String resultado) {
        System.out.println(resultado);
    }

    public void cerrarScanner() {
        leer.close();
    }
}

