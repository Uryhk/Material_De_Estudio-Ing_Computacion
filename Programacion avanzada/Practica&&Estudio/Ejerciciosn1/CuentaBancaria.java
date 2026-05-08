/**
 * EJERCICIO 2 - UNIDAD 1: Instancia de objetos y estado
 * =======================================================
 * Tema: Estado de un objeto, interacción básica, tipos de datos.
 *
 * CONSIGNA:
 * Implementá los métodos marcados con TODO en la clase CuentaBancaria.
 * La clase modela una cuenta bancaria simple.
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Entender qué es el estado de un objeto.
 * - Modificar el estado a través de métodos.
 * - Validar entradas en los métodos (programación defensiva básica).
 * - Practicar el llamado interno de métodos (this.metodo()).
 */
public class CuentaBancaria {

    // ── Constantes de clase ───────────────────────────────────────────────────
    /** Saldo mínimo permitido en la cuenta */
    public static final double SALDO_MINIMO = 0.0;

    // ── Campos de instancia ───────────────────────────────────────────────────
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private int cantidadTransacciones;

    // ── Constructores ─────────────────────────────────────────────────────────

    /**
     * Constructor base. NO modificar.
     * Crea una cuenta con saldo 0.
     *
     * @param titular      Nombre del titular.
     * @param numeroCuenta Número identificador de la cuenta.
     */
    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular             = titular;
        this.numeroCuenta        = numeroCuenta;
        this.saldo               = 0.0;
        this.cantidadTransacciones = 0;
    }

    /**
     * TODO: Constructor alternativo.
     * Crea una cuenta con un saldo inicial.
     * Si el saldo inicial es negativo, asigná 0.
     * Reutilizá el constructor anterior con this(...).
     *
     * @param titular        Nombre del titular.
     * @param numeroCuenta   Número identificador de la cuenta.
     * @param saldoInicial   El saldo con el que comienza la cuenta.
     */
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        // TODO: implementar usando this(...)
    }

    // ── Getters ───────────────────────────────────────────────────────────────

    /** @return el nombre del titular */
    public String getTitular()             { return titular; }

    /** @return el número de cuenta */
    public String getNumeroCuenta()        { return numeroCuenta; }

    /** @return el saldo actual */
    public double getSaldo()               { return saldo; }

    /** @return la cantidad de transacciones realizadas */
    public int getCantidadTransacciones()  { return cantidadTransacciones; }

    // ── Métodos de negocio ────────────────────────────────────────────────────

    /**
     * TODO: Deposita un monto en la cuenta.
     * - Solo se permiten montos mayores a 0.
     * - Si el monto es válido, sumarlo al saldo e incrementar cantidadTransacciones.
     * - Si no es válido, imprimir: "Error: monto de depósito inválido."
     *
     * @param monto El monto a depositar.
     */
    public void depositar(double monto) {
        // TODO: implementar
    }

    /**
     * TODO: Extrae un monto de la cuenta.
     * - Solo se permiten montos mayores a 0.
     * - No se puede extraer más de lo que hay en el saldo.
     * - Si la extracción es válida, restar al saldo e incrementar cantidadTransacciones.
     * - Si el monto es inválido o insuficiente, imprimir el error correspondiente.
     *
     * @param monto El monto a extraer.
     * @return true si la extracción fue exitosa, false en caso contrario.
     */
    public boolean extraer(double monto) {
        // TODO: implementar
        return false;
    }

    /**
     * TODO: Transfiere un monto desde esta cuenta a la cuenta destino.
     * Reutilizá los métodos extraer() y depositar().
     * La transferencia solo ocurre si extraer() devuelve true.
     *
     * @param destino La cuenta destino.
     * @param monto   El monto a transferir.
     * @return true si la transferencia fue exitosa.
     */
    public boolean transferir(CuentaBancaria destino, double monto) {
        // TODO: implementar
        return false;
    }

    /**
     * TODO: Devuelve true si la cuenta tiene saldo disponible (saldo > SALDO_MINIMO).
     * @return true si hay saldo.
     */
    public boolean tieneSaldo() {
        // TODO: implementar
        return false;
    }

    /**
     * TODO: Devuelve un resumen de la cuenta con el formato:
     *   Cuenta[titular=Juan, numero=0001, saldo=$1500.00, transacciones=3]
     *
     * Tip: Usá String.format("%.2f", saldo) para formatear el saldo.
     */
    @Override
    public String toString() {
        // TODO: implementar
        return "";
    }
}
