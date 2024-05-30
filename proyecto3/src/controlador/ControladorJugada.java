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

    public void actionPerformed(ActionEvent e) {
        seleccionHumana = vistaJugada.getseleccionHumano();
        seleccionMaquina = vistaJugada.getseleccionMaquina();
        String resultado = determinarGanador(seleccionHumana, seleccionMaquina);
        vistaJugada.mostrarResultado("Eleccion de la maquina: " + seleccionMaquina + "\n" +
                                     "Resultado: " + resultado);
    }

    private String determinarGanador(String humano, String maquina) {
        if (humano.equals(maquina)) {
            return "EMPATE!!";
        } else if ((humano.equals("PIEDRA") && maquina.equals("TIJERA")) ||
                   (humano.equals("PAPEL") && maquina.equals("PIEDRA")) ||
                   (humano.equals("TIJERA") && maquina.equals("PAPEL"))) {
            return "HAZ GANADO!!!";
        } else {
            return "TE HAN GANADO!!";
        }
    }
}
