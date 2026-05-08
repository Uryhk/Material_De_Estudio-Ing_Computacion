import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * EJERCICIO 4 - UNIDAD 3: Agrupamiento de Objetos
 * =================================================
 * Tema: ArrayList, iteradores, clases genéricas, enumeración de colecciones.
 *
 * CONSIGNA:
 * Implementá los métodos de la clase Biblioteca.
 * La biblioteca administra una colección de objetos Libro.
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Usar ArrayList<T> para colecciones de tamaño flexible.
 * - Recorrer colecciones con for-each e Iterator.
 * - Buscar, agregar y eliminar elementos de una colección.
 * - Entender las clases genéricas (ArrayList<Libro>).
 */
public class Biblioteca {

    // ── Clase interna: Libro ──────────────────────────────────────────────────
    // (En un proyecto real estaría en su propio archivo)
    public static class Libro {
        private String titulo;
        private String autor;
        private int anioPublicacion;
        private boolean prestado;

        /** Constructor. NO modificar. */
        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo          = titulo;
            this.autor           = autor;
            this.anioPublicacion = anioPublicacion;
            this.prestado        = false;
        }

        public String getTitulo()         { return titulo; }
        public String getAutor()          { return autor;  }
        public int    getAnioPublicacion(){ return anioPublicacion; }
        public boolean isPrestado()       { return prestado; }
        public void setPrestado(boolean prestado) { this.prestado = prestado; }

        @Override
        public String toString() {
            return "\"" + titulo + "\" por " + autor +
                   " (" + anioPublicacion + ")" +
                   (prestado ? " [PRESTADO]" : " [DISPONIBLE]");
        }
    }

    // ── Campo principal ───────────────────────────────────────────────────────
    private ArrayList<Libro> catalogo;

    // ── Constructor ───────────────────────────────────────────────────────────

    /**
     * Crea una biblioteca con catálogo vacío. NO modificar.
     */
    public Biblioteca() {
        this.catalogo = new ArrayList<>();
    }

    // ── Gestión de la colección ───────────────────────────────────────────────

    /**
     * TODO: Agrega un libro al catálogo.
     * No agregar si el libro es null.
     * @param libro El libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        // TODO: implementar
    }

    /**
     * TODO: Elimina un libro del catálogo buscándolo por título (exacto).
     * Si el libro no existe, no hacer nada.
     * Tip: Usá un Iterator para eliminar de forma segura.
     *
     * @param titulo El título del libro a eliminar.
     * @return true si fue eliminado, false si no se encontró.
     */
    public boolean eliminarLibro(String titulo) {
        // TODO: implementar con Iterator
        return false;
    }

    /**
     * TODO: Devuelve la cantidad de libros en el catálogo.
     * @return tamaño del catálogo.
     */
    public int cantidadLibros() {
        // TODO: implementar
        return 0;
    }

    // ── Búsqueda ──────────────────────────────────────────────────────────────

    /**
     * TODO: Busca y devuelve el primer libro con el título dado.
     * Devuelve null si no lo encuentra.
     * Usá un bucle for-each.
     *
     * @param titulo El título a buscar.
     * @return El objeto Libro o null.
     */
    public Libro buscarPorTitulo(String titulo) {
        // TODO: implementar
        return null;
    }

    /**
     * TODO: Devuelve una lista con todos los libros de un autor dado.
     * Si no hay, devuelve una lista vacía.
     *
     * @param autor El nombre del autor.
     * @return Lista de libros del autor.
     */
    public ArrayList<Libro> buscarPorAutor(String autor) {
        // TODO: implementar
        return new ArrayList<>();
    }

    // ── Gestión de préstamos ──────────────────────────────────────────────────

    /**
     * TODO: Registra el préstamo de un libro (si está disponible).
     * Cambia el estado 'prestado' del libro a true.
     * Si el libro no existe o ya está prestado, imprimir un mensaje de error.
     *
     * @param titulo El título del libro a prestar.
     * @return true si el préstamo fue exitoso.
     */
    public boolean prestarLibro(String titulo) {
        // TODO: implementar
        return false;
    }

    /**
     * TODO: Registra la devolución de un libro.
     * Cambia el estado 'prestado' a false.
     *
     * @param titulo El título del libro devuelto.
     * @return true si la devolución fue exitosa.
     */
    public boolean devolverLibro(String titulo) {
        // TODO: implementar
        return false;
    }

    // ── Listados ──────────────────────────────────────────────────────────────

    /**
     * TODO: Imprime todos los libros del catálogo usando un for-each.
     * Si el catálogo está vacío, imprimir: "La biblioteca está vacía."
     */
    public void listarTodos() {
        // TODO: implementar con for-each
    }

    /**
     * TODO: Imprime solo los libros disponibles (no prestados).
     * Usá un Iterator explícito.
     */
    public void listarDisponibles() {
        // TODO: implementar con Iterator
        Iterator<Libro> it = catalogo.iterator();
        // TODO: continuar implementación
    }

    /**
     * DESAFÍO: Devuelve cuántos libros fueron publicados después del año dado.
     * @param anio El año de corte.
     * @return cantidad de libros publicados después del año.
     */
    public int cantidadPublicadosDespuesDe(int anio) {
        // TODO: implementar
        return 0;
    }
}
