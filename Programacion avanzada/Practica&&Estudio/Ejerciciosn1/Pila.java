/**
 * EJERCICIO 6 - UNIDAD 5: Programación Defensiva y Manejo de Excepciones
 * ========================================================================
 * Tema: Excepciones, programación defensiva, aserciones, reporte de errores.
 *
 * CONSIGNA:
 * Implementá una Pila (Stack) genérica con manejo robusto de errores.
 * Una Pila es una estructura LIFO: el último elemento en entrar
 * es el primero en salir.
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Lanzar excepciones con throw new ...Exception(mensaje).
 * - Crear excepciones personalizadas.
 * - Manejar excepciones con try-catch-finally.
 * - Usar assert para verificar invariantes.
 * - Aplicar programación defensiva (validar SIEMPRE las entradas).
 */
import java.util.ArrayList;

public class Pila<T> {

    // ── Excepción personalizada ───────────────────────────────────────────────

    /**
     * Excepción lanzada cuando se opera sobre una pila vacía.
     * Extender RuntimeException la hace "no chequeada" (unchecked).
     */
    public static class PilaVaciaException extends RuntimeException {
        public PilaVaciaException(String mensaje) {
            super(mensaje);
        }
    }

    /**
     * Excepción lanzada cuando se supera la capacidad máxima.
     */
    public static class PilaLlenaException extends RuntimeException {
        public PilaLlenaException(String mensaje) {
            super(mensaje);
        }
    }

    // ── Constante ─────────────────────────────────────────────────────────────

    /** Capacidad máxima por defecto de la pila */
    public static final int CAPACIDAD_MAXIMA = 100;

    // ── Campos ────────────────────────────────────────────────────────────────
    private ArrayList<T> elementos;
    private int capacidad;

    // ── Constructor ───────────────────────────────────────────────────────────

    /**
     * Constructor base. NO modificar.
     * Crea una pila con capacidad máxima CAPACIDAD_MAXIMA.
     */
    public Pila() {
        this.elementos = new ArrayList<>();
        this.capacidad = CAPACIDAD_MAXIMA;
    }

    /**
     * TODO: Constructor con capacidad personalizada.
     * Si la capacidad es <= 0, lanzá IllegalArgumentException.
     *
     * @param capacidad La capacidad máxima de la pila.
     * @throws IllegalArgumentException si la capacidad no es positiva.
     */
    public Pila(int capacidad) {
        // TODO: implementar
        // Ejemplo de lanzamiento:
        // throw new IllegalArgumentException("La capacidad debe ser positiva.");
    }

    // ── Operaciones de Pila ───────────────────────────────────────────────────

    /**
     * TODO: Agrega un elemento en el tope de la pila (push).
     * - Si el elemento es null, lanzá NullPointerException.
     * - Si la pila está llena, lanzá PilaLlenaException.
     *
     * @param elemento El elemento a agregar.
     * @throws NullPointerException si el elemento es null.
     * @throws PilaLlenaException si la pila está llena.
     */
    public void apilar(T elemento) {
        // TODO: implementar
    }

    /**
     * TODO: Remueve y devuelve el elemento del tope (pop).
     * - Si la pila está vacía, lanzá PilaVaciaException.
     *
     * @return El elemento del tope.
     * @throws PilaVaciaException si la pila está vacía.
     */
    public T desapilar() {
        // TODO: implementar
        return null;
    }

    /**
     * TODO: Devuelve (sin remover) el elemento del tope (peek).
     * - Si la pila está vacía, lanzá PilaVaciaException.
     *
     * @return El elemento del tope.
     * @throws PilaVaciaException si la pila está vacía.
     */
    public T verTope() {
        // TODO: implementar
        return null;
    }

    // ── Consultas ─────────────────────────────────────────────────────────────

    /**
     * TODO: Devuelve true si la pila está vacía.
     */
    public boolean estaVacia() {
        // TODO: implementar
        return true;
    }

    /**
     * TODO: Devuelve true si la pila está llena (tamaño == capacidad).
     */
    public boolean estaLlena() {
        // TODO: implementar
        return false;
    }

    /**
     * TODO: Devuelve la cantidad actual de elementos.
     */
    public int tamanio() {
        // TODO: implementar
        return 0;
    }

    /**
     * TODO: Vacía la pila completamente.
     */
    public void vaciar() {
        // TODO: implementar
    }

    // ── Uso de try-catch (EJERCICIO DE MANEJO DE EXCEPCIONES) ─────────────────

    /**
     * EJERCICIO: Completá este método que intenta desapilar un elemento.
     * Si la pila está vacía, en lugar de propagar la excepción,
     * debe imprimir "Advertencia: la pila está vacía." y devolver null.
     * Usá un bloque try-catch.
     *
     * @return El elemento desapilado, o null si la pila estaba vacía.
     */
    public T desapilarSeguro() {
        // TODO: implementar con try-catch
        return null;
    }

    /**
     * DESAFÍO: Invertí el orden de los elementos de la pila.
     * Tip: Usá una pila auxiliar.
     * Al finalizar, this debe tener los elementos en orden inverso.
     */
    public void invertir() {
        // TODO: implementar
    }

    // ── Uso de assert ──────────────────────────────────────────────────────────

    /**
     * Verifica el invariante de la clase:
     * el tamaño nunca debe ser mayor que la capacidad.
     * Usá esta aserción después de cada apilar/desapilar.
     *
     * Para habilitar aserciones al correr: java -ea Pila
     */
    private void verificarInvariante() {
        assert elementos.size() <= capacidad
            : "Invariante violado: tamaño " + elementos.size()
              + " supera capacidad " + capacidad;
    }

    @Override
    public String toString() {
        return "Pila" + elementos + " [tope→]";
    }
}
