package ec3.EJ4;

public class Asiento {
    private int fila;
    private char ubicacion;

    public Asiento(int fila, char ubicacion) {
        this.fila = fila;
        this.ubicacion = ubicacion;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(char ubicacion) {
        this.ubicacion = ubicacion;
    }
}
