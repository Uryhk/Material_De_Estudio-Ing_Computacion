# Análisis Matemático I - Material para Final

## Resumen Teórico y Ejercicios

---

# PARTE 1: TEORÍA

## 1. Números Reales y Funciones

### 1.1 Números Reales

**Definición**: El conjunto de los números reales ℝ está formado por la unión de los números racionales (ℚ) e irracionales (I):
- ℝ = ℚ ∪ I

**Propiedades fundamentales**:
- Cuerpo ordenado completo
- Axiomas de orden: tricotomía y transitividad
- Propiedad arquimediana

### 1.2 Intervalos

**Tipos de intervalos**:
- Abierto: (a, b) = {x ∈ ℝ | a < x < b}
- Cerrado: [a, b] = {x ∈ ℝ | a ≤ x ≤ b}
- Semiabiertos: [a, b), (a, b]
- Infinitos: [a, ∞), (−∞, b], ℝ

### 1.3 Valor Absoluto

**Definición**: |a| = { a si a ≥ 0; −a si a < 0 }

**Propiedades importantes**:
1. |ab| = |a||b|
2. |a + b| ≤ |a| + |b| (desigualdad triangular)
3. Si a > 0 y |x| ≤ a ⇔ −a ≤ x ≤ a
4. Si a > 0 y |x| ≥ a ⇔ x ∈ (−∞, −a] ∪ [a, ∞)

**Distancia**: d(a, b) = |b − a|

### 1.4 Funciones

**Definición**: Una función f: A → B asigna a cada elemento de A un único elemento de B.

**Conceptos clave**:
- Dominio: Dom(f) = {x ∈ A | ∃f(x)}
- Imagen: Im(f) = {y ∈ B | ∃x ∈ A: y = f(x)}

**Clasificación**:
- **Inyectiva**: x₁ ≠ x₂ ⇒ f(x₁) ≠ f(x₂)
- **Suryectiva**: Im(f) = B
- **Biyectiva**: inyectiva y suryectiva

**Paridad**:
- **Par**: f(−x) = f(x), ∀x ∈ Dom(f)
- **Impar**: f(−x) = −f(x), ∀x ∈ Dom(f)

### 1.5 Funciones Elementales

**Función lineal**: f(x) = mx + b
- m: pendiente
- b: ordenada al origen

**Función cuadrática**: f(x) = ax² + bx + c (a ≠ 0)
- Vértice: (−b/2a, f(−b/2a))
- Raíces: x = (−b ± √(b² − 4ac))/2a

**Función exponencial**: f(x) = aˣ (a > 0, a ≠ 1)
- Dom(f) = ℝ, Im(f) = (0, ∞)
- Siempre inyectiva y creciente si a > 1

**Función logarítmica**: f(x) = log_a(x) (a > 0, a ≠ 1)
- Dom(f) = (0, ∞), Im(f) = ℝ
- Inversa de la exponencial

**Funciones trigonométricas**:
- sen(x), cos(x): Dom = ℝ, Im = [−1, 1], período 2π
- tan(x): Dom = ℝ − {(2k+1)π/2}, Im = ℝ, período π

---

## 2. Límites

### 2.1 Definición de Límite

**Definición (ε-δ)**: lim_{x→a} f(x) = ℓ si:
∀ε > 0, ∃δ > 0 tal que si 0 < |x − a| < δ ⇒ |f(x) − ℓ| < ε

**Límites laterales**:
- Por derecha: lim_{x→a⁺} f(x) = ℓ_d
- Por izquierda: lim_{x→a⁻} f(x) = ℓ_i

**Teorema**: lim_{x→a} f(x) = ℓ ⇔ lim_{x→a⁺} f(x) = lim_{x→a⁻} f(x) = ℓ

### 2.2 Propiedades de Límites

Sean lim_{x→a} f(x) = ℓ y lim_{x→a} g(x) = m:

1. lim_{x→a} [f(x) ± g(x)] = ℓ ± m
2. lim_{x→a} [f(x) · g(x)] = ℓ · m
3. lim_{x→a} [f(x)/g(x)] = ℓ/m (si m ≠ 0)
4. lim_{x→a} [cf(x)] = c·ℓ
5. lim_{x→a} [f(x)]ⁿ = ℓⁿ

### 2.3 Límites Notables

1. **lim_{x→0} sen(x)/x = 1**
2. **lim_{x→0} (1−cos(x))/x = 0**
3. **lim_{x→0} (1−cos(x))/x² = 1/2**
4. **lim_{x→∞} (1 + 1/x)ˣ = e**
5. **lim_{x→0} (eˣ − 1)/x = 1**
6. **lim_{x→0} ln(1+x)/x = 1**
7. **lim_{x→0} (aˣ − 1)/x = ln(a)**
8. **lim_{x→0} (1+x)^α − 1)/x = α**

### 2.4 Límites Infinitos y Asíntotas

**Límite infinito**: lim_{x→a} f(x) = ∞ si f(x) crece sin cota cuando x → a

**Asíntota vertical**: x = a es AV si:
- lim_{x→a⁺} f(x) = ±∞ o lim_{x→a⁻} f(x) = ±∞

**Asíntota horizontal**: y = b es AH si:
- lim_{x→∞} f(x) = b o lim_{x→−∞} f(x) = b

**Asíntota oblicua**: y = mx + b es AO si:
- m = lim_{x→∞} f(x)/x
- b = lim_{x→∞} [f(x) − mx]

### 2.5 Indeterminaciones y L'Hôpital

**Formas indeterminadas**: 0/0, ∞/∞, 0·∞, ∞−∞, 0⁰, ∞⁰, 1^∞

**Regla de L'Hôpital**: Si lim_{x→a} f(x)/g(x) es 0/0 o ∞/∞:
```
lim_{x→a} f(x)/g(x) = lim_{x→a} f'(x)/g'(x)
```
(si el límite del lado derecho existe)

**Ejemplos importantes**:
```
lim_{x→0} (eˣ − 1)/x = lim_{x→0} eˣ/1 = 1

lim_{x→0} (1−cos(x))/x² = lim_{x→0} sen(x)/(2x) = lim_{x→0} cos(x)/2 = 1/2

lim_{x→∞} ln(x)/x = lim_{x→∞} (1/x)/1 = 0
```

---

## 3. Continuidad

### 3.1 Definición

**Definición**: f es continua en x = a si:
1. f(a) está definida
2. lim_{x→a} f(x) existe
3. lim_{x→a} f(x) = f(a)

**Continuidad lateral**:
- Continua por derecha en a: lim_{x→a⁺} f(x) = f(a)
- Continua por izquierda en a: lim_{x→a⁻} f(x) = f(a)

### 3.2 Tipos de Discontinuidad

**Discontinuidad evitable**: ∃ lim_{x→a} f(x) = ℓ (finito) pero f(a) ≠ ℓ o f(a) no existe

**Discontinuidad inevitable**:
- **Salto finito**: lim_{x→a⁺} f(x) ≠ lim_{x→a⁻} f(x) (ambos finitos)
- **Salto infinito**: algún límite lateral es infinito

### 3.3 Teoremas Importantes

**Teorema de Bolzano (Valor Intermedio)**: Si f es continua en [a,b] y N está entre f(a) y f(b), entonces ∃c ∈ (a,b) tal que f(c) = N.

**Teorema de Weierstrass**: Si f es continua en [a,b], entonces f alcanza su máximo y mínimo absolutos en [a,b].

**Álgebra de funciones continuas**: Si f y g son continuas en a:
- f ± g, f·g, f/g (si g(a) ≠ 0) son continuas en a
- f ∘ g es continua si g continua en a y f continua en g(a)

---

## 4. Derivadas

### 4.1 Definición

**Derivada en un punto**: 
```
f'(a) = lim_{h→0} [f(a+h) − f(a)]/h = lim_{x→a} [f(x) − f(a)]/(x−a)
```

**Interpretación geométrica**: f'(a) es la pendiente de la recta tangente al gráfico de f en (a, f(a))

**Ecuación de la recta tangente**: y = f'(a)(x − a) + f(a)

### 4.2 Derivadas Laterales

- **Derecha**: f'₊(a) = lim_{h→0⁺} [f(a+h) − f(a)]/h
- **Izquierda**: f'₋(a) = lim_{h→0⁻} [f(a+h) − f(a)]/h

**Teorema**: f'(a) existe ⇔ f'₊(a) = f'₋(a)

### 4.3 Derivabilidad y Continuidad

**Teorema**: Si f es derivable en a (con derivada finita) ⇒ f es continua en a

**IMPORTANTE**: El recíproco NO es válido. Ejemplo: f(x) = |x| es continua en x = 0 pero no derivable.

### 4.4 Tabla de Derivadas

| Función | Derivada |
|---------|----------|
| c (constante) | 0 |
| x | 1 |
| xⁿ | n·xⁿ⁻¹ |
| √x | 1/(2√x) |
| 1/x | −1/x² |
| eˣ | eˣ |
| aˣ | aˣ·ln(a) |
| ln(x) | 1/x |
| log_a(x) | 1/(x·ln(a)) |
| sen(x) | cos(x) |
| cos(x) | −sen(x) |
| tan(x) | sec²(x) = 1/cos²(x) |
| cot(x) | −csc²(x) = −1/sen²(x) |
| sec(x) | sec(x)·tan(x) |
| csc(x) | −csc(x)·cot(x) |
| arcsen(x) | 1/√(1−x²) |
| arccos(x) | −1/√(1−x²) |
| arctan(x) | 1/(1+x²) |

### 4.5 Reglas de Derivación

**Álgebra de derivadas**:
1. [cf(x)]' = c·f'(x)
2. [f(x) ± g(x)]' = f'(x) ± g'(x)
3. [f(x)·g(x)]' = f'(x)·g(x) + f(x)·g'(x) (regla del producto)
4. [f(x)/g(x)]' = [f'(x)·g(x) − f(x)·g'(x)]/[g(x)]² (regla del cociente)

**Regla de la cadena**: [f(g(x))]' = f'(g(x))·g'(x)

**Ejemplos de regla de la cadena**:
- [sen(x²)]' = cos(x²)·2x
- [e^(3x)]' = e^(3x)·3
- [ln(x²+1)]' = [1/(x²+1)]·2x
- [(x²+1)⁵]' = 5(x²+1)⁴·2x

**Derivación logarítmica**: Para calcular [f(x)^{g(x)}]':
1. y = f(x)^{g(x)}
2. ln(y) = g(x)·ln(f(x))
3. y'/y = g'(x)·ln(f(x)) + g(x)·f'(x)/f(x)
4. y' = f(x)^{g(x)}·[g'(x)·ln(f(x)) + g(x)·f'(x)/f(x)]

**Ejemplo**: [x^x]'
```
y = x^x
ln(y) = x·ln(x)
y'/y = 1·ln(x) + x·(1/x) = ln(x) + 1
y' = x^x(ln(x) + 1)
```

### 4.6 Derivadas de Orden Superior

**Notación**:
- Primera derivada: f'(x), f^(1)(x), dy/dx
- Segunda derivada: f''(x), f^(2)(x), d²y/dx²
- n-ésima derivada: f^(n)(x), dⁿy/dxⁿ

**Ejemplo**:
```
f(x) = x⁴
f'(x) = 4x³
f''(x) = 12x²
f'''(x) = 24x
f^(4)(x) = 24
f^(5)(x) = 0
```

---

## 5. Aplicaciones de la Derivada

### 5.1 Teoremas Fundamentales

**Teorema de Rolle**: Si f es continua en [a,b], derivable en (a,b) y f(a) = f(b), entonces ∃c ∈ (a,b) tal que f'(c) = 0.

**Teorema del Valor Medio (Lagrange)**: Si f es continua en [a,b] y derivable en (a,b), entonces ∃c ∈ (a,b) tal que:
```
f'(c) = [f(b) − f(a)]/(b−a)
```

**Interpretación geométrica**: Existe al menos un punto donde la tangente es paralela a la secante que une los extremos.

### 5.2 Extremos y Puntos Críticos

**Punto crítico**: c es punto crítico de f si:
- c es punto interior del dominio
- f'(c) = 0 o f'(c) no existe

**Condición necesaria**: Si f tiene un extremo local en c ⇒ c es punto crítico

**IMPORTANTE**: No todo punto crítico es un extremo.

### 5.3 Criterios para Extremos

**Primer criterio (cambio de signo de f')**:
Sea c punto crítico:
- Si f' cambia de + a − en c ⇒ **máximo local**
- Si f' cambia de − a + en c ⇒ **mínimo local**
- Si f' no cambia de signo ⇒ **no es extremo**

**Segundo criterio (usando f'')**:
Sea f'(c) = 0:
- Si f''(c) > 0 ⇒ **mínimo local**
- Si f''(c) < 0 ⇒ **máximo local**
- Si f''(c) = 0 ⇒ **no decide** (usar primer criterio)

**Ejemplo completo**:
```
f(x) = x³ − 3x² + 4

f'(x) = 3x² − 6x = 3x(x − 2)
Puntos críticos: x = 0, x = 2

Método 1 (primer criterio):
      (−∞, 0)    (0, 2)    (2, ∞)
f'       +         −         +
f        ↗         ↘         ↗

Máximo local en x = 0: f(0) = 4
Mínimo local en x = 2: f(2) = 0

Método 2 (segundo criterio):
f''(x) = 6x − 6
f''(0) = −6 < 0 ⇒ máximo local
f''(2) = 6 > 0 ⇒ mínimo local
```

### 5.4 Crecimiento y Decrecimiento

**Teorema**: Sea f derivable en intervalo abierto I:
- Si f'(x) > 0 ∀x ∈ I ⇒ f es **estrictamente creciente** en I
- Si f'(x) < 0 ∀x ∈ I ⇒ f es **estrictamente decreciente** en I
- Si f'(x) = 0 ∀x ∈ I ⇒ f es **constante** en I

**Procedimiento**:
1. Calcular f'(x)
2. Encontrar puntos críticos (f'(x) = 0 o no existe)
3. Hacer tabla de signos
4. Determinar intervalos de monotonía

### 5.5 Concavidad y Puntos de Inflexión

**Concavidad**:
- **Cóncava hacia arriba (convexa) ⌣**: Si f''(x) > 0 en I
- **Cóncava hacia abajo (cóncava) ⌢**: Si f''(x) < 0 en I

**Punto de inflexión**: (c, f(c)) es punto de inflexión si:
- f cambia de concavidad en c
- Equivalentemente: f'' cambia de signo en c

**Candidatos a puntos de inflexión**: Valores donde f''(x) = 0 o f''(x) no existe.

**Ejemplo**:
```
f(x) = x³ − 6x²

f'(x) = 3x² − 12x
f''(x) = 6x − 12 = 6(x − 2)

Candidato: x = 2

      (−∞, 2)    (2, ∞)
f''      −         +
f        ⌢         ⌣

Punto de inflexión en (2, f(2)) = (2, −16)
```

### 5.6 Análisis Completo de Funciones

**Metodología estándar**:

1. **Dominio**: Determinar Dom(f)
2. **Intersecciones con ejes**:
   - Eje y: f(0)
   - Eje x: resolver f(x) = 0
3. **Paridad**: Verificar si f(−x) = f(x) o f(−x) = −f(x)
4. **Asíntotas**:
   - Verticales: límites en puntos fuera del dominio
   - Horizontales: lim_{x→±∞} f(x)
   - Oblicuas: m = lim_{x→∞} f(x)/x, b = lim_{x→∞} [f(x)−mx]
5. **Primera derivada f'(x)**:
   - Puntos críticos
   - Intervalos de crecimiento/decrecimiento
   - Extremos locales
6. **Segunda derivada f''(x)**:
   - Candidatos a puntos de inflexión
   - Intervalos de concavidad
   - Puntos de inflexión
7. **Gráfico aproximado**: Con toda la información anterior
8. **Imagen**: Determinar Im(f)

**Ejemplo completo**:
```
f(x) = x³/3 − x² − 3x + 1

1. Dominio: ℝ

2. Intersecciones:
   - f(0) = 1 → (0, 1)
   - Raíces: difíciles de calcular exactamente

3. Paridad: Ninguna

4. Asíntotas: Ninguna (polinómica)

5. f'(x) = x² − 2x − 3 = (x−3)(x+1)
   Puntos críticos: x = −1, x = 3
   
   Tabla de signos:
         (−∞,−1)  (−1,3)   (3,∞)
   f'       +       −        +
   f        ↗       ↘        ↗
   
   Máximo local: (−1, 7/3)
   Mínimo local: (3, −17)

6. f''(x) = 2x − 2 = 2(x−1)
   Candidato: x = 1
   
         (−∞,1)   (1,∞)
   f''      −       +
   f        ⌢       ⌣
   
   Punto de inflexión: (1, −5/3)

7. Gráfico: [Bosquejar con la información]

8. Imagen: ℝ
```

### 5.7 Problemas de Optimización

**Metodología**:
1. Identificar la variable a optimizar (función objetivo)
2. Expresar en términos de una sola variable
3. Determinar el dominio relevante
4. Encontrar puntos críticos
5. Evaluar en puntos críticos y extremos del dominio
6. Seleccionar el óptimo

**Ejemplo típico**: 
```
Construir una caja rectangular sin tapa con 12 m² de material.
Maximizar el volumen.

Variables: base cuadrada lado x, altura h
Restricción: x² + 4xh = 12
Función objetivo: V = x²h

De la restricción: h = (12−x²)/(4x)
Sustituir: V(x) = x²·(12−x²)/(4x) = (12x−x³)/4

Dom: x > 0 y 12−x² ≥ 0 → x ∈ (0, 2√3)

V'(x) = (12−3x²)/4
V'(x) = 0 → x² = 4 → x = 2

V''(x) = −6x/4 = −3x/2
V''(2) = −3 < 0 → máximo

Dimensiones óptimas: x = 2, h = 1
Volumen máximo: V = 2 m³
```

---

## 6. Integrales

### 6.1 Integral Indefinida

**Definición**: ∫f(x)dx = P(x) + C donde P'(x) = f(x)

La integral indefinida es el conjunto de todas las primitivas (antiderivadas) de f.

**Propiedades**:
1. ∫[f(x) ± g(x)]dx = ∫f(x)dx ± ∫g(x)dx
2. ∫k·f(x)dx = k·∫f(x)dx (k constante)
3. Si F'(x) = f(x), entonces ∫f(x)dx = F(x) + C

### 6.2 Tabla de Integrales Inmediatas

| Función | Integral |
|---------|----------|
| k | kx + C |
| xⁿ (n≠−1) | xⁿ⁺¹/(n+1) + C |
| 1/x | ln\|x\| + C |
| eˣ | eˣ + C |
| aˣ | aˣ/ln(a) + C |
| sen(x) | −cos(x) + C |
| cos(x) | sen(x) + C |
| sec²(x) = 1/cos²(x) | tan(x) + C |
| csc²(x) = 1/sen²(x) | −cot(x) + C |
| sec(x)tan(x) | sec(x) + C |
| csc(x)cot(x) | −csc(x) + C |
| 1/(1+x²) | arctan(x) + C |
| 1/√(1−x²) | arcsen(x) + C |
| 1/(a²+x²) | (1/a)arctan(x/a) + C |
| 1/√(a²−x²) | arcsen(x/a) + C |

**Integrales inmediatas importantes**:
```
∫tan(x)dx = −ln|cos(x)| + C = ln|sec(x)| + C
∫cot(x)dx = ln|sen(x)| + C
∫sec(x)dx = ln|sec(x) + tan(x)| + C
∫csc(x)dx = ln|csc(x) − cot(x)| + C
```

### 6.3 Método de Sustitución

**Fórmula**: Si u = g(x), entonces:
```
∫f(g(x))·g'(x)dx = ∫f(u)du = F(u) + C = F(g(x)) + C
```

**Pasos**:
1. Identificar u = g(x)
2. Calcular du = g'(x)dx
3. Sustituir en la integral
4. Integrar respecto a u
5. Volver a la variable original

**Ejemplos**:

```
1) ∫2x·e^(x²)dx
   u = x², du = 2xdx
   = ∫e^u du = e^u + C = e^(x²) + C

2) ∫sen(3x)dx
   u = 3x, du = 3dx → dx = du/3
   = (1/3)∫sen(u)du = −(1/3)cos(u) + C = −(1/3)cos(3x) + C

3) ∫x/√(x²+1)dx
   u = x²+1, du = 2xdx → xdx = du/2
   = (1/2)∫u^(−1/2)du = (1/2)·2u^(1/2) + C = √(x²+1) + C

4) ∫tan(x)dx = ∫sen(x)/cos(x)dx
   u = cos(x), du = −sen(x)dx
   = −∫(1/u)du = −ln|u| + C = −ln|cos(x)| + C

5) ∫x²/(x³+1)dx
   u = x³+1, du = 3x²dx → x²dx = du/3
   = (1/3)∫(1/u)du = (1/3)ln|u| + C = (1/3)ln|x³+1| + C
```

### 6.4 Integración por Partes

**Fórmula**: ∫u·dv = u·v − ∫v·du

Equivalentemente: ∫f(x)·g'(x)dx = f(x)·g(x) − ∫f'(x)·g(x)dx

**Criterio para elegir u y dv**:
Usar la regla **ILATE** (en orden de prioridad para u):
- **I**nversas trigonométricas (arcsen, arctan, etc.)
- **L**ogarítmicas (ln(x), log(x))
- **A**lgebraicas (x, x², polinomios)
- **T**rigonométricas (sen, cos, tan)
- **E**xponenciales (eˣ, aˣ)

**Ejemplos**:

```
1) ∫x·eˣdx
   u = x → du = dx
   dv = eˣdx → v = eˣ
   = x·eˣ − ∫eˣdx = x·eˣ − eˣ + C = eˣ(x−1) + C

2) ∫ln(x)dx
   u = ln(x) → du = (1/x)dx
   dv = dx → v = x
   = x·ln(x) − ∫x·(1/x)dx = x·ln(x) − x + C

3) ∫x²·sen(x)dx
   u = x² → du = 2xdx
   dv = sen(x)dx → v = −cos(x)
   = −x²cos(x) + ∫2x·cos(x)dx
   
   Para ∫2x·cos(x)dx:
   u = 2x → du = 2dx
   dv = cos(x)dx → v = sen(x)
   = 2x·sen(x) − ∫2sen(x)dx = 2x·sen(x) + 2cos(x) + C
   
   Resultado final:
   = −x²cos(x) + 2x·sen(x) + 2cos(x) + C

4) ∫x·arctan(x)dx
   u = arctan(x) → du = dx/(1+x²)
   dv = xdx → v = x²/2
   = (x²/2)arctan(x) − ∫(x²/2)·dx/(1+x²)
