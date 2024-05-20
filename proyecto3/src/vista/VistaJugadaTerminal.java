package vista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import controlador.ControladorJugada;

public class VistaJugadaTerminal implements VistaJugada{

    String seleccionHumano, seleccionMaquina;

    @Override
    public void mostrarInterfaz(ControladorJugada controladorJugada) {
        System.out.println("BIENVENIDO/A AL JUEGO!!!");
        ArrayList<String> opciones = new ArrayList<>();
        opciones.add("PIEDRA");
        opciones.add("PAPEL");
        opciones.add("TIJERA");
        opciones.add("SALIR");
        
        byte opcion = 0;
        while (opcion != 4) {
            System.out.println("Selecciona tu opcion para jugar: ");
            for(int i=0; i<4; i++){
                System.out.println((i+1) + ") " + opciones.get(i));
            }
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    opcion = scanner.nextByte();
                    if(opcion<1 || opcion>4){
                        throw new ExcepcionOpcion("OPCION NO VALIDA!!!");
                    }
                    break;
                }catch(InputMismatchException e){
                    System.out.println("DEBES DIGITAR EL NUMERO DE LA OPCION!!");
                }
                catch (ExcepcionOpcion e) {
                    System.out.println(e.getMessage()); 
                }
                scanner.nextLine();
            }
            Random randomOpcion = new Random();
            int opcionAleatoriaMaquina = (randomOpcion.nextInt(3));
            switch (opcion) {
                case 1:
                    if(opcionAleatoriaMaquina == 0){
                        System.out.println("EMPATE!!");
                    }
                    else if(opcionAleatoriaMaquina == 1){
                        System.out.println("LA MAQUINA HA SACADO "+ (opciones.get(opcionAleatoriaMaquina)));
                        System.out.println("TE HAN GANADO!!");
                    }
                    else{
                        System.out.println("LA MAQUINA HA SACADO "+ (opciones.get(opcionAleatoriaMaquina)));
                        System.out.println("HAZ GANADO!!!");
                    }
                    break;
                case 2:
                    if(opcionAleatoriaMaquina == 1){
                        System.out.println("EMPATE!!");
                    }
                    else if(opcionAleatoriaMaquina == 0){
                        System.out.println("LA MAQUINA HA SACADO "+ (opciones.get(opcionAleatoriaMaquina)));
                        System.out.println("HAZ GANADO!!!");
                    }
                    else{
                        System.out.println("LA MAQUINA HA SACADO "+ (opciones.get(opcionAleatoriaMaquina)));
                        System.out.println("TE HAN GANADO!!");
                    }
                    break;
                case 3:
                    if(opcionAleatoriaMaquina == 2){
                        System.out.println("EMPATE!!");
                    }
                    else if(opcionAleatoriaMaquina == 0){
                        System.out.println("LA MAQUINA HA SACADO "+ (opciones.get(opcionAleatoriaMaquina)));
                        System.out.println("TE HAN GANADO!!");
                    }
                    else{
                        System.out.println("LA MAQUINA HA SACADO "+ (opciones.get(opcionAleatoriaMaquina)));
                        System.out.println("HAZ GANADO!!!");
                    }
                    break;
            }
        }
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
