package ec3.EJ1;

public class Triciclo extends Vehiculo {
    private String propietario;
    // Completar con los metodos indicados
    // en el UML de la consigna
    public Triciclo(String propietario){
        super(3, propietario);
        this.propietario = propietario;
    }
    @Override
    public String toString() {
        return "Triciclo de "+this.propietario+ super.toString();
    }
}
