import controlador.ControladorJugada;
import modelo.Jugada;
import vista.VistaJugadaGui;

public class App {
    public static void main(String[] args) throws Exception {
        // Para VISTA GUI
        Jugada jugada = new Jugada(); 
        VistaJugadaGui vistaJugadaGui = new VistaJugadaGui();
        ControladorJugada controladorJugada = new ControladorJugada(jugada, vistaJugadaGui);

        controladorJugada.mostrarInterfaz();
    }
}
