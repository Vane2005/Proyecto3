package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Jugada;
import vista.VistaJugada;

public class ControladorJugada implements ActionListener{
    Jugada jugada;
    VistaJugada vistaJugada;
    String seleccionHumana;
    String seleccionMaquina;
    
    public ControladorJugada(Jugada jugada, VistaJugada vistaJugada) {
        this.jugada = jugada;
        this.vistaJugada = vistaJugada;
    }

    public void mostrarInterfaz(){
        vistaJugada.mostrarInterfaz(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        seleccionHumana = vistaJugada.getseleccionHumano();
        seleccionMaquina = vistaJugada.getseleccionMaquina();
        String resultado = "";
        vistaJugada.mostrarResultado(resultado);
    }
}
