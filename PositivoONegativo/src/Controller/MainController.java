package Controller;

import model.VerificarNumero;
import view.ProgramView;

public class MainController {
    private ProgramView programView;
    private VerificarNumero verificarNumero;

    public MainController() {
        programView = new ProgramView();
        verificarNumero = new VerificarNumero();
    }

    public void ejecutarPrograma() {
        int numero;
        do {
            numero = programView.obtenerNumero();
            verificarNumero.setNumero(numero);
            if (numero != 0) {
                programView.mostrarResultado(verificarNumero.verificarPositivoNegativo());
            }
        } while (numero != 0);
        programView.cerrarScanner();
    }

    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.ejecutarPrograma();
    }
}

