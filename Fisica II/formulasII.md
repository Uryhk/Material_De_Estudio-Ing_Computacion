# MACHETE DE FÍSICA 2 — VERSIÓN CORREGIDA Y COMPLETA

---

## 1. CONSTANTES FUNDAMENTALES

| Constante | Símbolo | Valor | Unidad |
|-----------|---------|-------|--------|
| Constante de Coulomb | $$k = \frac{1}{4\pi\varepsilon_0}$$ | $$8,99 \times 10^9$$ | $$\text{N·m}^2/\text{C}^2$$ |
| Permitividad del vacío | $$\varepsilon_0$$ | $$8,85 \times 10^{-12}$$ | $$\text{C}^2/(\text{N·m}^2)$$ |
| Permeabilidad del vacío | $$\mu_0$$ | $$4\pi \times 10^{-7}$$ | $$\text{T·m/A}$$ |
| Carga elemental | $$e$$ | $$1,6 \times 10^{-19}$$ | $$\text{C}$$ |
| Velocidad de la luz | $$c$$ | $$3 \times 10^8$$ | $$\text{m/s}$$ |

---

## 2. ELECTROSTÁTICA

### 2.1 Conceptos fundamentales

**Cuantización de la carga**
$$Q = n e \quad [\text{C}], \quad n \in \mathbb{Z}$$

**Ley de Coulomb** (fuerza entre cargas puntuales)
$$F = \frac{k |q_1 q_2|}{r^2} = \frac{1}{4\pi\varepsilon_0} \frac{|q_1 q_2|}{r^2} \quad [\text{N}]$$

**Campo eléctrico** — definición
$$\vec{E} = \frac{\vec{F}}{q_0} \quad \left[\frac{\text{N}}{\text{C}}\right]$$

**Campo de carga puntiforme**
$$\vec{E} = \frac{1}{4\pi\varepsilon_0} \frac{q}{r^2} \hat{r} \quad \left[\frac{\text{N}}{\text{C}}\right]$$

**Fuerza sobre carga en campo E**
$$\vec{F} = q \vec{E} \quad [\text{N}]$$

**Principio de superposición**
$$\vec{E}_{\text{total}} = \vec{E}_1 + \vec{E}_2 + \cdots + \vec{E}_n$$

### 2.2 Dipolo eléctrico

**Momento dipolar**
$$\vec{p} = q \vec{d} \quad [\text{C·m}]$$

**Par de torsión sobre dipolo**
$$\tau = pE \sin \theta \quad [\text{N·m}]$$

**Energía potencial del dipolo**
$$U = -\vec{p} \cdot \vec{E} = -pE \cos \theta \quad [\text{J}]$$

### 2.3 Campos de distribuciones continuas

**Anillo de carga** (radio $$a$$, carga $$Q$$, sobre el eje $$x$$)
$$E_x = \frac{1}{4\pi\varepsilon_0} \frac{Qx}{(x^2 + a^2)^{3/2}} \quad \left[\frac{\text{N}}{\text{C}}\right]$$

**Disco uniformemente cargado** (radio $$R$$, densidad $$\sigma$$)
$$E_x = \frac{\sigma}{2\varepsilon_0} \left[1 - \frac{x}{\sqrt{x^2 + R^2}}\right] \quad \left[\frac{\text{N}}{\text{C}}\right]$$

**Plano infinito** (densidad superficial $$\sigma$$)
$$E = \frac{\sigma}{2\varepsilon_0} \quad \left[\frac{\text{N}}{\text{C}}\right]$$

**Línea infinita** (densidad lineal $$\lambda$$)
$$E = \frac{\lambda}{2\pi\varepsilon_0 r} \quad \left[\frac{\text{N}}{\text{C}}\right]$$

---

## 3. LEY DE GAUSS

### 3.1 Forma integral
$$\Phi_E = \oint_S \vec{E} \cdot d\vec{A} = \frac{Q_{\text{enc}}}{\varepsilon_0} \quad \left[\frac{\text{N·m}^2}{\text{C}}\right]$$

### 3.2 Aplicaciones por geometría

| Geometría | Región | Campo eléctrico |
|-----------|--------|-----------------|
| **Esfera conductora** (R, Q) | $$r > R$$ | $$E = \frac{1}{4\pi\varepsilon_0} \frac{Q}{r^2}$$ |
| | $$r < R$$ | $$E = 0$$ |
| | $$r = R$$ | $$E = \frac{\sigma}{\varepsilon_0} = \frac{1}{4\pi\varepsilon_0} \frac{Q}{R^2}$$ |
| **Esfera no conductora** (R, Q) | $$r > R$$ | $$E = \frac{1}{4\pi\varepsilon_0} \frac{Q}{r^2}$$ |
| | $$r < R$$ | $$E = \frac{1}{4\pi\varepsilon_0} \frac{Qr}{R^3} = \frac{\rho r}{3\varepsilon_0}$$ |
| **Cilindro conductor** (R, λ) | $$r > R$$ | $$E = \frac{\lambda}{2\pi\varepsilon_0 r}$$ |
| | $$r < R$$ | $$E = 0$$ |
| **Cilindro no conductor** (R, ρ) | $$r > R$$ | $$E = \frac{\lambda}{2\pi\varepsilon_0 r},\; \lambda = \rho \pi R^2$$ |
| | $$r < R$$ | $$E = \frac{\rho r}{2\varepsilon_0}$$ |
| **Lámina aislante infinita** | cualquier $$r$$ | $$E = \frac{\sigma}{2\varepsilon_0}$$ |
| **Conductor plano infinito** | exterior | $$E = \frac{\sigma}{\varepsilon_0}$$ |
| | interior | $$E = 0$$ |
| **Dos planos paralelos** $$+\sigma, -\sigma$$ | entre placas | $$E = \frac{\sigma}{\varepsilon_0}$$ |
| | exterior | $$E = 0$$ |

---

## 4. POTENCIAL ELÉCTRICO

### 4.1 Definiciones fundamentales

**Potencial eléctrico**
$$V = \frac{U}{q_0} \quad [\text{V} = \text{J/C}]$$

**Diferencia de potencial**
$$V_A - V_B = -\int_A^B \vec{E} \cdot d\vec{l} \quad [\text{V}]$$

**Potencial de carga puntual**
$$V = \frac{1}{4\pi\varepsilon_0} \frac{q}{r} \quad [\text{V}]$$

**Potencial de sistema de cargas**
$$V = \sum_i \frac{1}{4\pi\varepsilon_0} \frac{q_i}{r_i} \quad [\text{V}]$$

**Energía potencial eléctrica** (dos cargas)
$$U = \frac{1}{4\pi\varepsilon_0} \frac{qQ}{r} \quad [\text{J}]$$

**Energía potencial de sistema de N cargas**
$$U = \frac{1}{4\pi\varepsilon_0} \sum_{i<j} \frac{q_i q_j}{r_{ij}} \quad [\text{J}]$$

**Trabajo de la fuerza eléctrica**
$$W_{A\to B} = q(V_A - V_B) = -\Delta U \quad [\text{J}]$$

**Relación campo-potencial**
$$\vec{E} = -\nabla V \quad \Rightarrow \quad E_x = -\frac{\partial V}{\partial x},\; E_y = -\frac{\partial V}{\partial y},\; E_z = -\frac{\partial V}{\partial z} \quad \left[\frac{\text{V}}{\text{m}}\right]$$

### 4.2 Potencial por geometría

| Geometría | Región | Potencial |
|-----------|--------|-----------|
| **Esfera conductora** (R, Q) | $$r > R$$ | $$V = \frac{1}{4\pi\varepsilon_0} \frac{Q}{r}$$ |
| | $$r \leq R$$ | $$V = \frac{1}{4\pi\varepsilon_0} \frac{Q}{R} = \text{cte}$$ |
| **Esfera no conductora** (R, Q) | $$r > R$$ | $$V = \frac{1}{4\pi\varepsilon_0} \frac{Q}{r}$$ |
| | $$r \leq R$$ | $$V = \frac{Q}{8\pi\varepsilon_0 R} \left(3 - \frac{r^2}{R^2}\right)$$ |
| **Cilindro conductor** (R, λ) | diferencia | $$V_a - V_b = \frac{\lambda}{2\pi\varepsilon_0} \ln\left(\frac{r_b}{r_a}\right)$$ |
| **Anillo de carga** (a, Q) | sobre el eje | $$V = \frac{1}{4\pi\varepsilon_0} \frac{Q}{\sqrt{x^2 + a^2}}$$ |
| | centro | $$V = \frac{1}{4\pi\varepsilon_0} \frac{Q}{a}$$ |

---

## 5. CAPACITORES Y DIELÉCTRICOS

### 5.1 Capacitancia

**Definición**
$$C = \frac{Q}{V} \quad [\text{F} = \text{C/V}]$$

| Tipo | Capacitancia |
|------|--------------|
| **Placas paralelas** (A, d) | $$C = \frac{\varepsilon_0 A}{d}$$ |
| **Placas con dieléctrico** (K) | $$C = \frac{K\varepsilon_0 A}{d} = \frac{\varepsilon A}{d}$$ |
| **Esférico** ($$r_a < r_b$$) | $$C = 4\pi\varepsilon_0 \frac{r_a r_b}{r_b - r_a}$$ |
| **Esfera aislada** | $$C = 4\pi\varepsilon_0 R$$ |
| **Cilíndrico** (L, $$r_a < r_b$$) | $$C = \frac{2\pi\varepsilon_0 L}{\ln(r_b/r_a)}$$ |

### 5.2 Asociación de capacitores

**Serie**
$$\frac{1}{C_{\text{eq}}} = \frac{1}{C_1} + \frac{1}{C_2} + \cdots + \frac{1}{C_n}$$

**Paralelo**
$$C_{\text{eq}} = C_1 + C_2 + \cdots + C_n$$

### 5.3 Energía y densidad de energía

**Energía almacenada**
$$U = \frac{Q^2}{2C} = \frac{1}{2}CV^2 = \frac{QV}{2} \quad [\text{J}]$$

**Densidad de energía eléctrica**
$$u = \frac{1}{2}\varepsilon_0 E^2 \quad \left[\frac{\text{J}}{\text{m}^3}\right]$$
$$u = \frac{1}{2}K\varepsilon_0 E^2 \quad \text{(con dieléctrico)}$$

### 5.4 Efectos del dieléctrico (constante $$K = \varepsilon_r$$)

| Condición | $$Q$$ | $$V$$ | $$E$$ | $$C$$ | $$U$$ |
|-----------|-------|-------|-------|-------|-------|
| **Batería desconectada** (Q cte) | constante | $$V = V_0/K$$ | $$E = E_0/K$$ | $$C = K C_0$$ | $$U = U_0/K$$ |
| **Batería conectada** (V cte) | $$Q = K Q_0$$ | constante | $$E = E_0$$ | $$C = K C_0$$ | $$U = K U_0$$ |

---

## 6. CORRIENTE ELÉCTRICA

### 6.1 Conceptos fundamentales

**Corriente eléctrica**
$$I = \frac{dQ}{dt} \quad [\text{A}]$$

**Velocidad de deriva**
$$I = n q v_d A \quad \Rightarrow \quad v_d = \frac{I}{n q A} \quad \left[\frac{\text{m}}{\text{s}}\right]$$

**Densidad de corriente**
$$\vec{J} = \frac{I}{A} \hat{n} = n q \vec{v}_d \quad \left[\frac{\text{A}}{\text{m}^2}\right]$$

### 6.2 Ley de Ohm

**Microscópica**
$$\vec{J} = \sigma \vec{E} \quad \Leftrightarrow \quad \vec{E} = \rho \vec{J}$$

**Macroscópica**
$$V = I R \quad [\text{V}]$$

**Resistencia de un conductor cilíndrico**
$$R = \frac{\rho L}{A} = \frac{\rho L}{\pi r^2} \quad [\Omega]$$

**Resistividad con temperatura**
$$\rho(T) = \rho_0 [1 + \alpha (T - T_0)]$$

### 6.3 FEM y potencia

**Ley de Ohm generalizada** (circuito cerrado)
$$\varepsilon = I(R + r) \quad \Rightarrow \quad I = \frac{\varepsilon}{R + r}$$

**Potencia eléctrica**
$$P = V I = I^2 R = \frac{V^2}{R} \quad [\text{W}]$$

**Efecto Joule** (calor disipado)
$$Q = P \cdot t = I^2 R t \quad [\text{J}]$$

### 6.4 Resistencia en geometrías particulares

| Geometría | Resistencia |
|-----------|-------------|
| **Cilindro hueco** (flujo radial) | $$R = \frac{\rho}{2\pi L} \ln\left(\frac{r_b}{r_a}\right)$$ |
| **Esfera hueca** (flujo radial) | $$R = \frac{\rho}{4\pi} \left(\frac{1}{r_a} - \frac{1}{r_b}\right)$$ |
| **Tronco cónico** (flujo axial) | $$R = \frac{\rho L}{\pi r_1 r_2}$$ |

---

## 7. CIRCUITOS DE CORRIENTE CONTINUA

### 7.1 Asociación de resistores

**Serie**
$$R_{\text{eq}} = R_1 + R_2 + \cdots + R_n$$

**Paralelo**
$$\frac{1}{R_{\text{eq}}} = \frac{1}{R_1} + \frac{1}{R_2} + \cdots + \frac{1}{R_n}$$

### 7.2 Leyes de Kirchhoff

**Regla de los nudos** (conservación de la carga)
$$\sum I_{\text{entrantes}} = \sum I_{\text{salientes}} \quad \Rightarrow \quad \sum I = 0$$

**Regla de las mallas** (conservación de la energía)
$$\sum V = 0 \quad \text{(en una malla cerrada)}$$

### 7.3 Circuitos RC

**Constante de tiempo**
$$\tau = RC \quad [\text{s}]$$

**Carga** (conectando a $$\varepsilon$$)
$$q(t) = C\varepsilon \left(1 - e^{-t/\tau}\right)$$
$$i(t) = \frac{\varepsilon}{R} e^{-t/\tau}$$

**Descarga** (capacitor inicialmente cargado $$Q_0$$)
$$q(t) = Q_0 e^{-t/\tau}$$
$$i(t) = -\frac{Q_0}{RC} e^{-t/\tau}$$

---

## 8. CAMPO MAGNÉTICO

### 8.1 Ley de Biot-Savart
$$d\vec{B} = \frac{\mu_0}{4\pi} \frac{I d\vec{l} \times \hat{r}}{r^2} \quad [\text{T}]$$

### 8.2 Ley de Ampère
$$\oint \vec{B} \cdot d\vec{l} = \mu_0 I_{\text{enc}}$$

### 8.3 Flujo magnético y Ley de Gauss magnética

**Flujo magnético**
$$\Phi_B = \int \vec{B} \cdot d\vec{A} \quad [\text{Wb}]$$

**Ley de Gauss para B**
$$\oint \vec{B} \cdot d\vec{A} = 0 \quad \text{(no existen monopolos magnéticos)}$$

### 8.4 Campos por geometría (Ampère/Biot-Savart)

| Geometría | Región | Campo magnético |
|-----------|--------|-----------------|
| **Conductor recto largo** (R, I) | $$r > R$$ | $$B = \frac{\mu_0 I}{2\pi r}$$ |
| | $$r < R$$ | $$B = \frac{\mu_0 I}{2\pi} \frac{r}{R^2}$$ |
| | $$r = R$$ | $$B = \frac{\mu_0 I}{2\pi R}$$ |
| **Cilindro hueco** ($$R_1 < R_2$$) | $$r < R_1$$ | $$B = 0$$ |
| | $$R_1 < r < R_2$$ | $$B = \frac{\mu_0 I}{2\pi r} \frac{r^2 - R_1^2}{R_2^2 - R_1^2}$$ |
| | $$r > R_2$$ | $$B = \frac{\mu_0 I}{2\pi r}$$ |
| **Espira circular** (a, I) | centro | $$B = \frac{\mu_0 I}{2a}$$ |
| | sobre el eje | $$B_x = \frac{\mu_0 I a^2}{2(x^2 + a^2)^{3/2}}$$ |
| **Bobina plana** (N espiras) | centro | $$B = \frac{\mu_0 N I}{2a}$$ |
| | sobre el eje | $$B_x = \frac{\mu_0 N I a^2}{2(x^2 + a^2)^{3/2}}$$ |
| **Solenoide largo** (n = N/L) | interior | $$B = \mu_0 n I$$ |
| | extremo | $$B = \frac{\mu_0 n I}{2}$$ |
| | exterior | $$B \approx 0$$ |
| **Toroide** (r medio, N) | interior | $$B = \frac{\mu_0 N I}{2\pi r}$$ |
| | exterior | $$B = 0$$ |

---

## 9. INTERACCIÓN MAGNÉTICA

### 9.1 Fuerzas magnéticas

**Fuerza sobre carga en movimiento**
$$\vec{F} = q \vec{v} \times \vec{B} \quad [\text{N}]$$

**Fuerza de Lorentz** (campo E y B)
$$\vec{F} = q (\vec{E} + \vec{v} \times \vec{B}) \quad [\text{N}]$$

**Radio de órbita circular** ($$\vec{v} \perp \vec{B}$$)
$$r = \frac{m v}{|q| B} \quad [\text{m}]$$

**Frecuencia ciclotrón**
$$\omega = \frac{|q| B}{m} \quad \left[\frac{\text{rad}}{\text{s}}\right], \quad f = \frac{\omega}{2\pi} \quad [\text{Hz}]$$

### 9.2 Fuerza sobre conductores

**Fuerza sobre conductor rectilíneo**
$$\vec{F} = I \vec{L} \times \vec{B} \quad [\text{N}]$$

**Fuerza entre conductores paralelos**
$$\frac{F}{L} = \frac{\mu_0 I_1 I_2}{2\pi d} \quad \left[\frac{\text{N}}{\text{m}}\right]$$

**Selector de velocidades**
$$v = \frac{E}{B} \quad \left[\frac{\text{m}}{\text{s}}\right] \quad (F_E = F_B)$$

### 9.3 Efecto Hall
$$V_H = \frac{I B}{n q A} \quad [\text{V}]$$

### 9.4 Momento magnético, par y energía

**Momento magnético de espira**
$$\vec{\mu} = I \vec{A} \quad [\text{A·m}^2]$$

**Par de torsión sobre espira**
$$\vec{\tau} = \vec{\mu} \times \vec{B} \quad \Rightarrow \quad \tau = I A B \sin \theta \quad [\text{N·m}]$$

**Energía de espira en campo B**
$$U = -\vec{\mu} \cdot \vec{B} = -\mu B \cos \theta \quad [\text{J}]$$

---

## 10. INDUCCIÓN ELECTROMAGNÉTICA

### 10.1 Ley de Faraday-Lenz
$$\varepsilon = -\frac{d\Phi_B}{dt} \quad [\text{V}]$$

**Para N espiras**
$$\varepsilon = -N \frac{d\Phi_B}{dt} \quad [\text{V}]$$

**FEM por movimiento** (conductor en campo B)
$$\varepsilon = B L v \quad [\text{V}] \quad (\vec{B} \perp \vec{L} \perp \vec{v})$$

### 10.2 Inductancia

**Inductancia mutua**
$$\varepsilon_2 = -M \frac{dI_1}{dt}, \quad M = \frac{N_2 \Phi_{21}}{I_1} \quad [\text{H}]$$

**Autoinductancia**
$$\varepsilon = -L \frac{dI}{dt}, \quad L = \frac{N \Phi_B}{I} \quad [\text{H}]$$

**Inductancia de solenoide**
$$L = \frac{\mu_0 N^2 A}{l} \quad [\text{H}]$$

**Energía en inductor**
$$U = \frac{1}{2} L I^2 \quad [\text{J}]$$

**Densidad de energía magnética**
$$u_B = \frac{B^2}{2\mu_0} \quad \left[\frac{\text{J}}{\text{m}^3}\right]$$

### 10.3 Circuito RL

**Constante de tiempo**
$$\tau_L = \frac{L}{R} \quad [\text{s}]$$

**Crecimiento de corriente** (conexión a fuente $$\varepsilon$$)
$$i(t) = \frac{\varepsilon}{R} \left(1 - e^{-t/\tau_L}\right)$$

**Decaimiento de corriente** (desconexión)
$$i(t) = I_0 e^{-t/\tau_L}$$

---

## 11. PROPIEDADES MAGNÉTICAS DE LA MATERIA

### 11.1 Campos en medios materiales

**Campo magnético en medio**
$$\vec{B} = \mu_r \mu_0 \vec{H} = \mu \vec{H} \quad [\text{T}]$$

**Magnetización**
$$\vec{M} = \chi_m \vec{H} \quad \left[\frac{\text{A}}{\text{m}}\right]$$

**Relación fundamental**
$$\vec{B} = \mu_0 (\vec{H} + \vec{M}) \quad [\text{T}]$$

### 11.2 Clasificación de materiales

| Tipo | $$\mu_r$$ | $$\chi_m$$ | Comportamiento |
|------|-----------|------------|----------------|
| **Diamagnéticos** | ligeramente < 1 | negativa, pequeña | B se opone al campo aplicado |
| **Paramagnéticos** | ligeramente > 1 | positiva, pequeña | B se alinea con el campo |
| **Ferromagnéticos** | mucho > 1 | positiva, grande | Histéresis, dominios magnéticos |

### 11.3 Circuitos magnéticos (Ley de Hopkinson)

**Reluctancia magnética**
$$\mathcal{R} = \frac{l}{\mu A} \quad \left[\frac{\text{A}}{\text{Wb}}\right]$$

**Ley de Hopkinson** (análoga a Ohm)
$$N I = \Phi \cdot \mathcal{R}$$

---

## 12. CORRIENTE ALTERNA (CA)

### 12.1 Representación de señales

**Tensión sinusoidal**
$$v(t) = V_m \cos(\omega t + \varphi) \quad [\text{V}]$$

**Valor eficaz**
$$V_{\text{ef}} = \frac{V_m}{\sqrt{2}}, \quad I_{\text{ef}} = \frac{I_m}{\sqrt{2}}$$

### 12.2 Reactancias e impedancia

**Reactancia inductiva**
$$X_L = \omega L \quad [\Omega]$$

**Reactancia capacitiva**
$$X_C = \frac{1}{\omega C} \quad [\Omega]$$

**Impedancia serie RLC**
$$\bar{Z} = R + j\left(\omega L - \frac{1}{\omega C}\right)$$
$$Z = \sqrt{R^2 + (X_L - X_C)^2}$$

**Ángulo de fase**
$$\varphi = \arctan\left(\frac{X_L - X_C}{R}\right)$$

**Admitancia paralelo**
$$\bar{Y} = G + j\left(\omega C - \frac{1}{\omega L}\right)$$
$$Y = \sqrt{G^2 + (B_C - B_L)^2}$$

### 12.3 Resonancia

**Frecuencia angular de resonancia** ($$X_L = X_C$$)
$$\omega_{\text{res}} = \frac{1}{\sqrt{LC}} \quad \left[\frac{\text{rad}}{\text{s}}\right]$$

### 12.4 Potencia en CA

**Potencia activa** (real)
$$P = V_{\text{ef}} I_{\text{ef}} \cos \varphi = I_{\text{ef}}^2 R \quad [\text{W}]$$

**Potencia reactiva**
$$Q = V_{\text{ef}} I_{\text{ef}} \sin \varphi \quad [\text{VAR}]$$

**Potencia aparente**
$$S = V_{\text{ef}} I_{\text{ef}} = \sqrt{P^2 + Q^2} \quad [\text{VA}]$$

---

## 13. ECUACIONES DE MAXWELL Y ONDAS EM

### 13.1 Ecuaciones de Maxwell (forma integral y diferencial)

| Ley | Forma integral | Forma diferencial |
|-----|----------------|-------------------|
| **Gauss (E)** | $$\oint \vec{E} \cdot d\vec{A} = \frac{Q_{\text{enc}}}{\varepsilon_0}$$ | $$\nabla \cdot \vec{E} = \frac{\rho}{\varepsilon_0}$$ |
| **Gauss (B)** | $$\oint \vec{B} \cdot d\vec{A} = 0$$ | $$\nabla \cdot \vec{B} = 0$$ |
| **Faraday-Lenz** | $$\oint \vec{E} \cdot d\vec{l} = -\frac{d\Phi_B}{dt}$$ | $$\nabla \times \vec{E} = -\frac{\partial \vec{B}}{\partial t}$$ |
| **Ampère-Maxwell** | $$\oint \vec{B} \cdot d\vec{l} = \mu_0 (I + I_{\text{despl}})$$ | $$\nabla \times \vec{B} = \mu_0 \vec{J} + \mu_0 \varepsilon_0 \frac{\partial \vec{E}}{\partial t}$$ |

### 13.2 Ondas electromagnéticas

**Velocidad de la luz**
$$c = \frac{1}{\sqrt{\mu_0 \varepsilon_0}} \approx 3 \times 10^8 \ \text{m/s}$$

**Relación entre campos** (onda plana)
$$\frac{E}{B} = c$$

**Índice de refracción**
$$n = \frac{c}{v} = \sqrt{\mu_r \varepsilon_r} \quad (\text{adimensional})$$

### 13.3 Transporte de energía

**Vector de Poynting**
$$\vec{S} = \frac{1}{\mu_0} (\vec{E} \times \vec{B}) = \vec{E} \times \vec{H} \quad \left[\frac{\text{W}}{\text{m}^2}\right]$$

**Intensidad media**
$$I = \bar{S} = \frac{1}{2} \varepsilon_0 c E_m^2 = \frac{E_m^2}{2\mu_0 c} \quad \left[\frac{\text{W}}{\text{m}^2}\right]$$

**Presión de radiación**
$$p = \frac{I}{c} \quad (\text{absorción total}), \quad p = \frac{2I}{c} \quad (\text{reflexión total}) \quad [\text{Pa}]$$

---

## 14. ÓPTICA GEOMÉTRICA

### 14.1 Reflexión y refracción

**Ley de reflexión**
$$\theta_r = \theta_i$$

**Ley de Snell**
$$n_a \sin \theta_a = n_b \sin \theta_b$$

**Ángulo límite** (reflexión total interna, $$n_a > n_b$$)
$$\sin \theta_L = \frac{n_b}{n_a}$$

### 14.2 Espejos esféricos

**Ecuación de espejos**
$$\frac{1}{s} + \frac{1}{s'} = \frac{1}{f} = \frac{2}{R}$$

**Aumento lateral**
$$m = -\frac{s'}{s} = \frac{y'}{y}$$

**Convención de signos** (apunte):
- $$s > 0$$: objeto real (frente al espejo)
- $$s' > 0$$: imagen real (frente al espejo), $$s' < 0$$: imagen virtual (detrás)
- $$f > 0$$: espejo cóncavo (convergente), $$f < 0$$: convexo (divergente)
- $$R > 0$$: centro de curvatura frente al espejo

### 14.3 Lentes delgadas

**Ecuación de lentes**
$$\frac{1}{s} + \frac{1}{s'} = \frac{1}{f}$$

**Ecuación del fabricante de lentes**
$$\frac{1}{f} = (n-1)\left(\frac{1}{R_1} - \frac{1}{R_2}\right)$$

**Convención de signos**:
- Lente convergente: $$f > 0$$; divergente: $$f < 0$$
- $$s > 0$$: objeto real; $$s' > 0$$: imagen real (del lado opuesto)

### 14.4 Ley de Brewster (polarización por reflexión)
$$\tan \theta_B = \frac{n_b}{n_a}$$

---

## 15. ÓPTICA FÍSICA

### 15.1 Interferencia

**Experimento de Young** (dos rendijas)

*Máximos* (franjas brillantes)
$$d \sin \theta = m \lambda \quad \Rightarrow \quad y_m = \frac{m \lambda R}{d} \quad (m = 0, \pm 1, \pm 2, \dots)$$

*Mínimos* (franjas oscuras)
$$d \sin \theta = \left(m + \frac{1}{2}\right) \lambda \quad (m = 0, \pm 1, \pm 2, \dots)$$

**Intensidad** (dos fuentes coherentes)
$$I = 4I_0 \cos^2\left(\frac{\Delta\varphi}{2}\right), \quad \Delta\varphi = \frac{2\pi \Delta r}{\lambda}$$

**Interferencia en películas delgadas**

*Con desfase de 180°* (una reflexión en medio más denso):
- Constructiva: $$2nt = (m + \frac{1}{2}) \lambda$$
- Destructiva: $$2nt = m \lambda$$

*Sin desfase* (ambas reflexiones iguales):
- Constructiva: $$2nt = m \lambda$$
- Destructiva: $$2nt = (m + \frac{1}{2}) \lambda$$

### 15.2 Difracción

**Rendija simple** (ancho a)

*Mínimos*
$$a \sin \theta = m \lambda \quad (m = \pm 1, \pm 2, \dots)$$

*Intensidad*
$$I = I_0 \left[\frac{\sin(\beta/2)}{\beta/2}\right]^2, \quad \beta = \frac{2\pi a \sin \theta}{\lambda}$$

**Red de difracción** (espaciado d)

*Máximos principales*
$$d \sin \theta = m \lambda \quad (m = 0, \pm 1, \pm 2, \dots)$$

*Poder de resolución cromático*
$$R = \frac{\lambda}{\Delta\lambda} = mN$$

### 15.3 Polarización

**Ley de Malus**
$$I = I_0 \cos^2 \theta$$

---

## 16. NOTAS Y ACLARACIONES IMPORTANTES

### 16.1 Convenciones de signos

| Magnitud | Convención (apunte) |
|----------|---------------------|
| **Carga** | Positiva: fuente de campo; negativa: sumidero |
| **Campo E** | Sale de cargas +, entra a cargas - |
| **Potencial V** | Positivo cerca de cargas + |
| **Corriente I** | Sentido convencional: flujo de cargas + |
| **FEM ε** | Aumenta potencial de - a + dentro de la fuente |
| **Flujo Φ** | Positivo si E sale de superficie cerrada |

### 16.2 Constante de tiempo

- **RC**: $$\tau = RC$$ — tiempo para que capacitor cargue al 63.2% o descargue al 36.8%
- **RL**: $$\tau_L = L/R$$ — tiempo para que inductor alcance el 63.2% de la corriente final

### 16.3 Relaciones útiles

**Conversiones**:
- $$1 \ \text{Å} = 10^{-10} \ \text{m}$$
- $$1 \ \mu\text{C} = 10^{-6} \ \text{C}$$
- $$1 \ \text{nC} = 10^{-9} \ \text{C}$$
- $$1 \ \text{pC} = 10^{-12} \ \text{C}$$

**Energía en keV**:
- $$1 \ \text{keV} = 1.602 \times 10^{-16} \ \text{J}$$

**Ecuaciones de continuidad**:
- Carga: $$\frac{\partial \rho}{\partial t} = -\nabla \cdot \vec{J}$$
- Energía EM: $$\frac{\partial u}{\partial t} = -\nabla \cdot \vec{S}$$

---

## 17. CONCEPTOS FALTANTES IDENTIFICADOS (vs. machete original)

El machete original presentaba las siguientes omisiones que fueron incorporadas:

| Tema faltante | Por qué es importante |
|---------------|----------------------|
| **Dipolo eléctrico** (p, τ, U) | Fundamental para entender moléculas polares y comportamiento de dieléctricos |
| **Campo de disco y anillo** | Casos típicos en problemas de integración |
| **Cilindro no conductor** | Complemento del conductor para aplicaciones de Ley de Gauss |
| **Resistencia en geometrías no cilíndricas** | Para problemas de flujo radial |
| **Circuito RL** (crecimiento y decaimiento) | Contraparte magnética del RC |
| **Propiedades magnéticas** (μr, χm, clasificación) | Base para entender materiales magnéticos |
| **Admitancia paralelo** | Necesaria para circuitos RLC en paralelo |
| **Presión de radiación** | Aplicación práctica de ondas EM |
| **Ley de Brewster** | Polarización por reflexión |
| **Poder de resolución** | Concepto clave en óptica de instrumentos |
| **Reluctancia y Ley de Hopkinson** | Analogía magnética de circuitos eléctricos |
| **Efecto Hall** | Aplicación tecnológica y determinación de portadores |

---

## 18. RESUMEN DE RELACIONES IMPORTANTES

| Relación | Significado |
|----------|-------------|
| $$\vec{E} = -\nabla V$$ | El campo eléctrico es el gradiente negativo del potencial |
| $$\vec{F} = q(\vec{E} + \vec{v} \times \vec{B})$$ | Fuerza de Lorentz (unifica E y B) |
| $$\varepsilon = -d\Phi_B/dt$$ | Variación de flujo magnético genera FEM |
| $$c = 1/\sqrt{\mu_0\varepsilon_0}$$ | Velocidad de las ondas EM en el vacío |
| $$n = c/v$$ | Índice de refracción |
| $$I = \bar{S} = E_m^2/(2\mu_0 c)$$ | Intensidad de onda EM |
| $$\vec{S} = \vec{E} \times \vec{H}$$ | Vector de Poynting (flujo de energía) |

---

**Este machete sigue el formalismo del apunte de la cátedra de Física 2 (UNC) y contiene todas las ecuaciones necesarias para la resolución de problemas.**