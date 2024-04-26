package model;

public class VerificarNumero {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String verificarPositivoNegativo() {
        if (numero > 0) {
            return "El número es positivo.";
        } else if (numero < 0) {
            return "El número es negativo.";
        } else {
            return "El número es cero.";
        }
    }
}
