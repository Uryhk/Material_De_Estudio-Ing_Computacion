package ec3.EJ2;
public class Oficinas implements  Edificio{
    private int numeroDePisos;
    private double ancho;
    private double largo;
    /**
     * Constructor con parametros
     * @param numeroDePisos la cantidad de pisos del inmueble
     * @param ancho el ancho del edificio
     * @param largo el largo del edificio
     */
    public Oficinas (int numeroDePisos, double ancho, double largo) {
        this.numeroDePisos = numeroDePisos;
        this.ancho = ancho;
        this.largo = largo;

    }
    public  double getSuperficieEdificio(){
        double superficie=this.numeroDePisos*this.ancho*this.largo;
        return superficie;

    }

}
