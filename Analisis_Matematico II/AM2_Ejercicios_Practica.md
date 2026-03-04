# Analisis Matematico II — Guia de Ejercicios de Practica

**FCEFyN – Universidad Nacional de Cordoba | Ingenieria · CB · Primer Semestre**

Cada seccion incluye ejercicios progresivos (basico -> intermedio -> avanzado) con hints y respuestas orientativas.

---

## Contenido

1. Topologia en Rn
2. Dominio, Grafica y Curvas de Nivel
3. Limite y Continuidad
4. Derivadas Parciales y Derivadas de Orden Superior
5. Diferenciabilidad, Plano Tangente y Diferencial
6. Derivada Direccional y Gradiente
7. Regla de la Cadena y Funcion Implicita
8. Extremos Libres y Ligados
9. Integrales Dobles
10. Integrales Triples y Cambio de Variables
11. Curvas e Integrales de Linea
12. Superficies e Integrales de Superficie
13. Campos Vectoriales, Green, Gauss y Stokes
14. Ecuaciones Diferenciales Ordinarias

---

## 1. Topologia en Rn

### Entornos

**Ejercicio 1.1 — Basico**

Describir y graficar:

a) B2(3) en R  
b) B1((0,0)) en R2  
c) B2((1,1,0)) en R3

> **Respuestas:** a) intervalo (1, 5) | b) disco abierto x^2+y^2 < 1 | c) bola (x-1)^2+(y-1)^2+z^2 < 4

---

**Ejercicio 1.2 — Basico**

Dar el entorno reducido B'(1/2)(2) en R y graficarlo. Que diferencia hay con el entorno usual?

> **Resp:** (3/2, 5/2) sin el punto {2} — excluye el punto central.

---

### Clasificacion de Puntos y Conjuntos

**Ejercicio 1.3 — Intermedio**

Para A = {(x,y) en R2 : x^2 + y^2 < 4} union {(0,3)}:

a) Dar un punto interior, frontera, exterior y aislado.  
b) Es A abierto? cerrado? Ninguno?  
c) Dar todos los puntos de acumulacion de A.

> **Hint:** el punto (0,3) esta "fuera" del disco pero pertenece a A — eso lo hace aislado.

> **Resp:** b) Ninguno (tiene punto aislado, no es abierto; no contiene todos los puntos frontera, no es cerrado). c) Acumulacion: todo el disco cerrado x^2+y^2 <= 4.

---

**Ejercicio 1.4 — Intermedio**

Determinar si los siguientes conjuntos son abiertos, cerrados, ambos o ninguno:

a) A = {(x,y) : 1 < x^2 + y^2 <= 4}  
b) B = R2  
c) C = {(x,y) : x + y = 1}  
d) D = {(x,y) : x > 0, y > 0}

> **Resp:** a) Ninguno | b) Ambos | c) Cerrado | d) Abierto

---

**Ejercicio 1.5 — Avanzado**

Sea A = {(x,y,z) en R3 : x^2 + 4y^2 + z^2/9 < 1}. Clasificar los puntos:

a) p1 = (0, 0, 2)  
b) p2 = (1, 0, 0)  
c) p3 = (0, 1/2, 0)

> **Hint:** evaluar la expresion x^2+4y^2+z^2/9 en cada punto y comparar con 1.

> **Resp:** a) Interior (vale 4/9 < 1) | b) Frontera (vale 1) | c) Frontera (vale 1)

---

## 2. Dominio, Grafica y Curvas de Nivel

### Dominio

**Ejercicio 2.1 — Basico**

Determinar el dominio de cada funcion y graficarlo:

a) f(x,y) = sqrt(9 - x^2 - y^2)  
b) f(x,y) = ln(x + y)  
c) f(x,y) = 1 / sqrt(4 - x^2 - y^2)  
d) f(x,y) = arcsen(x + y)

> **Resp:** a) disco cerrado x^2+y^2 <= 9 | b) semiplano x+y > 0 | c) disco abierto x^2+y^2 < 4 | d) franja -1 <= x+y <= 1

---

**Ejercicio 2.2 — Intermedio**

Hallar el dominio de f(x,y) = sqrt(3x + 3y) + ln(sen y) y describir geometricamente la region.

> **Hint:** necesitas 3x+3y >= 0 (y >= -x) Y sen y > 0 (y en (2k*pi, (2k+1)*pi)).

---

### Curvas de Nivel

**Ejercicio 2.3 — Basico**

Hallar y graficar las curvas de nivel para k = -1, 0, 1, 4:

a) f(x,y) = x^2 + y^2  
b) f(x,y) = x - y  
c) f(x,y) = y^2 - x

> **Resp:** a) circunferencias concentricas | b) rectas paralelas x-y=k | c) parabolas x = y^2-k

---

**Ejercicio 2.4 — Intermedio**

Para f(x,y) = e^{xy}, hallar las curvas de nivel k = 1, e, e^4. Que curvas son?

> **Hint:** e^{xy} = k -> xy = ln k -> hiperbolas rectangulares (excepto k=1: ejes coordenados).

---

**Ejercicio 2.5 — Avanzado**

Identificar la superficie definida por f(x,y) = x^2 + y^2 - 4 y sus superficies de nivel k = -4, 0, 12. Que representan geometricamente en R2?

---

## 3. Limite y Continuidad

### Calculo Directo de Limites

**Ejercicio 3.1 — Basico**

Calcular los siguientes limites (son directos por continuidad):

a) lim_{(x,y)->(pi/4, 2)} y*cos(xy)  
b) lim_{(x,y,z)->(1,3,4)} sqrt(x+y+z)  
c) lim_{(x,y)->(0,1)} arccos(x/y) / (1+xy)

> **Resp:** a) 2*cos(pi/2) = 0 | b) sqrt(8) = 2*sqrt(2) | c) arccos(0)/1 = pi/2

---

### Demostrar que el Limite NO Existe

**Ejercicio 3.2 — Intermedio**

Demostrar que los siguientes limites no existen cuando (x,y)->(0,0):

a) f(x,y) = (x - y)/(x + y)  
b) f(x,y) = (x^2 - y^2)/(x^2 + y^2)  
c) f(x,y) = xy/(x^2 + y^2)

> **Hint:** sustituir y = mx. Si el resultado depende de m -> no existe el limite.

> **Resp a)** Por y=mx -> (1-m)/(1+m) depende de m. Por lo tanto el limite no existe.

---

**Ejercicio 3.3 — Intermedio**

Para f(x,y) = y^4/(x^4 + y^4), demostrar que los limites iterados existen e igualan 0, pero el limite doble no existe.

> **Hint:** probar por y = x que el resultado es 1/2 distinto de 0.

---

### Demostrar que el Limite SI Existe (Acotacion)

**Ejercicio 3.4 — Intermedio**

Calcular usando el Teorema del Sandwich:

a) lim_{(x,y)->(0,0)} x^2*y^2 / (x^2 + y^2)  
b) lim_{(x,y)->(0,0)} xy / sqrt(x^2 + y^2)  
c) lim_{(x,y)->(0,0)} y^3 / (x^2 + y^2)

> **Hint:** usar que x^2 <= x^2+y^2 y y^2 <= x^2+y^2 para acotar el numerador.

> **Resp:** a) 0 | b) 0 | c) 0 (pues |y^3|/(x^2+y^2) <= |y|)

---

**Ejercicio 3.5 — Avanzado**

Calcular lim_{(x,y)->(0,0)} x^2*y^3 / sqrt(x^2 + y^2) y justificar rigurosamente.

> **Resp:** 0. Acotar: |x^2*y^3|/sqrt(x^2+y^2) <= sqrt(x^2+y^2)*y^2 -> 0

---

### Continuidad

**Ejercicio 3.6 — Intermedio**

Estudiar la continuidad en todo R2 de:

```
f(x,y) = xy/(x^2+y^2)   si (x,y) distinto (0,0)
f(0,0) = 0
```

> **Resp:** No continua en (0,0) porque el lim no existe (depende del camino). Continua en R2 \ {(0,0)}.

---

**Ejercicio 3.7 — Avanzado**

Para la siguiente funcion, determinar el valor de f(0,0) que la hace continua en el origen:

```
f(x,y) = (x^2 + y^2 - x^3*y^3) / (x^2 + y^2)   si (x,y) distinto (0,0)
```

> **Hint:** calcular el limite cuando (x,y)->(0,0) y ese sera f(0,0).

> **Resp:** f(0,0) = 1

---

## 4. Derivadas Parciales y de Orden Superior

### Derivadas Parciales por Definicion

**Ejercicio 4.1 — Basico**

Usando la definicion, calcular fx(0,0) y fy(0,0) para:

```
f(x,y) = x^2*y/(x^2+y^2)   si (x,y) distinto (0,0)
f(0,0) = 0
```

> **Hint:** fx(0,0) = lim_{h->0} f(h,0)/h

> **Resp:** fx(0,0) = 0, fy(0,0) = 0

---

### Derivadas Parciales por Reglas

**Ejercicio 4.2 — Basico**

Calcular df/dx y df/dy:

a) f(x,y) = 2x^2 + 3xy + 5y^2  
b) f(x,y) = sen(x^2 - 2xy + y^2)  
c) f(x,y) = e^{x/y} * sen(x/y)  
d) f(x,y) = ln(x + sqrt(x^2 + y^2))

---

**Ejercicio 4.3 — Intermedio**

Calcular todas las derivadas parciales de segundo orden de:

a) f(x,y) = x^2*y + y^3  
b) f(x,y) = y^2*e^x + x^2*y^3  
c) f(x,y) = ln(x^2 + y^2)

Verificar en cada caso que fxy = fyx (Teorema de Schwarz).

---

**Ejercicio 4.4 — Avanzado**

Dada u = sen(r/t) + ln(t/r), verificar que:

```
t * du/dt + r * du/dr = 0
```

---

**Ejercicio 4.5 — Avanzado**

Hallar la Matriz Jacobiana de F(x,y,z) = (xy, y^2, x^2*z).

> **Resp:** J = | y   x   0 | / | 0   2y  0 | / | 2xz  0   x^2 |

---

## 5. Diferenciabilidad, Plano Tangente y Diferencial

### Plano Tangente

**Ejercicio 5.1 — Basico**

Hallar la ecuacion del plano tangente a la superficie en el punto indicado:

a) z = 4x^2 - y^2 + 2y  en  (-1, 2, 4)  
b) z = sqrt(xy)  en  (1, 1, 1)  
c) z = y*ln x  en  (1, 4, 0)

> **Hint:** z - z0 = fx(x0,y0)*(x-x0) + fy(x0,y0)*(y-y0)

---

**Ejercicio 5.2 — Intermedio**

Hallar la ecuacion del plano tangente y la recta normal a z = e^{x^2-y^2} en (1,-1,1).

---

### Diferenciabilidad

**Ejercicio 5.3 — Intermedio**

Determinar si la siguiente funcion es diferenciable en (0,0):

```
f(x,y) = 3x^3/(x^2+y^2)   si (x,y) distinto (0,0)
f(0,0) = 0
```

> **Hint:** calcular fx(0,0) y fy(0,0), luego estudiar el limite de diferenciabilidad.

> **Resp:** No diferenciable en (0,0), aunque es continua y tiene derivadas parciales.

---

**Ejercicio 5.4 — Avanzado**

Verificar que f(x,y) = x^2*y^2/(x^2+y^2) (con f(0,0)=0) es diferenciable en (0,0) y hallar su diferencial.

> **Resp:** Diferenciable. df(0,0) = 0*dx + 0*dy = 0

---

**Ejercicio 5.5 — Intermedio**

Calcular el diferencial total de:

a) z = sqrt(x^2 + y^2)  
b) z = arctan(y/x)  
c) u = z/sqrt(x^2 + y^2)  en el punto (3, 4, 5)

---

## 6. Derivada Direccional y Gradiente

**Ejercicio 6.1 — Basico**

Calcular el gradiente en el punto dado:

a) f(x,y) = x^2 + y^2  en  (1,1)  
b) f(x,y) = xy + x + y^2  en  (2,3)  
c) f(x,y,z) = (xyz)^2  en  (1,1,1)

> **Resp:** a) grad f = (2,2) | b) grad f = (4, 8) | c) grad f = (2,2,2)

---

**Ejercicio 6.2 — Basico**

Calcular df/du usando grad f . u para:

a) f(x,y) = xy en (1,2), u = (1/sqrt(2), 1/sqrt(2))  
b) f(x,y,z) = xy - y^2 - zx en (3,2,1), u = (2,6,7)/7

> **Hint:** asegurarse que u sea unitario antes de calcular.

---

**Ejercicio 6.3 — Intermedio**

Sea f(x,y) = 3x^4 - xy - y^3. Hallar la derivada direccional en (1,2) en la direccion que forma 60 grados con el eje x.

> **Hint:** u = (cos 60, sen 60) = (1/2, sqrt(3)/2)

---

**Ejercicio 6.4 — Intermedio**

Para f(x,y) = x^2 - y^2:

a) En que direccion crece f mas rapido en (2,-1)?  
b) Cual es la tasa maxima de crecimiento?  
c) Hallar la ecuacion de la tangente a la curva de nivel en (2,-1).

> **Resp:** a) u = (4,2)/sqrt(20) = (2,1)/sqrt(5) | b) ||grad f|| = 2*sqrt(5) | c) 4(x-2)-2(y+1)=0

---

**Ejercicio 6.5 — Avanzado**

Probar que la derivada de f(x,y) = x^3 + 3x^2 + 4xy + y^2 es nula en (2/3, -4/3) en cualquier direccion.

> **Hint:** mostrar que grad f(2/3, -4/3) = (0,0).

---

## 7. Regla de la Cadena y Funcion Implicita

### Regla de la Cadena

**Ejercicio 7.1 — Basico**

Hallar dz/dt usando la regla de la cadena:

a) z = x/y,  x = e^t,  y = e^{-t}  
b) z = ln(x/y),  x = 2t,  y = t^2 + 1

> **Resp a)** dz/dt = (1/y)*e^t + (-x/y^2)*(-e^{-t}) = e^{2t} + e^{2t} = 2e^{2t}

---

**Ejercicio 7.2 — Intermedio**

Sea z = u^3 - 3uv + v^3 con u = x^2 + y y v = xy^2. Hallar dz/dx y dz/dy.

---

**Ejercicio 7.3 — Intermedio**

Dadas G(x,y) = (x^2+xy+1, y^2) y F(u,v) = (u+v, 2u, v^2), hallar la Jacobiana de F o G en (1,1).

> **Hint:** (F o G)'(x0) = F'(G(x0)) * G'(x0)  — producto de matrices jacobianas.

---

### Funcion Implicita

**Ejercicio 7.4 — Basico**

Suponer que y depende de x. Derivar implicitamente y hallar dy/dx:

a) x^2 - xy + y^3 = 8  
b) 2y^2 + cubraiz(xy) = 3x^2 + 17

> **Hint:** derivar toda la ecuacion respecto a x, recordando que y = y(x).

---

**Ejercicio 7.5 — Intermedio**

Dado el sistema:
- x + y - u - v = 0
- x - y + 2u + v = 0

Calcular dx/du e dy/du:

a) Expresando x e y en funcion de u y v.  
b) Derivando implicitamente el sistema.

---

## 8. Extremos Libres y Ligados

### Extremos Libres

**Ejercicio 8.1 — Basico**

Encontrar y clasificar los puntos criticos:

a) f(x,y) = x^3 + y^3 - 3x - 12y + 20  
b) f(x,y) = (x-1)^2 + 2y^2  
c) f(x,y) = 4x^2 + 3y^2 - 8x

> **Hint:** resolver grad f = 0, luego aplicar criterio del Hessiano.

> **Resp a)** Puntos criticos: (1,2), (1,-2), (-1,2), (-1,-2). Clasificar con det H y fxx.

---

**Ejercicio 8.2 — Intermedio**

Hallar los puntos criticos de f(x,y) = x^3 + 3xy^2 - 3x^2 - 3y^2 + 4 y clasificarlos.

---

**Ejercicio 8.3 — Avanzado**

Encontrar los maximos y minimos de f(x,y) = 2x^2 + 3y^2 - 2x en la region x^2 + y^2 <= 1 (incluye la frontera).

> **Hint:** primero buscar puntos criticos en el interior, luego parametrizar la frontera con x=cos(t), y=sen(t).

---

### Extremos Ligados — Multiplicadores de Lagrange

**Ejercicio 8.4 — Basico**

Hallar los extremos de f(x,y) = x + y sujeto a x^2 + y^2 = 1.

> **Resp:** max sqrt(2) en (1/sqrt(2), 1/sqrt(2)), min -sqrt(2) en (-1/sqrt(2), -1/sqrt(2))

---

**Ejercicio 8.5 — Intermedio**

Hallar los extremos de f(x,y,z) = x - y + 2z sujeto a x^2 + y^2 + 2z^2 = 2.

> **Hint:** sistema grad f = lambda * grad g con g = x^2+y^2+2z^2-2.

---

**Ejercicio 8.6 — Avanzado**

Una caja sin tapa debe tener un volumen de 32000 cm3. Hallar las dimensiones que minimizan el material a utilizar.

> **Hint:** minimizar A = xy + 2xz + 2yz sujeto a xyz = 32000.

---

## 9. Integrales Dobles

### Integrales Iteradas en Region Rectangular

**Ejercicio 9.1 — Basico**

Calcular las siguientes integrales dobles en la region R indicada:

a) integral_doble (1 + 2x + 2y) dA,  R = [0,2]x[0,1]  
b) integral_doble x^2*y dA,  R = [0,4]x[0,2]  
c) integral_doble (x^2 + y^2) dA,  R = [-1,1]x[0,1]

> **Resp:** a) 12 | b) 128/3 | c) 4/3

---

### Integrales en Regiones No Rectangulares

**Ejercicio 9.2 — Intermedio**

Dibujar la region y calcular:

a) integral_doble (x+y) dA en D: debajo de y=x^2, encima del eje x, 0<=x<=1  
b) integral_doble xy^2 dA en la region entre y=x e y=x^2  
c) integral_doble (x+2y) dA en D: {0<=y<=x, x+y<=2}

> **Hint:** determinar si la region es Tipo I o Tipo II antes de plantear la integral iterada.

---

**Ejercicio 9.3 — Intermedio**

Cambiar el orden de integracion y resolver:

```
integral_0^1 integral_{sqrt(y)}^{1} sqrt(x^3+1) dx dy
```

> **Resp:** 2*(sqrt(8)-1)/9

---

### Coordenadas Polares

**Ejercicio 9.4 — Intermedio**

Usar coordenadas polares para calcular:

a) integral_doble sqrt(x^2+y^2) dA en D: x^2+y^2 <= a^2  
b) integral_doble (x^2+y^2) dA en D: limitada por r = 2a*cos(theta)  
c) integral_{-1}^{1} integral_0^{sqrt(1-x^2)} (x^2+y^2)^{3/2} dy dx

> **Hint:** dA = r dr dtheta. Identificar los limites polares de la region.

---

## 10. Integrales Triples y Cambio de Variables

**Ejercicio 10.1 — Basico**

Calcular integral_triple x dV en la region limitada por x=0, y=0, z=0, x=1, y=1, z=1.

> **Resp:** 1/2

---

**Ejercicio 10.2 — Intermedio**

Calcular integral_triple x dV en la region del primer octante acotada por x+y+z=1.

> **Resp:** 1/24

---

**Ejercicio 10.3 — Intermedio**

Usar coordenadas cilindricas:

a) Volumen del solido acotado por z = x^2+y^2 y z = 9.  
b) integral_{-3}^{3} integral_{-sqrt(9-x^2)}^{sqrt(9-x^2)} integral_0^{9-x^2-y^2} x^2 dz dy dx

> **Resp a)** 81*pi/2

---

**Ejercicio 10.4 — Avanzado**

Usar coordenadas esfericas para calcular:

a) integral_triple (x^2+y^2+z^2) dV en la bola de radio 3 centrada en el origen.  
b) Volumen del solido sobre el cono phi=pi/3 y bajo la esfera r=4*cos(phi).

> **Hint:** dV = rho^2 * sen(phi) drho dphi dtheta. Para a) el integrando es rho^2.

> **Resp a)** 4*3^5*pi/5 | b) 10*pi

---

## 11. Curvas e Integrales de Linea

### Curvas Parametrizadas

**Ejercicio 11.1 — Basico**

Identificar la curva y calcular su derivada:

a) r(t) = (sen t, 4 cos t)  
b) r(t) = (4 cos t, 4 sen t, t)  
c) r(t) = (2 + t, 3t, 4 - t)

> **Resp:** a) Elipse | b) Helice circular | c) Recta

---

**Ejercicio 11.2 — Intermedio**

Para r(t) = (3t - t^3, 3t^2, 3t + t^3) en t=1, calcular T, N, B, la curvatura kappa y la torsion tau.

> **Hint:** B = (r' x r'')/||r' x r''||, kappa = ||r' x r''||/||r'||^3

---

**Ejercicio 11.3 — Basico**

Calcular la longitud de arco de:

a) r(t) = (2 sen t, 5t, 2 cos t),  0 <= t <= pi  
b) r(t) = (e^t cos t, e^t sen t),  0 <= t <= 1

> **Resp a)** L = pi*sqrt(29)

---

### Integrales de Linea

**Ejercicio 11.4 — Basico**

Calcular integral_C (x^2 - y + 3z) ds donde C es el segmento de (0,0,0) a (1,2,1).

> **Hint:** parametrizar como r(t) = (t, 2t, t) con 0<=t<=1.

---

**Ejercicio 11.5 — Intermedio**

Calcular integral_C F.dr para:

a) F = (x^2-2xy, y^2-2xy) a lo largo de la parabola y=x^2, -1<=x<=1  
b) F = (x^2+y^2, -2xy) a lo largo de y=x^3, 0<=x<=1

> **Hint:** parametrizar la curva y usar integral_a^b F(r(t)).r'(t) dt

---

**Ejercicio 11.6 — Avanzado**

Calcular el trabajo de F = x^2*i + 2y*j sobre la curva C: x=t, y=t^3 desde (0,0) hasta (2,8).

---

## 12. Superficies e Integrales de Superficie

### Area de Superficie

**Ejercicio 12.1 — Basico**

Calcular el area de las superficies:

a) El paraboloide z = x^2 + y^2 bajo el plano z = 4  
b) La porcion del plano z = 2 - x - y sobre el disco x^2 + y^2 <= 1  
c) El cono z^2 = x^2 + y^2 cortado por z = 1

> **Hint:** A = integral_doble_D sqrt(1 + zx^2 + zy^2) dA

---

**Ejercicio 12.2 — Intermedio**

Evaluar integral_doble_S (y^2 + 2yz) dS donde S es la porcion del plano 2x+y+2z=6 en el primer octante.

---

**Ejercicio 12.3 — Intermedio**

Calcular el flujo de F(x,y,z) = (x, y, z) a traves de z = 4 - x^2 - y^2 (z>=0), con normal hacia afuera.

> **Hint:** flujo = integral_doble_D F.(-zx, -zy, 1) dA = integral_doble_D (2x^2+2y^2+4-x^2-y^2) dA

---

**Ejercicio 12.4 — Avanzado**

Calcular integral_doble_S F.dS siendo F = (3z, -4, y) y S: z = 1-x-y en el primer octante (normal hacia arriba).

---

## 13. Campos Vectoriales — Green, Gauss y Stokes

### Divergencia, Rotor y Campos Conservativos

**Ejercicio 13.1 — Basico**

Calcular div F y rot F para:

a) F = (x^2*y, z, xyz)  
b) F = (x, xy, k) (k constante)

---

**Ejercicio 13.2 — Intermedio**

Determinar si F es conservativo. Si lo es, hallar la funcion potencial:

a) F(x,y) = (x, y)  
b) F(x,y) = (xy, xy)  
c) F(x,y,z) = (2x*y^3*z^4, 3x^2*y^2*z^4, 4x^2*y^3*z^3)

> **Hint:** verificar rot F = 0. Luego integrar componente a componente para hallar f.

> **Resp a)** f = (x^2+y^2)/2 | b) No conservativo | c) f = x^2*y^3*z^4

---

### Teorema de Green

**Ejercicio 13.3 — Basico**

Usar Green para calcular la integral de linea cerrada P dx + Q dy:

a) P=(y+e^{sqrt(x)}), Q=(2x+cos y^2), C: frontera entre y=x^2 e y=sqrt(x)  
b) P=2xy, Q=(x+y), C: frontera entre y=0 e y=1-x^2

> **Hint:** integral_doble_D (dQ/dx - dP/dy) dA

> **Resp a)** 1/3

---

### Teorema de Gauss (Divergencia)

**Ejercicio 13.4 — Intermedio**

Usar el Teorema de Gauss para calcular el flujo de:

a) F = (x^2+sen z, xy+cos z, e^y) a traves del cilindro x^2+y^2=4, z=0, z=y-3  
b) F = (x, y, z) a traves de la superficie de la esfera x^2+y^2+z^2=9

> **Hint:** div F hace la integral triple mucho mas sencilla.

> **Resp b)** div F = 3 -> 3*Vol(esfera) = 3*(4*pi*27/3) = 108*pi

---

### Teorema de Stokes

**Ejercicio 13.5 — Intermedio**

Usar Stokes para calcular la integral de linea cerrada F.dr:

a) F = (-y^2, z, x), C: triangulo en el plano 2x+2y+z=6, orientado antihorario visto desde arriba.  
b) F = (4xz, y, 4xy), C: interseccion de z=9-x^2-y^2 con z=0.

> **Hint:** integral_cerrada F.dr = integral_doble_S rot(F).dS — elegir la superficie S mas conveniente.

---

## 14. Ecuaciones Diferenciales Ordinarias

### EDO Variables Separables

**Ejercicio 14.1 — Basico**

Resolver las siguientes EDO separables:

a) y' = x^2/y^3  
b) y' = e^{x+2y}  
c) y' = (y-1)(y-2)  
d) sen x * cos y dx + tan y * cos x dy = 0

> **Resp a)** y^4/4 = x^3/3 + C
> **Resp b)** -e^{-2y}/2 = e^x + C

---

### EDO Exactas

**Ejercicio 14.2 — Intermedio**

Verificar si son exactas y resolver:

a) (y - 3x^2) dx - (4y - x) dy = 0  
b) y*e^{xy} dx + x*e^{xy} dy = 0  
c) (y - x^3) dx + (x + y^3) dy = 0

> **Hint:** verificar dP/dy = dQ/dx. Si si: buscar f con fx=P, fy=Q.

> **Resp b)** Exacta: e^{xy} = C

---

### EDO Lineal de 1er Orden

**Ejercicio 14.3 — Intermedio**

Resolver usando factor integrante:

a) y' + y*tan x = sen 2x  
b) y' - 2xy = 2x*e^{x^2}  
c) xy' - 3y = x^4  
d) y' + y/x = 3x

> **Hint:** mu(x) = e^{integral P(x) dx}, luego y = (1/mu) * integral (mu*Q) dx + C

---

### Ecuacion de Bernoulli

**Ejercicio 14.4 — Intermedio**

Resolver las ecuaciones de Bernoulli:

a) y' = y*tan x + y^3*cos^2 x  
b) x*y' + y = x^2*y^2*ln x  
c) xy' - 2y = 4x^3*y^{1/2}

> **Hint:** sustituir v = y^{1-n} para linealizar la ecuacion.

---

### EDO Lineal de 2do Orden

**Ejercicio 14.5 — Basico**

Resolver las ecuaciones homogeneas:

a) y'' - 3y' + 2y = 0  
b) y'' + 9y = 0  
c) y'' - 6y' + 9y = 0  
d) y'' + y' + 2y = 0

> **Resp a)** r^2-3r+2=0 -> r=1,2 -> y = C1*e^x + C2*e^{2x}
> **Resp b)** r = +/-3i -> y = C1*cos(3x) + C2*sen(3x)
> **Resp c)** r = 3 (doble) -> y = (C1 + C2*x)*e^{3x}

---

**Ejercicio 14.6 — Intermedio**

Resolver por coeficientes indeterminados:

a) y'' + 5y' + 4y = 3 - 2x  con  y(0)=1, y'(0)=0  
b) y'' + 9y = cos x  
c) y'' - 3y' + 2y = sen x  
d) y'' - 6y' + 9y = 4e^{2x}

> **Hint:** proponer yp segun el termino f(x). Si hay resonancia (raiz coincide), multiplicar por x.

---

**Ejercicio 14.7 — Avanzado**

Resolver por variacion de parametros:

a) y'' - 3y' + 2y = sen x  
b) y'' - 2y' + y = e^{2x}  
c) y'' - 3y' + 2y = 1/(1+e^{-x})

> **Hint:** yp = u1*y1 + u2*y2 con u1' = -y2*f/W, u2' = y1*f/W (W = Wronskiano).

---

**Ejercicio 14.8 — Avanzado (Aplicacion)**

Un circuito RLC tiene R=180 Ohm, L=20 H, C=1/280 F y voltaje E(t)=10 sen t V. Con Q(0)=0 e I(0)=1 A, determinar la carga Q(t).

> **Hint:** L*Q'' + R*Q' + (1/C)*Q = E(t) -> 20Q'' + 180Q' + 280Q = 10 sen t

---

*Analisis Matematico II · FCEFyN · UNC · Guia de Ejercicios de Practica*
