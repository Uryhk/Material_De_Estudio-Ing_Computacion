# 📘 Guía Completa de Java — Sintaxis y Librerías

> Material de referencia para aprender y repasar Java desde cero.  
> Pensado para trabajar desde terminal y bloc de notas.

---

## Índice

1. [Estructura básica de un programa](#1-estructura-básica-de-un-programa)
2. [Variables y Tipos de datos](#2-variables-y-tipos-de-datos)
3. [Operadores](#3-operadores)
4. [Control de flujo](#4-control-de-flujo)
5. [Arreglos (Arrays)](#5-arreglos-arrays)
6. [Métodos (Funciones)](#6-métodos-funciones)
7. [Programación Orientada a Objetos](#7-programación-orientada-a-objetos)
8. [Herencia e Interfaces](#8-herencia-e-interfaces)
9. [Excepciones](#9-excepciones)
10. [Generics](#10-generics)
11. [Librería java.lang](#11-librería-javalang)
12. [Librería java.util](#12-librería-javautil)
13. [Librería java.io y java.nio](#13-librería-javaio-y-javanio)
14. [Librería java.net](#14-librería-javanet)
15. [Librería java.math](#15-librería-javamath)
16. [Lambdas y Streams (Java 8+)](#16-lambdas-y-streams-java-8)
17. [Palabras reservadas](#17-palabras-reservadas)
18. [Convenciones de nomenclatura](#18-convenciones-de-nomenclatura)

---

## 1. Estructura básica de un programa

```java
// Declaración del paquete (opcional)
package com.miempresa.proyecto;

// Importaciones
import java.util.Scanner;

// Toda clase pública debe estar en un archivo con el mismo nombre
public class HolaMundo {

    // Punto de entrada del programa
    public static void main(String[] args) {
        System.out.println("Hola, Mundo!");
    }
}
```

### Comentarios

```java
// Comentario de una línea

/*
   Comentario
   de varias líneas
*/

/**
 * Comentario Javadoc (para documentación automática)
 * @param nombre El nombre del usuario
 * @return Un saludo personalizado
 */
public String saludar(String nombre) {
    return "Hola " + nombre;
}
```

---

## 2. Variables y Tipos de datos

### Tipos primitivos

| Tipo      | Tamaño   | Rango / Descripción                        | Ejemplo                   |
|-----------|----------|--------------------------------------------|---------------------------|
| `byte`    | 8 bits   | -128 a 127                                 | `byte b = 10;`            |
| `short`   | 16 bits  | -32,768 a 32,767                           | `short s = 1000;`         |
| `int`     | 32 bits  | -2,147,483,648 a 2,147,483,647             | `int i = 42;`             |
| `long`    | 64 bits  | Números enteros muy grandes                | `long l = 100000000L;`    |
| `float`   | 32 bits  | Decimales (precisión simple)               | `float f = 3.14f;`        |
| `double`  | 64 bits  | Decimales (precisión doble)                | `double d = 3.14159;`     |
| `char`    | 16 bits  | Un carácter Unicode                        | `char c = 'A';`           |
| `boolean` | 1 bit    | `true` o `false`                           | `boolean b = true;`       |

### Declaración e inicialización

```java
// Declarar sin inicializar
int edad;

// Declarar e inicializar
int edad = 25;

// Variable final (constante)
final double PI = 3.14159;

// Inferencia de tipo (Java 10+)
var nombre = "Juan";   // el compilador infiere que es String
var numero = 42;       // el compilador infiere que es int
```

### Tipo String (no es primitivo, es una clase)

```java
String nombre = "Ana";
String apellido = new String("García");

// Concatenación
String completo = nombre + " " + apellido;

// Métodos más usados de String
nombre.length()              // longitud: 3
nombre.toUpperCase()         // "ANA"
nombre.toLowerCase()         // "ana"
nombre.charAt(0)             // 'A'
nombre.substring(1)          // "na"
nombre.substring(1, 3)       // "na"
nombre.contains("An")        // true
nombre.startsWith("An")      // true
nombre.endsWith("na")        // true
nombre.replace("A", "E")     // "Ena"
nombre.trim()                // elimina espacios al inicio y al final
nombre.split(",")            // divide en array por coma
nombre.isEmpty()             // false
nombre.equals("Ana")         // true (comparar contenido)
nombre.equalsIgnoreCase("ANA") // true
String.valueOf(42)           // convierte int a String: "42"
Integer.parseInt("42")       // convierte String a int: 42

// ⚠️ Nunca comparar Strings con ==, usar .equals()
```

### Casting (conversión de tipos)

```java
// Implícito (widening): de menor a mayor
int i = 100;
long l = i;       // automático
double d = i;     // automático

// Explícito (narrowing): de mayor a menor, puede perder datos
double d = 9.99;
int i = (int) d;  // i = 9 (trunca decimales)

// String a número
int n = Integer.parseInt("42");
double x = Double.parseDouble("3.14");

// Número a String
String s = String.valueOf(42);
String s2 = Integer.toString(42);
```

---

## 3. Operadores

### Aritméticos

```java
int a = 10, b = 3;

a + b   // 13  suma
a - b   // 7   resta
a * b   // 30  multiplicación
a / b   // 3   división entera
a % b   // 1   módulo (resto de la división)

// Incremento / Decremento
a++;    // post-incremento: usa a y luego suma 1
++a;    // pre-incremento:  suma 1 y luego usa a
a--;    // post-decremento
--a;    // pre-decremento
```

### Asignación

```java
a = 5;    // asignación simple
a += 3;   // a = a + 3
a -= 3;   // a = a - 3
a *= 2;   // a = a * 2
a /= 2;   // a = a / 2
a %= 2;   // a = a % 2
```

### Comparación (devuelven boolean)

```java
a == b   // igual
a != b   // distinto
a > b    // mayor que
a < b    // menor que
a >= b   // mayor o igual
a <= b   // menor o igual
```

### Lógicos

```java
true && false   // AND  → false
true || false   // OR   → true
!true           // NOT  → false
```

### Ternario

```java
// condicion ? valor_si_true : valor_si_false
int max = (a > b) ? a : b;
String estado = (edad >= 18) ? "Mayor" : "Menor";
```

---

## 4. Control de flujo

### if / else if / else

```java
int nota = 75;

if (nota >= 90) {
    System.out.println("Sobresaliente");
} else if (nota >= 70) {
    System.out.println("Aprobado");
} else if (nota >= 50) {
    System.out.println("Regular");
} else {
    System.out.println("Desaprobado");
}
```

### switch

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
}

// Switch expression (Java 14+)
String nombre = switch (dia) {
    case 1 -> "Lunes";
    case 2 -> "Martes";
    case 3 -> "Miércoles";
    default -> "Otro";
};
```

### Bucle for

```java
// For clásico
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// For-each (para recorrer arrays y colecciones)
int[] numeros = {10, 20, 30, 40};
for (int num : numeros) {
    System.out.println(num);
}
```

### Bucle while

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### Bucle do-while

```java
// Siempre ejecuta al menos una vez
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

### break y continue

```java
for (int i = 0; i < 10; i++) {
    if (i == 3) continue;  // salta la iteración cuando i == 3
    if (i == 7) break;     // sale del bucle cuando i == 7
    System.out.println(i);
}
```

---

## 5. Arreglos (Arrays)

```java
// Declarar e inicializar
int[] numeros = new int[5];       // array de 5 enteros (valen 0 por defecto)
int[] datos = {1, 2, 3, 4, 5};   // inicialización directa

// Acceder y modificar
datos[0] = 10;       // primer elemento
datos[datos.length - 1];  // último elemento

// Recorrer
for (int i = 0; i < datos.length; i++) {
    System.out.println(datos[i]);
}

// Arrays bidimensionales (matrices)
int[][] matriz = new int[3][3];
int[][] tablero = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println(tablero[1][2]); // 6 (fila 1, columna 2)

// Métodos útiles con Arrays (importar java.util.Arrays)
import java.util.Arrays;

Arrays.sort(datos);                    // ordenar
Arrays.fill(numeros, 0);               // llenar con un valor
int[] copia = Arrays.copyOf(datos, 3); // copiar los primeros 3 elementos
System.out.println(Arrays.toString(datos)); // imprimir array como string
```

---

## 6. Métodos (Funciones)

```java
// Sintaxis: [modificador] [tipo_retorno] nombre(parámetros)
public static int sumar(int a, int b) {
    return a + b;
}

// Método sin retorno
public static void saludar(String nombre) {
    System.out.println("Hola " + nombre);
}

// Método con parámetros variables (varargs)
public static int sumarTodos(int... numeros) {
    int total = 0;
    for (int n : numeros) total += n;
    return total;
}

// Llamadas
int resultado = sumar(3, 4);      // 7
saludar("Ana");
int total = sumarTodos(1, 2, 3, 4, 5);  // 15

// Sobrecarga (overloading): mismo nombre, distintos parámetros
public static double sumar(double a, double b) {
    return a + b;
}
```

---

## 7. Programación Orientada a Objetos

### Clase y Objeto

```java
// Definición de la clase
public class Persona {

    // Atributos (campos)
    private String nombre;
    private int edad;
    public static int totalPersonas = 0;  // atributo de clase (compartido)

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;   // this hace referencia al objeto actual
        this.edad = edad;
        totalPersonas++;
    }

    // Constructor vacío (sin parámetros)
    public Persona() {
        this("Desconocido", 0);  // llama al constructor con parámetros
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) {
        if (edad >= 0) this.edad = edad;
    }

    // Método de instancia
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    // toString (se llama automáticamente al imprimir el objeto)
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}

// Uso
Persona p1 = new Persona("Ana", 25);
Persona p2 = new Persona();

p1.presentarse();
System.out.println(p1.getNombre());
System.out.println(Persona.totalPersonas);  // 2
System.out.println(p1);  // llama a toString()
```

### Modificadores de acceso

| Modificador   | Misma clase | Mismo paquete | Subclase | Cualquier clase |
|---------------|-------------|---------------|----------|-----------------|
| `private`     | ✅           | ❌             | ❌        | ❌               |
| *(sin nada)*  | ✅           | ✅             | ❌        | ❌               |
| `protected`   | ✅           | ✅             | ✅        | ❌               |
| `public`      | ✅           | ✅             | ✅        | ✅               |

---

## 8. Herencia e Interfaces

### Herencia

```java
// Clase padre (superclase)
public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

// Clase hija (subclase) — extiende Animal
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);  // llama al constructor del padre
        this.raza = raza;
    }

    // Sobreescritura de método (override)
    @Override
    public void comer() {
        System.out.println(nombre + " come croquetas.");
    }

    public void ladrar() {
        System.out.println("¡Guau!");
    }
}

// Uso
Perro p = new Perro("Rex", 3, "Labrador");
p.comer();     // método sobreescrito
p.ladrar();    // método propio
Animal a = p;  // polimorfismo: un Perro es un Animal
```

### Clases abstractas

```java
// No se puede instanciar directamente
public abstract class Figura {
    // Método abstracto: sin implementación, DEBE ser implementado por las subclases
    public abstract double calcularArea();

    // Método concreto: tiene implementación
    public void describir() {
        System.out.println("Área: " + calcularArea());
    }
}

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) { this.radio = radio; }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

### Interfaces

```java
// Contrato que una clase debe cumplir
public interface Volador {
    // Todos los métodos son públicos y abstractos por defecto
    void volar();
    void aterrizar();

    // Método con implementación por defecto (Java 8+)
    default void planear() {
        System.out.println("Planeando...");
    }
}

public interface Nadador {
    void nadar();
}

// Una clase puede implementar múltiples interfaces
public class Pato extends Animal implements Volador, Nadador {
    public Pato(String nombre) { super(nombre, 1); }

    @Override
    public void volar() { System.out.println("El pato vuela."); }

    @Override
    public void aterrizar() { System.out.println("El pato aterriza."); }

    @Override
    public void nadar() { System.out.println("El pato nada."); }
}
```

---

## 9. Excepciones

```java
// try-catch-finally
try {
    int resultado = 10 / 0;          // lanza ArithmeticException
    String s = null;
    s.length();                       // lanza NullPointerException
} catch (ArithmeticException e) {
    System.out.println("Error aritmético: " + e.getMessage());
} catch (NullPointerException e) {
    System.out.println("Objeto nulo: " + e.getMessage());
} catch (Exception e) {
    // Captura cualquier excepción no capturada arriba
    System.out.println("Error genérico: " + e.getMessage());
} finally {
    // Se ejecuta SIEMPRE, haya o no excepción
    System.out.println("Bloque finally ejecutado.");
}

// Lanzar una excepción manualmente
public void setEdad(int edad) {
    if (edad < 0) {
        throw new IllegalArgumentException("La edad no puede ser negativa.");
    }
    this.edad = edad;
}

// Declarar que un método puede lanzar excepción (checked)
public void leerArchivo(String ruta) throws IOException {
    // código que puede fallar
}

// Crear excepción personalizada
public class SaldoInsuficienteException extends Exception {
    private double montoFaltante;

    public SaldoInsuficienteException(double montoFaltante) {
        super("Saldo insuficiente. Faltan: $" + montoFaltante);
        this.montoFaltante = montoFaltante;
    }

    public double getMontoFaltante() { return montoFaltante; }
}
```

### Excepciones más comunes

| Excepción                      | Causa típica                              |
|-------------------------------|------------------------------------------|
| `NullPointerException`        | Usar un objeto que es `null`              |
| `ArrayIndexOutOfBoundsException` | Acceder a un índice inválido del array  |
| `ClassCastException`          | Conversión de tipos incompatibles         |
| `NumberFormatException`       | Convertir un String no numérico a número  |
| `ArithmeticException`         | División por cero                         |
| `StackOverflowError`          | Recursión infinita                        |
| `IOException`                 | Problemas al leer/escribir archivos       |
| `FileNotFoundException`       | El archivo no existe                      |

---

## 10. Generics

```java
// Clase genérica
public class Caja<T> {
    private T contenido;

    public Caja(T contenido) { this.contenido = contenido; }
    public T getContenido() { return contenido; }
}

// Uso
Caja<String> cajaTexto = new Caja<>("Hola");
Caja<Integer> cajaNumero = new Caja<>(42);

// Método genérico
public static <T> void imprimir(T elemento) {
    System.out.println(elemento);
}

// Bounded generics (limitar tipos)
public static <T extends Number> double sumar(T a, T b) {
    return a.doubleValue() + b.doubleValue();
}
```

---

## 11. Librería java.lang

> Se importa automáticamente, no hace falta `import`.

### Math

```java
Math.abs(-5)          // 5       — valor absoluto
Math.max(3, 7)        // 7       — máximo
Math.min(3, 7)        // 3       — mínimo
Math.pow(2, 10)       // 1024.0  — potencia
Math.sqrt(16)         // 4.0     — raíz cuadrada
Math.cbrt(27)         // 3.0     — raíz cúbica
Math.round(3.7)       // 4       — redondear
Math.floor(3.9)       // 3.0     — redondear hacia abajo
Math.ceil(3.1)        // 4.0     — redondear hacia arriba
Math.random()         // 0.0 a 1.0 — número aleatorio
Math.PI               // 3.14159...
Math.E                // 2.71828...
Math.log(Math.E)      // 1.0     — logaritmo natural
Math.log10(100)       // 2.0     — logaritmo base 10
Math.sin(Math.PI/2)   // 1.0     — seno
Math.cos(0)           // 1.0     — coseno
```

### Integer, Double, etc. (Wrapper classes)

```java
// Conversiones
Integer.parseInt("42")         // String → int
Integer.toString(42)           // int → String
Integer.valueOf(42)            // int → Integer (objeto)
Integer.MAX_VALUE              // 2147483647
Integer.MIN_VALUE              // -2147483648
Integer.toBinaryString(10)     // "1010"
Integer.toHexString(255)       // "ff"

Double.parseDouble("3.14")
Double.isNaN(Double.NaN)       // true
Double.isInfinite(1.0/0.0)     // true

// Autoboxing / Unboxing (conversión automática)
Integer obj = 42;     // autoboxing:   int → Integer
int primitivo = obj;  // unboxing:     Integer → int
```

### StringBuilder

```java
// Más eficiente que String para concatenaciones en bucles
StringBuilder sb = new StringBuilder();

sb.append("Hola");
sb.append(" ");
sb.append("Mundo");
sb.insert(0, "¡");       // insertar en posición
sb.delete(0, 1);         // eliminar rango
sb.replace(0, 4, "Hey"); // reemplazar rango
sb.reverse();            // invertir
sb.toString();           // convertir a String

// StringBuffer es igual pero thread-safe (más lento)
```

### System

```java
System.out.println("Texto");        // imprimir con salto de línea
System.out.print("Texto");          // imprimir sin salto
System.out.printf("%.2f%n", 3.14);  // formato estilo C
System.err.println("Error!");       // imprimir en stderr

System.currentTimeMillis()          // tiempo actual en milisegundos
System.nanoTime()                   // tiempo en nanosegundos (para medir performance)
System.exit(0)                      // terminar el programa (0 = éxito)
System.gc()                         // sugerir al GC que limpie memoria
System.getenv("PATH")               // leer variable de entorno
System.getProperty("java.version")  // leer propiedad del sistema
```

---

## 12. Librería java.util

### Scanner (leer entrada del usuario)

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

System.out.print("Ingresá tu nombre: ");
String nombre = sc.nextLine();    // lee una línea completa

System.out.print("Ingresá tu edad: ");
int edad = sc.nextInt();          // lee un entero
sc.nextLine();                    // limpiar el buffer después de nextInt()

double salario = sc.nextDouble(); // lee un double
boolean valor = sc.nextBoolean(); // lee true/false

sc.close(); // cerrar al terminar
```

### ArrayList

```java
import java.util.ArrayList;
import java.util.Collections;

ArrayList<String> lista = new ArrayList<>();

lista.add("Ana");                  // agregar al final
lista.add(0, "Beto");              // agregar en posición
lista.get(0);                      // obtener elemento
lista.set(0, "Carlos");            // modificar elemento
lista.remove(0);                   // eliminar por índice
lista.remove("Ana");               // eliminar por valor
lista.size();                      // cantidad de elementos
lista.contains("Ana");             // true/false
lista.indexOf("Ana");              // índice del elemento
lista.isEmpty();                   // true/false
lista.clear();                     // vaciar la lista

// Recorrer
for (String s : lista) {
    System.out.println(s);
}

// Ordenar
Collections.sort(lista);            // orden alfabético/natural
Collections.reverse(lista);         // invertir
Collections.shuffle(lista);         // mezclar aleatoriamente
Collections.min(lista);             // mínimo
Collections.max(lista);             // máximo
```

### LinkedList

```java
import java.util.LinkedList;

// Funciona como lista doblemente enlazada y como pila/cola
LinkedList<Integer> ll = new LinkedList<>();

ll.addFirst(1);      // agregar al inicio
ll.addLast(5);       // agregar al final
ll.getFirst();       // ver el primero
ll.getLast();        // ver el último
ll.removeFirst();    // quitar el primero
ll.removeLast();     // quitar el último

// Como cola (FIFO)
ll.offer(3);         // agregar al final
ll.poll();           // quitar del frente

// Como pila (LIFO)
ll.push(3);          // agregar al inicio
ll.pop();            // quitar del inicio
```

### HashMap

```java
import java.util.HashMap;
import java.util.Map;

HashMap<String, Integer> mapa = new HashMap<>();

mapa.put("Ana", 25);           // agregar / actualizar
mapa.get("Ana");               // 25
mapa.getOrDefault("X", 0);    // devuelve 0 si no existe la clave
mapa.containsKey("Ana");       // true
mapa.containsValue(25);        // true
mapa.remove("Ana");            // eliminar
mapa.size();                   // cantidad de entradas
mapa.isEmpty();                // true/false

// Recorrer
for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
    System.out.println(entrada.getKey() + ": " + entrada.getValue());
}

// Solo claves o solo valores
for (String clave : mapa.keySet()) { ... }
for (int valor : mapa.values()) { ... }
```

### HashSet

```java
import java.util.HashSet;

// No permite duplicados, no tiene orden
HashSet<String> set = new HashSet<>();

set.add("Ana");
set.add("Ana");    // ignorado (duplicado)
set.contains("Ana");   // true
set.remove("Ana");
set.size();

// TreeSet: como HashSet pero ordenado
import java.util.TreeSet;
TreeSet<Integer> ordenado = new TreeSet<>();
```

### Stack

```java
import java.util.Stack;

Stack<Integer> pila = new Stack<>();

pila.push(1);     // agregar arriba
pila.push(2);
pila.peek();      // ver el tope sin sacar: 2
pila.pop();       // sacar el tope: 2
pila.isEmpty();   // false
```

### Queue (con LinkedList o PriorityQueue)

```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

// Cola normal (FIFO)
Queue<String> cola = new LinkedList<>();
cola.offer("primero");
cola.offer("segundo");
cola.peek();    // ver el frente sin sacar
cola.poll();    // sacar del frente

// Cola de prioridad (el menor elemento va primero)
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(1);
pq.offer(3);
pq.poll();   // 1 (el menor)
```

### Collections y Arrays utilitarios

```java
import java.util.Collections;
import java.util.Arrays;

// Collections
Collections.sort(lista);
Collections.sort(lista, Collections.reverseOrder());
Collections.unmodifiableList(lista);   // lista inmutable
Collections.singletonList("único");    // lista de un elemento
Collections.nCopies(5, "hola");        // lista con 5 repeticiones de "hola"
Collections.frequency(lista, "Ana");   // cuántas veces aparece

// Arrays
Arrays.sort(array);
Arrays.binarySearch(array, 5);         // buscar (array debe estar ordenado)
Arrays.fill(array, 0);
Arrays.copyOf(array, nuevoTamaño);
Arrays.copyOfRange(array, desde, hasta);
Arrays.equals(array1, array2);
Arrays.asList(1, 2, 3);               // convertir a lista
```

### Date y Calendar (clásico)

```java
import java.util.Date;
import java.util.Calendar;

Date hoy = new Date();
System.out.println(hoy);

Calendar cal = Calendar.getInstance();
cal.get(Calendar.YEAR);           // año
cal.get(Calendar.MONTH);          // mes (0 = enero)
cal.get(Calendar.DAY_OF_MONTH);   // día
cal.get(Calendar.HOUR_OF_DAY);    // hora (24h)
cal.get(Calendar.MINUTE);         // minutos
```

### LocalDate, LocalTime, LocalDateTime (moderno, Java 8+)

```java
import java.time.*;
import java.time.format.DateTimeFormatter;

LocalDate hoy = LocalDate.now();
LocalDate fecha = LocalDate.of(2024, 3, 15);

hoy.getYear();         // año
hoy.getMonthValue();   // mes (1-12)
hoy.getDayOfMonth();   // día
hoy.getDayOfWeek();    // MONDAY, TUESDAY, etc.
hoy.plusDays(10);      // sumar días
hoy.minusMonths(2);    // restar meses
hoy.isBefore(fecha);   // comparar

LocalTime ahora = LocalTime.now();
LocalDateTime dt = LocalDateTime.now();

// Formatear
DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String texto = hoy.format(formato);        // "15/03/2024"
LocalDate parsed = LocalDate.parse("15/03/2024", formato);
```

### Random

```java
import java.util.Random;

Random rand = new Random();

rand.nextInt(10);        // entero entre 0 y 9
rand.nextInt(50) + 1;   // entero entre 1 y 50
rand.nextDouble();       // double entre 0.0 y 1.0
rand.nextBoolean();      // true o false
rand.nextFloat();        // float entre 0.0 y 1.0
```

---

## 13. Librería java.io y java.nio

### Leer y escribir archivos (clásico con java.io)

```java
import java.io.*;

// Escribir texto en un archivo
try (FileWriter fw = new FileWriter("archivo.txt");
     BufferedWriter bw = new BufferedWriter(fw)) {
    bw.write("Primera línea");
    bw.newLine();
    bw.write("Segunda línea");
} catch (IOException e) {
    e.printStackTrace();
}

// Leer texto de un archivo
try (FileReader fr = new FileReader("archivo.txt");
     BufferedReader br = new BufferedReader(fr)) {
    String linea;
    while ((linea = br.readLine()) != null) {
        System.out.println(linea);
    }
} catch (IOException e) {
    e.printStackTrace();
}

// Escribir con PrintWriter (más cómodo)
try (PrintWriter pw = new PrintWriter(new FileWriter("salida.txt"))) {
    pw.println("Línea 1");
    pw.printf("Valor: %d%n", 42);
} catch (IOException e) {
    e.printStackTrace();
}
```

### Archivos con java.nio (moderno, Java 7+)

```java
import java.nio.file.*;
import java.util.List;

Path ruta = Paths.get("archivo.txt");

// Leer todo el contenido
String contenido = Files.readString(ruta);         // Java 11+
List<String> lineas = Files.readAllLines(ruta);    // lista de líneas

// Escribir
Files.writeString(ruta, "Contenido nuevo");        // Java 11+
Files.write(ruta, lineas);                         // escribe lista de líneas

// Operaciones con archivos
Files.exists(ruta)                    // ¿existe?
Files.createFile(ruta)                // crear archivo
Files.createDirectory(Paths.get("carpeta"))  // crear directorio
Files.copy(origen, destino)           // copiar
Files.move(origen, destino)           // mover / renombrar
Files.delete(ruta)                    // eliminar

// Listar archivos de un directorio
Files.list(Paths.get(".")).forEach(System.out::println);
```

---

## 14. Librería java.net

### HTTP con HttpURLConnection (clásico)

```java
import java.net.*;
import java.io.*;

URL url = new URL("https://api.ejemplo.com/datos");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");

int codigo = conn.getResponseCode(); // 200, 404, etc.

BufferedReader in = new BufferedReader(
    new InputStreamReader(conn.getInputStream())
);
String linea;
StringBuilder respuesta = new StringBuilder();
while ((linea = in.readLine()) != null) {
    respuesta.append(linea);
}
in.close();
System.out.println(respuesta.toString());
```

### HttpClient (moderno, Java 11+)

```java
import java.net.http.*;
import java.net.URI;

HttpClient cliente = HttpClient.newHttpClient();

HttpRequest peticion = HttpRequest.newBuilder()
    .uri(URI.create("https://api.ejemplo.com/datos"))
    .header("Content-Type", "application/json")
    .GET()
    .build();

HttpResponse<String> respuesta = cliente.send(peticion,
    HttpResponse.BodyHandlers.ofString());

System.out.println(respuesta.statusCode());  // 200
System.out.println(respuesta.body());         // JSON
```

---

## 15. Librería java.math

```java
import java.math.*;

// BigInteger: enteros de tamaño arbitrario (para criptografía, etc.)
BigInteger a = new BigInteger("99999999999999999999");
BigInteger b = BigInteger.valueOf(12345);

a.add(b)
a.subtract(b)
a.multiply(b)
a.divide(b)
a.mod(b)
a.pow(3)
a.gcd(b)          // máximo común divisor
a.isProbablePrime(5)  // test de primalidad

// BigDecimal: decimales de precisión arbitraria (para dinero, finanzas)
BigDecimal x = new BigDecimal("3.14159265358979323846");
BigDecimal y = new BigDecimal("1.23456789");

x.add(y)
x.subtract(y)
x.multiply(y)
x.divide(y, 10, RoundingMode.HALF_UP)  // 10 decimales, redondeo
x.setScale(2, RoundingMode.HALF_UP)     // redondear a 2 decimales
x.compareTo(y)    // -1, 0, o 1

// Modos de redondeo
RoundingMode.UP          // siempre hacia arriba
RoundingMode.DOWN        // siempre hacia abajo
RoundingMode.CEILING     // hacia el número positivo mayor
RoundingMode.FLOOR       // hacia el número negativo mayor
RoundingMode.HALF_UP     // redondeo bancario estándar (0.5 → sube)
RoundingMode.HALF_EVEN   // bancario (0.5 → al par más cercano)
```

---

## 16. Lambdas y Streams (Java 8+)

### Lambdas

```java
import java.util.function.*;

// Sintaxis: (parámetros) -> expresión
// o:        (parámetros) -> { bloque de código }

// Función sin parámetros
Runnable r = () -> System.out.println("Hola");
r.run();

// Función con un parámetro
Consumer<String> imprimir = s -> System.out.println(s);
imprimir.accept("Hola");

// Función con dos parámetros
BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;
int resultado = suma.apply(3, 4);  // 7

// Función que devuelve algo
Function<String, Integer> longitud = s -> s.length();
Predicate<Integer> esPar = n -> n % 2 == 0;
Supplier<String> proveedor = () -> "Texto fijo";

// Referencia a métodos (sintaxis más corta)
Consumer<String> imp2 = System.out::println;   // referencia a método de instancia
Function<String, Integer> len = String::length; // referencia a método de instancia
```

### Streams

```java
import java.util.stream.*;
import java.util.List;

List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// filter: filtrar elementos
List<Integer> pares = numeros.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());  // [2, 4, 6, 8, 10]

// map: transformar cada elemento
List<Integer> cuadrados = numeros.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());

// reduce: acumular en un solo valor
int suma = numeros.stream()
    .reduce(0, (a, b) -> a + b);  // 55

// forEach: ejecutar acción por elemento
numeros.stream().forEach(System.out::println);

// sorted: ordenar
List<Integer> ordenados = numeros.stream()
    .sorted()
    .collect(Collectors.toList());

// distinct: eliminar duplicados
// limit: tomar solo N elementos
// skip: saltar N elementos

List<String> palabras = List.of("hola", "mundo", "java");

// Operaciones sobre Strings
String resultado = palabras.stream()
    .map(String::toUpperCase)
    .filter(s -> s.length() > 4)
    .sorted()
    .collect(Collectors.joining(", "));  // "MUNDO, JAVA" (sin "HOLA" si tiene 4)

// Estadísticas
OptionalInt max = numeros.stream().mapToInt(Integer::intValue).max();
double promedio = numeros.stream().mapToInt(Integer::intValue).average().getAsDouble();
long count = numeros.stream().filter(n -> n > 5).count();

// anyMatch, allMatch, noneMatch
boolean alguno = numeros.stream().anyMatch(n -> n > 8);    // true
boolean todos = numeros.stream().allMatch(n -> n > 0);     // true
boolean ninguno = numeros.stream().noneMatch(n -> n < 0);  // true
```

---

## 17. Palabras reservadas

```
abstract    assert      boolean     break       byte
case        catch       char        class       const
continue    default     do          double      else
enum        extends     final       finally     float
for         goto        if          implements  import
instanceof  int         interface   long        native
new         package     private     protected   public
return      short       static      strictfp    super
switch      synchronized this       throw       throws
transient   try         void        volatile    while
var (Java 10+, no es reservada técnicamente pero es especial)
```

---

## 18. Convenciones de nomenclatura

| Elemento          | Convención            | Ejemplo                        |
|-------------------|-----------------------|--------------------------------|
| Clase             | PascalCase            | `MiClase`, `ListaDeUsuarios`   |
| Interfaz          | PascalCase            | `Serializable`, `Runnable`     |
| Método            | camelCase             | `calcularTotal()`, `getNombre()` |
| Variable          | camelCase             | `nombreUsuario`, `edadMaxima`  |
| Constante         | SCREAMING_SNAKE_CASE  | `MAX_VALOR`, `TASA_IVA`        |
| Paquete           | minúsculas con puntos | `com.empresa.proyecto`         |
| Parámetro         | camelCase             | `String nombreCompleto`        |

---

## 💡 Tips finales

- Siempre cerrá recursos (archivos, conexiones) con **try-with-resources** (`try (Resource r = ...)`)
- Usá **`StringBuilder`** en lugar de concatenar Strings en bucles
- Preferí **`equals()`** a `==` para comparar objetos
- Usá **`BigDecimal`** para cálculos monetarios, nunca `double` o `float`
- Las colecciones del paquete `java.util` son las más usadas: ArrayList, HashMap, HashSet
- Los **Streams** de Java 8 hacen el código más limpio y expresivo
- Compilá siempre con `-g` si vas a usar `jdb` para debuggear

---

*Última actualización: 2026 | Basado en Java 8 — Java 21*