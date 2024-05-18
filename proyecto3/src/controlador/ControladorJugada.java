package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Jugada;
import vista.VistaJugada;

public class ControladorJugada implements ActionListener{
    Jugada jugada;
    VistaJugada vistaJugada;
    
    public ControladorJugada(Jugada jugada, VistaJugada vistaJugada) {
        this.jugada = jugada;
        this.vistaJugada = vistaJugada;
    }

    public void mostrarInterfaz(){
        vistaJugada.mostrarInterfaz(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String seleccionHumana = vistaJugada.getseleccionHumano();
        String seleccionMaquina = vistaJugada.getSeleccionMaquina();
        String resultado = "";
        vistaJugada.mostrarResultado(resultado);
    }
}
