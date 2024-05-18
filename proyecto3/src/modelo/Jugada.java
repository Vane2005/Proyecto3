package modelo;

public class Jugada {
    String seleccionHumano, seleccionMaquina;

    public Jugada(String seleccionHumano, String seleccionMaquina) {
        this.seleccionHumano = seleccionHumano;
        this.seleccionMaquina = seleccionMaquina;
    }

    public String getSeleccionHumano() {
        return seleccionHumano;
    }

    public void setSeleccionHumano(String seleccionHumano) {
        this.seleccionHumano = seleccionHumano;
    }

    public String getSeleccionMaquina() {
        return seleccionMaquina;
    }

    public void setSeleccionMaquina(String seleccionMaquina) {
        this.seleccionMaquina = seleccionMaquina;
    }
    
}
