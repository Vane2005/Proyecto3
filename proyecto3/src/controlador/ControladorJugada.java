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
        String resultado = Determinar_Ganador(seleccionHumana, seleccionMaquina);
        vistaJugada.mostrarResultado(resultado);
    }

    public String Determinar_Ganador(String seleccionHumana, String seleccionMaquina){
        if (seleccionHumana.equals(seleccionMaquina)){
            return "EMPATE";
        }
        else {
            switch (seleccionHumana) {
                case "PIEDRA":
                    if (seleccionMaquina.equals("TIJERA")) {
                        return "GANADOR HUMANO";
                    }
                    else if (seleccionMaquina.equals("PAPEL")) {
                        return "GANADOR MAQUINA";
                    }
                    break;

                case "PAPEL":
                    if (seleccionMaquina.equals("PIEDRA")) {
                        return "GANADOR HUMANO";
                    }
                    else if (seleccionMaquina.equals("TIJERA")) {
                        return "GANADOR MAQUINA";
                    }
                    break;

                case "TIJERA":
                    if (seleccionMaquina.equals("PAPEL")) {
                        return "GANADOR HUMANO";
                    }
                    else if (seleccionMaquina.equals("PIEDRA")) {
                        return "GANADOR MAQUINA";
                    }
                    break;
            }
            return "INTENTE NUEVAMENTE";
        }
    }
}
