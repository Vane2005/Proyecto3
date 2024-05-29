package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;

import controlador.ControladorJugada;

public class VistaJugadaGui extends JFrame implements VistaJugada {

    Container contenedor;
    JComboBox <String> combo; // Componente de lista desplegable
    String ListaOpciones [] = {"PIEDRA", "PAPEL", "TIJERA"};
    public static JButton BotonElegir;
    JLabel LabelBienvenido;
    JPanel PanelSur; // Panel para organizar los componentes "combo" y "BotonElegir"

    public VistaJugadaGui(){
        setTitle("PIEDRA - PAPEL - TIJERA");
        contenedor = getContentPane(); // Obtener el panel de contenido de la ventana
        BorderLayout layout = new BorderLayout();
        contenedor.setBackground(new Color(128, 128,128)); // Establecer el color de fondo del panel contenedor
        contenedor.setLayout(layout);

        JLabel LabelBienvenido = new JLabel("BIENVENIDO");
        Font fuente = new Font("Comic Sans MS", Font.PLAIN, 70); // Establecer la fuente para la etiqueta
        LabelBienvenido.setFont(fuente);
        contenedor.add(LabelBienvenido, BorderLayout.NORTH); // Agregar la etiqueta en la parte superior del panel contenedor

        PanelSur = new JPanel();
        PanelSur.setLayout(new FlowLayout());
        PanelSur.setBackground(new Color(128, 128,128));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550,300);
        setLocationRelativeTo(null); // Establecer la posicion inicial de la ventana en el centro de la pantalla
        

        combo = new JComboBox<String>(ListaOpciones); // Se crea la lista desplegable con las opciones especificadas
        Font fuente1 = new Font("Comic Sans MS", Font.PLAIN, 30);
        combo.setBackground(new Color(173,216,230));
        combo.setFont(fuente1);

        BotonElegir = new JButton("ELEGIR");
        BotonElegir.setBackground(new Color(173,216,230));
        BotonElegir.setFont(fuente1);

        PanelSur.add(combo);
        PanelSur.add(BotonElegir);
        contenedor.add(PanelSur, BorderLayout.CENTER);
    }

    @Override
    public void mostrarInterfaz(ControladorJugada controladorJugada) {
        BotonElegir.addActionListener(controladorJugada);
        setVisible(true);
    }

    public void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(contenedor, resultado);
    }

    @Override
    public String getseleccionHumano() {
        return (String) combo.getSelectedItem();
    }

    @Override
    public String getseleccionMaquina() {
        Random random = new Random();
        int obtenerIndiceAleatorio = random.nextInt(ListaOpciones.length); // se elige un indice aleatorio de la lista de las opciones
        return ListaOpciones[obtenerIndiceAleatorio]; // se obtiene el contenido del indice
    }

}