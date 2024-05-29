import controlador.ControladorJugada;
import modelo.Jugada;
import vista.VistaJugadaGui;
import vista.VistaJugadaTerminal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int modo = 0;

        while (true) {
            try {
                System.out.println("Selecciona el modo de interfaz:");
                System.out.println("1. Grafica");
                System.out.println("2. Consola");
                System.out.println("3. Salir");
                modo = scanner.nextInt();

                if (modo == 3) {
                    break;
                } else if (modo == 1 || modo == 2) {
                    Jugada jugada = new Jugada();

                    if (modo == 1) {
                        VistaJugadaGui vistaJugadaGui = new VistaJugadaGui();
                        ControladorJugada controladorJugada = new ControladorJugada(jugada, vistaJugadaGui);
                        controladorJugada.mostrarInterfaz();
                    } else if (modo == 2) {
                        VistaJugadaTerminal vistaJugadaTerminal = new VistaJugadaTerminal();
                        ControladorJugada controladorJugada = new ControladorJugada(jugada, vistaJugadaTerminal);
                        controladorJugada.mostrarInterfaz();
                    }
                } else {
                    System.out.println("Modo no valido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un numero valido.");
                scanner.nextLine(); 
            }
        }
    }
}