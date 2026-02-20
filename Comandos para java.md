# JDK Debug - Comandos desde Terminal y Bloc de Notas

> Guía para trabajar con Java sin IDE, usando solo la terminal/CMD y un editor de texto plano.

---

## Índice

- [Editar archivos](#editar-archivos)
- [Compilar y Ejecutar](#compilar-y-ejecutar)
- [Debug con jdb](#debug-con-jdb)
- [Comandos dentro de jdb](#comandos-dentro-de-jdb)
- [Herramientas del JDK](#herramientas-del-jdk)
- [Estructura de proyecto recomendada](#estructura-de-proyecto-recomendada)

---

## Editar archivos

| Acción | Linux | Windows |
|---|---|---|
| Abrir con nano | `nano MiArchivo.java` | *(no disponible por defecto)* |
| Abrir con vim | `vim MiArchivo.java` | *(no disponible por defecto)* |
| Abrir con Bloc de Notas | *(no disponible)* | `notepad MiArchivo.java` |
| Abrir con gedit | `gedit MiArchivo.java &` | *(no disponible)* |

---

## Compilar y Ejecutar

### 🐧 Linux

```bash
# Compilar un archivo
javac MiArchivo.java

# Compilar todos los archivos .java del directorio
javac *.java

# Compilar con carpeta de salida para los .class
javac -d bin src/MiArchivo.java

# Compilar con información de debug (necesario para jdb)
javac -g MiArchivo.java

# Ejecutar
java MiClase

# Ejecutar especificando el classpath
java -cp bin MiClase
```

### 🪟 Windows (CMD)

```cmd
:: Compilar un archivo
javac MiArchivo.java

:: Compilar todos los archivos .java del directorio
javac *.java

:: Compilar con carpeta de salida para los .class
javac -d bin src\MiArchivo.java

:: Compilar con información de debug (necesario para jdb)
javac -g MiArchivo.java

:: Ejecutar
java MiClase

:: Ejecutar especificando el classpath
java -cp bin MiClase
```

---

## Debug con jdb

### 🐧 Linux

```bash
# Compilar con info de debug (paso previo obligatorio)
javac -g MiArchivo.java

# Iniciar el debugger directamente
jdb MiClase

# Iniciar el programa en modo debug (espera conexión del debugger)
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005 MiClase

# Conectar jdb al proceso que está esperando en el puerto 5005
jdb -attach 5005

# Pasar argumentos al programa
jdb MiClase arg1 arg2
```

### 🪟 Windows (CMD)

```cmd
:: Compilar con info de debug (paso previo obligatorio)
javac -g MiArchivo.java

:: Iniciar el debugger directamente
jdb MiClase

:: Iniciar el programa en modo debug (espera conexión del debugger)
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005 MiClase

:: Conectar jdb al proceso que está esperando en el puerto 5005
jdb -attach 5005

:: Pasar argumentos al programa
jdb MiClase arg1 arg2
```

---

## Comandos dentro de jdb

> Estos comandos son **iguales en Linux y Windows** ya que se escriben dentro de la consola de jdb.

```
run                          → Ejecutar el programa
cont                         → Continuar hasta el próximo breakpoint

stop at MiClase:10           → Poner breakpoint en la línea 10
stop in MiClase.miMetodo     → Poner breakpoint al inicio de un método
clear MiClase:10             → Quitar breakpoint en la línea 10
clear                        → Ver todos los breakpoints activos

next                         → Siguiente línea (NO entra a métodos internos)
step                         → Siguiente línea (SÍ entra a métodos internos)
step up                      → Ejecutar hasta salir del método actual

print nombreVariable         → Imprimir el valor de una variable
dump nombreVariable          → Imprimir todos los campos de un objeto
locals                       → Ver todas las variables locales del scope actual
eval expresion               → Evaluar cualquier expresión Java

where                        → Ver el call stack (pila de llamadas)
where all                    → Ver el call stack de todos los threads
threads                      → Listar todos los threads activos
thread <id>                  → Cambiar al thread indicado

list                         → Ver el código fuente alrededor de la línea actual
list 20                      → Ver el código alrededor de la línea 20
classes                      → Listar todas las clases cargadas
methods MiClase              → Listar todos los métodos de una clase

help                         → Ver todos los comandos disponibles
exit / quit                  → Salir del debugger
```

---

## Herramientas del JDK

### 🐧 Linux

```bash
# Ver el bytecode de un .class (métodos, instrucciones)
javap MiClase.class

# Ver el bytecode detallado
javap -c MiClase.class

# Ver métodos y firmas
javap -p MiClase.class

# Listar procesos Java corriendo (muestra PID)
jps

# Listar procesos con argumentos
jps -v

# Ver los threads de un proceso Java
jstack <PID>

# Ver el uso de memoria (heap) de un proceso
jmap -heap <PID>

# Ver logs del Garbage Collector
java -verbose:gc MiClase

# Monitoreo en tiempo real (se refresca cada 1 seg)
jstat -gc <PID> 1000
```

### 🪟 Windows (CMD)

```cmd
:: Ver el bytecode de un .class
javap MiClase.class

:: Ver el bytecode detallado
javap -c MiClase.class

:: Ver métodos y firmas
javap -p MiClase.class

:: Listar procesos Java corriendo (muestra PID)
jps

:: Listar procesos con argumentos
jps -v

:: Ver los threads de un proceso Java
jstack <PID>

:: Ver el uso de memoria (heap) de un proceso
jmap -heap <PID>

:: Ver logs del Garbage Collector
java -verbose:gc MiClase

:: Monitoreo en tiempo real (se refresca cada 1 seg)
jstat -gc <PID> 1000
```

---

## Estructura de proyecto recomendada

### 🐧 Linux

```bash
# Crear estructura
mkdir proyecto
cd proyecto
mkdir src bin

# Editar el archivo fuente
nano src/MiClase.java

# Compilar
javac -g -d bin src/*.java

# Ejecutar
java -cp bin MiClase

# Debug
jdb -classpath bin MiClase
```

### 🪟 Windows (CMD)

```cmd
:: Crear estructura
mkdir proyecto
cd proyecto
mkdir src
mkdir bin

:: Editar el archivo fuente
notepad src\MiClase.java

:: Compilar
javac -g -d bin src\*.java

:: Ejecutar
java -cp bin MiClase

:: Debug
jdb -classpath bin MiClase
```

---

## Tips rápidos

- Siempre compilar con `-g` antes de usar `jdb`, de lo contrario no podrás ver variables ni código fuente.
- Si `jdb` no muestra el código fuente, asegurate de que el `.java` esté en el mismo directorio o indicarlo con `-sourcepath`.
- Para debug rápido sin `jdb`, `System.out.println()` sigue siendo tu mejor amigo.
- En Windows, usá `\` para separar rutas; en Linux usá `/`.