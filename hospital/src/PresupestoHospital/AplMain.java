package PresupestoHospital;

import java.util.Scanner;

public class AplMain { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el monto presupuestal anual: ");
    double montoPresupuestal = scanner.nextDouble();

    DistribucionPresupuestoHospital distribucion = new DistribucionPresupuestoHospital(montoPresupuestal);

    System.out.println("Resultados:");
    System.out.println("Urgencias recibirá $" + distribucion.getUrgenciasFormateado() );
    System.out.println("Pediatría recibirá $" + distribucion.getPediatriaFormateado() );
    System.out.println("Traumatología recibirá $" + distribucion.getTraumatologiaFormateado() );

    scanner.close();
}
}