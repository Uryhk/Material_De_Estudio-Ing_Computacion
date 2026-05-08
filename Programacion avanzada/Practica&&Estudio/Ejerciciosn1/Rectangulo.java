/**
 * EJERCICIO 1 - UNIDAD 1: Objetos y Clases
 * ==========================================
 * Tema: Definición de clases, campos, constructores y métodos.
 *
 * CONSIGNA:
 * Implementá los métodos marcados con TODO en la clase Rectangulo.
 * La clase representa un rectángulo con ancho y alto.
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Entender la estructura de una clase Java.
 * - Usar campos (atributos) de instancia.
 * - Implementar constructores y métodos simples.
 * - Practicar el uso de getters y setters.
 */
public class Rectangulo {

    // ── Campos de instancia ──────────────────────────────────────────────────
    private double ancho;
    private double alto;

    // ── Constructores ────────────────────────────────────────────────────────

    /**
     * Constructor por defecto.
     * Crea un rectángulo de 1.0 x 1.0.
     * NO modificar este constructor.
     */
    public Rectangulo() {
        this.ancho = 1.0;
        this.alto  = 1.0;
    }

    /**
     * Constructor con parámetros.
     * TODO: Inicializá los campos con los valores recibidos.
     * Si algún valor es <= 0, asigná 1.0 en su lugar.
     *
     * @param ancho El ancho del rectángulo.
     * @param alto  El alto del rectángulo.
     */
    public Rectangulo(double ancho, double alto) {
        // TODO: implementar
        if(ancho>0 && alto>0){this.ancho=ancho; this.alto=alt;}
        else if(ancho<=0){this.ancho=1.0;}
        else{ this.alto=1.0;}
    }

    // ── Getters y Setters ────────────────────────────────────────────────────

    /** @return el ancho del rectángulo */
    public double getAncho() { return ancho; }

    /** @return el alto del rectángulo */
    public double getAlto()  { return alto;  }

    /**
     * TODO: Modifica el ancho solo si el valor es mayor que 0.
     * @param ancho El nuevo ancho.
     */
    public void setAncho(double ancho) {
        // TODO: implementar
        if(ancho>0){this.ancho=ancho;}else{System.out.println("Error");}
    }

    /**
     * TODO: Modifica el alto solo si el valor es mayor que 0.
     * @param alto El nuevo alto.
     */
    public void setAlto(double alto) {
        // TODO: implementar
        if(alto>0){this.alto=alto;}else{Syste.out.println("Error");}
    }

    // ── Métodos de negocio ───────────────────────────────────────────────────

    /**
     * TODO: Calcula y devuelve el área del rectángulo (ancho * alto).
     * @return El área del rectángulo.
     */
    public double calcularArea() {
        // TODO: implementar
        
        return (getAlto()*getAlto());
    }

    /**
     * TODO: Calcula y devuelve el perímetro del rectángulo (2 * (ancho + alto)).
     * @return El perímetro del rectángulo.
     */
    public double calcularPerimetro() {
        // TODO: implementar
        return (2*(getAlto()+getAncho()));
    }

    /**
     * TODO: Devuelve true si el rectángulo es un cuadrado (ancho == alto).
     * @return true si es cuadrado, false en caso contrario.
     */
    public boolean esCuadrado() {
        // TODO: implementar
        return false;
    }

    /**
     * TODO: Devuelve una representación del rectángulo con el siguiente formato:
     *     Rectangulo[ancho=5.0, alto=3.0, area=15.0]
     * @return String con la descripción del rectángulo.
     */
    @Override
    public String toString() {
        // TODO: implementar
        return "Rectangulo[ancho="+getAncho()+", alto="+getAlto()+", area="+calcularPerimetro()+'\'';
    }

    // ── EJERCICIOS ADICIONALES (desafío) ─────────────────────────────────────

    /**
     * DESAFÍO 1: ¿Cabe este rectángulo dentro del rectángulo 'otro'?
     * Un rectángulo cabe dentro de otro si su ancho <= otro.ancho Y su alto <= otro.alto.
     * TODO: implementar
     *
     * @param otro El rectángulo contenedor.
     * @return true si this cabe dentro de otro.
     */
    public boolean cabeDentro(Rectangulo otro) {
        // TODO: implementar
        boolean cabeDentro=(this.ancho<=otro.ancho && this.alto<=otro.alto)?true :false;
        return cabeDentro;
    }

    /**
     * DESAFÍO 2: Escala el rectángulo multiplicando ancho y alto por el factor dado.
     * Si el factor es <= 0, no hacer nada.
     * TODO: implementar
     *
     * @param factor El factor de escala.
     */
    public void escalar(double factor) {
        // TODO: implementar
        if(factor<=0){System.out.println("Error");}
        else{
            this.alto=factor*getAlto();
            this.ancho=factor*getAncho();
        }
        
        
    }
}
