package Controller;

import Model.Agenda;
import View.AgendaView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        AgendaView agendaView = new AgendaView();
        AgendaController agendaController = new AgendaController(agenda, agendaView);

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("¡Bienvenido a tu Agenda Personal!");

        while (!salir) {
            System.out.println("\n--- Menú de Agenda ---");
            System.out.println("1. Agregar amigo");
            System.out.println("2. Buscar amigo por nombre");
            System.out.println("3. Eliminar amigo");
            System.out.println("4. Mostrar cantidad de amigos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agendaController.agregarAmigo();
                    break;
                case 2:
                    agendaController.buscarAmigo();
                    break;
                case 3:
                    agendaController.eliminarAmigo();
                    break;
                case 4:
                    agendaController.mostrarCantidadAmigos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, por favor intenta nuevamente.");
                    break;
            }
        }

        System.out.println("\n¡Gracias por utilizar tu Agenda Personal! ¡Hasta luego!");
        scanner.close();
    }
}
