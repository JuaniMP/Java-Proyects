package Model;

public class Alumno {
    private int edad;
    private double estatura;

    public Alumno(int edad, double estatura) {
        this.edad = edad;
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
}
