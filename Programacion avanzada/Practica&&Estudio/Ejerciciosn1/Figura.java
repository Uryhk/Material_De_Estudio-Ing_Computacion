/**
 * EJERCICIO 5 - UNIDAD 4: Interfaces, Ocultamiento y Variables de Clase
 * =======================================================================
 * Tema: Interfaces, información y ocultamiento, variables de clase y constantes.
 *
 * CONSIGNA:
 * Este archivo contiene:
 *   (a) Una interfaz Figura con los métodos que toda figura debe implementar.
 *   (b) La clase Triangulo que implementa Figura.
 *   (c) La clase FabricaDeFiguras que usa variables de clase (static).
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Definir y usar interfaces en Java.
 * - Diferenciar entre variables de instancia y variables de clase (static).
 * - Practicar el ocultamiento de información (private + getters).
 * - Usar constantes (static final).
 */

// ════════════════════════════════════════════════════════════════════════════
// (a) INTERFAZ: Figura
// ════════════════════════════════════════════════════════════════════════════

/**
 * Interfaz que deben implementar todas las figuras geométricas.
 * Define el contrato: toda figura debe poder calcular su área,
 * su perímetro y describirse a sí misma.
 */
interface Figura {

    /**
     * @return El área de la figura.
     */
    double calcularArea();

    /**
     * @return El perímetro de la figura.
     */
    double calcularPerimetro();

    /**
     * @return El nombre de la figura (ej. "Triángulo", "Círculo").
     */
    String getNombre();

    /**
     * Método default: ya tiene implementación.
     * Devuelve una descripción completa de la figura.
     * NO necesita ser sobreescrito, pero puede hacerlo.
     */
    default String describir() {
        return getNombre() +
               " | Área: " + String.format("%.2f", calcularArea()) +
               " | Perímetro: " + String.format("%.2f", calcularPerimetro());
    }
}


// ════════════════════════════════════════════════════════════════════════════
// (b) CLASE: Triangulo (implementa Figura)
// ════════════════════════════════════════════════════════════════════════════

/**
 * TODO: Completá la clase Triangulo para que implemente la interfaz Figura.
 *
 * Un triángulo tiene tres lados: a, b y c.
 * Área (fórmula de Herón):
 *    s = (a + b + c) / 2
 *    area = sqrt(s * (s-a) * (s-b) * (s-c))
 */
class Triangulo implements Figura {

    // ── Campos privados ───────────────────────────────────────────────────────
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // ── Constructor ───────────────────────────────────────────────────────────

    /**
     * TODO: Creá el constructor que recibe los tres lados.
     * Validar que todos los lados sean > 0 y que formen un triángulo válido
     * (la suma de dos lados siempre debe ser mayor que el tercero).
     * Si no son válidos, asignar 3.0 a todos los lados (triángulo equilátero base).
     */
    public Triangulo(double a, double b, double c) {
        // TODO: implementar
    }

    // ── Implementación de la interfaz ─────────────────────────────────────────

    /**
     * TODO: Implementar calcularArea() con la fórmula de Herón.
     */
    @Override
    public double calcularArea() {
        // TODO: implementar
        return 0;
    }

    /**
     * TODO: Implementar calcularPerimetro() → a + b + c
     */
    @Override
    public double calcularPerimetro() {
        // TODO: implementar
        return 0;
    }

    /**
     * TODO: Implementar getNombre() → "Triángulo"
     */
    @Override
    public String getNombre() {
        // TODO: implementar
        return "";
    }

    // ── Métodos adicionales ───────────────────────────────────────────────────

    /**
     * TODO: Determina el tipo de triángulo:
     *   - "Equilátero" si los tres lados son iguales.
     *   - "Isósceles" si exactamente dos lados son iguales.
     *   - "Escaleno" si todos los lados son diferentes.
     *
     * @return El tipo de triángulo.
     */
    public String getTipo() {
        // TODO: implementar
        return "";
    }

    /** Getters */
    public double getLadoA() { return ladoA; }
    public double getLadoB() { return ladoB; }
    public double getLadoC() { return ladoC; }
}


// ════════════════════════════════════════════════════════════════════════════
// (c) CLASE: FabricaDeFiguras — variables de clase y constantes
// ════════════════════════════════════════════════════════════════════════════

/**
 * Clase que demuestra el uso de variables de clase (static) y constantes.
 * Lleva la cuenta de cuántas figuras fueron creadas en total.
 */
class FabricaDeFiguras {

    // ── Variable de clase (compartida por todas las instancias) ───────────────

    /**
     * Contador global de figuras creadas. Es static: pertenece a la CLASE,
     * no a una instancia específica.
     */
    private static int totalFigurasCreadas = 0;

    /**
     * Constante de clase: valor de PI usado en esta fábrica.
     */
    public static final double PI = Math.PI;

    // ── Métodos estáticos ─────────────────────────────────────────────────────

    /**
     * TODO: Crea un nuevo Triangulo, incrementa el contador y lo devuelve.
     * @param a lado a
     * @param b lado b
     * @param c lado c
     * @return Un nuevo Triangulo.
     */
    public static Triangulo crearTriangulo(double a, double b, double c) {
        // TODO: implementar
        return null;
    }

    /**
     * TODO: Devuelve el total de figuras creadas por la fábrica.
     * @return Total de figuras.
     */
    public static int getTotalFigurasCreadas() {
        // TODO: implementar
        return 0;
    }

    /**
     * DESAFÍO: Crea un triángulo equilátero dado un lado.
     * Todos sus lados son iguales.
     * @param lado El lado del triángulo equilátero.
     * @return Un nuevo Triangulo equilátero.
     */
    public static Triangulo crearEquilatero(double lado) {
        // TODO: implementar
        return null;
    }
}
