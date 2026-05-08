import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;

/**
 * EJERCICIO 8 - UNIDAD 7: Prueba, Depuración y Mantenimiento
 * ============================================================
 * Tema: Pruebas de unidad con JUnit 5, pruebas positivas/negativas,
 *       automatización, aserciones, escenarios de prueba.
 *
 * CONSIGNA:
 * Completá los métodos de prueba marcados con TODO.
 * Este archivo prueba la clase CuentaBancaria del Ejercicio 2.
 *
 * OBJETIVOS DE APRENDIZAJE:
 * - Escribir tests con @Test y aserciones de JUnit 5.
 * - Separar pruebas positivas (camino feliz) de negativas (errores).
 * - Usar @BeforeEach para preparar el estado inicial (fixture).
 * - Usar @Nested para agrupar pruebas por escenario.
 * - Verificar que se lanzan excepciones correctamente.
 * - Escribir nombres descriptivos con @DisplayName.
 *
 * NOTA: Para usar JUnit 5, agregá la dependencia en tu build tool:
 *   Maven:  junit-jupiter 5.x
 *   Gradle: testImplementation 'org.junit.jupiter:junit-jupiter:5.x'
 */
@DisplayName("Pruebas de CuentaBancaria")
public class CuentaBancariaTest {

    // ── Fixture: objetos de prueba ────────────────────────────────────────────
    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;

    /**
     * Se ejecuta ANTES de cada método @Test.
     * Inicializa el estado limpio para cada prueba.
     * NO modificar.
     */
    @BeforeEach
    void setUp() {
        cuentaOrigen  = new CuentaBancaria("Ana García", "001", 1000.0);
        cuentaDestino = new CuentaBancaria("Juan Pérez", "002");
    }

    // ══════════════════════════════════════════════════════════════════════════
    // GRUPO 1: Pruebas del constructor
    // ══════════════════════════════════════════════════════════════════════════
    @Nested
    @DisplayName("Constructor")
    class ConstructorTests {

        @Test
        @DisplayName("Constructor con saldo inicial asigna el saldo correcto")
        void constructorConSaldoInicialAsignaSaldo() {
            // TODO: Verificá que cuentaOrigen tiene saldo 1000.0
            // Usá: assertEquals(valorEsperado, valorActual)
        }

        @Test
        @DisplayName("Constructor base crea cuenta con saldo 0")
        void constructorBaseCreasCuentaConSaldoCero() {
            // TODO: Verificá que cuentaDestino tiene saldo 0.0
        }

        @Test
        @DisplayName("Constructor con saldo negativo asigna 0")
        void constructorConSaldoNegativoAsignaCero() {
            // TODO: Creá una cuenta con saldo -500.0 y verificá que el saldo sea 0.0
            CuentaBancaria cuenta = new CuentaBancaria("Test", "003", -500.0);
            // TODO: assertEquals(...)
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // GRUPO 2: Pruebas de depositar
    // ══════════════════════════════════════════════════════════════════════════
    @Nested
    @DisplayName("Depositar")
    class DepositarTests {

        @Test
        @DisplayName("Depositar un monto válido incrementa el saldo")
        void depositarMontoValidoIncrementaSaldo() {
            // TODO: Depositá 500.0 en cuentaOrigen y verificá que el saldo sea 1500.0
        }

        @Test
        @DisplayName("Depositar incrementa la cantidad de transacciones")
        void depositarIncrementaTransacciones() {
            // TODO: Depositá dinero y verificá que cantidadTransacciones sea 1
        }

        @Test
        @DisplayName("Depositar monto cero no modifica el saldo")
        void depositarCeroNoModificaSaldo() {
            // PRUEBA NEGATIVA
            // TODO: Intentá depositar 0.0 y verificá que el saldo siga en 1000.0
        }

        @Test
        @DisplayName("Depositar monto negativo no modifica el saldo")
        void depositarNegativoNoModificaSaldo() {
            // PRUEBA NEGATIVA
            // TODO: Intentá depositar -100.0 y verificá que el saldo siga igual
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // GRUPO 3: Pruebas de extraer
    // ══════════════════════════════════════════════════════════════════════════
    @Nested
    @DisplayName("Extraer")
    class ExtraerTests {

        @Test
        @DisplayName("Extraer monto válido reduce el saldo y devuelve true")
        void extraerMontoValidoReduceSaldo() {
            // TODO: Extraé 300.0 de cuentaOrigen
            // Verificá: (1) retorna true, (2) saldo es 700.0
            boolean resultado = cuentaOrigen.extraer(300.0);
            // TODO: assertTrue(resultado);
            // TODO: assertEquals(700.0, cuentaOrigen.getSaldo());
        }

        @Test
        @DisplayName("Extraer más del saldo devuelve false y no modifica el saldo")
        void extraerMasDelSaldoDevuelveFalse() {
            // PRUEBA NEGATIVA
            // TODO: Intentá extraer 2000.0 (más del saldo)
            // Verificá: (1) retorna false, (2) saldo sigue en 1000.0
        }

        @Test
        @DisplayName("Extraer monto cero devuelve false")
        void extraerCeroDevuelveFalse() {
            // PRUEBA NEGATIVA
            // TODO: implementar
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // GRUPO 4: Pruebas de transferir
    // ══════════════════════════════════════════════════════════════════════════
    @Nested
    @DisplayName("Transferir")
    class TransferirTests {

        @Test
        @DisplayName("Transferencia válida mueve el dinero entre cuentas")
        void transferenciaValidaMueveDinero() {
            // TODO: Transferí 400.0 de cuentaOrigen a cuentaDestino
            // Verificá:
            //   (1) Retorna true
            //   (2) cuentaOrigen.getSaldo() == 600.0
            //   (3) cuentaDestino.getSaldo() == 400.0
        }

        @Test
        @DisplayName("Transferencia fallida no modifica ninguna cuenta")
        void transferenciaFallidaNoModificaNada() {
            // PRUEBA NEGATIVA
            // TODO: Intentá transferir 5000.0 (más del saldo)
            // Verificá que ambas cuentas mantengan su saldo original
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // GRUPO 5: Prueba de regresión
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * PRUEBA DE REGRESIÓN:
     * Simula un escenario completo de uso.
     * Si este test pasa, garantiza que la integración de métodos funciona.
     */
    @Test
    @DisplayName("Escenario completo: depósito, extracción y transferencia")
    void escenarioCompleto() {
        // TODO: Completá este escenario paso a paso:
        // 1. Depositar 500.0 en cuentaOrigen → saldo: 1500.0
        // 2. Extraer 200.0 de cuentaOrigen   → saldo: 1300.0
        // 3. Transferir 300.0 a cuentaDestino → origen: 1000.0, destino: 300.0
        // 4. Verificar que cantidadTransacciones de cuentaOrigen sea 3
        // 5. Verificar que tieneSaldo() de cuentaDestino sea true
    }
}
