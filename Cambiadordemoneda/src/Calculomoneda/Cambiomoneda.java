package Calculomoneda;

public class Cambiomoneda {
    private double pesosColombianos;
    private double tipoCambioDolares = 3933.37;
    private double tipoCambioEuros = 3923.37;
    private double dolares;
    private double euros;

    // Constructor
    public Cambiomoneda(double pesosColombianos) {
        this.pesosColombianos = pesosColombianos;
        convertirMoneda();
    }

    // Getters y Setters
    public double getPesosColombianos() {
        return pesosColombianos;
    }

    public void setPesosColombianos(double pesosColombianos) {
        this.pesosColombianos = pesosColombianos;
    }

    public double getDolares() {
        return dolares;
    }

    public double getEuros() {
        return euros;
    }

    // Método para realizar la conversión
    private void convertirMoneda() {
        dolares = pesosColombianos / tipoCambioDolares;
        euros = pesosColombianos / tipoCambioEuros;
    }
}