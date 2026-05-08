import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * EJERCICIO 7 - UNIDAD 6: Procesamiento Funcional de Colecciones
 * ================================================================
 * Tema: Lambdas, Streams, forEach, filter, map, reduce, collect.
 *
 * CONSIGNA:
 * Completá los métodos de ProcesadorEstudiantes usando la API de Streams
 * y expresiones lambda.
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Escribir expresiones lambda: (param) -> expresión.
 * - Usar Stream.filter(), .map(), .collect(), .reduce(), .sorted().
 * - Usar forEach() en colecciones.
 * - Entender Optional<T> como resultado posible de operaciones.
 */
public class ProcesadorEstudiantes {

    // ── Clase Estudiante ──────────────────────────────────────────────────────

    public static class Estudiante {
        private String nombre;
        private double promedio;
        private String carrera;
        private int anioIngreso;

        /** Constructor. NO modificar. */
        public Estudiante(String nombre, double promedio, String carrera, int anioIngreso) {
            this.nombre      = nombre;
            this.promedio    = promedio;
            this.carrera     = carrera;
            this.anioIngreso = anioIngreso;
        }

        public String getNombre()      { return nombre; }
        public double getPromedio()    { return promedio; }
        public String getCarrera()     { return carrera; }
        public int    getAnioIngreso() { return anioIngreso; }

        @Override
        public String toString() {
            return nombre + " (" + carrera + ", prom=" + promedio + ")";
        }
    }

    // ── Campo principal ────────────────────────────────────────────────────────
    private List<Estudiante> estudiantes;

    /** Constructor. NO modificar. */
    public ProcesadorEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = new ArrayList<>(estudiantes);
    }

    // ══════════════════════════════════════════════════════════════════════════
    // SECCIÓN A: forEach y lambdas básicas
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * TODO: Imprime el nombre de cada estudiante usando forEach y lambda.
     * Formato: "- Nombre"
     */
    public void imprimirNombres() {
        // TODO: implementar con forEach y lambda
        // estudiantes.forEach(e -> ...);
    }

    /**
     * TODO: Imprime solo los estudiantes cuyo promedio es mayor o igual a umbral.
     * Usá forEach con una lambda que contenga un if.
     *
     * @param umbral El promedio mínimo.
     */
    public void imprimirConPromedioMinimo(double umbral) {
        // TODO: implementar
    }

    // ══════════════════════════════════════════════════════════════════════════
    // SECCIÓN B: Streams con filter y collect
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * TODO: Devuelve una lista con los estudiantes de la carrera dada.
     * Usá stream().filter(...).collect(Collectors.toList()).
     *
     * @param carrera La carrera a filtrar.
     * @return Lista de estudiantes de esa carrera.
     */
    public List<Estudiante> filtrarPorCarrera(String carrera) {
        // TODO: implementar con stream().filter().collect()
        return new ArrayList<>();
    }

    /**
     * TODO: Devuelve una lista de estudiantes aprobados (promedio >= 6.0).
     *
     * @return Lista de estudiantes aprobados.
     */
    public List<Estudiante> obtenerAprobados() {
        // TODO: implementar
        return new ArrayList<>();
    }

    /**
     * TODO: Devuelve una lista de estudiantes ingresados después del año dado.
     *
     * @param anio El año de corte (exclusive).
     * @return Lista de estudiantes que ingresaron después.
     */
    public List<Estudiante> filtrarPorAnioIngreso(int anio) {
        // TODO: implementar
        return new ArrayList<>();
    }

    // ══════════════════════════════════════════════════════════════════════════
    // SECCIÓN C: Streams con map
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * TODO: Devuelve una lista con los NOMBRES (String) de todos los estudiantes.
     * Usá stream().map(...).collect(...)
     *
     * @return Lista de nombres.
     */
    public List<String> obtenerNombres() {
        // TODO: implementar con .map(e -> e.getNombre())
        return new ArrayList<>();
    }

    /**
     * TODO: Devuelve una lista con los promedios de los estudiantes aprobados.
     * Combiná filter() y map().
     *
     * @return Lista de promedios de aprobados.
     */
    public List<Double> promediosDeAprobados() {
        // TODO: implementar
        return new ArrayList<>();
    }

    // ══════════════════════════════════════════════════════════════════════════
    // SECCIÓN D: Operaciones de reducción
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * TODO: Calcula el promedio general de todos los estudiantes.
     * Usá stream().mapToDouble(...).average().
     * Si la lista está vacía, devolvé 0.0.
     *
     * @return El promedio general.
     */
    public double promedioGeneral() {
        // TODO: implementar con mapToDouble().average().orElse(0.0)
        return 0.0;
    }

    /**
     * TODO: Devuelve el estudiante con el promedio más alto.
     * Usá stream().max(Comparator.comparingDouble(...)).
     * Devuelve null si la lista está vacía.
     *
     * @return El mejor estudiante o null.
     */
    public Estudiante mejorEstudiante() {
        // TODO: implementar con stream().max(...)
        return null;
    }

    /**
     * TODO: Cuenta cuántos estudiantes pertenecen a la carrera dada.
     * Usá stream().filter(...).count().
     *
     * @param carrera La carrera a contar.
     * @return Cantidad de estudiantes.
     */
    public long contarPorCarrera(String carrera) {
        // TODO: implementar
        return 0;
    }

    // ══════════════════════════════════════════════════════════════════════════
    // SECCIÓN E: Sorted y otras operaciones
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * TODO: Devuelve la lista de estudiantes ordenada por promedio de mayor a menor.
     * Usá stream().sorted(Comparator.comparingDouble(...).reversed()).collect(...)
     *
     * @return Lista ordenada por promedio descendente.
     */
    public List<Estudiante> ordenadosPorPromedioDesc() {
        // TODO: implementar
        return new ArrayList<>();
    }

    /**
     * DESAFÍO: Devuelve una lista con los top N estudiantes por promedio.
     * Combiná sorted(), limit() y collect().
     *
     * @param n Cantidad de estudiantes a devolver.
     * @return Lista con los mejores N estudiantes.
     */
    public List<Estudiante> topN(int n) {
        // TODO: implementar con sorted().limit(n).collect()
        return new ArrayList<>();
    }
}
