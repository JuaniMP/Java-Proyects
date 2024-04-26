package Controller;
import Model.Alumno;
import View.InputHelper;


public class Main {
    public static void main(String[] args) {
        InputHelper inputHelper = new InputHelper();

        int totalAlumnos = 5;
        int edadesTotal = 0;
        double estaturasTotal = 0;
        int alumnosMayores18 = 0;
        int alumnosMidenMas175 = 0;

        Alumno[] alumnos = new Alumno[totalAlumnos];

        for (int i = 0; i < totalAlumnos; i++) {
            int edad = inputHelper.promptForInt("Ingrese la edad del alumno " + (i + 1) + ":");
            double estatura = inputHelper.promptForDouble("Ingrese la estatura del alumno " + (i + 1) + " en metros:");
            
            alumnos[i] = new Alumno(edad, estatura);
            edadesTotal += edad;
            estaturasTotal += estatura;
            
            if (edad > 18) {
                alumnosMayores18++;
            }
            if (estatura > 1.75) {
                alumnosMidenMas175++;
            }
        }

        double edadMedia = (double) edadesTotal / totalAlumnos;
        double estaturaMedia = estaturasTotal / totalAlumnos;

        System.out.println("La edad media de los alumnos es: " + edadMedia);
        System.out.println("La estatura media de los alumnos es: " + estaturaMedia);
        System.out.println("Cantidad de alumnos mayores de 18 años: " + alumnosMayores18);
        System.out.println("Cantidad de alumnos que miden más de 1.75 metros: " + alumnosMidenMas175);

        inputHelper.closeScanner();
    }
}


