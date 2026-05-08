import java.util.ArrayList;
import java.util.List;

/**
 * ╔══════════════════════════════════════════════════════════════════╗
 * ║           MAIN DE PRUEBA — Ejercicios Java POO                  ║
 * ║  Ejecutá esta clase para verificar tus implementaciones.        ║
 * ║  Cada sección imprime ✅ si el resultado es correcto            ║
 * ║  o ❌ con el valor obtenido si algo falla.                      ║
 * ╚══════════════════════════════════════════════════════════════════╝
 */
public class Main {

    // ── Contador global de pruebas ────────────────────────────────────────────
    private static int totalPruebas  = 0;
    private static int pruebasOk     = 0;
    private static int pruebasFail   = 0;

    // ═════════════════════════════════════════════════════════════════════════
    // MÉTODO PRINCIPAL
    // ═════════════════════════════════════════════════════════════════════════
    public static void main(String[] args) {

        printEncabezado("INICIO DE PRUEBAS");

        probarRectangulo();
        probarCuentaBancaria();
        probarPuntoYCirculo();
        probarBiblioteca();
        probarFiguraYTriangulo();
        probarPila();
        probarProcesadorEstudiantes();

        imprimirResumenFinal();
    }

    // ═════════════════════════════════════════════════════════════════════════
    // EJERCICIO 1a — Rectangulo
    // ═════════════════════════════════════════════════════════════════════════
    static void probarRectangulo() {
        printSeccion("EJERCICIO 1a — Rectangulo");

        // ── Constructor por defecto ───────────────────────────────────────────
        Rectangulo r1 = new Rectangulo();
        check("Constructor por defecto: ancho = 1.0",    r1.getAncho() == 1.0);
        check("Constructor por defecto: alto  = 1.0",    r1.getAlto()  == 1.0);

        // ── Constructor con parámetros ────────────────────────────────────────
        Rectangulo r2 = new Rectangulo(5.0, 3.0);
        check("Constructor (5, 3): ancho = 5.0",         r2.getAncho() == 5.0);
        check("Constructor (5, 3): alto  = 3.0",         r2.getAlto()  == 3.0);

        // ── Constructor con valores inválidos → deben quedar en 1.0 ──────────
        Rectangulo r3 = new Rectangulo(-2.0, 0.0);
        check("Constructor negativo: ancho = 1.0",       r3.getAncho() == 1.0);
        check("Constructor cero:     alto  = 1.0",       r3.getAlto()  == 1.0);

        // ── setAncho / setAlto ────────────────────────────────────────────────
        r2.setAncho(10.0);
        check("setAncho(10.0) → ancho = 10.0",           r2.getAncho() == 10.0);
        r2.setAncho(-5.0);
        check("setAncho(-5.0) → ancho sigue en 10.0",    r2.getAncho() == 10.0);

        // ── Área y Perímetro ──────────────────────────────────────────────────
        Rectangulo r4 = new Rectangulo(4.0, 3.0);
        check("Área (4x3) = 12.0",                       r4.calcularArea() == 12.0);
        check("Perímetro (4x3) = 14.0",                  r4.calcularPerimetro() == 14.0);

        // ── esCuadrado ────────────────────────────────────────────────────────
        Rectangulo cuadrado = new Rectangulo(5.0, 5.0);
        check("esCuadrado (5x5) = true",                 cuadrado.esCuadrado());
        check("esCuadrado (4x3) = false",                !r4.esCuadrado());

        // ── toString ──────────────────────────────────────────────────────────
        String str = r4.toString();
        check("toString contiene 'Rectangulo'",           str != null && str.contains("Rectangulo"));
        check("toString contiene el area '12'",           str != null && str.contains("12"));

        // ── DESAFÍO: cabeDentro ───────────────────────────────────────────────
        Rectangulo grande  = new Rectangulo(10.0, 10.0);
        Rectangulo pequenio = new Rectangulo(3.0, 3.0);
        check("DESAFÍO: (3x3) cabe dentro de (10x10)",   pequenio.cabeDentro(grande));
        check("DESAFÍO: (10x10) NO cabe dentro de (3x3)",!grande.cabeDentro(pequenio));

        // ── DESAFÍO: escalar ──────────────────────────────────────────────────
        Rectangulo re = new Rectangulo(2.0, 3.0);
        re.escalar(2.0);
        check("DESAFÍO: escalar x2 → ancho = 4.0",       re.getAncho() == 4.0);
        check("DESAFÍO: escalar x2 → alto  = 6.0",       re.getAlto()  == 6.0);
    }

    // ═════════════════════════════════════════════════════════════════════════
    // EJERCICIO 1b — CuentaBancaria
    // ═════════════════════════════════════════════════════════════════════════
    static void probarCuentaBancaria() {
        printSeccion("EJERCICIO 1b — CuentaBancaria");

        // ── Constructores ─────────────────────────────────────────────────────
        CuentaBancaria c1 = new CuentaBancaria("Ana", "001");
        check("Constructor base: saldo = 0.0",            c1.getSaldo() == 0.0);

        CuentaBancaria c2 = new CuentaBancaria("Luis", "002", 1000.0);
        check("Constructor con saldo: saldo = 1000.0",    c2.getSaldo() == 1000.0);

        CuentaBancaria c3 = new CuentaBancaria("Eva", "003", -500.0);
        check("Constructor saldo negativo: saldo = 0.0",  c3.getSaldo() == 0.0);

        // ── Depositar ─────────────────────────────────────────────────────────
        c1.depositar(500.0);
        check("Depositar 500 → saldo = 500.0",            c1.getSaldo() == 500.0);
        check("Depositar → transacciones = 1",            c1.getCantidadTransacciones() == 1);

        c1.depositar(-100.0);
        check("Depositar negativo no cambia saldo",       c1.getSaldo() == 500.0);
        check("Depositar negativo no cuenta transacción", c1.getCantidadTransacciones() == 1);

        // ── Extraer ───────────────────────────────────────────────────────────
        boolean ok = c2.extraer(300.0);
        check("Extraer 300 → true",                       ok);
        check("Extraer 300 → saldo = 700.0",              c2.getSaldo() == 700.0);

        boolean fallo = c2.extraer(9999.0);
        check("Extraer más del saldo → false",            !fallo);
        check("Saldo no cambia tras extracción fallida",  c2.getSaldo() == 700.0);

        // ── Transferir ────────────────────────────────────────────────────────
        CuentaBancaria origen  = new CuentaBancaria("A", "X", 500.0);
        CuentaBancaria destino = new CuentaBancaria("B", "Y");
        boolean tr = origen.transferir(destino, 200.0);
        check("Transferir 200 → true",                    tr);
        check("Origen tras transferencia = 300.0",        origen.getSaldo()  == 300.0);
        check("Destino tras transferencia = 200.0",       destino.getSaldo() == 200.0);

        boolean trFail = origen.transferir(destino, 9999.0);
        check("Transferencia imposible → false",          !trFail);

        // ── tieneSaldo y toString ─────────────────────────────────────────────
        check("tieneSaldo() true cuando saldo > 0",       origen.tieneSaldo());
        CuentaBancaria vacia = new CuentaBancaria("X", "Z");
        check("tieneSaldo() false cuando saldo = 0",      !vacia.tieneSaldo());

        String str = origen.toString();
        check("toString no es null ni vacío",             str != null && !str.isEmpty());
    }

    // ═════════════════════════════════════════════════════════════════════════
    // EJERCICIO 2 — Punto y Círculo
    // ═════════════════════════════════════════════════════════════════════════
    static void probarPuntoYCirculo() {
        printSeccion("EJERCICIO 2 — Punto y Círculo");

        // ── Punto ─────────────────────────────────────────────────────────────
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 4);

        double dist = p1.distanciaA(p2);
        check("Distancia (0,0)→(3,4) = 5.0",             Math.abs(dist - 5.0) < 0.001);

        p1.moverA(1, 1);
        check("moverA(1,1) → x = 1.0",                   p1.getX() == 1.0);
        check("moverA(1,1) → y = 1.0",                   p1.getY() == 1.0);

        String strPunto = p2.toString();
        check("Punto.toString contiene coordenadas",      strPunto != null && strPunto.contains("3") && strPunto.contains("4"));

        // ── Círculo ───────────────────────────────────────────────────────────
        Circulo c = new Circulo();
        check("Circulo default: radio = 1.0",             c.getRadio() == 1.0);
        check("Circulo default: centro en (0,0)",         c.getCentro().getX() == 0 && c.getCentro().getY() == 0);

        Circulo c2 = new Circulo(2, 3, 5);
        check("Circulo(2,3,5): radio = 5.0",              c2.getRadio() == 5.0);

        Circulo cNeg = new Circulo(0, 0, -3);
        check("Circulo radio negativo → radio = 1.0",     cNeg.getRadio() == 1.0);

        double area = c2.calcularArea();
        check("Área circulo r=5 ≈ 78.54",                 Math.abs(area - 78.5398) < 0.01);

        double circ = c2.calcularCircunferencia();
        check("Circunferencia r=5 ≈ 31.41",               Math.abs(circ - 31.4159) < 0.01);

        // ── contienePunto ─────────────────────────────────────────────────────
        Circulo circulo = new Circulo(0, 0, 10);
        Punto dentro  = new Punto(3, 4);   // distancia 5 < 10
        Punto afuera  = new Punto(8, 8);   // distancia ≈ 11.3 > 10
        check("Punto (3,4) está DENTRO de círculo r=10",  circulo.contienePunto(dentro));
        check("Punto (8,8) está FUERA de círculo r=10",   !circulo.contienePunto(afuera));

        // ── superposición ─────────────────────────────────────────────────────
        Circulo ca = new Circulo(0, 0, 5);
        Circulo cb = new Circulo(4, 0, 5);  // dist entre centros = 4 < 5+5
        Circulo cc = new Circulo(20, 0, 3); // dist > 5+3
        check("Círculos superpuestos → true",             ca.seSuperponeContra(cb));
        check("Círculos separados → false",               !ca.seSuperponeContra(cc));

        // ── DESAFÍO: elMasGrande ──────────────────────────────────────────────
        Circulo chico = new Circulo(0, 0, 2);
        Circulo grande = new Circulo(0, 0, 8);
        check("DESAFÍO: elMasGrande devuelve el de radio 8", grande.elMasGrande(chico).getRadio() == 8.0);
    }

    // ═════════════════════════════════════════════════════════════════════════
    // EJERCICIO 3 — Biblioteca
    // ═════════════════════════════════════════════════════════════════════════
    static void probarBiblioteca() {
        printSeccion("EJERCICIO 3 — Biblioteca");

        Biblioteca bib = new Biblioteca();
        check("Biblioteca vacía: cantidadLibros = 0",     bib.cantidadLibros() == 0);

        Biblioteca.Libro l1 = new Biblioteca.Libro("El Quijote",    "Cervantes",  1605);
        Biblioteca.Libro l2 = new Biblioteca.Libro("Cien años",     "García M.",  1967);
        Biblioteca.Libro l3 = new Biblioteca.Libro("El Aleph",      "Borges",     1949);
        Biblioteca.Libro l4 = new Biblioteca.Libro("Ficciones",     "Borges",     1944);

        bib.agregarLibro(l1);
        bib.agregarLibro(l2);
        bib.agregarLibro(l3);
        bib.agregarLibro(l4);
        bib.agregarLibro(null);  // no debería agregarse

        check("Agregar 4 libros + null → cantidad = 4",  bib.cantidadLibros() == 4);

        // ── Búsquedas ─────────────────────────────────────────────────────────
        Biblioteca.Libro encontrado = bib.buscarPorTitulo("El Aleph");
        check("buscarPorTitulo: encontrado no es null",   encontrado != null);
        check("buscarPorTitulo: autor correcto",          encontrado != null && encontrado.getAutor().equals("Borges"));

        Biblioteca.Libro noExiste = bib.buscarPorTitulo("Harry Potter");
        check("buscarPorTitulo inexistente → null",       noExiste == null);

        ArrayList<Biblioteca.Libro> deBorges = bib.buscarPorAutor("Borges");
        check("buscarPorAutor('Borges') → 2 libros",     deBorges != null && deBorges.size() == 2);

        ArrayList<Biblioteca.Libro> sinAutor = bib.buscarPorAutor("Tolkien");
        check("buscarPorAutor inexistente → lista vacía", sinAutor != null && sinAutor.isEmpty());

        // ── Préstamos ─────────────────────────────────────────────────────────
        boolean prestado = bib.prestarLibro("El Quijote");
        check("prestarLibro existente → true",            prestado);
        check("libro queda marcado como prestado",        l1.isPrestado());

        boolean prestadoDosVeces = bib.prestarLibro("El Quijote");
        check("prestarLibro ya prestado → false",         !prestadoDosVeces);

        boolean devuelto = bib.devolverLibro("El Quijote");
        check("devolverLibro → true",                     devuelto);
        check("libro queda disponible tras devolución",   !l1.isPrestado());

        // ── Eliminar ──────────────────────────────────────────────────────────
        boolean eliminado = bib.eliminarLibro("Cien años");
        check("eliminarLibro existente → true",           eliminado);
        check("cantidad tras eliminar = 3",               bib.cantidadLibros() == 3);

        boolean noEliminado = bib.eliminarLibro("Libro Fantasma");
        check("eliminarLibro inexistente → false",        !noEliminado);

        // ── DESAFÍO ───────────────────────────────────────────────────────────
        int cantidad = bib.cantidadPublicadosDespuesDe(1950);
        check("DESAFÍO: publicados después de 1950 = 1 (solo Cien años fue eliminado, queda Ficciones 1944 y El Aleph 1949... ninguno)",
              cantidad == 0);
    }

    // ═════════════════════════════════════════════════════════════════════════
    // EJERCICIO 4 — Figura e Triángulo
    // ═════════════════════════════════════════════════════════════════════════
    static void probarFiguraYTriangulo() {
        printSeccion("EJERCICIO 4 — Figura, Triángulo y FabricaDeFiguras");

        // ── Triángulo válido ──────────────────────────────────────────────────
        Triangulo t1 = new Triangulo(3, 4, 5);
        check("Triángulo (3,4,5): perímetro = 12.0",      t1.calcularPerimetro() == 12.0);

        double areaEsperada = 6.0; // triángulo rectángulo 3-4-5
        check("Triángulo (3,4,5): área ≈ 6.0",            Math.abs(t1.calcularArea() - areaEsperada) < 0.001);
        check("Triángulo (3,4,5): tipo = Escaleno",        t1.getTipo().equals("Escaleno"));
        check("Triángulo: getNombre = 'Triángulo'",        t1.getNombre() != null && !t1.getNombre().isEmpty());

        // ── Triángulo equilátero ──────────────────────────────────────────────
        Triangulo equilatero = new Triangulo(5, 5, 5);
        check("Triángulo equilátero: tipo = Equilátero",   equilatero.getTipo().equals("Equilátero"));

        // ── Triángulo isósceles ───────────────────────────────────────────────
        Triangulo isosceles = new Triangulo(5, 5, 3);
        check("Triángulo isósceles: tipo = Isósceles",     isosceles.getTipo().equals("Isósceles"));

        // ── Triángulo inválido → lados por defecto ────────────────────────────
        Triangulo invalido = new Triangulo(1, 1, 100); // 1+1 < 100 → inválido
        check("Triángulo inválido → lados = 3.0",          invalido.getLadoA() == 3.0);

        // ── FabricaDeFiguras ──────────────────────────────────────────────────
        int totalInicial = FabricaDeFiguras.getTotalFigurasCreadas();
        Triangulo tf1 = FabricaDeFiguras.crearTriangulo(3, 4, 5);
        Triangulo tf2 = FabricaDeFiguras.crearTriangulo(5, 5, 5);
        check("Fábrica: crearTriangulo no devuelve null",  tf1 != null && tf2 != null);
        check("Fábrica: contador incrementado en 2",       FabricaDeFiguras.getTotalFigurasCreadas() == totalInicial + 2);

        // ── DESAFÍO: crearEquilatero ──────────────────────────────────────────
        Triangulo eq = FabricaDeFiguras.crearEquilatero(6);
        check("DESAFÍO: crearEquilatero(6) → todos lados = 6", eq != null && eq.getLadoA() == 6.0 && eq.getLadoB() == 6.0);

        // ── Polimorfismo con interfaz Figura ──────────────────────────────────
        Figura figura = new Triangulo(3, 4, 5);
        check("Polimorfismo: Figura.calcularArea() ≈ 6",   Math.abs(figura.calcularArea() - 6.0) < 0.001);
        String descripcion = figura.describir();
        check("Figura.describir() no es null",             descripcion != null && !descripcion.isEmpty());
    }

    // ═════════════════════════════════════════════════════════════════════════
    // EJERCICIO 5 — Pila
    // ═════════════════════════════════════════════════════════════════════════
    static void probarPila() {
        printSeccion("EJERCICIO 5 — Pila (con excepciones)");

        Pila<Integer> pila = new Pila<>();
        check("Pila nueva está vacía",                     pila.estaVacia());
        check("Pila nueva: tamaño = 0",                    pila.tamanio() == 0);

        // ── Apilar y desapilar ────────────────────────────────────────────────
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        check("Tras apilar 3 elementos: tamaño = 3",       pila.tamanio() == 3);
        check("verTope() = 30 (LIFO)",                     pila.verTope() == 30);
        check("Pila no está vacía",                        !pila.estaVacia());

        int tope = pila.desapilar();
        check("desapilar() devuelve 30",                   tope == 30);
        check("Tras desapilar: tamaño = 2",                pila.tamanio() == 2);
        check("Nuevo tope es 20",                          pila.verTope() == 20);

        // ── Excepción pila vacía ──────────────────────────────────────────────
        Pila<String> pilaStr = new Pila<>();
        boolean lanzoPilaVacia = false;
        try {
            pilaStr.desapilar();
        } catch (Pila.PilaVaciaException e) {
            lanzoPilaVacia = true;
        }
        check("desapilar() pila vacía lanza PilaVaciaException", lanzoPilaVacia);

        boolean lanzoPeek = false;
        try {
            pilaStr.verTope();
        } catch (Pila.PilaVaciaException e) {
            lanzoPeek = true;
        }
        check("verTope() pila vacía lanza PilaVaciaException",   lanzoPeek);

        // ── Excepción null ────────────────────────────────────────────────────
        boolean lanzoNull = false;
        try {
            pilaStr.apilar(null);
        } catch (NullPointerException e) {
            lanzoNull = true;
        }
        check("apilar(null) lanza NullPointerException",         lanzoNull);

        // ── Constructor con capacidad inválida ────────────────────────────────
        boolean lanzoIllegal = false;
        try {
            Pila<Integer> pilaInvalida = new Pila<>(-5);
        } catch (IllegalArgumentException e) {
            lanzoIllegal = true;
        }
        check("Pila(-5) lanza IllegalArgumentException",         lanzoIllegal);

        // ── Pila llena ────────────────────────────────────────────────────────
        Pila<Integer> pilaSmall = new Pila<>(3);
        pilaSmall.apilar(1);
        pilaSmall.apilar(2);
        pilaSmall.apilar(3);
        check("Pila con capacidad 3: estaLlena()",               pilaSmall.estaLlena());
        boolean lanzoLlena = false;
        try {
            pilaSmall.apilar(4);
        } catch (Pila.PilaLlenaException e) {
            lanzoLlena = true;
        }
        check("apilar() en pila llena lanza PilaLlenaException", lanzoLlena);

        // ── desapilarSeguro (no lanza, devuelve null) ─────────────────────────
        Pila<Double> pilaVaciaD = new Pila<>();
        Double seguro = pilaVaciaD.desapilarSeguro();
        check("desapilarSeguro() en vacía → null (sin excepción)", seguro == null);

        // ── vaciar ────────────────────────────────────────────────────────────
        pila.vaciar();
        check("vaciar() → pila queda vacía",                     pila.estaVacia());

        // ── DESAFÍO: invertir ─────────────────────────────────────────────────
        Pila<Integer> pilaInv = new Pila<>();
        pilaInv.apilar(1);
        pilaInv.apilar(2);
        pilaInv.apilar(3); // tope
        pilaInv.invertir();
        check("DESAFÍO: invertir → nuevo tope es 1",             pilaInv.verTope() == 1);
    }

    // ═════════════════════════════════════════════════════════════════════════
    // EJERCICIO 6 — ProcesadorEstudiantes (Streams y Lambdas)
    // ═════════════════════════════════════════════════════════════════════════
    static void probarProcesadorEstudiantes() {
        printSeccion("EJERCICIO 6 — ProcesadorEstudiantes (Streams & Lambdas)");

        List<ProcesadorEstudiantes.Estudiante> lista = new ArrayList<>();
        lista.add(new ProcesadorEstudiantes.Estudiante("Ana",    8.5, "Sistemas",    2020));
        lista.add(new ProcesadorEstudiantes.Estudiante("Luis",   5.0, "Civil",       2019));
        lista.add(new ProcesadorEstudiantes.Estudiante("María",  9.2, "Sistemas",    2021));
        lista.add(new ProcesadorEstudiantes.Estudiante("Carlos", 4.0, "Química",     2018));
        lista.add(new ProcesadorEstudiantes.Estudiante("Eva",    7.8, "Civil",       2022));
        lista.add(new ProcesadorEstudiantes.Estudiante("Pedro",  6.5, "Sistemas",    2020));

        ProcesadorEstudiantes proc = new ProcesadorEstudiantes(lista);

        // ── Sección B: filter ─────────────────────────────────────────────────
        List<ProcesadorEstudiantes.Estudiante> sistemas = proc.filtrarPorCarrera("Sistemas");
        check("filtrarPorCarrera('Sistemas') → 3 estudiantes",   sistemas != null && sistemas.size() == 3);

        List<ProcesadorEstudiantes.Estudiante> aprobados = proc.obtenerAprobados();
        check("obtenerAprobados (>=6) → 4 estudiantes",          aprobados != null && aprobados.size() == 4);

        List<ProcesadorEstudiantes.Estudiante> recientes = proc.filtrarPorAnioIngreso(2019);
        check("filtrarPorAnioIngreso(2019) → 4 estudiantes",     recientes != null && recientes.size() == 4);

        // ── Sección C: map ────────────────────────────────────────────────────
        List<String> nombres = proc.obtenerNombres();
        check("obtenerNombres() → 6 nombres",                    nombres != null && nombres.size() == 6);
        check("obtenerNombres() contiene 'Ana'",                 nombres != null && nombres.contains("Ana"));

        List<Double> promediosAprobados = proc.promediosDeAprobados();
        check("promediosDeAprobados() → 4 promedios",            promediosAprobados != null && promediosAprobados.size() == 4);

        // ── Sección D: reducción ──────────────────────────────────────────────
        double promGeneral = proc.promedioGeneral();
        double esperado = (8.5 + 5.0 + 9.2 + 4.0 + 7.8 + 6.5) / 6.0;
        check("promedioGeneral() ≈ " + String.format("%.2f", esperado),
              Math.abs(promGeneral - esperado) < 0.001);

        ProcesadorEstudiantes.Estudiante mejor = proc.mejorEstudiante();
        check("mejorEstudiante() → María (9.2)",                 mejor != null && mejor.getNombre().equals("María"));

        long countSistemas = proc.contarPorCarrera("Sistemas");
        check("contarPorCarrera('Sistemas') = 3",                countSistemas == 3);

        // ── Sección E: sorted ─────────────────────────────────────────────────
        List<ProcesadorEstudiantes.Estudiante> ordenados = proc.ordenadosPorPromedioDesc();
        check("ordenadosPorPromedioDesc: primero es María (9.2)",
              ordenados != null && !ordenados.isEmpty() && ordenados.get(0).getNombre().equals("María"));
        check("ordenadosPorPromedioDesc: último es Carlos (4.0)",
              ordenados != null && ordenados.get(ordenados.size() - 1).getNombre().equals("Carlos"));

        // ── DESAFÍO: topN ─────────────────────────────────────────────────────
        List<ProcesadorEstudiantes.Estudiante> top3 = proc.topN(3);
        check("DESAFÍO: topN(3) → 3 estudiantes",                top3 != null && top3.size() == 3);
        check("DESAFÍO: topN(3) primero es María",               top3 != null && top3.get(0).getNombre().equals("María"));

        // ── Caso borde: lista vacía ───────────────────────────────────────────
        ProcesadorEstudiantes vacioProc = new ProcesadorEstudiantes(new ArrayList<>());
        check("promedioGeneral lista vacía → 0.0",               vacioProc.promedioGeneral() == 0.0);
        check("mejorEstudiante lista vacía → null",              vacioProc.mejorEstudiante() == null);
    }

    // ═════════════════════════════════════════════════════════════════════════
    // UTILIDADES DE REPORTE
    // ═════════════════════════════════════════════════════════════════════════

    /**
     * Evalúa una condición e imprime el resultado con ✅ o ❌.
     */
    static void check(String descripcion, boolean condicion) {
        totalPruebas++;
        if (condicion) {
            pruebasOk++;
            System.out.println("  ✅ " + descripcion);
        } else {
            pruebasFail++;
            System.out.println("  ❌ " + descripcion + "  ← FALLÓ");
        }
    }

    static void printSeccion(String titulo) {
        System.out.println("\n┌─────────────────────────────────────────────────┐");
        System.out.println("│  " + titulo);
        System.out.println("└─────────────────────────────────────────────────┘");
    }

    static void printEncabezado(String titulo) {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║  " + titulo);
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    static void imprimirResumenFinal() {
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║              RESUMEN FINAL DE PRUEBAS             ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.printf( "║  Total:   %3d pruebas                             ║%n", totalPruebas);
        System.out.printf( "║  ✅ OK:   %3d                                     ║%n", pruebasOk);
        System.out.printf( "║  ❌ Fail: %3d                                     ║%n", pruebasFail);
        System.out.println("╠═══════════════════════════════════════════════════╣");
        if (pruebasFail == 0) {
            System.out.println("║  🎉 ¡Todos los ejercicios implementados! 🎉        ║");
        } else {
            int porcentaje = (pruebasOk * 100) / totalPruebas;
            System.out.printf( "║  Completaste el %3d%% — ¡Seguí adelante!           ║%n", porcentaje);
        }
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}