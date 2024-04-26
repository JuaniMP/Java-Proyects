package CALCULObOLETO;

public class CalculoKilometros {
    private double precioPorKilometro = 120.0;
    private double kilometros;

    public CalculoKilometros() {
        precioPorKilometro = 120.0;
        kilometros = 0;
    }

    public double getPrecioPorKilometro() {
        return precioPorKilometro;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double calcularCosto() {
        return kilometros * precioPorKilometro;
    }

    public double calcularCosto(double pKilometros, double pPrecioPorKilometro) {
        return pKilometros * pPrecioPorKilometro;
    }
}