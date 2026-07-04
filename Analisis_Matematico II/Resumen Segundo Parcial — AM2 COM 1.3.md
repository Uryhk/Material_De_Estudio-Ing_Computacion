# Resumen Segundo Parcial — AM2 COM 1.3

**Análisis Matemático 2 · Año 2026 ·  Basado en: U4 (Integrales Múltiples), U5 (Curvas), U6 (Superficies), U7 (Campos Vectoriales), U8 (EDO)

---

## UNIDAD 4: INTEGRALES MÚLTIPLES

### Integral de Riemann en Varias Variables

**Def.:** Sean $f: D_f \subseteq \mathbb{R}^n \to \mathbb{R}$ y $D \subseteq D_f$ acotado. $f$ es **integrable** en $D$ si existe el límite:

$\int_D f(\bar{x}), d^n\bar{x} = \lim_{|P|\to 0} \sum_{\alpha \in P} f_D(\bar{x}_\alpha), \Delta^n\bar{x}$

donde $f_D(\bar{x}) = f(\bar{x})$ si $\bar{x} \in D$, y $0$ si $\bar{x} \notin D \cap D_f$.

### Integrales Iteradas y Teorema de Fubini

Para un dominio $D = {(x,y) : y \in [c,d],\ x \in [g_1(y), g_2(y)]}$:

$\iint_D f, dxdy = \int_c^d dy \int_{g_1(y)}^{g_2(y)} f(x,y), dx$

**Teorema de Fubini:** Si existe la integral iterada y la integral de Riemann, ambas son iguales.

**Obs.:** Los límites más interiores pueden depender de las variables más exteriores, no al revés.

### Propiedades de Integrales Múltiples

1. **Linealidad:** $\int_D (\alpha f + \beta g), d^n\bar{x} = \alpha \int_D f + \beta \int_D g$
2. **Partición:** $\int_{D_1 \cup D_2} f = \int_{D_1} f + \int_{D_2} f$ (si $D_1 \cap D_2$ tiene medida nula)
3. **Simetría par:** Si $f$ es par en $x$ y $D$ simétrico en $x$: $\int_D f = 2\int_{D^+} f$
4. **Simetría impar:** Si $f$ es impar en $x$ y $D$ simétrico en $x$: $\int_D f = 0$
5. **Monotonía:** $f \leq g$ en $D \Rightarrow \int_D f \leq \int_D g$

### Existencia de la Integral (CS de Integrabilidad)

Si $f$ es **continua a trozos** en $D$ y $D$ es un **conjunto liso** (de medida de borde nula), entonces $f$ es integrable en $D$.

### Cambio de Variable en VV

Sean $f$ y $\bar{g}: D_{\bar{g}} \subseteq \mathbb{R}^n \to D \subseteq \mathbb{R}^n$ tales que:

1. $f$ continua a trozos en $D = \text{Im}(\bar{g})$
2. $\bar{g} \in C^1(D_{\bar{g}})$
3. $|\bar{g}'(\bar{u})| \neq 0$ en $\bar{g}^{-1}(D)$

Entonces:

$\int_D f(\bar{x}), d^n\bar{x} = \int_{\bar{g}^{-1}(D)} f(\bar{g}(\bar{u}))\cdot |\bar{g}'(\bar{u})|, d^n\bar{u}$

**Pasos:** (1) renovar el dominio, (2) renovar el integrando, (3) renovar el diferencial con el Jacobiano.

**Interpretación geométrica:** El Jacobiano $|\bar{g}'(\bar{u})|$ mide cuánto estira o comprime localmente la transformación $\bar{g}$. Regiones donde $|\bar{g}'| > 1$ se expanden; donde $|\bar{g}'| < 1$ se contraen.

### Jacobianos Notable




| Cambio        | Transformación $(x,y,z)$                                             | $\|\bar{g}'\|$   |
| ------------- | -------------------------------------------------------------------- | ---------------- |
| $Polares$     | $(r\cos\theta,\; r\sin\theta)$                                       | $r$              |
| $Cilindricas$ | $(r\cos\theta,\; r\sin\theta,\; z)$                                  | $r$              |
| $Esfericas$   | $(r\sin\varphi\cos\theta,\; r\sin\varphi\sin\theta,\; r\cos\varphi)$ | $r^2\sin\varphi$ |
| $Reescaleo$   | $(Au,\; Bv,\; Cw)$                                                   | $ABC$            |

### Aplicaciones

- **Área** de $D \subseteq \mathbb{R}^2$: $A(D) = \iint_D 1, d^2\bar{x}$
- **Volumen** de $D \subseteq \mathbb{R}^3$: $V(D) = \iiint_D 1, d^3\bar{x}$
- **Volumen n-dimensional** de $D \subseteq \mathbb{R}^n$: $V_n(D) = \int_D 1, d^n\bar{x}$
- **Promedio** de $f$ en $D$: $\bar{f} = \dfrac{1}{V_n(D)} \int_D f, d^n\bar{x}$

---

## UNIDAD 5: CURVAS

### La Curva como Función

**Def.:** Una función de tipo curva es $\gamma: [a,b] \subseteq \mathbb{R} \to \mathbb{R}^p$, con $\gamma(t) = (\gamma_1(t), \ldots, \gamma_p(t))$.

- La **imagen** $\text{Im}(\gamma)$ es la curva en $\mathbb{R}^p$ (conjunto de puntos recorridos).
- El **grafo** es la curva en $\mathbb{R}^{1+p}$ (pares $(t, \gamma(t))$).
- Usaremos siempre $\gamma \in C^1[a,b]$.

### Curvas y Parametrizaciones

**Parametrizaciones equivalentes:** $\gamma: [a,b] \to \mathbb{R}^p$ y $\beta: [c,d] \to \mathbb{R}^p$ son **equivalentes** si existe $t: [c,d] \to [a,b]$ con:

1. $t \in C^1[c,d]$
2. $t' > 0$ en $[c,d]$
3. $\beta = \gamma \circ t$

Si $t' > 0$: misma orientación. Si $t' < 0$: orientación opuesta (parametrización inversa $-C$).

**Curva regular:** $C \subseteq \mathbb{R}^p$ es regular si existe $\gamma: [a,b] \to \mathbb{R}^p$ tal que $C = \text{Im},\gamma$ con:

1. $\gamma \in C^1[a,b]$
2. $\gamma'(t) \neq \bar{0}$ en $[a,b]$
3. $\gamma$ inyectiva en $(a,b)$ (y $\gamma(a) = \gamma(b)$ permitido para curvas cerradas)

$C$ es **regular a trozos** si es unión finita de curvas regulares.

### Longitud de Arco

$$L(C) = \int_a^b |\gamma'(t)|, dt$$

**Obs.:** No depende de la parametrización elegida.

### Integral de Línea de Campo Escalar (ILCE)

**Def.:** Sean $f: D_f \subseteq \mathbb{R}^n \to \mathbb{R}$ y $C \subseteq D_f$ curva regular a trozos con parametrización $\gamma: [a,b] \to C$:

$\int_C f(\bar{x}), d\ell = \int_a^b f[\gamma(t)]\cdot |\gamma'(t)|, dt$

**Propiedades:**

- **No** depende de la parametrización ni de la orientación.
- Caso particular: $\int_C 1, d\ell = L(C)$.
- Promedio de $f$ en $C$: $\text{Prom}(f,C) = \dfrac{1}{L(C)}\int_C f, d\ell$.

### Integral de Línea de Campo Vectorial (ILCV)

**Def.:** Sean $F: D_F \subseteq \mathbb{R}^n \to \mathbb{R}^n$ y $C \subseteq D_F$ curva regular a trozos con $\gamma: [a,b] \to C$:

$\int_C F(\bar{x})\cdot d\bar{\ell} = \int_a^b F[\gamma(t)]\cdot \gamma'(t), dt$

**Propiedades:**

- El **módulo** no depende de la parametrización.
- El **signo** depende de la orientación: $\int_{-C} F\cdot d\bar{\ell} = -\int_C F\cdot d\bar{\ell}$.
- Interpretación física: **trabajo** de $F$ a lo largo de $C$.

**Efecto de cambiar parametrización:**

- ILCE (campo escalar): el resultado **no cambia** (ni con orientación inversa).
- ILCV (campo vectorial): el resultado **cambia de signo** si se invierte la orientación.

### Geometría Diferencial de Curvas (Parámetros Locales)

Para $\gamma \in C^2[a,b]$ regular:

| Parámetro                   | Definición                                         |
| --------------------------- | -------------------------------------------------- |
| **Versor tangente**         | $\hat{T} = \dfrac{\gamma'(t)}{\|\gamma'(t)\|}$     |
| **Curvatura**               | $\kappa = \dfrac{\|\hat{T}'(t)\|}{\|\gamma'(t)\|}$ |
| **Radio de oscilación**     | $\rho = \dfrac{1}{\kappa}$                         |
| **Versor normal principal** | $\hat{N} = \dfrac{\hat{T}'(t)}{\|\hat{T}'(t)\|}$   |
| **Versor binormal**         | $\hat{B} = \hat{T} \times \hat{N}$                 |
| **Triedro de Frenet**       | $(\hat{T}, \hat{N}, \hat{B})$ base ortonormal      |

---

## UNIDAD 6: SUPERFICIES

### La Superficie como Función

**Def.:** Una superficie paramétrica es $\bar{h}: D_{\bar{h}} \subseteq \mathbb{R}^2 \to \mathbb{R}^3$, con $\bar{h} \in C^1$ y $D_{\bar{h}}$ compacto.

**Vectores tangentes** (columnas de $\bar{h}'$):

$\frac{\partial \bar{h}}{\partial u},\quad \frac{\partial \bar{h}}{\partial v} \in \mathbb{R}^3$

**Vector normal** (producto vectorial):

$\bar{n} = \frac{\partial \bar{h}}{\partial u} \times \frac{\partial \bar{h}}{\partial v}, \qquad \hat{n} = \frac{\bar{n}}{|\bar{n}|} \quad \text{(versor normal)}$

### Superficie Regular y Área

**Superficie regular:** $S \subseteq \mathbb{R}^3$ es regular si existe $\bar{h}: D_{\bar{h}} \to S$ con $\bar{h} \in C^1$, $\bar{h}$ inyectiva en $\text{Int}(D_{\bar{h}})$ y $\bar{n} \neq \bar{0}$.

$S$ es **regular a trozos** si es unión finita de superficies regulares.

**Diferenciales:**

- $da = |\bar{n}|, d^2\bar{u}$ → diferencial de área (escalar)
- $d\bar{a} = \hat{n}, da = \bar{n}, d^2\bar{u}$ → diferencial de superficie (vectorial)

**Área:**

$A(S) = \int_S da = \int_{D_{\bar{h}}} \left|\frac{\partial \bar{h}}{\partial u} \times \frac{\partial \bar{h}}{\partial v}\right| d^2\bar{u}$

### Integral de Superficie de Campo Escalar (ISCE)

**Def.:** Sean $f: D_f \subseteq \mathbb{R}^3 \to \mathbb{R}$ y $S \subseteq D_f$ superficie regular a trozos con $\bar{h}$:

$\int_S f(\bar{x}), da = \int_{D_{\bar{h}}} f[\bar{h}(\bar{u})]\left|\frac{\partial \bar{h}}{\partial u} \times \frac{\partial \bar{h}}{\partial v}\right| d^2\bar{u}$

**Propiedades:**

- **No** depende de la parametrización ni de la orientación.
- Caso particular: $\int_S 1, da = A(S)$.

### Integral de Superficie de Campo Vectorial (ISCV) — Flujo

**Def.:** Sean $F: D_F \subseteq \mathbb{R}^3 \to \mathbb{R}^3$ y $S \subseteq D_F$ superficie regular orientada con $\bar{h}$:

$\int_S F(\bar{x})\cdot d\bar{a} = \int_S F\cdot \hat{n}, da = \int_{D_{\bar{h}}} F[\bar{h}(\bar{u})]\cdot \left(\frac{\partial \bar{h}}{\partial u} \times \frac{\partial \bar{h}}{\partial v}\right) d^2\bar{u}$

**Propiedades:**

- El **módulo** no depende de la parametrización.
- El **signo** depende de la orientación.

**Efecto de cambiar parametrización:**

- ISCE (campo escalar): el resultado **no cambia**.
- ISCV (campo vectorial): el resultado **cambia de signo** si se invierte la orientación.

---

## UNIDAD 7: CAMPOS VECTORIALES

### Divergencia

**Def.:** Sea $F: D_F \subseteq \mathbb{R}^n \to \mathbb{R}^n$, $F \in C^1(D_F)$. La **divergencia** de $F$ en $\bar{x}_0$ es:

$\text{div}_F(\bar{x}_0) = \nabla \cdot F = \frac{\partial F_1}{\partial x_1} + \cdots + \frac{\partial F_n}{\partial x_n} = \text{tr}[F'(\bar{x}_0)]$

**Interpretación:** Mide la expansión/contracción del campo en $\bar{x}_0$.

- $\text{div}_F > 0$: fuente (flechas divergen desde el punto).
- $\text{div}_F < 0$: sumidero (flechas convergen al punto).
- $\text{div}_F \approx 0$: el campo pasa de largo.

### Rotor en $\mathbb{R}^2$

**Def.:** Sea $F: D_F \subseteq \mathbb{R}^2 \to \mathbb{R}^2$, $F \in C^1(D_F)$. El **rotor** de $F$ en $\bar{x}_0$ es (un escalar):

$\text{rot}_F(\bar{x}_0) = \frac{\partial F_2}{\partial x} - \frac{\partial F_1}{\partial y}$

**Interpretación:** Mide la rotación antihoraria del campo alrededor de $\bar{x}_0$.

### Rotor en $\mathbb{R}^3$

**Def.:** Sea $F: D_F \subseteq \mathbb{R}^3 \to \mathbb{R}^3$, $F \in C^1(D_F)$. El **rotor** de $F$ en $\bar{x}_0$ es (un vector):

$\overrightarrow{\text{rot}}_F = \nabla \times F = \begin{pmatrix} \partial_y F_3 - \partial_z F_2 \ \partial_z F_1 - \partial_x F_3 \ \partial_x F_2 - \partial_y F_1 \end{pmatrix}$

**Interpretación:** Su dirección indica el eje de máxima rotación local.

**Equivalencias entre gradiente, rotor y divergencia:**

- $F = \nabla\phi \Rightarrow \nabla \times F = \bar{0}$ (gradiente implica irrotacional)
- $F = \nabla \times G \Rightarrow \nabla \cdot F = 0$ (rotor implica divergencia nula)
- En dominio simplemente conexo: $\nabla \times F = \bar{0} \Rightarrow F = \nabla\phi$

### Campo Gradiente y Función Potencial

**Def.:** $F: D \subseteq \mathbb{R}^n \to \mathbb{R}^n$ es **gradiente** (o campo conservativo) si existe $\phi \in C^1(D)$ tal que $\nabla\phi = F$ en $D$. $\phi$ se llama **función potencial** de $F$.

### Campo Irrotacional

**Def.:** $F \in C^1(D)$ es **irrotacional** si $F'$ es simétrica:

$\frac{\partial F_i}{\partial x_j} = \frac{\partial F_j}{\partial x_i} \quad \forall, i,j$

En $\mathbb{R}^2$: $\text{rot}_F = 0$. En $\mathbb{R}^3$: $\overrightarrow{\text{rot}}_F = \bar{0}$.

### Campo Conservativo e Independencia del Camino

**Def.:** $F$ es **conservativo** en $D$ si $\oint_C F\cdot d\bar{\ell} = 0$ para toda curva cerrada $C \subseteq D$.

**Equivalentemente:** $\int_C F\cdot d\bar{\ell}$ depende solo de los extremos, no del camino.

**En dominio simplemente conexo:**

$F \text{ gradiente} \iff F \text{ conservativo} \iff F \text{ irrotacional}$

### Obtención de la Función Potencial

Dado $F$ irrotacional (verificar $\partial_j F_i = \partial_i F_j$), hallar $\phi$ tal que $\nabla\phi = F$:

**Método 1 — Integración directa (cruzada):**

1. Integrar $F_1$ en $x$: $\phi = \int F_1, dx = \phi_1(x,y) + C_1(y)$
2. Derivar en $y$ e igualar con $F_2$: $\partial_y \phi = F_2 \Rightarrow$ hallar $C_1(y)$
3. (En $\mathbb{R}^3$: repetir con $z$ e $F_3$)

**Método 2 — Camino radial:**

$\phi(\bar{x}) = \int_0^1 F(t\bar{x})\cdot \bar{x}, dt + C$

**Método 3 — Camino telescópico** (en $\mathbb{R}^2$):

$\phi(x,y) = \int_0^x F_1(t,0), dt + \int_0^y F_2(x,t), dt + C$

### Teoremas Fundamentales del Cálculo (sin demostración)

#### Teorema de Green

Sea $F$ campo $C^1$ en $D \subseteq \mathbb{R}^2$ simple a trozos, con borde $\partial D$ orientado positivamente (antihorario):

$\int_D \text{rot}*F, d^2\bar{x} = \oint*{\partial D} F\cdot d\bar{\ell}$

**Uso:** Convierte integral de línea sobre el borde en integral doble sobre la región (o viceversa). También se puede expresar como:

$\iint_D \left(\frac{\partial F_2}{\partial x} - \frac{\partial F_1}{\partial y}\right) dA = \oint_{\partial D} F_1, dx + F_2, dy$

#### Teorema de Stokes

Sea $F$ campo $C^1$ y $S$ superficie orientada con borde $\partial S$ orientado consistentemente:

$\int_S (\nabla \times F)\cdot d\bar{a} = \oint_{\partial S} F\cdot d\bar{\ell}$

**Uso:** Generaliza Green al espacio. Relaciona el flujo del rotor a través de $S$ con la circulación sobre $\partial S$.

#### Teorema de Gauss (Divergencia)

Sea $F$ campo $C^1$ y $V \subseteq \mathbb{R}^3$ con borde $\partial V$ orientado hacia afuera:

$\int_V (\nabla\cdot F), d^3\bar{x} = \oint_{\partial V} F\cdot d\bar{a}$

**Uso:** Convierte integral de volumen de la divergencia en flujo a través de la superficie de borde.

---

## UNIDAD 8: ECUACIONES DIFERENCIALES ORDINARIAS (EDO)

### Forma General y Clasificación

Una **EDO lineal** de orden $n$ tiene la forma:

$A_n(x)\cdot y^{(n)} + \cdots + A_1(x)\cdot y' + A_0(x)\cdot y = B(x)$

- **Homogénea** si $B(x) = 0$; **inhomogénea** si $B(x) \neq 0$.
- **Con coeficientes constantes** si todos los $A_i \in \mathbb{R}$ son constantes.
- **Normalizada** si $A_n(x) = 1$.

**Prueba de linealidad:** $y, y', \ldots, y^{(n)}$ no deben estar multiplicados entre sí ni elevados a potencias distintas de 1. La variable $x$ sí puede multiplicar libremente.

### Propiedades Básicas de las Soluciones

**Teorema:** Sean $y_1, \ldots, y_k$ soluciones de la EDO lineal **homogénea**. Entonces toda combinación lineal $y_H = C_1 y_1 + \cdots + C_k y_k$ también es solución.

**Estructura de la solución general:**

$y_G = y_P + y_H$

donde $y_P$ es **una** solución particular de la inhomogénea e $y_H$ es la solución general de la homogénea.

**Obs.:** La solución general de la homogénea de orden $n$ tiene exactamente $n$ constantes libres.

---

### Métodos para EDO de Primer Orden

#### 1. Factor Integrante — EDO Lineal de 1° Orden

Sirve para EDO de la forma (normalizada):

$y' + p(x)\cdot y = q(x)$

**Desarrollo:**

1. Calcular el **factor integrante**: $\mu(x) = e^{\int p(x), dx}$
2. Multiplicar la EDO por $\mu$: se reconoce $(\mu \cdot y)' = \mu \cdot q$
3. Integrar ambos lados:

$\mu(x)\cdot y = \int \mu(x)\cdot q(x), dx + C_1$

**Solución general:**

$y_G = \frac{1}{\mu(x)}\left[\int \mu(x)\cdot q(x), dx + C_1\right] \qquad \text{con } \mu = e^{\int p, dx}$

#### 2. Bernoulli — EDO No Lineal Reducible a Lineal

Sirve para EDO de la forma:

$y' + p(x)\cdot y = q(x)\cdot y^\alpha \qquad (\alpha \neq 0, 1)$

**Desarrollo:**

1. Dividir por $y^\alpha$: $y^{-\alpha} y' + p(x)\cdot y^{1-\alpha} = q(x)$
2. Sustituir $z = y^{1-\alpha}$ → $z' = (1-\alpha), y^{-\alpha} y'$, con lo que la ecuación se convierte en:

$z' + (1-\alpha), p(x)\cdot z = (1-\alpha), q(x)$

3. Resolver por factor integrante (es lineal en $z$).
4. Despejar $y = z^{1/(1-\alpha)}$.

#### 3. Variables Separables

Sirve para EDO de la forma $q(y)\cdot y' = p(x)$:

1. Separar: $q(y), dy = p(x), dx$
2. Integrar ambos lados:

$\int q(y), dy = \int p(x), dx \implies Q(y) = P(x) + C_1$

3. Despejar $y$ si es posible.

#### 4. Diferencial Exacta

Sirve para EDO de la forma $P(x,y), dx + Q(x,y), dy = 0$:

1. **Verificar exactitud:** $\dfrac{\partial Q}{\partial x} = \dfrac{\partial P}{\partial y}$

2. Si se cumple, existe $\phi(x,y)$ tal que $\dfrac{\partial\phi}{\partial x} = P$ y $\dfrac{\partial\phi}{\partial y} = Q$.

3. Hallar $\phi$ por integración cruzada (igual que encontrar función potencial).

4. La solución general es $\phi(x,y) = C_1$.

---

### EDO Lineales a Coeficientes Constantes

#### Caso Homogéneo de Orden 2

EDO: $y'' + b\cdot y' + c\cdot y = 0$

**Método:** Proponer $y = e^{\lambda x}$ → buscar raíces del **polinomio indicial** $\lambda^2 + b\lambda + c = 0$:

$$\lambda_\pm = \frac{-b \pm \sqrt{b^2 - 4c}}{2}$

| Tipo de raíces                                    | Solución homogénea                                    |
| ------------------------------------------------- | ----------------------------------------------------- |
| Reales distintas: $\lambda_+ \neq \lambda_-$      | $y_H = C_1 e^{\lambda_+ x} + C_2 e^{\lambda_- x}$     |
| Reales iguales: $\lambda_+ = \lambda_- = \lambda$ | $y_H = C_1 e^{\lambda x} + C_2 x e^{\lambda x}$       |
| Complejas: $\lambda_\pm = r \pm i\omega$          | $y_H = e^{rx}(C_1\cos(\omega x) + C_2\sin(\omega x))$ |

#### Caso Inhomogéneo de Orden 2: Coeficientes Indeterminados

EDO: $y'' + b\cdot y' + c\cdot y = B(x)$

**Pasos:**

1. Resolver la homogénea → $y_H$
2. Proponer $y_P$ según $B(x)$ (ver tabla)
3. Reemplazar $y_P$ en la EDO y resolver el sistema para los coeficientes
4. Solución general: $y_G = y_P + y_H$

**Tabla de $y_P$ según $B(x)$:**

| $B(x)$                                            | Proponer $y_P$                                                                                                                   |
| ------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| $e^{\lambda x}$                                   | $Ae^{\lambda x}$ (si $\lambda$ no es raíz); $Axe^{\lambda x}$ (si $\lambda$ es raíz simple); $Ax^2e^{\lambda x}$ (si raíz doble) |
| $\cos(kx)$ o $\sin(kx)$                           | $A\cos(kx) + B\sin(kx)$                                                                                                          |
| $x^n$                                             | $B_n x^n + \cdots + B_1 x + B_0$                                                                                                 |
| $e^{\lambda x}\cos(kx)$ o $e^{\lambda x}\sin(kx)$ | $e^{\lambda x}(A\cos(kx) + B\sin(kx))$                                                                                           |
| $x^n e^{\lambda x}$                               | $e^{\lambda x}(B_n x^n + \cdots + B_0)$                                                                                          |
| Suma de anteriores                                | Suma de los $y_P$ correspondientes                                                                                               |

---

## Tabla Resumen de Teoremas (sin demostración)

| Teorema                       | Enunciado                                                                       |
| ----------------------------- | ------------------------------------------------------------------------------- |
| **Existencia de la Integral** | $f$ continua a trozos en $D$ liso $\Rightarrow$ integrable en $D$               |
| **Cambio de Variable**        | $int_D f, d^n\bar{x} = \int_{\bar{g}^{-1}(D)} f(\bar{g})\cdot$                  |
| **Green**                     | $\int_D \text{rot}*F, d^2\bar{x} = \oint*{\partial D} F\cdot d\bar{\ell}$       |
| **Stokes**                    | $\int_S (\nabla\times F)\cdot d\bar{a} = \oint_{\partial S} F\cdot d\bar{\ell}$ |
| **Gauss**                     | $\int_V (\nabla\cdot F), d^3\bar{x} = \oint_{\partial V} F\cdot d\bar{a}$       |
| **Función Potencial**         | $F$ irrotacional en dominio s.c. $\iff$ $\exists,\phi$ con $\nabla\phi = F$     |
