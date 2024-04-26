package Model;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Amigo> amigos;

    public Agenda() {
        amigos = new ArrayList<>();
    }

    public void agregarAmigo(Amigo amigo) {
        amigos.add(amigo);
    }

    public Amigo buscarAmigoPorNombre(String nombre) {
        for (Amigo amigo : amigos) {
            if (amigo.getNombre().equals(nombre)) {
                return amigo;
            }
        }
        return null;
    }

    public void eliminarAmigo(Amigo amigo) {
        if (amigos.contains(amigo)) {
            amigos.remove(amigo);
        }
    }

    public int getCantidadAmigos() {
        return amigos.size();
    }

    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    public void mostrarTodosLosAmigos() {
        for (Amigo amigo : amigos) {
            System.out.println(amigo);
        }
    }

    public void vaciarAgenda() {
        amigos.clear();
    }

    // Puedes agregar más métodos según las necesidades de tu aplicación

}
