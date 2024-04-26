package Calculomoneda;

import java.util.Scanner;

public class AplMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en pesos colombianos: ");
        double montoPesos = scanner.nextDouble();

        Cambiomoneda cambio = new Cambiomoneda(montoPesos);

        System.out.println("Cambio a dólares: US$" + String.format("%.2f", cambio.getDolares()));
        System.out.println("Cambio a euros: €" + String.format("%.2f", cambio.getEuros()));

        scanner.close();
    }
}
