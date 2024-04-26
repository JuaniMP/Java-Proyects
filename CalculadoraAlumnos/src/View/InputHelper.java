package View;

import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;

    public InputHelper() {
        this.scanner = new Scanner(System.in);
    }

    public int promptForInt(String message) {
        System.out.print(message);

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            scanner.nextLine();
            System.out.print(message);
        }

        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public double promptForDouble(String message) {
        System.out.print(message);

        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            scanner.nextLine();
            System.out.print(message);
        }

        double input = scanner.nextDouble();
        scanner.nextLine();
        
        return input;
    }

    public void closeScanner() {
        scanner.close();
    }
}
