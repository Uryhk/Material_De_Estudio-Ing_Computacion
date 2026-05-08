/**
 * EJERCICIO 3a - UNIDAD 2: Interacción entre Objetos
 * ====================================================
 * Tema: Objetos como parámetros, diagramas de clases, abstracción.
 *
 * Esta clase representa un punto en un plano cartesiano 2D.
 * Es usada por la clase Circulo (Ejercicio 3b).
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Construir objetos simples que son usados por otros.
 * - Practicar la composición de objetos.
 * - Calcular distancias con Math.sqrt() y Math.pow().
 */
public class Punto {

    // ── Campos ───────────────────────────────────────────────────────────────
    private double x;
    private double y;

    // ── Constructor ───────────────────────────────────────────────────────────

    /**
     * Crea un punto en la posición (x, y). NO modificar.
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // ── Getters y Setters ─────────────────────────────────────────────────────

    public double getX() { return x; }
    public double getY() { return y; }

    /**
     * TODO: Modifica las coordenadas del punto.
     * @param x nueva coordenada x.
     * @param y nueva coordenada y.
     */
    public void moverA(double x, double y) {
        // TODO: implementar
    }

    // ── Métodos ───────────────────────────────────────────────────────────────

    /**
     * TODO: Calcula la distancia euclidiana entre este punto y el punto 'otro'.
     * Fórmula: sqrt((x2-x1)^2 + (y2-y1)^2)
     * Usá Math.sqrt() y Math.pow()
     *
     * @param otro El otro punto.
     * @return La distancia entre ambos puntos.
     */
    public double distanciaA(Punto otro) {
        // TODO: implementar
        return 0;
    }

    /**
     * TODO: Devuelve una representación del punto: "(3.0, 4.0)"
     */
    @Override
    public String toString() {
        // TODO: implementar
        return "";
    }
}
