package vista;

import controlador.ControladorJugada;

public interface VistaJugada {
    public void mostrarInterfaz(ControladorJugada controladorJugada);
    public void mostrarResultado(String resultado);
    public String getseleccionHumano();
    public String getseleccionMaquina();
}
