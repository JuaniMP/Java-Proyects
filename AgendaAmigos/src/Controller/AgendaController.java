package Controller;

import Model.Agenda;
import Model.Amigo;
import View.AgendaView;

public class AgendaController {
    private Agenda agenda;
    private AgendaView agendaView;

    public AgendaController(Agenda agenda, AgendaView agendaView) {
        this.agenda = agenda;
        this.agendaView = agendaView;
    }

    public void agregarAmigo() {
        Amigo amigo = agendaView.crearAmigo(); // Corrección aquí
        agenda.agregarAmigo(amigo);
        agendaView.mostrarMensaje("Amigo agregado correctamente");
    }

    public void buscarAmigo() {
        String nombre = agendaView.buscarNombreAmigo();
        Amigo amigo = agenda.buscarAmigoPorNombre(nombre);
        if (amigo != null) {
            agendaView.mostrarMensaje("Amigo encontrado: " + amigo);
        } else {
            agendaView.mostrarMensaje("Amigo no encontrado");
        }
    }

    public void eliminarAmigo() {
        String nombre = agendaView.buscarNombreAmigo();
        Amigo amigo = agenda.buscarAmigoPorNombre(nombre);
        if (amigo != null) {
            agenda.eliminarAmigo(amigo);
            agendaView.mostrarMensaje("Amigo eliminado correctamente");
        } else {
            agendaView.mostrarMensaje("Amigo no encontrado");
        }
    }

    public void mostrarCantidadAmigos() {
        agendaView.mostrarMensaje("Cantidad de amigos: " + agenda.getCantidadAmigos());
    }
}

