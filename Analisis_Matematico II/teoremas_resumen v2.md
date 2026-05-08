# Resumen de Teoremas y Demostraciones
## Cálculo en Varias Variables — Unidades I, II, III y IV

---

## UNIDAD I: Funciones de ℝⁿ en ℝᵖ

### Topología de ℝⁿ

**Definiciones clave:**

- **Bola abierta** de centro x₀ y radio r: Bᵣ(x₀) = {x ∈ ℝⁿ / ‖x − x₀‖ < r}
- **Bola cerrada**: B̄ᵣ(x₀) = {x ∈ ℝⁿ / ‖x − x₀‖ ≤ r}
- **Bola reducida**: B'ᵣ(x₀) = {x ∈ ℝⁿ / 0 < ‖x − x₀‖ < r}

**Puntos asociados a un conjunto A ⊆ ℝⁿ:**

- x₀ es **interior** a A ⟺ ∃r > 0 / Bᵣ(x₀) ⊆ A
- x₀ es **exterior** a A ⟺ ∃r > 0 / Bᵣ(x₀) ⊆ Aᶜ
- x₀ es **frontera** de A ⟺ ∀r > 0: Bᵣ(x₀) ∩ A ≠ ∅ y Bᵣ(x₀) ∩ Aᶜ ≠ ∅
- x₀ es **punto límite (acumulación)** de A ⟺ ∀r > 0: B'ᵣ(x₀) ∩ A ≠ ∅
- x₀ es **aislado** de A ⟺ ∃r > 0 / Bᵣ(x₀) ∩ A = {x₀}

**Conjuntos abiertos y cerrados:**

- A es **abierto** ⟺ A = Int(A) ⟺ A ∩ Fr(A) = ∅
- A es **cerrado** ⟺ Aᶜ es abierto ⟺ Fr(A) ⊆ A

---

## UNIDAD II: Límite y Continuidad

### 1. Definición de Límite en Varias Variables

**f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ** tiene **límite ℓ̄ en x̄₀** si y solo si:

$$\forall \varepsilon \in \mathbb{R}_{>0} : \exists \delta \in \mathbb{R}_{>0} / \forall \bar{x} : \begin{pmatrix} \bar{x} \in D_f \\ 0 < \|\bar{x}-\bar{x}_0\| < \delta \end{pmatrix} \Rightarrow \|\bar{f}(\bar{x}) - \bar{\ell}\| < \varepsilon$$

---

### 2. Teorema del Límite (CNS) ★ Con Demostración

**Enunciado:** Sean f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ, x̄₀ ∈ Acum(Dᶠ), ℓ̄ ∈ ℝᵖ con:
$$\bar{f}(\bar{x}) = \begin{pmatrix} f_1(\bar{x}) \\ \vdots \\ f_p(\bar{x}) \end{pmatrix}, \quad \bar{\ell} = \begin{pmatrix} \ell_1 \\ \vdots \\ \ell_p \end{pmatrix}$$

Entonces:
$$\lim_{\bar{x}\to\bar{x}_0} \bar{f}(\bar{x}) = \bar{\ell} \iff \begin{cases} \lim_{\bar{x}\to\bar{x}_0} f_1(\bar{x}) = \ell_1 \\ \vdots \\ \lim_{\bar{x}\to\bar{x}_0} f_p(\bar{x}) = \ell_p \end{cases}$$

**Demostración (⇒):** Supongo que lim f̄(x̄) = ℓ̄. Dado ε ∈ ℝ₊, por hipótesis:
$$\exists \delta \in \mathbb{R}_{>0} / \forall \bar{x} \in D_f: 0 < \|\bar{x}-\bar{x}_0\| < \delta \Rightarrow \|\bar{f}(\bar{x})-\bar{\ell}\| < \varepsilon$$

Para cada componente i ∈ {1,...,p}, vale la desigualdad:
$$|f_i(\bar{x}) - \ell_i| \leq \|\bar{f}(\bar{x}) - \bar{\ell}\|$$

Por lo tanto el mismo δ sirve para acotar cada componente, y así lim fᵢ(x̄) = ℓᵢ. □

**Demostración (⟸):** Supongo que lim fᵢ(x̄) = ℓᵢ para todo i. Dado ε ∈ ℝ₊, sea ε̃ = ε/√p > 0. Por hipótesis:
$$\exists \delta_i \in \mathbb{R}_{>0} / \forall \bar{x} \in D_f: 0 < \|\bar{x}-\bar{x}_0\| < \delta_i \Rightarrow |f_i(\bar{x}) - \ell_i| < \tilde{\varepsilon}$$

Sea δ = min{δ₁,...,δₚ}. Para todo x̄ ∈ Dᶠ con 0 < ‖x̄−x̄₀‖ < δ se tiene:
$$\|\bar{f}(\bar{x})-\bar{\ell}\|^2 = \sum_{i=1}^p |f_i(\bar{x})-\ell_i|^2 < p \cdot \tilde{\varepsilon}^2 = p \cdot \frac{\varepsilon^2}{p} = \varepsilon^2$$

Por lo tanto ‖f̄(x̄) − ℓ̄‖ < ε. ■

---

### 3. Traslación del Límite

**Enunciado:** Sean f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ, x̄₀ ∈ Acum(Dᶠ) y ℓ̄ ∈ ℝᵖ. Entonces:
$$\lim_{\bar{x}\to\bar{x}_0} \bar{f}(\bar{x}) = \bar{\ell} \iff \lim_{\bar{x}\to\bar{0}} \bar{f}(\bar{x}+\bar{x}_0) = \bar{\ell}$$

---

### 4. Álgebra de Límites (CS de Límite)

**Enunciado:** Si lim φ(x̄) = c, lim f̄(x̄) = ȳ₀, lim ḡ(x̄) = z̄₀ y lim h̄(ȳ) = ℓ̄, entonces:

1. lim [φ(x̄)·f̄(x̄)] = c·ȳ₀
2. lim [f̄(x̄) ± ḡ(x̄)] = ȳ₀ ± z̄₀
3. lim [h̄(f̄(x̄))] = ℓ̄

---

### 5. Unicidad del Límite (CN de Límite) ★ Con Demostración

**Enunciado:** Sean f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ, x̄₀ ∈ Acum(Dᶠ), ℓ̄, m̄ ∈ ℝᵖ. Si:
$$\lim_{\bar{x}\to\bar{x}_0} \bar{f}(\bar{x}) = \bar{\ell} \quad \text{y} \quad \lim_{\bar{x}\to\bar{x}_0} \bar{f}(\bar{x}) = \bar{m}$$

entonces ℓ̄ = m̄.

**Demostración:** Dado ε ∈ ℝ₊, sea ε̃ = ε/2 > 0. Por hipótesis:
$$\exists \delta_\ell : 0 < \|\bar{x}-\bar{x}_0\| < \delta_\ell \Rightarrow \|\bar{f}(\bar{x})-\bar{\ell}\| < \tilde{\varepsilon}$$
$$\exists \delta_m : 0 < \|\bar{x}-\bar{x}_0\| < \delta_m \Rightarrow \|\bar{f}(\bar{x})-\bar{m}\| < \tilde{\varepsilon}$$

Sea δ = min{δ_ℓ, δ_m}. Como x̄₀ ∈ Acum(Dᶠ), existe x̄ ∈ Dᶠ con 0 < ‖x̄−x̄₀‖ < δ. Entonces:
$$\|\bar{\ell}-\bar{m}\| = \|\bar{\ell}-\bar{f}(\bar{x})+\bar{f}(\bar{x})-\bar{m}\| \leq \|\bar{f}(\bar{x})-\bar{\ell}\| + \|\bar{f}(\bar{x})-\bar{m}\| < \tilde{\varepsilon}+\tilde{\varepsilon} = \varepsilon$$

Si ‖ℓ̄ − m̄‖ > 0, tomando ε = ‖ℓ̄ − m̄‖ se obtiene ‖ℓ̄ − m̄‖ < ‖ℓ̄ − m̄‖, lo cual es absurdo. Por lo tanto ‖ℓ̄ − m̄‖ = 0, es decir ℓ̄ = m̄. ■

---

### 6. Límites Restringidos (CN de Límite)

**Enunciado:** Si lim f̄(x̄) = ℓ̄, entonces para cualquier dirección ū ≠ 0̄:
$$\lim_{t \to 0^+} \bar{f}(\bar{x}_0 + t \cdot \bar{u}) = \bar{\ell}$$

**Observaciones importantes:**
- El camino debe estar en el dominio.
- Es condición **necesaria**, no suficiente: si todos los caminos dan el mismo límite, eso **no** garantiza que el global exista.
- Si dos caminos dan límites **distintos** → el límite global **no existe**.

---

### 7. Límites Iterados (CN de Límite)

Si lim f̄(x̄) = ℓ̄ existe (para f: ℝ² → ℝ), entonces los límites iterados existen y coinciden:
$$\lim_{x\to x_0}\left[\lim_{y\to y_0} f(x,y)\right] = \bar{\ell} \quad \text{y} \quad \lim_{y\to y_0}\left[\lim_{x\to x_0} f(x,y)\right] = \bar{\ell}$$

---

### 8. Teorema del Sándwich (CS de Límite)

**Enunciado:** Sean f, g, h: D ⊆ ℝⁿ → ℝ, x̄₀ ∈ Acum(D), ℓ ∈ ℝ tales que para todo x̄ ∈ D:
$$f(\bar{x}) \leq g(\bar{x}) \leq h(\bar{x})$$

Si lim f(x̄) = lim h(x̄) = ℓ, entonces lim g(x̄) = ℓ.

---

### 9. Continuidad en Varias Variables

**Definición:** f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ es **continua en x̄₀** ⟺

- x̄₀ ∈ Dᶠ
- ∃ lim_{x̄→x̄₀} f̄(x̄)
- lim_{x̄→x̄₀} f̄(x̄) = f̄(x̄₀)

**Funciones continuas** (ejemplos conocidos): polinomios, proyecciones, raíces de índice impar, norma, transformaciones lineales, funciones racionales con denominador no nulo, las funciones continuas en una variable.

---

### 10. Continuidad de la Composición ★ Con Demostración

**Enunciado:** Sean f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ y ḡ: Dᵍ ⊆ ℝᵖ → ℝq con x̄₀ ∈ Dᶠ y f̄(x̄₀) ∈ Dᵍ. Si:
- f̄ es continua en x̄₀
- ḡ es continua en f̄(x̄₀)

entonces **ḡ ∘ f̄ es continua en x̄₀**.

**Demostración:**
Como ḡ es continua en f̄(x̄₀), dado ε > 0, existe δ̃ > 0 tal que:
$$\begin{cases} \bar{y} \in D_g \\ \|\bar{y}-\bar{f}(\bar{x}_0)\| < \tilde{\delta} \end{cases} \Rightarrow \|\bar{g}(\bar{y})-\bar{g}(\bar{f}(\bar{x}_0))\| < \varepsilon \quad (1)$$

Como f̄ es continua en x̄₀, para este δ̃ > 0, existe δ > 0 tal que:
$$\begin{cases} \bar{x} \in D_f \\ \|\bar{x}-\bar{x}_0\| < \delta \end{cases} \Rightarrow \|\bar{f}(\bar{x})-\bar{f}(\bar{x}_0)\| < \tilde{\delta} \quad (2)$$

Si x̄ ∈ D_{ḡ∘f̄} con ‖x̄−x̄₀‖ < δ, entonces x̄ ∈ Dᶠ y f̄(x̄) ∈ Dᵍ. Por (2), ‖f̄(x̄)−f̄(x̄₀)‖ < δ̃; aplicando (1):
$$\|\bar{g}(\bar{f}(\bar{x}))-\bar{g}(\bar{f}(\bar{x}_0))\| < \varepsilon \quad \blacksquare$$

---

## UNIDAD III: Derivadas Parciales y La Diferencial

### 11. Derivadas Parciales

**Definición:** La **derivada parcial** de f̄ en x̄₀ respecto de xᵢ es:
$$\frac{\partial \bar{f}}{\partial x_i}(\bar{x}_0) = \lim_{t\to 0} \frac{\bar{f}(\bar{x}_0 + t\cdot\hat{e}_i) - \bar{f}(\bar{x}_0)}{t}$$

**Obs.:** Para puntos regulares (interiores), se calcula derivando respecto de xᵢ con las demás variables fijas. Para puntos patológicos, hay que usar la definición.

---

### 12. Derivadas Direccionales

**Definición:** La **derivada direccional** de f̄ en x̄₀ respecto de û ∈ ℝⁿ es:
$$\frac{\partial \bar{f}}{\partial \hat{u}}(\bar{x}_0) = \lim_{t\to 0} \frac{\bar{f}(\bar{x}_0 + t\cdot\hat{u}) - \bar{f}(\bar{x}_0)}{t}$$

---

### 13. Gradiente

**Definición:** El **gradiente** de f: Dᶠ ⊆ ℝⁿ → ℝ en x̄₀ es:
$$\nabla f(\bar{x}_0) = \left(\frac{\partial f}{\partial x_1}(\bar{x}_0), \ldots, \frac{\partial f}{\partial x_n}(\bar{x}_0)\right)$$

El gradiente es un campo vectorial. Es importante tener enlistadas todas las derivadas parciales porque permiten calcular cualquier derivada direccional (en los casos buenos) sin usar la definición.

---

### 14. Matriz Jacobiana

**Definición:** La **matriz Jacobiana** de f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ en x̄₀ es la matriz p×n:
$$\bar{f}'(\bar{x}_0) = \begin{pmatrix} \frac{\partial f_1}{\partial x_1}(\bar{x}_0) & \cdots & \frac{\partial f_1}{\partial x_n}(\bar{x}_0) \\ \vdots & \ddots & \vdots \\ \frac{\partial f_p}{\partial x_1}(\bar{x}_0) & \cdots & \frac{\partial f_p}{\partial x_n}(\bar{x}_0) \end{pmatrix}$$

Donde cada fila es el gradiente de una función componente: [f̄'(x̄₀)]ᵢⱼ = ∂fᵢ/∂xⱼ.

---

### 15. Diferenciabilidad en Varias Variables

**Definición:** f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ es **diferenciable en x̄₀** ∈ Int(Dᶠ) si existe L: ℝⁿ → ℝᵖ lineal tal que:
$$\lim_{\bar{x}\to\bar{x}_0} \frac{\bar{f}(\bar{x}) - \bar{f}(\bar{x}_0) - L(\bar{x}-\bar{x}_0)}{\|\bar{x}-\bar{x}_0\|} = \bar{0}$$

En ese caso, L es el **diferencial** de f̄ en x̄₀, denotado L = d_{x̄₀}f̄.

---

### 16. Unicidad de la Diferencial (CN) ★ Con Demostración

**Enunciado:** Sean f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ, x̄₀ ∈ Int(Dᶠ), y L, M: ℝⁿ → ℝᵖ lineales. Si L = d_{x̄₀}f̄ y M = d_{x̄₀}f̄, entonces L = M.

**Demostración:** Por hipótesis:
$$\lim_{\bar{x}\to\bar{x}_0} \frac{\bar{f}(\bar{x})-\bar{f}(\bar{x}_0)-L(\bar{x}-\bar{x}_0)}{\|\bar{x}-\bar{x}_0\|} = \bar{0} \quad (1)$$
$$\lim_{\bar{x}\to\bar{x}_0} \frac{\bar{f}(\bar{x})-\bar{f}(\bar{x}_0)-M(\bar{x}-\bar{x}_0)}{\|\bar{x}-\bar{x}_0\|} = \bar{0} \quad (2)$$

Por álgebra de límites (2)−(1):
$$\lim_{\bar{x}\to\bar{x}_0} \frac{L(\bar{x}-\bar{x}_0)-M(\bar{x}-\bar{x}_0)}{\|\bar{x}-\bar{x}_0\|} = \bar{0}$$

Tomo x̄ = x̄₀ + t·û con t > 0. Entonces ‖x̄−x̄₀‖ = t. Aplicando el límite restringido:
$$\lim_{t\to 0^+} \frac{L(t\hat{u})-M(t\hat{u})}{t} = \bar{0}$$

Como L y M son lineales, L(tû) = t·L(û) y M(tû) = t·M(û), por lo tanto:
$$\lim_{t\to 0^+} [L(\hat{u}) - M(\hat{u})] = \bar{0}$$

Esto implica L(û) = M(û) para toda dirección û. Luego L = M. ■

---

### 17. Existencia de Derivadas (CN de Diferenciabilidad) ★ Con Demostración

**Enunciado:** Si ∃ d_{x̄₀}f̄, entonces ∀û ∈ ℝⁿ existe la derivada direccional y:
$$d_{\bar{x}_0}\bar{f}(\hat{u}) = \frac{\partial \bar{f}}{\partial \hat{u}}(\bar{x}_0) = \bar{f}'(\bar{x}_0)\cdot\hat{u}$$

Es decir, la Jacobiana es la matriz del diferencial en la base canónica.

**Demostración:** Sea L = d_{x̄₀}f̄. Por hipótesis:
$$\lim_{\bar{x}\to\bar{x}_0} \frac{\bar{f}(\bar{x})-\bar{f}(\bar{x}_0)-L(\bar{x}-\bar{x}_0)}{\|\bar{x}-\bar{x}_0\|} = \bar{0}$$

Tomo x̄ = x̄₀ + t·û. Entonces ‖x̄−x̄₀‖ = |t|·‖û‖ = |t| = (±1)·t. Aplicando el límite restringido:
$$\bar{0} = \lim_{t\to 0} \frac{\bar{f}(\bar{x}_0+t\hat{u})-\bar{f}(\bar{x}_0)-L(t\hat{u})}{(\pm 1)\cdot t}$$
$$\bar{0} = \lim_{t\to 0} \left[\frac{\bar{f}(\bar{x}_0+t\hat{u})-\bar{f}(\bar{x}_0)}{t} - L(\hat{u})\right]$$
$$L(\hat{u}) = \lim_{t\to 0} \frac{\bar{f}(\bar{x}_0+t\hat{u})-\bar{f}(\bar{x}_0)}{t} = \frac{\partial \bar{f}}{\partial \hat{u}}(\bar{x}_0)$$

Tomando û = ê_i:
$$L(\hat{e}_i) = \frac{\partial \bar{f}}{\partial x_i}(\bar{x}_0) \Rightarrow [L]_\mathcal{C} = \bar{f}'(\bar{x}_0) \quad \blacksquare$$

---

### 18. Continuidad de la Función Diferenciable (CN de Diferenciabilidad) ★ Con Demostración

**Enunciado:** Si ∃ d_{x̄₀}f̄, entonces f̄ es continua en x̄₀.

$$\exists d_{\bar{x}_0}\bar{f} \Rightarrow \bar{f} \in C^0(\bar{x}_0)$$

**Demostración:** Sea L = d_{x̄₀}f̄. Por hipótesis:
$$\lim_{\bar{x}\to\bar{x}_0} \frac{\bar{f}(\bar{x})-\bar{f}(\bar{x}_0)-L(\bar{x}-\bar{x}_0)}{\|\bar{x}-\bar{x}_0\|} = \bar{0} \quad (1)$$

Como la norma y L son continuas:
$$\lim_{\bar{x}\to\bar{x}_0} \|\bar{x}-\bar{x}_0\| = 0 \quad (2)$$
$$\lim_{\bar{x}\to\bar{x}_0} L(\bar{x}-\bar{x}_0) = \bar{0} \quad (3)$$

Por álgebra de límites (2)·(1)+(3):
$$\lim_{\bar{x}\to\bar{x}_0} \left[\bar{f}(\bar{x})-\bar{f}(\bar{x}_0)\right] = \bar{0}$$
$$\lim_{\bar{x}\to\bar{x}_0} \bar{f}(\bar{x}) = \bar{f}(\bar{x}_0) \quad \blacksquare$$

---

### 19. Continuidad de Derivadas Parciales (CS de Diferenciabilidad)

**Enunciado:** Si todas las derivadas parciales ∂f̄/∂xᵢ existen y son continuas en x̄₀, entonces f̄ es diferenciable en x̄₀.

$$\left[\exists \frac{\partial \bar{f}}{\partial x_i}(\bar{x}_0) \text{ y } \frac{\partial \bar{f}}{\partial x_i} \in C^0(\bar{x}_0) \text{ para todo } i\right] \Rightarrow \exists d_{\bar{x}_0}\bar{f}$$

Se dice que f̄ ∈ C¹(x̄₀) (continuamente diferenciable). Si f̄ ∈ C¹, todas las derivadas de f son continuas.

---

### 20. Teorema de Clairaut

**Enunciado:** Sean f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ, x̄₀ ∈ Int(Dᶠ). Si f̄ ∈ C²(Dᶠ), entonces:
$$\forall i,j \in \{1,\ldots,n\}: \quad \frac{\partial^2 \bar{f}}{\partial x_i \partial x_j} = \frac{\partial^2 \bar{f}}{\partial x_j \partial x_i}$$

Es decir, para funciones "buenas" (de clase C²), el orden de derivación no importa.

---

### 21. Derivada Direccional Máxima — Teorema del Gradiente ★ Con Demostración

**Enunciado:** Sean f: Dᶠ ⊆ ℝⁿ → ℝ, x̄₀ ∈ Int(Dᶠ), con f ∈ C¹(Dᶠ) y ∇f(x̄₀) ≠ 0̄. El máximo y mínimo valor de (∂f/∂û)(x̄₀) se alcanzan en las direcciones:

$$\hat{u}_{\max} = \frac{\nabla f(\bar{x}_0)}{\|\nabla f(\bar{x}_0)\|} \quad \text{y} \quad \hat{u}_{\min} = -\frac{\nabla f(\bar{x}_0)}{\|\nabla f(\bar{x}_0)\|}$$

**Demostración:** Como f ∈ C¹, la derivada direccional se calcula como:
$$\frac{\partial f}{\partial \hat{u}}(\bar{x}_0) = \nabla f(\bar{x}_0) \cdot \hat{u} = \|\nabla f(\bar{x}_0)\| \cdot \|\hat{u}\| \cdot \cos\theta = \|\nabla f(\bar{x}_0)\| \cos\theta$$

donde θ es el ángulo entre ∇f(x̄₀) y û. El máximo de cos θ se alcanza cuando θ = 0 (misma dirección), y el mínimo cuando θ = π (direcciones opuestas). ■

**Obs:** El gradiente en un punto es perpendicular al conjunto de nivel por ese punto. Si dx̄ es tangente al CN de f, entonces dz = ∇f · dx̄ = 0, lo que implica dx̄ ⊥ ∇f.

---

### 22. Regla de la Cadena en VV — Teorema de la Función Compuesta ★ Con Demostración

**Enunciado:** Sean ḡ: Dᵍ ⊆ ℝq → ℝⁿ, f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ, ū₀ ∈ ℝq tales que:
1. ḡ ∈ C¹(Dᵍ)
2. f̄ ∈ C¹(Dᶠ)
3. ū₀ ∈ Int(Dᵍ)
4. ḡ(ū₀) ∈ Int(Dᶠ)

Entonces existe un entorno D de ū₀ tal que f̄ ∘ ḡ ∈ C¹(D) y:
$$(f̄ \circ \bar{g})'(\bar{u}) = \bar{f}'[\bar{g}(\bar{u})] \cdot \bar{g}'(\bar{u}) \quad (p\times n)(n\times q) = p\times q$$

La **Regla General de la Cadena** (RGC) establece:
$$\frac{\partial z}{\partial x_i} = \frac{\partial z}{\partial y_1}\frac{\partial y_1}{\partial x_i} + \cdots + \frac{\partial z}{\partial y_p}\frac{\partial y_p}{\partial x_i}$$

**Demostración (esquema):** Sean x̄₀ = ḡ(ū₀), x̄ = ḡ(ū). Como ḡ y f̄ son diferenciables:
$$\Delta\bar{g} = \bar{g}'(\bar{u}_0)\cdot\Delta\bar{u} + E_{\bar{g}}(\bar{u}) \quad \text{donde } \frac{E_{\bar{g}}(\bar{u})}{\|\Delta\bar{u}\|}\to\bar{0}$$
$$\Delta\bar{f} = \bar{f}'(\bar{x}_0)\cdot\Delta\bar{x} + E_{\bar{f}}(\bar{x}) \quad \text{donde } \frac{E_{\bar{f}}(\bar{x})}{\|\Delta\bar{x}\|}\to\bar{0}$$

Sabemos que Δx̄ = Δḡ. Como ḡ ∈ C¹, existe M > 0 tal que ‖Δx̄‖/‖Δū‖ ≤ M. Entonces:
$$\Delta(f̄\circ\bar{g}) = \underbrace{\bar{f}'(\bar{g}(\bar{u}_0))\cdot\bar{g}'(\bar{u}_0)}_* \cdot\Delta\bar{u} + \underbrace{\bar{f}'(\bar{g}(\bar{u}_0))\cdot E_{\bar{g}}(\bar{u}) + E_{\bar{f}}(\bar{x})}_{E_{f̄\circ\bar{g}}(\bar{u})}$$

Se verifica que lim_{ū→ū₀} E_{f̄∘ḡ}(ū)/‖Δū‖ = 0. Por tanto f̄∘ḡ ∈ C¹(x̄₀) y su Jacobiana es ∗. ■

---

### 23. Teorema de la Función Inversa

**Enunciado:** Sean F: Dᶠ ⊆ ℝⁿ → ℝⁿ, x̄₀ ∈ ℝⁿ tales que:
1. F ∈ C¹(Dᶠ)
2. x̄₀ ∈ Int(Dᶠ)
3. det[F'(x̄₀)] ≠ 0

Entonces existen entornos A de x̄₀ y B de F(x̄₀) tales que:
1. ∀x̄ ∈ A: det[F'(x̄)] ≠ 0
2. F: A → B es biyectiva
3. F⁻¹ ∈ C¹(B)
4. ∀x̄ ∈ A: (F⁻¹)'[F(x̄)] = [F'(x̄)]⁻¹

---

### 24. Teorema de la Función Implícita

**Enunciado:** Sean ḡ: Dᵍ ⊆ ℝⁿ⁺ᵖ → ℝᵖ, x̄₀ ∈ ℝⁿ, ȳ₀ ∈ ℝᵖ tales que:
1. ḡ ∈ C¹(Dᵍ)
2. (x̄₀, ȳ₀) ∈ Int(Dᵍ)
3. ḡ(x̄₀, ȳ₀) = 0̄
4. Si ḡ'(x̄₀, ȳ₀) = [ḡ_x | ḡ_y] con ḡ_y ∈ ℝᵖˣᵖ, entonces det[ḡ_y] ≠ 0

Entonces existe f̄: Dᶠ ⊆ ℝⁿ → ℝᵖ tal que:
1. f̄ ∈ C¹(Dᶠ)
2. x̄₀ ∈ Int(Dᶠ)
3. f̄(x̄₀) = ȳ₀
4. ∀x̄ ∈ Dᶠ: ḡ(x̄, f̄(x̄)) = 0̄
5. f̄'(x̄₀) = −[ḡ_y]⁻¹ · [ḡ_x]

---

## UNIDAD IV: Extremos y Criterios

### 25. Condición Necesaria de Extremo Libre (CN de ELib)

**Definición:** x̄₀ ∈ Int(Dᶠ) es **punto crítico** de f si ∇f(x̄₀) = 0̄.

**Teorema (CN de ELib):** Si x̄₀ ∈ Int(Dᶠ) es extremo de f y f ∈ C¹(Dᶠ), entonces:
$$\bar{x}_0 \text{ es extremo} \Rightarrow \bar{x}_0 \text{ es punto crítico} \quad (\nabla f(\bar{x}_0) = \bar{0})$$

**Obs:** Todo extremo es punto crítico, pero no todo punto crítico es extremo (puede ser punto silla).

---

### 26. Condición Suficiente de Extremo Libre — Teorema de la Hessiana ★ Con Demostración

**Definición — Matriz Hessiana:** Para f: Dᶠ ⊆ ℝⁿ → ℝ escalar:
$$H_f = f'' = \begin{bmatrix} \frac{\partial^2 f}{\partial x_1^2} & \cdots & \frac{\partial^2 f}{\partial x_1\partial x_n} \\ \vdots & \ddots & \vdots \\ \frac{\partial^2 f}{\partial x_n\partial x_1} & \cdots & \frac{\partial^2 f}{\partial x_n^2} \end{bmatrix}$$

**Teorema (CS de ELib — Hessiana):** Sean f: Dᶠ ⊆ ℝⁿ → ℝ, f ∈ C²(Dᶠ), x̄₀ ∈ Int(Dᶠ) punto crítico.

a) Si f''(x̄₀) es **definida positiva** → x̄₀ es **mínimo local** (mL) de f.  
b) Si f''(x̄₀) es **definida negativa** → x̄₀ es **máximo local** (ML) de f.  
c) Si f''(x̄₀) tiene autovalores de distinto signo → x̄₀ es **punto silla** de f.

**Cómo determinar la definitud de f'':**

- **Para matrices 2×2:** Si det(A) > 0 → usar menores principales. Si det(A) < 0 → punto silla.
- **Criterio de menores principales:** Sea A = f''(x̄₀) simétrica:
  - Si todos los menores principales son positivos → definida positiva (mL)
  - Si tienen signos alternados empezando por − → definida negativa (ML)
  - Si alguno es cero → el criterio no sirve (buscar autovalores)

**Para matrices 2×2 (atajo):** Si f''(x̄₀) = [[a, b], [b, d]]:
- det(A) = λ₁·λ₂ (producto de autovalores)
- Si det(A) < 0 → es punto silla (AVL de signo distinto)
- Si det(A) > 0 → usar menores principales para clasificar

**Obs:** A es definida positiva ⟺ todos sus AVL son positivos. A es definida negativa ⟺ todos sus AVL son negativos.

---

### 27. Extremos Ligados — Método de Multiplicadores de Lagrange (CN de ELig)

**Contexto:** Extremos de f sobre Fr(Dᶠ) cuando Fr(Dᶠ) = CN_ḡ(0̄) (forma implícita).

**Método:** Los candidatos a extremos ligados son las soluciones del sistema ∇H = 0̄ donde:
$$H(\bar{x}, \bar{\lambda}) = f(\bar{x}) \pm \bar{\lambda} \cdot \bar{g}(\bar{x})$$

con tantos λᵢ como ecuaciones tiene ḡ (ecuaciones que definen la frontera). El sistema es:
$$\begin{cases} \nabla_x H = \nabla f \pm \bar{\lambda}\cdot\nabla\bar{g} = \bar{0} \\ \nabla_\lambda H = \bar{g}(\bar{x}) = \bar{0} \end{cases}$$

Es decir, en los extremos ligados: **∇f = λ · ∇g** (el gradiente de f es paralelo al de g en la frontera).

---

### 28. Condición Necesaria de Extremo Ligado — Método de Composición (CNS de ELig)

**Alternativa:** Se usa cuando Fr(Dᶠ) se conoce en forma **paramétrica**: Fr(Dᶠ) = Im_{h̄}.

Los extremos ligados de f se obtienen como los extremos **libres** de la composición g = f ∘ h̄.

---

### Resumen del Proceso para Extremos (esquema general)

**Extremos libres (interior):**
1. Encontrar puntos críticos: resolver ∇f(x̄) = 0̄
2. Calcular Hessiana f''(x̄) en cada punto crítico
3. Analizar definitud de f''(x̄) con menores principales o autovalores
4. Clasificar: mL, ML, o punto silla

**Extremos ligados (frontera):**
- Si Fr es implícita (CN_ḡ(0̄)): usar MML → resolver ∇H = 0̄
- Si Fr es paramétrica (Im_{h̄}): usar composición → extremos libres de g = f∘h̄

**Comparar:** Los extremos globales se determinan comparando todos los valores encontrados (libres y ligados) evaluando f en cada candidato.

---

## Diagrama de Implicaciones

> **CN** = condición necesaria &nbsp;|&nbsp; **CS** = condición suficiente &nbsp;|&nbsp; **CNS** = necesaria y suficiente

### LÍMITE

| Si... | | Entonces... | Tipo |
|---|:---:|---|:---:|
| Existe el límite global | → | Existen todos los límites restringidos | CN |
| Dos caminos dan valores distintos | → | No existe el límite global | CN |
| f es continua en x₀ | → | El límite existe e igual a f(x₀) | CS |
| Álgebra de Límites / T. Sándwich / AFC | → | Existe el límite | CS |
| Límite global existe | → | Los límites iterados existen e igualan al global | CN |

### DIFERENCIABILIDAD

| Si... | | Entonces... | Tipo |
|---|:---:|---|:---:|
| f es diferenciable en x₀ | → | f es continua en x₀ | CN |
| f es diferenciable en x₀ | → | Existen todas las derivadas direccionales | CN |
| f es diferenciable en x₀ | → | ∂f/∂û(x₀) = ∇f(x₀)·û = f′(x₀)·û | CN |
| f es diferenciable en x₀ | → | El diferencial es único | CN |
| Todas las ∂f/∂xᵢ existen y son continuas en x₀ | → | f es diferenciable en x₀ (f ∈ C¹) | CS |

### EXTREMOS

| Si... | | Entonces... | Tipo |
|---|:---:|---|:---:|
| x₀ ∈ Int(D) es extremo libre de f | → | x₀ es punto crítico: ∇f(x₀) = 0 | CN |
| x₀ punto crítico, f′′(x₀) definida positiva | → | x₀ es mínimo local | CS |
| x₀ punto crítico, f′′(x₀) definida negativa | → | x₀ es máximo local | CS |
| x₀ punto crítico, f′′(x₀) tiene AVL de distinto signo | → | x₀ es punto silla | CS |
| x₀ es extremo ligado, Fr implícita = CN\_g(0) | → | x₀ satisface el sistema MML: ∇f = λ·∇g | CN |
| Fr paramétrica = Im\_h, extremos ligados de f | → | Son extremos libres de g = f∘h | CNS |

---

*Basado en los apuntes de: Unidad 1 (Funciones de ℝⁿ en ℝᵖ), Unidad 2 (Límite y Continuidad), Unidad 3A (Formalismo del Cálculo Diferencial) y Unidad 3B (Aplicaciones Básicas del Cálculo Diferencial).*
