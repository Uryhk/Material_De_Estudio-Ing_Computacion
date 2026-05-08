/**
 * EJERCICIO 3b - UNIDAD 2: Interacción entre Objetos
 * ====================================================
 * Tema: Composición, autorreferencia (this), objetos como parámetros de métodos.
 *
 * CONSIGNA:
 * Implementá los métodos de la clase Circulo.
 * Un Círculo tiene un centro (Punto) y un radio.
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Usar un objeto como campo de otro objeto (composición).
 * - Pasar objetos como parámetros de métodos.
 * - Entender la autorreferencia (this).
 * - Interactuar entre dos objetos del mismo tipo.
 */
public class Circulo {

    // ── Campos ───────────────────────────────────────────────────────────────
    private Punto centro;   // ← composición: Circulo "tiene" un Punto
    private double radio;

    // ── Constructor ───────────────────────────────────────────────────────────

    /**
     * Constructor base. NO modificar.
     * Crea un círculo con centro en (0,0) y radio 1.
     */
    public Circulo() {
        this.centro = new Punto(0, 0);
        this.radio  = 1.0;
    }

    /**
     * TODO: Constructor con parámetros.
     * Si el radio es <= 0, asignar 1.0.
     *
     * @param cx    Coordenada x del centro.
     * @param cy    Coordenada y del centro.
     * @param radio El radio del círculo.
     */
    public Circulo(double cx, double cy, double radio) {
        // TODO: implementar
        this.centro=new Punto(cx,cy);
        if(radio<=0){this.radio=1.0;}
        else{
            this.radio=radio;
        }
    }

    // ── Getters ───────────────────────────────────────────────────────────────
    public Punto getCentro() { return centro; }
    public double getRadio() { return radio;  }

    /**
     * TODO: Modifica el radio. Solo acepta valores > 0.
     * @param radio El nuevo radio.
     */
    public void setRadio(double radio) {
        // TODO: implementar
        this.radio=(radio>0)?radio:1.0;
    }

    // ── Métodos de geometría ──────────────────────────────────────────────────

    /**
     * TODO: Calcula el área del círculo. Fórmula: π * r²
     * Usá Math.PI y Math.pow().
     * @return el área.
     */
    public double calcularArea() {
        // TODO: implementar
        return Math.pow(this.radio,2)*Math.PI;
    }

    /**
     * TODO: Calcula la circunferencia. Fórmula: 2 * π * r
     * @return la circunferencia.
     */
    public double calcularCircunferencia() {
        // TODO: implementar
        return 2*Math.PI*this.radio;
    }

    // ── Métodos de interacción con otros objetos ──────────────────────────────

    /**
     * TODO: Determina si un Punto dado está dentro de este círculo.
     * Un punto está dentro si su distancia al centro es <= radio.
     * Usá el método distanciaA() de la clase Punto.
     *
     * @param p El punto a verificar.
     * @return true si el punto está dentro del círculo.
     */
    public boolean contienePunto(Punto p) {
        // TODO: implementar
        return (p.distanciaA(this.centro)<=getRadio());
    }

    /**
     * TODO: Determina si este círculo se superpone con otro.
     * Dos círculos se superponen si la distancia entre sus centros
     * es menor que la suma de sus radios.
     *
     * @param otro El otro círculo.
     * @return true si se superponen.
     */  
    public boolean seSuperponeContra(Circulo otro) {
        // TODO: implementar
        double distancias= this.centro.distanciaA(otro.centro); 
        return distancia<(this.getRadio()+otro.getRadio());
    }

    /**
     * TODO: Mueve el centro del círculo a una nueva posición.
     * Usá el método moverA() del objeto Punto.
     *
     * @param nx nueva coordenada x.
     * @param ny nueva coordenada y.
     */
    public void moverCentro(double nx, double ny) {
        // TODO: implementar
        this.centro.moverA(nx,ny);
    }

    /**
     * DESAFÍO: Devuelve el círculo con mayor área entre this y otro.
     * Usá la autorreferencia: return this; o return otro;
     *
     * @param otro El círculo con el que comparar.
     * @return El círculo más grande.
     */
    public Circulo elMasGrande(Circulo otro) {
        // TODO: implementar
        if(this.calcularArea()<otro.calcularArea()){return otro;
        }else{return this;}
    }

    /**
     * TODO: toString con formato: "Circulo[centro=(0.0, 0.0), radio=5.0]"
     */
    @Override
    public String toString() {
        // TODO: implementar
    return "Circulo[centro=(" + this.centro.getX() + ", " + this.centro.getY() + "), radio=" + this.radio + "]";
    }
}
