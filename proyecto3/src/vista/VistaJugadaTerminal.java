package vista;

import controlador.ControladorJugada;

public class VistaJugadaTerminal implements VistaJugada{

    String seleccionHumano, seleccionMaquina;

    @Override
    public void mostrarInterfaz(ControladorJugada controladorJugada) {
        
    }

    @Override
    public void mostrarResultado(String resultado) {
        System.out.println("EL GANADOR ES: " + resultado);
    }

    @Override
    public String getseleccionHumano() {
        return seleccionHumano;
    }

    @Override
    public String getseleccionMaquina() {
        return seleccionMaquina;
    }
    
}
