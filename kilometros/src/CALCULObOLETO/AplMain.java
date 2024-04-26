package CALCULObOLETO;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AplMain {
    public static void main(String[] args) {
        Scanner pantalla = new Scanner(System.in);
        CalculoKilometros calculadora = new CalculoKilometros();

        System.out.print("Ingrese la cantidad de kilómetros a recorrer: ");
        calculadora.setKilometros(pantalla.nextDouble());

        double costoTotal = calculadora.calcularCosto();

        DecimalFormat formatoDinero = new DecimalFormat("#,###,###");
        String costoTotalFormateado = formatoDinero.format(costoTotal);

        System.out.println("El costo total del boleto es: $" + costoTotalFormateado + " pesos colombianos");

        pantalla.close();
    }
}
