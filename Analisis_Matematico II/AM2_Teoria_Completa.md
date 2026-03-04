# Análisis Matemático II — Resumen Teórico Completo

**FCEFyN – Universidad Nacional de Córdoba | Ingeniería · CB · Primer Semestre**

---

## Contenido

1. Conceptos Topológicos y Funciones de Rn a Rp
2. Limite y Continuidad
3. Derivadas Parciales, Diferencial y Derivada Direccional
4. Extremos Libres y Ligados - Serie de Taylor
5. Integrales Multiples
6. Curvas e Integrales de Linea
7. Superficies e Integrales de Superficie
8. Teoria de Campos Vectoriales
9. Ecuaciones Diferenciales Ordinarias

---

## Unidad I — Conceptos Topologicos y Funciones de Rn a Rp

### Distancia en Rn

La distancia entre dos puntos P = (p1,...,pn) y Q = (q1,...,qn):

```
d(P,Q) = sqrt[(p1-q1)^2 + (p2-q2)^2 + ... + (pn-qn)^2]
```

### Entorno y Entorno Reducido

**Entorno de radio r centrado en X0:**

```
Br(X0) = { x en Rn / d(x, X0) < r }
```

**Entorno reducido** (excluye el centro):

```
B'r(X0) = { x en Rn / 0 < d(x, X0) < r }
```

- En **R**: intervalo abierto (a-r, a+r)
- En **R2**: disco abierto
- En **R3**: bola abierta

### Clasificacion de Puntos

| Tipo de punto | Definicion |
|---|---|
| **Interior de A** | Existe r > 0 tal que Br(p) esta incluido en A |
| **Frontera de A** | Todo entorno de p contiene puntos de A y de Ac |
| **Exterior de A** | Existe r > 0 tal que Br(p) esta incluido en Ac |
| **Acumulacion de A** | Todo entorno reducido de p contiene puntos de A |
| **Aislado de A** | p en A y existe r > 0 tal que B'r(p) esta en Ac |

> Un conjunto es **abierto** si todos sus puntos son interiores. Es **cerrado** si contiene todos sus puntos frontera.

### Funciones de Rn a Rp: Representacion

- **Explicita:** S = grafico de f = {(x, f(x)) : x en D}
- **Parametrica:** S = imagen de f = {f(t) : t en D}
- **Implicita:** S = conjunto de nivel = {x : f(x) = y0}

**Conjuntos de nivel:** Para f : Rn a R, el conjunto Nk = {x en D : f(x) = k} es el conjunto de nivel k.

---

## Unidad II — Limite y Continuidad

### Definicion de Limite (epsilon-delta)

```
lim(x->x0) f(x) = L

Para todo epsilon > 0, existe delta > 0 tal que:
x en B'delta(x0) interseccion dom(f)  =>  f(x) en Bepsilon(L)
```

> **Importante:** en Rn con n >= 2, el limite debe ser el mismo por **todos** los caminos posibles hacia x0. Si por dos caminos distintos se obtienen valores diferentes, el limite **NO existe**.

### Estrategias para Estudiar Limites

1. **Limites iterados:** calcular primero lim en x luego en y. Si difieren -> no existe.
2. **Limites radiales:** sustituir y = mx. Si el resultado depende de m -> no existe.
3. **Curvas parabolicas:** sustituir y = mx^2 para detectar dependencia.
4. **Teorema del Sandwich:** Si 0 <= |f(x)| <= g(x) y lim g(x) = 0 -> lim f(x) = 0.
5. **Coordenadas polares:** x = r*cos(theta), y = r*sen(theta). Si |f| -> 0 cuando r -> 0 (para todo theta) -> limite = 0.

### Continuidad

F es continua en x0 si:

```
1. x0 esta en dom(F)
2. Existe lim(x->x0) F(x)
3. lim(x->x0) F(x) = F(x0)
```

> La composicion de funciones continuas es continua. Funciones elementales son continuas en su dominio.

---

## Unidad III — Derivadas Parciales, Diferencial y Derivada Direccional

### Derivadas Parciales (definicion)

```
df/dx (a,b) = lim(h->0) [f(a+h,b) - f(a,b)] / h

df/dy (a,b) = lim(h->0) [f(a,b+h) - f(a,b)] / h
```

En la practica: derivar respecto a una variable tratando las demas como constantes.

### Derivadas Parciales de Orden Superior

```
fxx = d^2f/dx^2     fyy = d^2f/dy^2
fxy = d^2f/dydx     fyx = d^2f/dxdy
```

> **Teorema de Schwarz (Clairaut):** Si fxy y fyx son continuas en un entorno de (a,b), entonces fxy(a,b) = fyx(a,b).

### Gradiente

```
grad f(x0) = (df/dx1(x0), df/dx2(x0), ..., df/dxn(x0))
```

El gradiente apunta en la direccion de maximo crecimiento de f. Su modulo es la tasa maxima de cambio.

### Diferenciabilidad

f : R2 -> R es diferenciable en (x0,y0) si:

```
lim(h,k)->(0,0)  [f(x0+h, y0+k) - f(x0,y0) - fx*h - fy*k] / sqrt(h^2+k^2) = 0
```

> **Condicion suficiente:** Si las derivadas parciales existen y son continuas en un entorno de x0, entonces f es diferenciable en x0 (f es C^1 -> diferenciable).

> **Jerarquia:** Diferenciable => Continua => Existen derivadas parciales. (Los reciprocos NO son validos en general.)

### Plano Tangente y Recta Normal

A la superficie z = f(x,y) en el punto P = (a, b, f(a,b)):

```
Plano tangente:
z - f(a,b) = fx(a,b)*(x-a) + fy(a,b)*(y-b)

Recta normal:
(x,y,z) = (a, b, f(a,b)) + t*(fx(a,b), fy(a,b), -1)
```

### Matriz Jacobiana

Para F : Rn -> Rm con F = (f1, ..., fm), la matriz jacobiana m x n es:

```
F'(x0) = [ dfi/dxj (x0) ]   (i=1..m, j=1..n)
```

### Regla de la Cadena

Si F : Rn -> Rm es diferenciable en x0 y G : Rm -> Rr es diferenciable en F(x0):

```
(G o F)'(x0) = G'(F(x0)) * F'(x0)   [producto de matrices]
```

**Caso escalar z = f(x,y), x = g(t), y = h(t):**

```
dz/dt = (df/dx)*(dx/dt) + (df/dy)*(dy/dt)
```

### Derivada Direccional

Sea u un vector unitario (||u|| = 1):

```
df/du (x0) = lim(t->0) [f(x0 + t*u) - f(x0)] / t
```

Si f es diferenciable:

```
df/du (x0) = grad f(x0) . u
```

- **Maxima** derivada direccional: direccion u = grad f / ||grad f||, valor = ||grad f||
- **Minima:** direccion -grad f / ||grad f||, valor = -||grad f||
- El gradiente es **perpendicular** a las curvas/superficies de nivel

### Funcion Implicita

Si F(x,y,z) = 0 define z implicitamente como funcion de (x,y):

```
dz/dx = -(dF/dx)/(dF/dz)     dz/dy = -(dF/dy)/(dF/dz)
```

Condicion: dF/dz distinto de 0 en el punto considerado.

---

## Unidad IV — Extremos Libres y Ligados - Serie de Taylor

### Polinomio de Taylor de 2do Orden (f : R2 -> R)

```
f(x0+h, y0+k) aprox f(x0,y0) + fx*h + fy*k 
  + (1/2)*(fxx*h^2 + 2*fxy*h*k + fyy*k^2)
```

### Puntos Criticos y Clasificacion

x0 es punto critico si grad f(x0) = 0 (o no existen las derivadas parciales).

```
Matriz Hessiana:
H(x0) = | fxx  fxy |
         | fyx  fyy |

det H = fxx*fyy - (fxy)^2
```

| Condicion | Clasificacion |
|---|---|
| det H > 0 y fxx > 0 | **Minimo local** |
| det H > 0 y fxx < 0 | **Maximo local** |
| det H < 0 | **Punto de ensilladura (silla)** |
| det H = 0 | El criterio no decide |

### Extremos Ligados — Multiplicadores de Lagrange

Optimizar f(x,y,z) sujeto a la restriccion g(x,y,z) = 0:

```
grad f(x0) = lambda * grad g(x0)

Es decir:
fx = lambda * gx
fy = lambda * gy
fz = lambda * gz
g(x,y,z) = 0
```

lambda se llama multiplicador de Lagrange. Se resuelve el sistema para x, y, z, lambda.

> Con dos restricciones g1=0 y g2=0: grad f = lambda * grad g1 + mu * grad g2

---

## Unidad V — Integrales Multiples

### Integral Doble — Teorema de Fubini

```
integral_doble_R f(x,y) dA = integral_a^b [integral_c^d f(x,y) dy] dx

(valido para regiones rectangulares R = [a,b]x[c,d])
```

Para regiones no rectangulares:

```
Tipo I:  integral_doble_D f dA = integral_a^b integral_{g1(x)}^{g2(x)} f(x,y) dy dx
Tipo II: integral_doble_D f dA = integral_c^d integral_{h1(y)}^{h2(y)} f(x,y) dx dy
```

### Cambio a Coordenadas Polares

```
x = r*cos(theta),  y = r*sen(theta)
dA = r * dr * dtheta

integral_doble f(x,y) dA = integral_alpha^beta integral_{r1}^{r2} f(r cos t, r sen t) * r dr dtheta
```

> **No olvidar el factor r** (jacobiano de la transformacion)!

### Integral Triple

```
integral_triple_E f(x,y,z) dV = integral_a^b integral_{g1}^{g2} integral_{h1}^{h2} f dz dy dx
```

**Coordenadas cilindricas:** x=r cos(theta), y=r sen(theta), z=z  ->  dV = r dz dr dtheta

**Coordenadas esfericas:** x=rho sen(phi) cos(theta), y=rho sen(phi) sen(theta), z=rho cos(phi)  ->  dV = rho^2 sen(phi) drho dphi dtheta

### Cambio General de Variables

```
integral_doble_{T(D)} f(x,y) dA = integral_doble_D (f o T) * |det T'| dA

Jacobiano: J = det T' = d(x,y)/d(u,v)
```

---

## Unidad VI — Curvas e Integrales de Linea

### Curva Parametrizada

gamma : [a,b] -> Rn es suave si gamma'(t) distinto de 0 para todo t.

```
Longitud de arco: L = integral_a^b ||gamma'(t)|| dt

||gamma'(t)|| = sqrt[(x'(t))^2 + (y'(t))^2 + (z'(t))^2]
```

### Triedro de Frenet (T, N, B)

```
T(t) = gamma'(t) / ||gamma'(t)||         (tangente unitario)
N(t) = T'(t) / ||T'(t)||                 (normal principal)
B(t) = T(t) x N(t)                       (binormal)

Curvatura:  kappa = ||gamma' x gamma''|| / ||gamma'||^3
Torsion:    tau   = (gamma' x gamma'') . gamma''' / ||gamma' x gamma''||^2
```

### Integral de Linea de Campo Escalar

```
integral_gamma f ds = integral_a^b f(gamma(t)) * ||gamma'(t)|| dt
```

Interpretacion: masa de un alambre de densidad f a lo largo de gamma.

### Integral de Linea de Campo Vectorial (Trabajo)

```
integral_gamma F.dr = integral_a^b F(gamma(t)) . gamma'(t) dt

Notacion alternativa: integral_gamma P dx + Q dy + R dz
```

Interpretacion: trabajo realizado por la fuerza F sobre una particula que recorre gamma.

---

## Unidad VII — Superficies e Integrales de Superficie

### Superficie Parametrizada

```
S(u,v) : D incluido en R2 -> R3

Vector normal: N = Su x Sv
Elemento de area: dS = ||Su x Sv|| du dv
```

### Area de Superficie

```
Para z = g(x,y):
A(S) = integral_doble_D sqrt[1 + (dg/dx)^2 + (dg/dy)^2] dA

Para parametrizacion S(u,v):
A(S) = integral_doble_D ||Su x Sv|| du dv
```

### Integral de Superficie de Campo Escalar

```
integral_doble_S f dS = integral_doble_D f(S(u,v)) * ||Su x Sv|| du dv
```

### Integral de Superficie de Campo Vectorial (Flujo)

```
integral_doble_S F.dS = integral_doble_S F.n dS = integral_doble_D F(S(u,v)) . (Su x Sv) du dv
```

Interpretacion: flujo del campo F a traves de la superficie S.

---

## Unidad VIII — Teoria de Campos Vectoriales

### Divergencia y Rotor

```
div F = nabla.F = dF1/dx + dF2/dy + dF3/dz

rot F = nabla x F = | i      j      k     |
                    | d/dx   d/dy   d/dz  |
                    | F1     F2     F3    |
```

- **div F = 0** -> campo solenoidal (sin fuentes ni sumideros)
- **rot F = 0** -> campo irrotacional

### Campos Conservativos y Funcion Potencial

F es conservativo si existe f escalar tal que F = grad f (f es la funcion potencial).

```
Condicion (dominio simplemente conexo):
rot F = 0  <=>  F conservativo

Independencia del camino:
integral_gamma F.dr = f(B) - f(A)   para cualquier gamma de A a B
```

> Para encontrar f: integrar df/dx = F1 respecto a x, luego determinar la funcion "constante" usando df/dy = F2.

### Teorema de Green (en el plano)

```
integral_cerrada_gamma P dx + Q dy = integral_doble_D (dQ/dx - dP/dy) dA
```

gamma es la frontera de D orientada positivamente (sentido antihorario).

> **Area por Green:** A(D) = (1/2) * integral_cerrada_gamma (-y dx + x dy)

### Teorema de Gauss (Divergencia)

```
integral_doble_S F.dS = integral_triple_E div(F) dV
```

S es la frontera cerrada de E orientada hacia afuera.

### Teorema de Stokes

```
integral_cerrada_gamma F.dr = integral_doble_S rot(F).dS
```

gamma es la frontera de la superficie S. Generaliza Green al espacio tridimensional.

> **Relaciones fundamentales:** rot(grad f) = 0  y  div(rot F) = 0

---

## Unidad IX — Ecuaciones Diferenciales Ordinarias

### EDO de 1er Orden a Variables Separables

```
dy/dx = g(x)/h(y)  ->  h(y) dy = g(x) dx
->  integral h(y) dy = integral g(x) dx + C
```

### EDO Exacta

P(x,y) + Q(x,y)*y' = 0 es exacta si **dP/dy = dQ/dx**.

```
Solucion: f(x,y) = C,  donde  df/dx = P  y  df/dy = Q
```

Se halla f integrando P respecto a x y ajustando con la condicion df/dy = Q.

### EDO Lineal de 1er Orden

```
y' + P(x)*y = Q(x)

Factor integrante: mu(x) = e^{integral P(x) dx}

Solucion: y = (1/mu) * [integral mu*Q dx + C]
```

### Ecuacion de Bernoulli

```
y' + P(x)*y = Q(x)*y^n  (n distinto de 0 y 1)

Sustitucion: v = y^{1-n}  ->  se reduce a EDO lineal
```

### EDO Lineal de 2do Orden con Coeficientes Constantes

```
a*y'' + b*y' + c*y = f(x)

Ecuacion caracteristica: a*r^2 + b*r + c = 0
```

#### Solucion homogenea (f = 0)

| Tipo de raices | Solucion general |
|---|---|
| Reales distintas r1 distinto r2 | yh = C1*e^{r1*x} + C2*e^{r2*x} |
| Raiz real doble r | yh = (C1 + C2*x)*e^{r*x} |
| Complejas r = alfa +/- beta*i | yh = e^{alfa*x}*(C1*cos(beta*x) + C2*sen(beta*x)) |

#### Solucion particular — Coeficientes Indeterminados

| f(x) | Proponer yp |
|---|---|
| Polinomio Pn(x) | x^s * Qn(x), s = multiplicidad de 0 como raiz |
| e^{alfa*x} | x^s * A * e^{alfa*x} |
| sen(beta*x) o cos(beta*x) | x^s * (A*cos(beta*x) + B*sen(beta*x)) |

#### Variacion de Parametros

```
yp = u1(x)*y1 + u2(x)*y2

u1' = -y2*f/W,   u2' = y1*f/W
W = y1*y2' - y1'*y2  (Wronskiano)
```

**Solucion general: y = yh + yp**

### Cuadro Resumen de Tipos de EDO

| Tipo | Identificacion | Metodo |
|---|---|---|
| Variables separables | dy/dx = g(x)/h(y) | Separar e integrar |
| Exacta | dP/dy = dQ/dx | Funcion potencial |
| Lineal 1er orden | y' + P*y = Q | Factor integrante |
| Bernoulli | y' + P*y = Q*y^n | v = y^{1-n} |
| Homogenea 2do orden | a*y''+b*y'+c*y = 0 | Ec. caracteristica |
| No homogenea 2do orden | a*y''+b*y'+c*y = f(x) | CI o Var. de parametros |

---

*Analisis Matematico II · FCEFyN · UNC · Resumen teorico para estudio y consulta*
