package Recuperatorio.actividad3;

public class Polideportivo implements InstalacionDeportiva{
    private double largo;
    private double ancho;
    private String nombre;

    /**
     * Constructor con parametros
     * @param largo el largo de la instalacion
     * @param ancho el ancho de la instalacion
     * @param nombre el nombre asignado al polideportivo
     */
    public Polideportivo (double largo, double ancho, String nombre) {
        this.largo = largo;
        this.ancho = ancho;
        this.nombre = nombre;

    }
    
    public double getSuperficie () 
    {
        double superficie=this.largo*this.ancho;
        return superficie;

    }

}

    }
