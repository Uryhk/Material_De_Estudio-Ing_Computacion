package ec3.EJ1;

public class Vehiculo {
    private Integer cant_Ruedas=4;
    private String propietario;
    public Vehiculo(Integer cant_Ruedas, String propietario) {
        this.cant_Ruedas = cant_Ruedas;
        this.propietario = propietario;
    }
    public String getPropietario() {
        return propietario;
    }
    @Override
    public String toString() {
        return (" (") +cant_Ruedas + " ruedas)";
    }
}
