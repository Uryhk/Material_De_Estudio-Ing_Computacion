# 📚 Resumen Teórico: Programación Orientada a Objetos en Java

> **Referencia de estudio** — Complemento para los ejercicios prácticos.

---

## Tabla de Contenidos

1. [Objetos y Clases](#1-objetos-y-clases)
2. [Interacción entre Objetos](#2-interacción-entre-objetos)
3. [Agrupamiento de Objetos](#3-agrupamiento-de-objetos)
4. [Ocultamiento, Variables de Clase y Constantes](#4-ocultamiento-variables-de-clase-y-constantes)
5. [Interfaces e Implementación de Métodos](#5-interfaces-e-implementación-de-métodos)
6. [Programación Defensiva y Manejo de Excepciones](#6-programación-defensiva-y-manejo-de-excepciones)
7. [Procesamiento Funcional de Colecciones](#7-procesamiento-funcional-de-colecciones)
8. [Prueba, Depuración y Mantenimiento](#8-prueba-depuración-y-mantenimiento)

---

## 1. Objetos y Clases

### ¿Qué es una Clase?
Una **clase** es un molde o plantilla que define la estructura y el comportamiento de un tipo de objeto. Contiene **campos** (atributos) y **métodos** (comportamientos).

```java
public class Persona {
    // Campos (estado del objeto)
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad   = edad;
    }

    // Método
    public String saludar() {
        return "Hola, soy " + nombre;
    }
}
```

### ¿Qué es un Objeto?
Un **objeto** es una instancia de una clase. Se crea con `new`.

```java
Persona p = new Persona("Ana", 25);  // instanciación
p.saludar();                          // llamado de método
```

### Tipos de datos en Java

| Tipo | Descripción | Ejemplos |
|------|-------------|---------|
| **Primitivos** | Almacenan valores directamente | `int`, `double`, `boolean`, `char` |
| **Objetos (referencia)** | Almacenan una referencia en memoria | `String`, `Integer`, `ArrayList` |

> ⚠️ Los primitivos se pasan **por valor**. Los objetos se pasan **por referencia**.

### Constructores múltiples (sobrecarga)
Una clase puede tener varios constructores con distintos parámetros:

```java
public Rectangulo() { ... }                   // sin parámetros
public Rectangulo(double ancho, double alto) { ... }  // con parámetros
```

Para evitar duplicar código, un constructor puede llamar a otro con `this(...)`:

```java
public Rectangulo() {
    this(1.0, 1.0);  // llama al constructor con 2 parámetros
}
```

### Getters y Setters
Permiten acceder y modificar campos privados de forma controlada:

```java
public double getAncho() { return ancho; }   // getter

public void setAncho(double ancho) {         // setter con validación
    if (ancho > 0) this.ancho = ancho;
}
```

---

## 2. Interacción entre Objetos

### Objetos como parámetros de métodos
Los objetos se pueden pasar como argumentos a otros métodos:

```java
public double distanciaA(Punto otro) {
    return Math.sqrt(Math.pow(otro.x - this.x, 2) +
                     Math.pow(otro.y - this.y, 2));
}
```

### Composición de objetos
Un objeto puede **contener** a otro objeto como campo (relación "tiene un"):

```java
public class Circulo {
    private Punto centro;  // ← composición
    private double radio;
}
```

### Autorreferencia: `this`
`this` hace referencia al objeto actual. Se usa para:
- Distinguir campos de parámetros con el mismo nombre: `this.nombre = nombre;`
- Llamar a otro constructor: `this(arg1, arg2);`
- Devolver el propio objeto: `return this;`

### Diagramas de Clases (UML básico)

```
┌─────────────────┐       ┌─────────────────┐
│   Circulo       │       │     Punto       │
├─────────────────┤       ├─────────────────┤
│ - centro: Punto │──────>│ - x: double     │
│ - radio: double │       │ - y: double     │
├─────────────────┤       ├─────────────────┤
│ + calcularArea()│       │ + distanciaA()  │
│ + moverCentro() │       │ + toString()    │
└─────────────────┘       └─────────────────┘
```

---

## 3. Agrupamiento de Objetos

### ArrayList — Colecciones de tamaño flexible

```java
import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<>();
nombres.add("Ana");          // agregar
nombres.get(0);              // obtener por índice
nombres.remove("Ana");       // remover por valor
nombres.size();              // tamaño
nombres.contains("Ana");     // verificar existencia
```

### Clases Genéricas `<T>`
Las clases genéricas permiten trabajar con cualquier tipo de dato:

```java
ArrayList<Libro>    libros     = new ArrayList<>();
ArrayList<Integer>  numeros    = new ArrayList<>();
ArrayList<Persona>  personas   = new ArrayList<>();
```

### Recorrido con `for-each`

```java
for (Libro libro : catalogo) {
    System.out.println(libro.getTitulo());
}
```

### Recorrido con `Iterator`
Necesario cuando se **elimina** de la colección durante el recorrido:

```java
Iterator<Libro> it = catalogo.iterator();
while (it.hasNext()) {
    Libro libro = it.next();
    if (libro.isPrestado()) {
        it.remove();  // ✅ seguro durante iteración
    }
}
```

> ⚠️ Eliminar directamente en un `for-each` lanza `ConcurrentModificationException`.

### Colecciones fijas: Arrays

```java
int[] numeros = {1, 2, 3, 4, 5};    // tamaño fijo
String[] dias = new String[7];
```

---

## 4. Ocultamiento, Variables de Clase y Constantes

### Modificadores de acceso

| Modificador | Acceso |
|-------------|--------|
| `private`   | Solo dentro de la misma clase |
| `(default)` | Solo dentro del mismo paquete |
| `protected` | Mismo paquete + subclases |
| `public`    | Desde cualquier lugar |

**Regla de oro:** los campos deben ser `private`, los métodos `public`.

### Variables de clase (`static`)
Pertenecen a la **clase**, no a una instancia específica. Se comparten entre todos los objetos:

```java
public class Contador {
    private static int total = 0;  // variable de clase

    public Contador() {
        total++;  // cada instancia incrementa el total
    }

    public static int getTotal() {
        return total;
    }
}

// Uso:
Contador.getTotal();  // se accede con el nombre de la CLASE
```

### Constantes (`static final`)

```java
public static final double PI = 3.14159;
public static final int MAX_INTENTOS = 3;
```

> `static` → pertenece a la clase. `final` → no puede cambiarse.

---

## 5. Interfaces e Implementación de Métodos

### ¿Qué es una interfaz?
Una interfaz define un **contrato**: qué métodos debe tener una clase, sin decir cómo implementarlos:

```java
interface Figura {
    double calcularArea();       // método abstracto (sin cuerpo)
    double calcularPerimetro();

    default String describir() {  // método default (con cuerpo)
        return "Figura con área: " + calcularArea();
    }
}
```

### Implementar una interfaz

```java
public class Circulo implements Figura {
    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
```

### Polimorfismo con interfaces

```java
Figura f1 = new Circulo(5);
Figura f2 = new Rectangulo(4, 3);
// Ambos responden a los mismos métodos aunque son distintos tipos:
f1.calcularArea();   // → 78.54
f2.calcularArea();   // → 12.0
```

---

## 6. Programación Defensiva y Manejo de Excepciones

### Programación Defensiva
Consiste en **validar siempre** las entradas y el estado antes de operar:

```java
public void setRadio(double radio) {
    if (radio <= 0) {
        throw new IllegalArgumentException("El radio debe ser positivo.");
    }
    this.radio = radio;
}
```

### Jerarquía de Excepciones en Java

```
Throwable
├── Error          (problemas de la JVM, no manejar)
└── Exception
    ├── IOException      (checked: hay que manejarlas)
    └── RuntimeException (unchecked: opcionales)
        ├── NullPointerException
        ├── IllegalArgumentException
        ├── IndexOutOfBoundsException
        └── ... (tus propias excepciones personalizadas)
```

### Lanzar excepciones

```java
throw new IllegalArgumentException("Valor inválido: " + valor);
throw new NullPointerException("El objeto no puede ser null.");
```

### Capturar excepciones con `try-catch-finally`

```java
try {
    // código que puede fallar
    double resultado = dividir(a, b);
} catch (ArithmeticException e) {
    System.out.println("Error aritmético: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Error general: " + e.getMessage());
} finally {
    System.out.println("Esto SIEMPRE se ejecuta.");
}
```

### Excepciones personalizadas

```java
public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(double monto, double saldo) {
        super("No hay saldo suficiente. Monto: " + monto + ", Saldo: " + saldo);
    }
}
```

### Aserciones (`assert`)
Verifican invariantes durante el desarrollo. Se activan con `java -ea`.

```java
assert tamanio >= 0 : "El tamaño no puede ser negativo: " + tamanio;
```

---

## 7. Procesamiento Funcional de Colecciones

### Expresiones Lambda
Funciones anónimas compactas: `(parámetros) -> cuerpo`

```java
// Forma larga (clase anónima)
Runnable r = new Runnable() {
    public void run() { System.out.println("Hola"); }
};

// Con lambda (equivalente)
Runnable r = () -> System.out.println("Hola");
```

### `forEach` con lambda

```java
List<String> nombres = List.of("Ana", "Juan", "María");
nombres.forEach(nombre -> System.out.println(nombre));
// equivalente a: nombres.forEach(System.out::println);
```

### Streams — Procesamiento declarativo

Un **Stream** es una secuencia de elementos sobre la que se aplican operaciones en cadena:

```java
lista.stream()
     .filter(...)      // filtrar
     .map(...)         // transformar
     .sorted(...)      // ordenar
     .limit(n)         // tomar solo n
     .collect(...)     // recolectar resultado
```

### Operaciones principales

```java
List<String> aprobados = estudiantes.stream()
    .filter(e -> e.getPromedio() >= 6.0)         // solo aprobados
    .map(e -> e.getNombre())                      // extraer nombre
    .sorted()                                     // ordenar alfabéticamente
    .collect(Collectors.toList());                // a lista

double promedio = estudiantes.stream()
    .mapToDouble(Estudiante::getPromedio)
    .average()
    .orElse(0.0);

long cantidad = estudiantes.stream()
    .filter(e -> e.getCarrera().equals("Sistemas"))
    .count();

Optional<Estudiante> mejor = estudiantes.stream()
    .max(Comparator.comparingDouble(Estudiante::getPromedio));
```

### Tabla de operaciones de Stream

| Operación | Tipo | Descripción |
|-----------|------|-------------|
| `filter(Predicate)` | Intermedia | Conserva solo los que cumplen la condición |
| `map(Function)` | Intermedia | Transforma cada elemento |
| `sorted()` | Intermedia | Ordena los elementos |
| `limit(n)` | Intermedia | Toma solo los primeros n |
| `distinct()` | Intermedia | Elimina duplicados |
| `collect(...)` | Terminal | Recolecta en una lista/set/etc. |
| `count()` | Terminal | Cuenta los elementos |
| `average()` | Terminal | Calcula el promedio |
| `max()` / `min()` | Terminal | Encuentra el máximo/mínimo |
| `forEach(...)` | Terminal | Ejecuta acción por cada elemento |
| `anyMatch(...)` | Terminal | ¿Alguno cumple la condición? |

---

## 8. Prueba, Depuración y Mantenimiento

### ¿Por qué hacer pruebas?
- Detectar errores **temprano** y de forma **automatizada**.
- Garantizar que el código sigue funcionando tras cambios (**regresión**).
- Servir como **documentación viva** del comportamiento esperado.

### Pruebas Unitarias con JUnit 5

```java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    private CuentaBancaria cuenta;

    @BeforeEach  // Se ejecuta ANTES de cada test
    void setUp() {
        cuenta = new CuentaBancaria("Ana", "001", 500.0);
    }

    @Test
    @DisplayName("Depositar incrementa el saldo correctamente")
    void depositar_incrementa_saldo() {
        cuenta.depositar(200.0);
        assertEquals(700.0, cuenta.getSaldo());  // ← prueba positiva
    }

    @Test
    @DisplayName("Depositar monto negativo no cambia el saldo")
    void depositar_negativo_no_cambia_saldo() {
        cuenta.depositar(-100.0);
        assertEquals(500.0, cuenta.getSaldo());  // ← prueba negativa
    }
}
```

### Aserciones de JUnit 5

| Aserción | Descripción |
|----------|-------------|
| `assertEquals(esperado, actual)` | Verifica igualdad |
| `assertNotEquals(a, b)` | Verifica desigualdad |
| `assertTrue(condición)` | Verifica que sea verdadero |
| `assertFalse(condición)` | Verifica que sea falso |
| `assertNull(objeto)` | Verifica que sea null |
| `assertNotNull(objeto)` | Verifica que no sea null |
| `assertThrows(Excepcion.class, () -> ...)` | Verifica que se lanza excepción |

### Pruebas positivas vs negativas

| Tipo | ¿Qué prueba? | Ejemplo |
|------|-------------|---------|
| **Positiva** | El camino feliz (lo que debería funcionar) | Depositar $100 → saldo sube |
| **Negativa** | Los casos de error (lo que debería fallar) | Depositar -100 → saldo no cambia |
| **Borde** | Los límites del sistema | Depositar exactamente el máximo |

### Ciclo de Prueba de Regresión

```
1. Escribir test → 2. El test falla (rojo) → 3. Implementar código →
4. El test pasa (verde) → 5. Refactorizar → 6. Volver al paso 1
```

> Esto se conoce como **TDD (Test Driven Development)**.

### Depuración (Debugging)
1. **Usar el depurador del IDE**: colocar breakpoints, inspeccionar variables.
2. **Imprimir trazas** con `System.out.println()` (método simple pero efectivo).
3. **Leer el stack trace**: indica exactamente qué línea lanzó la excepción.

```
Exception in thread "main" java.lang.NullPointerException
    at Circulo.calcularArea(Circulo.java:42)   ← línea del error
    at Main.main(Main.java:10)
```

---

## 📋 Guía de Referencia Rápida

```java
// Crear objeto
MiClase obj = new MiClase(params);

// Colecciones
ArrayList<Tipo> lista = new ArrayList<>();
lista.add(elemento);
lista.remove(elemento);
lista.size();
for (Tipo t : lista) { ... }

// Streams
lista.stream()
     .filter(x -> condicion)
     .map(x -> transformacion)
     .collect(Collectors.toList());

// Excepciones
try { ... }
catch (TipoException e) { e.getMessage(); }
finally { ... }
throw new IllegalArgumentException("mensaje");

// Interfaz
interface MiInterfaz { void metodo(); }
class MiClase implements MiInterfaz { ... }

// static y final
public static int contador = 0;
public static final double PI = 3.14159;

// JUnit
@Test void miTest() { assertEquals(esperado, actual); }
@BeforeEach void setUp() { ... }
```

---

*Resumen elaborado como complemento para los ejercicios prácticos de Java — POO.*
