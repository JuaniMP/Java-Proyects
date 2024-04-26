package Bucle;

class NumerosDeSieteEnSiete {
    private int inicio;
    private int fin;

    public NumerosDeSieteEnSiete(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public void imprimirNumeros() {
        for (int i = inicio; i >= fin; i -= 7) {
            System.out.println(i);
        }
    }
}