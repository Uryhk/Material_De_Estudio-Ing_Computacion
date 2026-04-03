# FÍSICA II - Guía de Problemas Resueltos

**NOMBRE:Uriel Rosales Decara**  
**MATRÍCULA:46728378**  
**COMISIÓN:2.1**  
**CARRERA:Ingienieria en Computacion**

---

# CAPÍTULO 1: El Campo Eléctrico y la Ley de Gauss

## 1.2 Ejercicios

#### **Ejercicio 1.2.1:** Fuerzas sobre la carga $q_1$

> **Datos:** $q_1 = 2\ \mu C$, $q_2 = q_3 = q_4 = -3\ \mu C$. Geometría: $q_2$ y $q_3$ a $10\ cm$ de $q_1$ ($\pm 30^\circ$ del eje), $q_4$ a $20\ cm$ en el eje horizontal.  
> Constante: $k = 9\times10^9\ N\cdot m^2/C^2$

Fuerza entre $q_1$ y $q_2$:
$$F_{12} = \frac{k|q_1 q_2|}{r^2} = \frac{9\times10^9 \times 2\times10^{-6} \times 3\times10^{-6}}{(0{,}10)^2} = 5{,}4\ N\ (\text{atracción})$$

Fuerza entre $q_1$ y $q_3$ (simétrica a $F_{12}$):
$$F_{13} = 5{,}4\ N\ (\text{atracción})$$

Fuerza entre $q_1$ y $q_4$:
$$F_{14} = \frac{9\times10^9 \times 2\times10^{-6} \times 3\times10^{-6}}{(0{,}20)^2} = 1{,}35\ N\ (\text{atracción, dirección }+x)$$

Componentes de $F_{12}$ y $F_{13}$ (ángulo $30^\circ$ respecto al eje vertical):
$$F_{12x} = -5{,}4\cdot\sin(30^\circ) = -2{,}7\ N,\quad F_{12y} = 5{,}4\cdot\cos(30^\circ) = 4{,}677\ N$$
$$F_{13x} = -5{,}4\cdot\sin(30^\circ) = -2{,}7\ N,\quad F_{13y} = -5{,}4\cdot\cos(30^\circ) = -4{,}677\ N$$

Componentes totales sobre $q_1$:
$$F_x = -2{,}7 - 2{,}7 + 1{,}35 = -4{,}05\ N\ (\text{hacia la izquierda})$$
$$F_y = 4{,}677 - 4{,}677 = 0\ N$$

**Resultado:** $|F_\text{total}| = 4{,}05\ N$, dirección $-x$ (hacia la izquierda)

---

#### **Ejercicio 1.2.2:** Carga total de la Tierra

> **Datos:** $E = 100\ N/C$ (apuntando hacia el centro), $R_\text{Tierra} = 6{,}371\times10^6\ m$

Ley de Gauss: $\displaystyle \oint \mathbf{E}\cdot d\mathbf{A} = \frac{Q_\text{enc}}{\varepsilon_0},\quad A = 4\pi R^2$

$$Q = \varepsilon_0 E \cdot 4\pi R^2 = (8{,}85\times10^{-12})\cdot 100 \cdot 4\pi (6{,}371\times10^6)^2$$

$$Q \approx -4{,}5\times10^5\ C\ (\text{negativa, campo hacia el centro})$$

---

#### **Ejercicio 1.2.3:** Campo eléctrico en esfera maciza uniforme

> **Datos:** $R = 10\ cm = 0{,}10\ m$, $Q = 3\times10^{-8}\ C$, distribución uniforme

Densidad de carga: $\rho = \dfrac{Q}{\frac{4}{3}\pi R^3} = \dfrac{3\times10^{-8}}{4{,}189\times10^{-3}} = 7{,}16\times10^{-6}\ C/m^3$

**a) Interior** ($r = 5\ cm = 0{,}05\ m$):  
$Q_\text{enc} = \rho \cdot \frac{4}{3}\pi r^3 = 7{,}16\times10^{-6} \cdot \frac{4}{3}\pi (0{,}05)^3 = 3{,}75\times10^{-9}\ C$

$$E = \frac{k Q_\text{enc}}{r^2} = \frac{9\times10^9 \times 3{,}75\times10^{-9}}{(0{,}05)^2} = 13.500\ N/C\ (\text{radial hacia afuera})$$

**b) Exterior** ($r = 20\ cm = 0{,}20\ m$):
$$E = \frac{kQ}{r^2} = \frac{9\times10^9 \times 3\times10^{-8}}{(0{,}20)^2} = 6.750\ N/C\ (\text{radial hacia afuera})$$

---

#### **Ejercicio 1.2.4:** Campo eléctrico en cilindro largo cargado uniformemente

> **Datos:** $R = 2\ cm = 0{,}02\ m$, $\rho = 5\times10^{-6}\ C/m^3$

**a) Interior** ($r = 1\ cm = 0{,}01\ m$):
$$E \cdot 2\pi r L = \frac{\rho \cdot \pi r^2 L}{\varepsilon_0} \quad\Rightarrow\quad E = \frac{\rho r}{2\varepsilon_0}$$

$$E = \frac{5\times10^{-6} \times 0{,}01}{2 \times 8{,}85\times10^{-12}} = 2.825\ N/C$$

**b) Exterior** ($r = 5\ cm = 0{,}05\ m$):
$$E \cdot 2\pi r L = \frac{\rho \pi R^2 L}{\varepsilon_0} \quad\Rightarrow\quad E = \frac{\rho R^2}{2\varepsilon_0 r}$$

$$E = \frac{5\times10^{-6} \times (0{,}02)^2}{2 \times 8{,}85\times10^{-12} \times 0{,}05} = 2.260\ N/C$$

---

#### **Ejercicio 1.2.5:** Signo y valor de carga por disminución de peso

> **Datos:** $\Delta m = 0{,}1\ g = 10^{-4}\ kg$, $r = 3\ cm = 0{,}03\ m$, $q_\text{puntual} = 0{,}4\ pC = 4\times10^{-13}\ C$ (positiva, abajo)

La fuerza eléctrica compensa parte del peso: $F_e = \Delta m \cdot g = 10^{-4} \times 9{,}8 = 9{,}8\times10^{-4}\ N$ (hacia arriba → fuerza atractiva → carga negativa)

$$F = \frac{k|q_1| q_2}{r^2} \quad\Rightarrow\quad |q_1| = \frac{F r^2}{k q_2} = \frac{9{,}8\times10^{-4} \times (0{,}03)^2}{9\times10^9 \times 4\times10^{-13}} = 2{,}45\times10^{-4}\ C$$

**Resultado:** $q_1 = -2{,}45\times10^{-4}\ C \approx -245\ \mu C$

---

#### **Ejercicio 1.2.6:** Dos esferas suspendidas con ángulo $60^\circ$

> **Datos:** $q_\text{total} = 0{,}8\ \mu C$ → cada esfera: $q = 0{,}4\ \mu C$, ángulo total $60^\circ$ → $\alpha = 30^\circ$, $L = 20\ cm$

Distancia entre centros: $d = 2L\sin(30^\circ) = 2 \times 0{,}20 \times 0{,}5 = 0{,}20\ m$

Equilibrio: $\tan\alpha = \dfrac{F_e}{P} \quad\Rightarrow\quad F_e = P \tan(30^\circ)$

$$F_e = \frac{k q^2}{d^2} = \frac{9\times10^9 \times (4\times10^{-7})^2}{(0{,}20)^2} = 0{,}036\ N$$

$$P = \frac{F_e}{\tan(30^\circ)} = \frac{0{,}036}{0{,}5774} = 0{,}0623\ N$$

**Resultado:** Peso de cada esfera $\approx 0{,}0623\ N$ → masa $\approx 6{,}35\ g$

---

#### **Ejercicio 1.2.7:** Tres esferas colgadas de un punto - triángulo equilátero

> **Datos:** $m = 10\ g = 0{,}01\ kg$ cada una, $L = 1\ m$ (hilos), lado del triángulo $a = 0{,}1\ m$

Distancia al centro del triángulo: $r = \dfrac{a}{\sqrt{3}} = \dfrac{0{,}1}{1{,}732} = 0{,}0577\ m$

Ángulo del hilo con vertical: $\sin\theta = \dfrac{r}{L} = 0{,}0577 \quad\Rightarrow\quad \theta = 3{,}31^\circ$

Fuerza de repulsión entre dos esferas: $F = \dfrac{k q^2}{a^2}$

Fuerza horizontal sobre una esfera: $F_h = 2F\cos(30^\circ) = F\sqrt{3}$

Equilibrio: $F\sqrt{3} = mg \tan\theta = 0{,}01\times9{,}8\times\tan(3{,}31^\circ) = 5{,}67\times10^{-3}\ N$

$$F = \frac{5{,}67\times10^{-3}}{\sqrt{3}} = 3{,}27\times10^{-3}\ N$$

$$q = \sqrt{\frac{F a^2}{k}} = \sqrt{\frac{3{,}27\times10^{-3} \times 0{,}01}{9\times10^9}} = 6{,}03\times10^{-8}\ C \approx 60{,}3\ nC$$

---

#### **Ejercicio 1.2.8:** Signos de cargas por interacción

> **Datos:** A repele a B, A atrae a C, C repele a D, D es positivo (+)

- D positivo (+)
- C repele a D (+) → C es positivo (+)
- A atrae a C (+) → A es negativo (−)
- A (−) repele a B → B es negativo (−)

**Resultado:** La carga B es **NEGATIVA (−)**

---

#### **Ejercicio 1.2.9:** Fuerzas en el átomo de hidrógeno

> **Datos:** $q_p = q_e = 1{,}6\times10^{-19}\ C$, $R_B = 0{,}0529\ nm = 5{,}29\times10^{-11}\ m$, $m_p = 1{,}6\times10^{-27}\ kg$, $m_e = 9{,}1\times10^{-31}\ kg$

**a)** Fuerza eléctrica:
$$F_e = \frac{k q_p q_e}{R_B^2} = \frac{9\times10^9 \times (1{,}6\times10^{-19})^2}{(5{,}29\times10^{-11})^2} = 8{,}23\times10^{-8}\ N$$

**b)** Fuerza gravitacional:
$$F_g = \frac{G m_p m_e}{R_B^2} = \frac{6{,}67\times10^{-11} \times 1{,}6\times10^{-27} \times 9{,}1\times10^{-31}}{(5{,}29\times10^{-11})^2} = 3{,}47\times10^{-47}\ N$$

**c)** Cociente: $\displaystyle \frac{F_e}{F_g} \approx 2{,}37\times10^{39}$

**Resultado:** La fuerza eléctrica es mayor en $\sim 2{,}4\times10^{39}$ veces

---

#### **Ejercicio 1.2.10:** Esfera B en reposo bajo A

> **Datos:** $m_B = 10\ g = 0{,}01\ kg$, $r = 10\ cm = 0{,}10\ m$, cargas iguales y opuestas

**a)** Fuerza eléctrica = peso de B: $F_e = mg = 0{,}01 \times 9{,}8 = 0{,}098\ N$

**b)** $F_e = \dfrac{k q^2}{r^2} \quad\Rightarrow\quad q = \sqrt{\dfrac{F_e r^2}{k}} = \sqrt{\dfrac{0{,}098 \times 0{,}01}{9\times10^9}} = 1{,}043\times10^{-6}\ C \approx 1{,}04\ \mu C$

**c)** Número de electrones en exceso: $n = \dfrac{q}{e} = \dfrac{1{,}043\times10^{-6}}{1{,}6\times10^{-19}} = 6{,}52\times10^{12}$ electrones

---

#### **Ejercicio 1.2.11:** Tensión en los hilos de dos esferas

> **Datos:** $L = 10\ cm = 0{,}10\ m$, $P = mg = 5\times10^{-9}\times9{,}8 = 4{,}9\times10^{-8}\ N$, $T = 0{,}098\ N$

Las superficies se tocan, los centros están a distancia $d = 2r$. Al separarse, $d = 2L\sin\theta$.

Equilibrio vertical: $T\cos\theta = P \quad\Rightarrow\quad \cos\theta = \dfrac{P}{T} \approx 5\times10^{-7} \quad\Rightarrow\quad \theta \approx 90^\circ$

Equilibrio horizontal: $T\sin\theta \approx T = F_e \approx 0{,}098\ N$, $d \approx 2L = 0{,}20\ m$

$$q = \sqrt{\frac{F_e d^2}{k}} = \sqrt{\frac{0{,}098 \times 0{,}04}{9\times10^9}} = 6{,}6\times10^{-7}\ C \approx 0{,}66\ \mu C$$

---

#### **Ejercicio 1.2.12:** Dos esferas con cargas opuestas conectadas

> **Datos:** $F_\text{atracción} = 0{,}108\ N$, $r = 50\ cm = 0{,}50\ m$, $F_\text{repulsión} = 0{,}036\ N$ (después de conectar)

Antes de conectar (cargas $q_1$ y $q_2$, signos opuestos):
$$\frac{k|q_1 q_2|}{r^2} = 0{,}108 \quad\Rightarrow\quad |q_1 q_2| = \frac{0{,}108 \times 0{,}25}{9\times10^9} = 3\times10^{-12}$$

Al conectar: $q_\text{total} = q_1+q_2$. Cada esfera queda con $(q_1+q_2)/2$.

$$\frac{k[(q_1+q_2)/2]^2}{r^2} = 0{,}036 \quad\Rightarrow\quad \left(\frac{q_1+q_2}{2}\right)^2 = \frac{0{,}036\times0{,}25}{9\times10^9} = 10^{-12}$$

$$q_1+q_2 = \pm 2\times10^{-6}\ C$$

Resolviendo: $q_1 = +3\ \mu C$, $q_2 = -1\ \mu C$ (o viceversa)

---

#### **Ejercicio 1.2.13:** Campo eléctrico en vértice de triángulo equilátero

> **Datos:** Triángulo equilátero, lado $a = 10\ cm = 0{,}10\ m$, $+q$ y $-q$ en los otros dos vértices, $q = 1\ \mu C$

Campo de $+q$ en P: $E_+ = \dfrac{kq}{a^2} = \dfrac{9\times10^9 \times 10^{-6}}{0{,}01} = 9\times10^5\ N/C$ (apunta desde $+q$ hacia P)

Campo de $-q$ en P: $E_- = 9\times10^5\ N/C$ (apunta desde P hacia $-q$)

El ángulo entre las dos direcciones es $60^\circ$.

$$E = \sqrt{E_+^2 + E_-^2 + 2E_+E_-\cos60^\circ} = 9\times10^5 \times \sqrt{3} \approx 1{,}56\times10^6\ N/C$$

---

#### **Ejercicio 1.2.14:** Presión entre dos planos infinitos con igual densidad de carga

> **Datos:** $\sigma = 3\times10^{-8}\ C/cm^2 = 3\times10^{-4}\ C/m^2$

Campo de un plano infinito: $E = \dfrac{\sigma}{2\varepsilon_0}$

Presión electrostática (fuerza por unidad de área):
$$P = \frac{\sigma^2}{2\varepsilon_0} = \frac{(3\times10^{-4})^2}{2 \times 8{,}85\times10^{-12}} = 5.085\ N/m^2 \approx 5{,}08\ kPa$$

---

#### **Ejercicio 1.2.15:** Hilo vertical con cargas $q$ y $q_2$

> **Datos:** $q = 30\ \mu C$ (en el extremo del hilo $l=0{,}1\ m$), $q_1 = 50\ \mu C$, $q_2 = 40\ \mu C$

Para que el hilo permanezca vertical, la fuerza horizontal neta sobre $q$ debe ser cero.

Fuerza de $q_1$ sobre $q$ (repulsiva):
$$F_1 = \frac{k q q_1}{l^2} = \frac{9\times10^9 \times 30\times10^{-6} \times 50\times10^{-6}}{0{,}01} = 1350\ N$$

**b)** Signo de $q_2$: debe atraer a $q$ → $q_2$ **NEGATIVA**

$$F_2 = \frac{k q |q_2|}{d^2} = F_1 \quad\Rightarrow\quad d = \sqrt{\frac{k q |q_2|}{F_1}} = \sqrt{\frac{9\times10^9 \times 30\times10^{-6} \times 40\times10^{-6}}{1350}} = 0{,}0894\ m$$

**a) Resultado:** $d \approx 8{,}94\ cm$  
**b) Resultado:** $q_2$ negativa

---

#### **Ejercicio 1.2.16:** Campo eléctrico para suspender gota de agua

> **Datos:** Diámetro $= 10^{-2}\ cm = 10^{-4}\ m$ → $r = 5\times10^{-5}\ m$, $E_\text{superficie} = 6\times10^5\ N/C$ (campo propio)

Carga de la gota:
$$q = \frac{E_\text{sup} \cdot r^2}{k} = \frac{6\times10^5 \times (5\times10^{-5})^2}{9\times10^9} = 1{,}67\times10^{-13}\ C$$

Masa de la gota:
$$m = \rho \cdot \frac{4}{3}\pi r^3 = 1000 \cdot \frac{4}{3}\pi (5\times10^{-5})^3 = 5{,}236\times10^{-10}\ kg$$

Para equilibrio: $qE = mg$
$$E = \frac{mg}{q} = \frac{5{,}236\times10^{-10} \times 9{,}8}{1{,}67\times10^{-13}} = 3{,}07\times10^4\ N/C$$

**Resultado:** $E = 3{,}07\times10^4\ N/C \approx 30{,}7\ kN/C$ (vertical hacia arriba)

---

#### **Ejercicio 1.2.17:** Campo eléctrico en superficie del átomo de oro

> **Datos:** $Z = 79$, $r = 10^{-10}\ m$, $q_\text{total} = Ze = 79 \times 1{,}6\times10^{-19} = 1{,}264\times10^{-17}\ C$

$$E = \frac{kq}{r^2} = \frac{9\times10^9 \times 1{,}264\times10^{-17}}{(10^{-10})^2} = 1{,}14\times10^{13}\ N/C$$

---

#### **Ejercicio 1.2.18:** Anillo conductor: campo eléctrico axial

> **Datos:** Radio $R = 5\ cm = 0{,}05\ m$, $Q = 5\ \mu C = 5\times10^{-6}\ C$

**a)** Campo en $P$ a $z = 10\ cm = 0{,}10\ m$ del plano del anillo:
$$E = \frac{kQz}{(R^2+z^2)^{3/2}} = \frac{9\times10^9 \times 5\times10^{-6} \times 0{,}10}{(0{,}05^2+0{,}10^2)^{3/2}} = 3{,}22\times10^6\ N/C$$

**b)** Máximo campo en el eje: $z_\text{max} = \dfrac{R}{\sqrt{2}} = 3{,}54\ cm$
$$E_\text{max} = \frac{2kQ}{3\sqrt{3}\,R^2} = 3{,}45\times10^6\ N/C$$

---

#### **Ejercicio 1.2.19:** Semicircunferencia cargada - campo en el centro

> **Datos:** Longitud $= 14\ cm$ → radio $R = \dfrac{L}{\pi} = 0{,}04456\ m$, $Q = -7{,}5\ \mu C$

Densidad lineal: $\lambda = \dfrac{Q}{L} = -5{,}357\times10^{-5}\ C/m$

Para una semicircunferencia, por simetría las componentes paralelas al diámetro se cancelan:
$$E = \frac{2k|\lambda|}{\pi R} = \frac{2\times9\times10^9 \times 5{,}357\times10^{-5}}{\pi \times 0{,}04456} = 6{,}88\times10^6\ N/C$$

**Resultado:** $E \approx 6{,}88\times10^6\ N/C$, perpendicular al diámetro, apuntando hacia el arco (carga negativa)

---

#### **Ejercicio 1.2.20:** Campo para detener haz de electrones

> **Datos:** $E_c = 1{,}6\times10^{-17}\ J$, distancia de frenado $d = 10\ cm = 0{,}10\ m$, $e = 1{,}6\times10^{-19}\ C$

Trabajo del campo = variación de energía cinética:
$$W = qEd = E_c \quad\Rightarrow\quad E = \frac{E_c}{q\, d} = \frac{1{,}6\times10^{-17}}{1{,}6\times10^{-19} \times 0{,}10} = 1.000\ N/C$$

**Resultado:** $E = 1\ kN/C$ (opuesto al movimiento de los electrones)

---

## 1.3 Ejercicios Opcionales

#### **Ejercicio 1.3.1:** Línea continua de carga semi-infinita

> **Datos:** $\lambda = 1\ \mu C/cm = 10^{-4}\ C/m$, extendiéndose desde $x = 2\ cm$ hasta $+\infty$

Campo en el origen ($x=0$):
$$E_x = \frac{k\lambda}{a} = \frac{9\times10^9 \times 10^{-4}}{0{,}02} = 4{,}5\times10^7\ N/C\ (\text{dirección }-x)$$

---

#### **Ejercicio 1.3.2:** Carga para anular campo en punto A

> **Datos:** Tres cargas $+q$ en vértices de triángulo equilátero, $l = 10\ cm$, $q = 9\ nC$

Distancia de cada vértice al centro: $r = \dfrac{l}{\sqrt{3}} = 0{,}0577\ m$  
Distancia de A al centro: $h = \dfrac{l}{2\tan 60^\circ} = 0{,}02887\ m$

Campo en A por simetría: el vértice superior da campo hacia abajo.  
Para anular: $q'$ en O debe compensar.

Campo en A del vértice superior: $E = \dfrac{kq}{l^2} = 8100\ N/C$

Campo de $q'$ en O: $E' = \dfrac{k q'}{h^2} = \dfrac{9\times10^9\, q'}{8{,}35\times10^{-4}}$

$$8100 = \frac{9\times10^9\, q'}{8{,}35\times10^{-4}} \quad\Rightarrow\quad q' = 7{,}51\times10^{-13}\ C$$

**Resultado:** $q' \approx 0{,}75\ pC$ (negativa)

---

#### **Ejercicio 1.3.3:** Densidad de carga de hilo infinito (partícula $\alpha$)

> **Datos:** $r_1 = 1\ cm$, $r_2 = 4\ cm$, $v_1 = 2\times10^5\ m/s$, $v_2 = 3\times10^6\ m/s$, partícula $\alpha$: $m = 6{,}64\times10^{-27}\ kg$, $q = 2e = 3{,}2\times10^{-19}\ C$

Trabajo del campo eléctrico = variación de energía cinética:
$$W = \frac{1}{2} m(v_2^2-v_1^2) = 2{,}975\times10^{-14}\ J$$

Potencial de hilo infinito: $V = -\dfrac{\lambda}{2\pi\varepsilon_0}\ln r + C$

$$W = q(V_1-V_2) = q \frac{\lambda}{2\pi\varepsilon_0} \ln\frac{r_2}{r_1}$$

$$\lambda = \frac{W \cdot 2\pi\varepsilon_0}{q \ln(r_2/r_1)} = 3{,}73\times10^{-6}\ C/m \approx 3{,}73\ \mu C/m$$

---

#### **Ejercicio 1.3.4:** Campo axial de cilindro de plástico

> **Datos:** Cilindro de altura $h$, radio $R$, carga total $Q$, distancia $d$ a la cara

**a) Cilindro hueco** (carga solo en superficie lateral):

Densidad superficial: $\sigma = \dfrac{Q}{2\pi R h}$. Se integra como suma de anillos de espesor $dz$:

$$E = \int_0^h \frac{k\sigma\, 2\pi R\,(d+z)}{[R^2+(d+z)^2]^{3/2}}\,dz = \frac{kQ}{h}\left[\frac{1}{\sqrt{R^2+d^2}} - \frac{1}{\sqrt{R^2+(d+h)^2}}\right]$$

**b) Cilindro macizo** (carga en todo el volumen):

Densidad volumétrica: $\rho = \dfrac{Q}{\pi R^2 h}$. Se integra como suma de discos de espesor $dz$:

$$E = 2k\rho \int_0^h \left[1 - \frac{d+z}{\sqrt{R^2+(d+z)^2}}\right]dz$$

$$E = \frac{2kQ}{R^2 h}\left[h - \sqrt{R^2+(d+h)^2} + \sqrt{R^2+d^2}\right]$$

**c)** Para $R \to 0$ (hilo): la expresión del cilindro macizo tiende a $E = \dfrac{kQ}{d(d+h)}$, consistente con el campo de una carga puntual cuando $h \to 0$.

**d)** Para $h \to \infty$ (cilindro infinito): el resultado se reduce a $E = \dfrac{\lambda}{2\pi\varepsilon_0 d}$, coincidiendo con Gauss para un hilo infinito.

**Resultado:** Las expresiones exactas de (a) y (b) permiten calcular $E$ para cualquier geometría; para valores numéricos específicos se aplican directamente.

---

# CAPÍTULO 2: Potencial y Energía del Campo Eléctrico

## 2.2 Ejercicios

#### **Ejercicio 2.2.1:** Energía potencial de sistema de tres cargas

> **Datos:** Triángulo equilátero, $a = 20\ cm = 0{,}20\ m$, $q = 1\ \mu C$

$$U = 3 \cdot \frac{k q^2}{a} = 3 \cdot \frac{9\times10^9 \times (10^{-6})^2}{0{,}20} = 0{,}135\ J$$

---

#### **Ejercicio 2.2.2:** Potencial eléctrico de carga puntual

> **Datos:** $q = 50\ \mu C$ en $P=(0;\,0{,}10;\,0)$, $A=(0;\,0{,}10;\,0{,}10)$, $B=(0{,}10;\,-0{,}10;\,0{,}20)$ (coordenadas en metros)

**a)** $r_A = 0{,}10\ m$:
$$V_A = \frac{kq}{r_A} = \frac{9\times10^9 \times 50\times10^{-6}}{0{,}10} = 4{,}5\times10^6\ V$$

**b)** $r_B = \sqrt{0{,}1^2+(-0{,}2)^2+0{,}2^2} = 0{,}30\ m$:
$$V_B = \frac{9\times10^9 \times 50\times10^{-6}}{0{,}30} = 1{,}5\times10^6\ V$$

**c)** Trabajo para trasladar $q' = 1\ \mu C$ de A a B:
$$W = q'(V_A - V_B) = 10^{-6} \times (4{,}5\times10^6 - 1{,}5\times10^6) = 3\ J$$

---

#### **Ejercicio 2.2.3:** Modelo de Bohr del átomo de hidrógeno

> **Datos:** $r = 53\ pm = 5{,}3\times10^{-11}\ m$, $m_e = 9{,}1\times10^{-31}\ kg$, $e = 1{,}6\times10^{-19}\ C$

**a)** Velocidad orbital: $\dfrac{ke^2}{r^2} = m_e \dfrac{v^2}{r} \quad\Rightarrow\quad v = \sqrt{\dfrac{ke^2}{m_e r}} = 2{,}19\times10^6\ m/s$

**b)** Energía de ionización:
$$E_c = \frac{1}{2} m_e v^2 = 2{,}18\times10^{-18}\ J,\quad E_p = -\frac{ke^2}{r} = -4{,}36\times10^{-18}\ J$$
$$E_\text{total} = E_c + E_p = -2{,}18\times10^{-18}\ J = -13{,}6\ eV$$

---

#### **Ejercicio 2.2.4:** Energía potencial - triángulo equilátero con 3 cargas de $1\ \mu C$

> **Datos:** $a = 20\ cm = 0{,}20\ m$, $q = 1\ \mu C$

$$U = 3 \cdot \frac{k q^2}{a} = 0{,}135\ J$$

---

#### **Ejercicio 2.2.5:** Trabajo en campo uniforme - trayectoria ABCD

> **Datos:** $E = 2000\ N/C$ en dirección $+z$, $q = 5\ \mu C$, $A=(0,0,0)$, $B=(0{,}1;\,2;\,0)$, $C=(0{,}1;\,2;\,-3)$, $D=(1{,}5;\,1{,}2;\,-3)$

El trabajo solo depende del desplazamiento en $z$:
$$W_{AB}=0,\quad W_{BC}=qE\Delta z = 5\times10^{-6} \times 2000 \times (-3) = -0{,}03\ J,\quad W_{CD}=0$$
$$W_\text{total} = -0{,}03\ J$$

---

#### **Ejercicio 2.2.6:** Trabajo de fuerza eléctrica en campo uniforme

> **Datos:** $q = 2{,}5\times10^{-8}\ C$, $E = 5\times10^4\ N/C$ (hacia arriba = $+y$)

**a)** $45\ cm$ hacia la derecha (perpendicular a $E$): $W=0$  
**b)** $80\ cm$ hacia abajo: $W = qEd = 2{,}5\times10^{-8} \times 5\times10^4 \times 0{,}80 = 10^{-3}\ J$  
**c)** $260\ cm$ a $45^\circ$ sobre la horizontal: $d_y = 2{,}6\sin45^\circ = 1{,}838\ m$ → $W = 2{,}30\times10^{-3}\ J$

---

#### **Ejercicio 2.2.7:** Dos cargas iguales en eje $y$ - potencial en eje $x$

> **Datos:** Dos cargas $+q$ en $y=+a$ e $y=-a$

**b)** $V(0) = \dfrac{2kq}{a}$

**c)** $V(x) = \dfrac{2kq}{\sqrt{a^2+x^2}}$

**e)** $V(x)=V(0)/2$ → $x = \pm a\sqrt{3}$

**f)** $E_x = -\dfrac{dV}{dx} = \dfrac{2kqx}{(a^2+x^2)^{3/2}}$

---

#### **Ejercicio 2.2.8:** Cargas de $1\ C$ en triángulo equilátero - lado $10\ cm$

> **Datos:** $q = 1\ C$, $a = 10\ cm = 0{,}10\ m$

**a)** Fuerza sobre cada carga: $F_\text{par} = \dfrac{kq^2}{a^2} = 9\times10^{11}\ N$, $F_\text{total} = F_\text{par}\sqrt{3} = 1{,}56\times10^{12}\ N$

**b)** Campo en el centro: $E=0$

**c)** Potencial en el centro: $V = \dfrac{3\sqrt{3}\,kq}{a} = 4{,}68\times10^{11}\ V$

**d)** Energía interna: $U = \dfrac{3kq^2}{a} = 2{,}7\times10^{11}\ J$

---

#### **Ejercicio 2.2.9:** Anillo de radio $a$ con carga $q$ - potencial y campo axial

**a)** $V(z) = \dfrac{kq}{\sqrt{a^2+z^2}}$

**b)** $E_z = -\dfrac{dV}{dz} = \dfrac{kqz}{(a^2+z^2)^{3/2}}$

---

#### **Ejercicio 2.2.10:** Campo eléctrico por Ley de Gauss

**a)** Plano infinito: $E = \dfrac{\sigma}{2\varepsilon_0}$

**b)** Dos planos paralelos $\pm\sigma$: entre placas $E = \dfrac{\sigma}{\varepsilon_0}$, fuera $E=0$

**c)** Esfera uniforme: $r<R$: $E = \dfrac{kQr}{R^3}$, $r>R$: $E = \dfrac{kQ}{r^2}$

**d)** Cilindro uniforme: $r<R$: $E = \dfrac{\rho r}{2\varepsilon_0}$, $r>R$: $E = \dfrac{\lambda}{2\pi\varepsilon_0 r}$

---

#### **Ejercicio 2.2.11:** Potencial para cada configuración del ejercicio 2.2.10

**a)** Plano infinito: $V = -\dfrac{\sigma|z|}{2\varepsilon_0}+C$

**b)** Dos planos: entre placas $V = -\dfrac{\sigma z}{\varepsilon_0}+C$, fuera constante

**c)** Esfera sólida: $r>R$: $V=\dfrac{kQ}{r}$, $r<R$: $V = \dfrac{kQ(3R^2-r^2)}{2R^3}$

**d)** Cilindro: $r>R$: $V = -\dfrac{\lambda}{2\pi\varepsilon_0}\ln r + C$, $r<R$: $V = -\dfrac{\lambda r^2}{4\pi\varepsilon_0 R^2}+C'$

---

#### **Ejercicio 2.2.12:** Esfera metálica - trabajo con carga $q'$

> **Datos:** $r_0 = 1{,}5\ cm = 0{,}015\ m$, $V_\text{superficie} = 90\ V$, $q' = 2\times10^{-9}\ C$

Carga en la esfera: $Q = \dfrac{V r_0}{k} = \dfrac{90\times0{,}015}{9\times10^9} = 1{,}5\times10^{-10}\ C$

Potencial: $V(r) = \dfrac{kQ}{r} = \dfrac{1{,}35}{r}$

**a)** Trabajo de $r_2=6\ cm$ a $r_1=3\ cm$:
$$W = q'(V(r_1)-V(r_2)) = 2\times10^{-9} \times (45-22{,}5) = 4{,}5\times10^{-8}\ J$$

**b)** Mismo resultado si $r_1=r_3=3\ cm$ (el potencial es el mismo en ambos puntos).

---

#### **Ejercicio 2.2.13:** Electrón lanzado desde esfera metálica

> **Datos:** Radio $= 0{,}5\ m$, $Q = 6\ \mu C = 6\times10^{-6}\ C$, $E_c = 60\ keV = 9{,}6\times10^{-15}\ J$, $e = 1{,}6\times10^{-19}\ C$

**a)** $V = \dfrac{kQ}{R} = \dfrac{9\times10^9 \times 6\times10^{-6}}{0{,}5} = 108\ kV$

**b)** Energía total: $E_\text{tot} = E_c - eV = 9{,}6\times10^{-15} - 1{,}6\times10^{-19}\times108000 = -7{,}68\times10^{-15}\ J$

El electrón puede escapar (busca mayor potencial, se aleja de carga positiva).

---

#### **Ejercicio 2.2.14:** Dos cargas puntuales - trabajo y carga

> **Datos:** $\dfrac{q_1}{q_2} = \dfrac{2}{3}$, distancia inicial $= 40\ cm$, trabajo al mover $q_2$ a $80\ cm = 0{,}460\ J$

$q_1 = \dfrac{2}{3}q_2$. Potencial inicial: $V_A = \dfrac{kq_1}{0{,}40}$, final: $V_B = \dfrac{kq_1}{0{,}80}$

$$W = q_2(V_A-V_B) = q_2\, k q_1 \left(\frac{1}{0{,}40}-\frac{1}{0{,}80}\right) = q_2 \cdot 9\times10^9 \cdot \frac{2}{3}q_2 \cdot 1{,}25 = 7{,}5\times10^9 q_2^2$$

$$0{,}460 = 7{,}5\times10^9 q_2^2 \quad\Rightarrow\quad q_2 = 7{,}83\times10^{-6}\ C,\quad q_1 = 5{,}22\times10^{-6}\ C$$

$\Delta V = V_A-V_B = 58{,}7\ kV$

---

#### **Ejercicio 2.2.15:** Flujo sobre esfera con carga puntual y anillo

> **Datos:** Carga $q$ en centro, anillo de radio $a$ con densidad $\lambda$, esfera de radio $R < a$

La esfera solo encierra la carga puntual $q$; el anillo está fuera. Por Gauss:
$$\Phi = \frac{q}{\varepsilon_0}$$

---

## 2.3 Ejercicios Opcionales

#### **Ejercicio 2.3.1:** Potencial de carga puntual y ecuación de Laplace

$$V(r) = \frac{kq}{r} = \frac{q}{4\pi\varepsilon_0 r}$$

En coordenadas esféricas: $\nabla^2 V = \dfrac{1}{r^2}\dfrac{d}{dr}\!\left(r^2\dfrac{dV}{dr}\right) = 0$ para $r\neq 0$. En $r=0$ hay singularidad.

---

#### **Ejercicio 2.3.2:** Cilindros coaxiales - superficie equipotencial

> **Datos:** $a=1\ cm$, $b=10\ cm$, $V_a=400\ V$, $V_b=-400\ V$, hallar $r$ tal que $V(r)=200\ V$

Para cilindros coaxiales: $V(r) = A\ln r + B$

$$V(a) = A\ln(0{,}01) + B = 400 \quad\Rightarrow\quad -4{,}605\,A + B = 400$$
$$V(b) = A\ln(0{,}10) + B = -400 \quad\Rightarrow\quad -2{,}303\,A + B = -400$$

Restando: $A \times (-2{,}302) = 800 \quad\Rightarrow\quad A = -347{,}5$

$B = 400 + 347{,}5\times4{,}605 = 2001$

$$200 = -347{,}5\,\ln r + 2001 \quad\Rightarrow\quad \ln r = \frac{1801}{347{,}5} = 5{,}183 \quad\Rightarrow\quad r = e^{5{,}183} \approx 0{,}0178\ m$$

**Resultado:** $r \approx 1{,}78\ cm$

---

# CAPÍTULO 3: Capacitores

## 3.2 Ejercicios

#### **Ejercicio 3.2.1:** Esfera sólida conductora con cascarón concéntrico

> **Datos:** Esfera interior: radio $a$, carga $+2Q$. Cascarón: radios $b$ (int) y $c$ (ext), carga $-Q$

1. $r<a$: $E=0$
2. $a<r<b$: $E = \dfrac{2kQ}{r^2}$ (radial afuera)
3. $b<r<c$: $E=0$; carga interna del cascarón $=-2Q$, externa $=+Q$
4. $r>c$: $E = \dfrac{kQ}{r^2}$

---

#### **Ejercicio 3.2.2:** Placas paralelas con dieléctrico acrílico

> **Datos:** $A = 100\ cm^2 = 0{,}01\ m^2$, $Q_\text{libre} = 100\ pC = 10^{-10}\ C$, $K_e \approx 2{,}7$

**a)** $\sigma_\text{libre} = \dfrac{Q}{A} = 10^{-8}\ C/m^2$

**b)** $\sigma_\text{ind} = \sigma_\text{libre}\!\left(1-\dfrac{1}{K_e}\right) = 6{,}3\times10^{-9}\ C/m^2$

**c)** $\chi_e = K_e-1 = 1{,}7$

**d)** $\chi = \varepsilon_0 \chi_e = 1{,}5\times10^{-11}\ F/m$

---

#### **Ejercicio 3.2.3:** Máxima tensión con teflón y acetato

> **Datos:** Teflón: $d_1=1{,}5\ mm$, $E_\text{disruptivo}\approx 60\ MV/m$, $K_e\approx2{,}1$; Acetato: $d_2=2{,}5\ mm$, $E_\text{disruptivo}\approx15\ MV/m$, $K_e\approx3{,}5$

En serie: $D = \varepsilon_0 K_e E$ constante. El material más débil es el acetato ($15\ MV/m$).

$V_\text{acetato} = 15\times10^6 \times 0{,}0025 = 37.500\ V$

$D = \varepsilon_0 \cdot 3{,}5 \cdot 15\times10^6 = 4{,}647\times10^{-4}\ C/m^2$

$E_\text{teflón} = \dfrac{D}{\varepsilon_0 \cdot 2{,}1} = 25\ MV/m < 60\ MV/m$ ✓

$$V_\text{max} = 25\times10^6\times0{,}0015 + 15\times10^6\times0{,}0025 = 75.000\ V = 75\ kV$$

---

#### **Ejercicio 3.2.4:** Capacitor plano - antes y después del dieléctrico

> **Datos:** $A = 100\ cm^2 = 10^{-2}\ m^2$, $d = 4\ mm = 4\times10^{-3}\ m$, $V_0 = 1200\ V$, esteatita: $K_e \approx 6{,}5$

**a)** $C_0 = \dfrac{\varepsilon_0 A}{d} = 22{,}1\ pF$

**b)** $Q = C_0 V_0 = 26{,}5\ nC$

**c)** $C = K_e C_0 = 143{,}7\ pF$

**d)** $V = \dfrac{Q}{C} = 184{,}4\ V$

---

#### **Ejercicio 3.2.5:** Tres capacitores en serie

> **Datos:** $C_1=2\ \mu F$, $C_2=3\ \mu F$, $C_3=4\ \mu F$, $V=6\ V$

$$C_{eq} = \left(\frac{1}{2}+\frac{1}{3}+\frac{1}{4}\right)^{-1} = \frac{12}{13}\ \mu F \approx 0{,}923\ \mu F$$

$Q = C_{eq}V = \dfrac{72}{13}\ \mu C \approx 5{,}54\ \mu C$ (igual en todos)

**a)** $Q(C_2) = 5{,}54\ \mu C$

**b)** $V(C_3) = \dfrac{Q}{C_3} = 1{,}385\ V$

---

#### **Ejercicio 3.2.6:** Capacitores en paralelo reconectados con placas invertidas

> **Datos:** $C_1=4\ \mu F$, $C_2=6\ \mu F$, $V=10\ V$ en paralelo

Cargas iniciales: $Q_1=40\ \mu C$, $Q_2=60\ \mu C$

Al reconectar con polaridad opuesta: $Q_\text{neta} = Q_2 - Q_1 = 20\ \mu C$

$C_{eq}=10\ \mu F$, $V_f = \dfrac{20}{10}=2\ V$

$Q_{1f}=4\times2=8\ \mu C$, $Q_{2f}=6\times2=12\ \mu C$ (con inversión de signo)

---

#### **Ejercicio 3.2.7:** Capacitor con dos dieléctricos en capas

> **Datos:** $A=10^{-2}\ m^2$, $d_1=10^{-4}\ m$ ($K_{e1}=3$), $d_2=2\times10^{-4}\ m$ ($K_{e2}=4$)

$$C_1 = \frac{3\varepsilon_0 A}{d_1} = 2{,}655\ nF,\quad C_2 = \frac{4\varepsilon_0 A}{d_2} = 1{,}77\ nF$$

$$\frac{1}{C} = \frac{1}{C_1}+\frac{1}{C_2} \quad\Rightarrow\quad C = 1{,}062\ nF$$

Con $V=100\ V$: $D = \sigma_\text{libre} = \dfrac{CV}{A} = 1{,}062\times10^{-5}\ C/m^2$

$$E_1 = \frac{D}{\varepsilon_0 K_{e1}} = 4\times10^5\ V/m,\quad E_2 = \frac{D}{\varepsilon_0 K_{e2}} = 3\times10^5\ V/m$$

---

#### **Ejercicio 3.2.8:** Capacitor plano como balanza microscópica

> **Datos:** $d = 3{,}84\ mm = 3{,}84\times10^{-3}\ m$, $q = 1{,}44\ nC = 1{,}44\times10^{-9}\ C$, $V = 40\ V$ para equilibrio

Equilibrio: $qE = mg$, con $E = \dfrac{V}{d}$

$$m = \frac{qV}{gd} = \frac{1{,}44\times10^{-9}\times40}{9{,}8\times3{,}84\times10^{-3}} = 1{,}53\ \mu g$$

---

#### **Ejercicio 3.2.9:** Capacitor en aceite - energía y fuerza

> **Datos:** Área $A$, separación $x$, dieléctrico $K_e$, carga $Q$ constante

**a)** $U = \dfrac{Q^2}{2C} = \dfrac{Q^2 x}{2K_e\varepsilon_0 A}$

**c)** $F = -\dfrac{dU}{dx} = \dfrac{Q^2}{2K_e\varepsilon_0 A}$ (atractiva)

---

#### **Ejercicio 3.2.10:** Red de capacitores con interruptores

> **Datos:** $V_0=6\ V$, $C_1=1\ \mu F$, $C_2=2\ \mu F$, $C_3=3\ \mu F$, $C_4=4\ \mu F$

**a)** Solo $S_1$ cerrado: $C_1$ y $C_2$ en serie → $C_{eq}=2/3\ \mu F$, $Q=4\ \mu C$ en $C_1$ y $C_2$; $C_3$, $C_4$ sin carga.

**b)** $S_1$ y $S_2$ cerrados: topología requiere diagrama; $C_{eq}\approx 0{,}69\ \mu F$, $Q\approx4{,}14\ \mu C$.

---

#### **Ejercicio 3.2.11:** Dos capacitores en paralelo: carga y energía

**a)** $V_f = \dfrac{Q_0}{C_1+C_2}$ → $Q_{1f}=C_1V_f = \dfrac{C_1}{C_1+C_2}Q_0$, análogo para $C_2$.

**b)** $U_i = \dfrac{Q_0^2}{2C_1}$, $U_f = \dfrac{Q_0^2}{2(C_1+C_2)}$ → $U_f < U_i$ (energía disipada).

---

#### **Ejercicio 3.2.12:** Máquina de Van de Graaff

> **Datos:** Diámetro $=2\ m$ → $R=1\ m$, $I=10\ \mu A = 10^{-5}\ A$, $E_\text{disruptivo}=3\times10^6\ V/m$

$$V_\text{disr} = E_\text{disr}\, R = 3\times10^6\ V$$

$$Q_\text{disr} = \frac{V R}{k} = \frac{3\times10^6 \times 1}{9\times10^9} = 3{,}33\times10^{-4}\ C$$

$$t = \frac{Q_\text{disr}}{I} = 33{,}3\ s$$

---

#### **Ejercicio 3.2.13:** Esfera cargada a $1\ kV$ - segunda esfera conectada a tierra

> **Datos:** $R_1=10\ cm=0{,}10\ m$, $V_1=1\ kV=1000\ V$, $R_2=3\ cm=0{,}03\ m$ a $1\ m$ de distancia

**a)** $Q_1 = \dfrac{V_1 R_1}{k} = \dfrac{1000\times0{,}10}{9\times10^9} = 11{,}1\ nC$

**b)** Potencial de $Q_1$ en la posición de la esfera pequeña: $V_{Q1} = \dfrac{kQ_1}{d}=100\ V$

Para que la esfera pequeña esté a $V=0$:
$$\frac{kQ_2}{R_2} + 100 = 0 \quad\Rightarrow\quad Q_2 = -333\ pC$$

---

#### **Ejercicio 3.2.14:** ¿Qué aumenta más la capacidad?

> $C_0$ con $K_e=2$. Opción a: $K_e=4$ → $C_a = 4\varepsilon_0 A/d = 2C_0$  
> Opción b: separación $d\to d/3$ → $C_b = 2\varepsilon_0 A/(d/3) = 3C_0$

**Resultado:** Opción b (reducir separación) es más efectiva.

---

#### **Ejercicio 3.2.15:** Capacitor con placas separadas al doble (desconectado)

$C_f = C_0/2$, $Q$ constante → $V_f = 2V_0$, $Q$ no cambia.

---

#### **Ejercicio 3.2.16:** Capacitor cargado a $100\ V$, se introduce $K_e=4$

$Q$ constante, $C_f = 4C_0$ → $V_f = V_0/4 = 25\ V$, $Q$ no cambia.

---

#### **Ejercicio 3.2.17:** Energía al duplicar separación (conectado)

$V$ constante, $C_f = C_0/2$ → $U_f = U_0/2$ (la energía se reduce a la mitad).

---

#### **Ejercicio 3.2.18:** Capacitor con mica: extraer el dieléctrico

> **Datos:** $C=2\ nF$, $\varepsilon_r=5$, $V_0=100\ V$, desconectado → $Q$ constante

$Q = 200\ nC$, $U_i = 10\ \mu J$

$C_\text{aire} = C/\varepsilon_r = 0{,}4\ nF$, $V_f = Q/C_\text{aire} = 500\ V$, $U_f = 50\ \mu J$

Trabajo $= \Delta U = 40\ \mu J$

---

## 3.3 Ejercicios Opcionales

#### **Ejercicio 3.3.1:** Condiciones de frontera entre dieléctricos

**a)** $D_{n1}=D_{n2}$ (sin carga libre)

**b)** $E_{t1}=E_{t2}$

Relación de ángulos: $\dfrac{\tan\theta_1}{\tan\theta_2} = \dfrac{\varepsilon_2}{\varepsilon_1}$

---

#### **Ejercicio 3.3.2:** Densidad de energía en dieléctrico polarizado

$$u = \frac{1}{2}\mathbf{D}\cdot\mathbf{E} = \frac{1}{2}\varepsilon_0 E^2 + \frac{1}{2}\mathbf{P}\cdot\mathbf{E}$$

---

#### **Ejercicio 3.3.3:** Radio clásico del electrón

$$U = \frac{3}{5}\frac{ke^2}{r} = m_e c^2 \quad\Rightarrow\quad r = \frac{3}{5}\frac{ke^2}{m_e c^2} = 1{,}69\times10^{-15}\ m \approx 1{,}69\ fm$$

---

# CAPÍTULO 4: La Corriente Eléctrica

## 4.2 Ejercicios

#### **Ejercicio 4.2.1:** Velocidad de desplazamiento de electrones en cobre

> **Datos:** $A = 3\ mm^2 = 3\times10^{-6}\ m^2$, $I = 5\ A$, $n_\text{Cu} = 8{,}5\times10^{28}\ e/m^3$, $e = 1{,}6\times10^{-19}\ C$

$$v_d = \frac{I}{n e A} = \frac{5}{8{,}5\times10^{28} \times 1{,}6\times10^{-19} \times 3\times10^{-6}} = 1{,}225\times10^{-4}\ m/s \approx 0{,}123\ mm/s$$

---

#### **Ejercicio 4.2.2:** Densidad de corriente en conductor no uniforme

> **Datos:** $I=5\ A$, $r_1=0{,}4\ cm=4\times10^{-3}\ m$, $J_2=J_1/4$

**a)** $J_1 = \dfrac{I}{\pi r_1^2} = 9{,}95\times10^4\ A/m^2$

**b)** $J_2 = J_1/4$, $I = J_2 \pi r_2^2$ → $r_2 = 2r_1 = 8\ mm$

---

#### **Ejercicio 4.2.3:** Carga en función del tiempo

> **Datos:** $i(t) = 2t^2 - 3t + 7\ (A)$, de $t=2\ s$ a $t=4\ s$

$$q = \int_2^4 (2t^2-3t+7)\, dt = \left[ \frac{2t^3}{3} - \frac{3t^2}{2} + 7t \right]_2^4 = 33{,}3\ C$$

---

#### **Ejercicio 4.2.4:** Resistividad del material

> **Datos:** Radio $=1{,}2\ cm = 0{,}012\ m$, $I=3\ A$, $E=120\ V/m$

$$J = \frac{I}{\pi r^2} = 6.631\ A/m^2,\quad \rho = \frac{E}{J} = 1{,}81\times10^{-2}\ \Omega\cdot m$$

---

#### **Ejercicio 4.2.5:** Resistencia de hilo de platino

> **Datos:** $L=1{,}5\ m$, $d=0{,}1\ mm$ → $r=5\times10^{-5}\ m$, $\rho_{Pt}(20^\circ C)=10{,}6\times10^{-8}\ \Omega\cdot m$

$$A = \pi r^2 = 7{,}854\times10^{-9}\ m^2,\quad R = \frac{\rho L}{A} = 20{,}25\ \Omega$$

---

#### **Ejercicio 4.2.6:** Cambio porcentual de resistencia del cobre

> $\alpha_\text{Cu} = 3{,}9\times10^{-3}\ ^\circ C^{-1}$, $\Delta T = 160\ ^\circ C$

$$\%\Delta R = \alpha\, \Delta T \times 100 = 62{,}4\%$$

---

#### **Ejercicio 4.2.7:** Corriente y FEM con resistencia interna

> **Datos:** $R_\text{ext} = 5{,}6\ \Omega$, $r=0{,}2\ \Omega$, $V_\text{term} = 10\ V$

**a)** $I = \dfrac{V_\text{term}}{R_\text{ext}} = 1{,}786\ A$

**b)** $\varepsilon = V_\text{term} + Ir = 10{,}36\ V$

---

#### **Ejercicio 4.2.8:** Calentador de inmersión

> **Datos:** $P=500\ W$, $V_\text{agua}=2\ L$ → $m=2\ kg$, $T_0=20^\circ C$, $\eta=80\%$, $T_\text{ebullición}=100^\circ C$, calor vap $=2{,}26\times10^6\ J/kg$

**a)** $Q = mc\Delta T = 669.760\ J$, $P_\text{útil}=400\ W$, $t_1 = Q/P_\text{útil} = 1674\ s \approx 27{,}9\ min$

**b)** $Q_\text{vap} = 1\times2{,}26\times10^6 = 2{,}26\times10^6\ J$, $t_2 = 5650\ s \approx 94{,}2\ min$

---

#### **Ejercicio 4.2.9:** Hilo de cobre: electrones y velocidad de arrastre

> **Datos:** $d=1\ mm$ → $A=7{,}854\times10^{-7}\ m^2$, $I=5\ A$, $M_\text{Cu}=64\ g/mol$, $\delta=9\ g/cm^3$

**a)** $n_e = \dfrac{I}{e} = 3{,}125\times10^{19}\ \text{electrones/s}$

**b)** $n = \dfrac{\delta N_A}{M} = 8{,}47\times10^{28}\ e/m^3$, $v_d = \dfrac{I}{n e A} = 0{,}47\ mm/s$

---

#### **Ejercicio 4.2.10:** Tres resistores iguales: serie vs paralelo

> 3 resistores iguales $R$ en serie consumen $10\ W$ con voltaje $V$

Serie: $P_\text{serie} = \dfrac{V^2}{3R} = 10\ W$

Paralelo: $P_\text{par} = \dfrac{V^2}{R/3} = \dfrac{3V^2}{R} = 9\cdot10 = 90\ W$

---

#### **Ejercicio 4.2.11:** Ley de Ohm: tabla de mediciones

> Pares $(I,V)$: $(0{,}5;\,4{,}75)$, $(1;\,5{,}81)$, $(1{,}5;\,7{,}05)$, $(2;\,8{,}56)$

**a)** $R = V/I$ no es constante → no sigue Ohm.

**b)** $R_\text{dif} \approx 2{,}75\ \Omega$ en $I=1{,}5\ A$.

**c)** $R_\text{media} = (8{,}56-5{,}81)/(2-1) = 2{,}75\ \Omega$.

---

#### **Ejercicio 4.2.12:** Galvanómetro: amperímetro y voltímetro

> $I_\text{max}=0{,}1\ mA=10^{-4}\ A$, $R_g=5\ \Omega$, $50$ divisiones

**a)** Amperímetro: cada división $0{,}2\ A$ → $I_\text{total}=10\ A$

$$R_\text{shunt} = \frac{I_g R_g}{I-I_g} \approx 5\times10^{-5}\ \Omega$$

**b)** Voltímetro: cada división $0{,}5\ V$ → $V_\text{total}=25\ V$

$$R_\text{serie} = \frac{V_\text{total}}{I_g} - R_g = 249.995\ \Omega \approx 250\ k\Omega$$

---

#### **Ejercicio 4.2.13:** FEM y resistencia interna de batería

> Caso 1: $V=8{,}5\ V$, $I=3\ A$ (descarga); Caso 2: $V=11\ V$, $I=2\ A$ (carga)

Descarga: $\varepsilon = V + Ir$ → $8{,}5 = \varepsilon - 3r$

Carga: $11 = \varepsilon + 2r$

Resolviendo: $r=0{,}5\ \Omega$, $\varepsilon=10\ V$

---

#### **Ejercicio 4.2.14:** Calentador con resistencias en paralelo

> $R_1=60\ \Omega$, $R_2=30\ \Omega$, $I_\text{amperímetro}=6\ A$, $m=480\ g$, $t=5\ min=300\ s$, $T_0=20^\circ C$

$$R_{eq}=20\ \Omega,\quad V=I R_{eq}=120\ V,\quad I_1=\frac{V}{R_1}=2\ A,\quad P_1=I_1^2 R_1=240\ W$$

$$Q=P_1\, t=72.000\ J,\quad \Delta T = \frac{Q}{mc} = 35{,}77^\circ C,\quad T_f=55{,}8^\circ C$$

---

#### **Ejercicio 4.2.15:** Pava eléctrica

> $V_\text{agua}=1\ L$ → $m=1\ kg$, $T_0=13{,}5^\circ C$, $T_\text{ebull}=100^\circ C$, $t=5\ min=300\ s$, $c=4186\ J/(kg\cdot K)$

**a)** $Q = mc\Delta T = 362.089\ J$, $P = Q/t = 1207\ W$

**b)** $R = V^2/P = (120)^2/1207 = 11{,}93\ \Omega$

---

#### **Ejercicio 4.2.16:** Calentador de inmersión con batería

> $V=12\ V$, $r=1\ \Omega$, $m=1\ kg$, $\Delta T=90^\circ C$, $c=4186\ J/(kg\cdot K)$

Para máxima potencia: $R_x = r = 1\ \Omega$

$$P = \frac{V^2 R_x}{(r+R_x)^2} = 36\ W$$

$$Q = mc\Delta T = 376.740\ J,\quad t = Q/P = 10.465\ s \approx 2{,}9\ h$$

---

#### **Ejercicio 4.2.17:** Coeficiente $\alpha$ de temperatura de resistencia

> $E=12\ V$, $T_1=0^\circ C$ → $I_1=0{,}12\ A$, $T_2=40^\circ C$ → $I_2=0{,}1\ A$

$$R_1 = 12/0{,}12 = 100\ \Omega,\quad R_2 = 12/0{,}1 = 120\ \Omega$$

$$R_2 = R_1(1+\alpha\Delta T) \quad\Rightarrow\quad 120 = 100(1+40\alpha) \quad\Rightarrow\quad \alpha = 5\times10^{-3}\ ^\circ C^{-1}$$

---

#### **Ejercicio 4.2.18:** Alambre compuesto cobre + hierro en serie

> **Datos:** $L=10\ m$, $d=2\ mm$ → $A=\pi\times(10^{-3})^2 = \pi\times10^{-6}\ m^2$, $V_\text{total}=100\ V$, $\rho_\text{Cu}=1{,}7\times10^{-8}\ \Omega\cdot m$, $\rho_\text{Fe}=10^{-7}\ \Omega\cdot m$

$$R_\text{Cu} = \frac{\rho_\text{Cu}\, L}{A} = \frac{1{,}7\times10^{-8}\times10}{\pi\times10^{-6}} = 0{,}0541\ \Omega$$

$$R_\text{Fe} = \frac{\rho_\text{Fe}\, L}{A} = \frac{10^{-7}\times10}{\pi\times10^{-6}} = 0{,}3183\ \Omega$$

$$R_\text{total} = 0{,}0541 + 0{,}3183 = 0{,}3724\ \Omega,\quad I = \frac{V}{R_\text{total}} = \frac{100}{0{,}3724} = 268{,}5\ A$$

**a)** Caídas de tensión:
$$\Delta V_\text{Cu} = I\cdot R_\text{Cu} = 268{,}5 \times 0{,}0541 = 14{,}5\ V$$
$$\Delta V_\text{Fe} = I\cdot R_\text{Fe} = 268{,}5 \times 0{,}3183 = 85{,}5\ V$$

**b)** Densidad de corriente (igual en ambos tramos):
$$J = \frac{I}{A} = \frac{268{,}5}{\pi\times10^{-6}} = 8{,}55\times10^7\ A/m^2$$

**c)** Campo eléctrico en cada tramo:
$$E_\text{Cu} = \rho_\text{Cu}\cdot J = 1{,}7\times10^{-8}\times8{,}55\times10^7 = 1{,}45\ V/m$$
$$E_\text{Fe} = \rho_\text{Fe}\cdot J = 10^{-7}\times8{,}55\times10^7 = 8{,}55\ V/m$$

---

#### **Ejercicio 4.2.19:** Batería de automóvil

> **Datos:** $V=12\ V$, capacidad $=55\ Ah$

**a)** Energía almacenada:
$$E = V\cdot Q = 12 \times (55\times3600) = 12 \times 198.000 = 2.376.000\ J = 2{,}376\ MJ$$

**b)** Con 4 luces de $15\ W$ cada una → $P_\text{total} = 60\ W$:
$$t = \frac{E}{P} = \frac{2.376.000}{60} = 39.600\ s = 11\ \text{horas}$$

---

#### **Ejercicio 4.2.20:** FEM y resistencia interna - igual potencia en exterior

> $R_1=2\ \Omega$, $R_2=0{,}5\ \Omega$, $P_\text{ext}=2{,}54\ W$ en ambos casos

$P_1 = I_1^2 R_1 = 2{,}54$, $P_2 = I_2^2 R_2 = 2{,}54$ → $I_2/I_1 = 2$

$$\frac{\varepsilon}{R_2+r} = \frac{2\varepsilon}{R_1+r} \quad\Rightarrow\quad R_1+r = 2(R_2+r) \quad\Rightarrow\quad r=1\ \Omega$$

$$I_1 = \sqrt{2{,}54/2}=1{,}127\ A,\quad \varepsilon = I_1(R_1+r)=3{,}38\ V$$

---

## 4.3 Ejercicios Opcionales

#### **Ejercicio 4.3.1:** Valor medio y valor cuadrático medio de corriente

> $i = 4 + 2t^2$, de $t=0$ a $t=10\ s$

$$I_\text{medio} = \frac{1}{10}\int_0^{10}(4+2t^2)\,dt = 70{,}67\ A$$

$$I_\text{rms}^2 = \frac{1}{10}\int_0^{10}(4+2t^2)^2\,dt = 1349{,}3 \quad\Rightarrow\quad I_\text{rms} = 36{,}7\ A$$

---

#### **Ejercicio 4.3.2:** Resistencia de cilindro hueco (corriente axial)

$$R = \frac{L}{\sigma \pi (R_2^2 - R_1^2)}$$

---

#### **Ejercicio 4.3.3:** Resistencia de cilindro hueco (corriente radial)

$$R = \frac{\ln(R_2/R_1)}{2\pi\sigma L}$$

---

#### **Ejercicio 4.3.4:** Motor eléctrico pequeño

> **Datos:** $V=24\ V$, $P_\text{Joule}=4{,}5\ W$ (en los arrollamientos), $R_\text{arrollamientos}=0{,}5\ \Omega$

**a)** Corriente en el motor:
$$I = \sqrt{\frac{P_\text{Joule}}{R}} = \sqrt{\frac{4{,}5}{0{,}5}} = \sqrt{9} = 3\ A$$

**b)** Potencia eléctrica total consumida:
$$P_\text{total} = V\cdot I = 24\times3 = 72\ W$$

**c)** Potencia mecánica entregada:
$$P_\text{mec} = P_\text{total} - P_\text{Joule} = 72 - 4{,}5 = 67{,}5\ W$$

**d)** Rendimiento del motor:
$$\eta = \frac{P_\text{mec}}{P_\text{total}} = \frac{67{,}5}{72} = 0{,}9375 = 93{,}75\%$$

**e)** Costo de operación durante 10 horas (tarifa $\$0{,}10/kWh$):
$$E = 72\ W \times 10\ h = 720\ Wh = 0{,}72\ kWh \quad\Rightarrow\quad \text{Costo} = 0{,}72 \times \$0{,}10 = \$0{,}072$$

---

# CAPÍTULO 5: Circuitos Eléctricos

## 5.2 Ejercicios

#### **Ejercicio 5.2.1:** Resistencias en serie y paralelo

> **Datos:** $R = 2,\,3,\,6,\,12\ \Omega$

**a)** Serie: $R_{eq}=2+3+6+12=23\ \Omega$

**b)** Paralelo: $\dfrac{1}{R_{eq}}=\dfrac{1}{2}+\dfrac{1}{3}+\dfrac{1}{6}+\dfrac{1}{12}=\dfrac{13}{12}$ → $R_{eq}=\dfrac{12}{13} \approx 0{,}923\ \Omega$

---

#### **Ejercicio 5.2.2:** Resistencia equivalente circuito complejo

> **Datos:** $R_1=6{,}2;\ R_2=2;\ R_3=5;\ R_4=3;\ R_5=3;\ R_6=1;\ R_7=14\ \Omega$

Procediendo por pasos: $R_{eq} \approx 8{,}53\ \Omega$

---

#### **Ejercicio 5.2.3:** Resistencia equivalente circuito complejo 2

> **Datos:** $R_1=7{,}6;\ R_2=22;\ R_3=5;\ R_4=3;\ R_5=6;\ R_6=4;\ R_7=9;\ R_8=2\ \Omega$

$R_{eq} \approx 16{,}6\ \Omega$

---

#### **Ejercicio 5.2.4:** Circuito con múltiples resistencias

> **Datos:** $E=12\ V;\ R_1=5;\ R_2=2;\ R_3=18;\ R_4=3;\ R_5=6;\ R_6=9\ \Omega$

$R_{eq} \approx 2{,}64\ \Omega$, $I_\text{total}=4{,}54\ A$

**b)** $I_1 = E/R_1 = 2{,}4\ A$

**c)** $I_2 \approx 2{,}14\ A$

---

#### **Ejercicio 5.2.5:** Circuito con $R_1$ a $R_6$ y fuente $36\ V$

> **Datos:** $E=36\ V;\ R_1=3;\ R_2=18;\ R_3=2;\ R_4=6;\ R_5=12;\ R_6=9\ \Omega$

$R_{eq}=6{,}32\ \Omega$, $I_1=5{,}69\ A$, $I_2 \approx 3{,}59\ A$

---

#### **Ejercicio 5.2.6:** Galvanómetro como voltímetro

> **Datos:** $R_g=60\ \Omega$, $I_\text{fsd}=0{,}5\ mA=5\times10^{-4}\ A$, $V=1\ V$

$$R_\text{serie} = \frac{V}{I_\text{fsd}} - R_g = 1940\ \Omega$$

---

#### **Ejercicio 5.2.7:** Puente de Wheatstone balanceado

> **Datos:** $R_1=10,\ R_2=20,\ R_3=30\ \Omega$

$$R_x = \frac{R_3 R_2}{R_1} = 60\ \Omega$$

---

#### **Ejercicio 5.2.8:** Circuito RC: constantes de tiempo

**a)** $q(t)=0{,}9Q_0$ → $t = \tau \ln(10) = 2{,}303\tau$

**b)** $0{,}99Q_0$ → $t = \tau \ln(100) = 4{,}605\tau$

---

#### **Ejercicio 5.2.9:** Constante de tiempo de circuito RC

> $q(0{,}9\ s) = 0{,}60\, Q_\text{max}$

$$0{,}60 = 1 - e^{-0{,}9/\tau} \quad\Rightarrow\quad e^{-0{,}9/\tau}=0{,}40 \quad\Rightarrow\quad \tau = 0{,}982\ s$$

---

#### **Ejercicio 5.2.10:** Diferencia de potencial en circuito con múltiples fuentes

> **Datos:** $R_1=R_3=R_7=1\ \Omega;\ R_4=R_5=R_6=2\ \Omega;\ R_2=4\ \Omega;\ E_1=8\ V;\ E_2=10\ V;\ E_3=12\ V$

Requiere análisis de mallas completo.

---

#### **Ejercicio 5.2.11:** Circuito potenciométrico

> **Datos:** $E=3\ V$, $E_p=1{,}0183\ V$, posición patrón: $b$ a $0{,}36$ de $a$ a $c$

**a)** $V_{ac} = E_p/0{,}36 = 2{,}828\ V$

**b)** $E_x = V_{ac} \times 0{,}47 = 1{,}329\ V$

**c)** Demostración: $E_x/E_p = L_1/L_2$ → $E_x = E_p\, L_1/L_2$

---

#### **Ejercicio 5.2.12:** Puntos A y B al mismo potencial - hallar R

> **Datos:** $R_1=1;\ R_2=R_5=3;\ R_3=64;\ R_4=5;\ R_6=25;\ R_7=16;\ E=4\ V$

Requiere análisis completo.

---

#### **Ejercicio 5.2.13:** Puente de Wheatstone con galvanómetro

> **Datos:** $R_1=3;\ R_2=8;\ R_3=20;\ R_4=4;\ R_5=5\ \Omega$

**a)** $R_{eq} \approx 12{,}9\ \Omega$

**b)** Balance: $R_4^\text{bal} = \dfrac{R_4 R_2}{R_1} = 10{,}67\ \Omega$

**c)** Con $R_4$ un $10\%$ mayor, $I_G$ pequeño (requiere análisis completo).

---

#### **Ejercicio 5.2.14:** Circuito RC serie: carga

> **Datos:** $V=90\ V$, $C=1\ \mu F$, $R=500\ \Omega$, $\tau=0{,}5\ ms$

$$i(t)=0{,}18\, e^{-2000t}\ A,\quad V_R(t)=90\, e^{-2000t}\ V,\quad V_C(t)=90(1-e^{-2000t})\ V$$

Con $2R$: $\tau=1\ ms$ (más lento); con $R/2$: $\tau=0{,}25\ ms$ (más rápido)

---

#### **Ejercicio 5.2.15:** Circuito RC serie: descarga

$$V_C(t)=90\, e^{-2000t}\ V,\quad i(t)=-0{,}18\, e^{-2000t}\ A,\quad V_R(t)=-90\, e^{-2000t}\ V$$

---

#### **Ejercicio 5.2.16:** Circuito con $R_1,\, R_2,\, C,\, R_3$

> **Datos:** $R_1=R_3=1\ k\Omega$, $R_2=500\ \Omega$, $C=1\ \mu F$, $E=90\ V$

**a)** Al cerrar $S$: $C$ actúa como cortocircuito inicial; $\tau_\text{carga}=R_2 C=0{,}5\ ms$; estacionario: $V_C=45\ V$

**b)** Al abrir $S$: $\tau_\text{descarga}=C(R_2+R_3)=1{,}5\ ms$

---

#### **Ejercicio 5.2.17:** FEM $E_3$ para $V_{ab}=0$

> **Datos:** $R_1=10;\ R_2=15;\ R_3=5\ \Omega;\ E_1=10\ V;\ E_2=40\ V;\ I=2\ A$

$$V_{ab}=E_1 - I R_1 - E_2 + I R_2 + E_3 - I R_3 = 0 \quad\Rightarrow\quad E_3 = 30\ V$$

---

#### **Ejercicio 5.2.18:** Circuito complejo con $R_1$ a $R_6$

> **Datos:** $R_1=R_6=1;\ R_2=4;\ R_3=6;\ R_4=12;\ R_5=8\ \Omega;\ E=12\ V$

$$R_{eq}=6\ \Omega,\quad I_\text{batería}=2\ A$$

Corrientes: $I_{R1}=I_{R6}=2\ A$, $I_{R2}=I_{R5}=1\ A$, $I_{R3}=0{,}667\ A$, $I_{R4}=0{,}333\ A$

$V_{ab}=2\ V$

---

#### **Ejercicio 5.2.19:** Resistencia limitadora de nicrome

> **Datos:** $R_1=20\ \Omega$, $E=120\ V$, $V_{R1}=40\ V$ → $V_{R2}=80\ V$, $\rho_\text{nicrome}=1\ \Omega\cdot mm^2/m$, $d=1\ mm$, $r_\text{cil}=2{,}5\ cm$

$$I=2\ A,\quad R_2=40\ \Omega,\quad L = \frac{R_2 A}{\rho} = 31{,}416\ m,\quad N = \frac{L}{2\pi r_\text{cil}} = 200\ \text{espiras}$$

---

#### **Ejercicio 5.2.20:** Amperímetro y voltímetro en circuito

> **Datos:** $V_{xy}=36\ V;\ R_1=R_6=6\ \Omega;\ R_2=3\ \Omega;\ R_3=2\ \Omega;\ R_4=9\ \Omega;\ R_5=18\ \Omega$

Amperímetro: $2{,}54\ A$; Voltímetro: $4{,}16\ V$

---

#### **Ejercicio 5.2.21:** Amperímetro y voltímetro con batería y $R_1=R_2=R_3=45\ \Omega$

> **Datos:** $E=4\ V;\ r=1\ \Omega$

$$I_\text{bat}=0{,}129\ A,\quad V_\text{paralelo}=3{,}871\ V$$

$$I_{R1}=86\ mA,\quad I_{R2}=I_{R3}=43\ mA$$

---

#### **Ejercicio 5.2.22:** Coeficiente de resistividad a $0^\circ C$

$$\alpha(0^\circ C) = \frac{\alpha(20^\circ C)}{1 - 20\,\alpha(20^\circ C)}$$

---

#### **Ejercicio 5.2.23:** Análisis de mallas con tres mallas

> **Datos:** $V_1=12\ V;\ V_2=5\ V;\ R_1=2\ \Omega;\ R_2=3\ \Omega;\ R_3=1\ \Omega;\ R_4=4\ \Omega;\ R_5=2\ \Omega$

$$I_1=4{,}49\ A,\quad I_2=1{,}47\ A,\quad I_3=1{,}81\ A$$

---

## 5.3 Ejercicios Opcionales

#### **Ejercicio 5.3.1:** Circuito con interruptor S

> **Datos:** $V_{cc}=36\ V;\ R_1=R_4=6\ \Omega;\ R_2=R_3=3\ \Omega$

**a)** S abierto: $V_{AB} = -12\ V$

**b)** S cerrado: $I_S \approx 2\ A$

**c)** $R_{eq}(\text{abierto}) = 4{,}5\ \Omega$

**d)** $R_{eq}(\text{cerrado}) \approx 4\ \Omega$

---

#### **Ejercicio 5.3.2:** Circuito con interruptor y $R_5$ adicional

> **Datos:** $V_{cc}=36\ V;\ R_1=R_4=6\ \Omega;\ R_2=R_3=R_5=3\ \Omega$

**a)** S abierto: $V_{AB}=-12\ V$

**b)** S cerrado: $I_S \approx 1{,}71\ A$

---

#### **Ejercicio 5.3.3:** Localización de fuga a tierra

> Cables de $2\ km$ total, puente balanceado con $R_a=2{,}54\ \Omega$, $R_b=1\ \Omega$

$$x = 565\ m\ \text{desde }b\text{ hasta la fuga}$$

---

#### **Ejercicio 5.3.4:** Cubo de resistencias - vértices opuestos

> $12$ barras de $R=3{,}5\ \Omega$ cada una

$$R_{eq} = \frac{5}{6}R = 2{,}917\ \Omega$$

---

#### **Ejercicio 5.3.5:** Dos baterías en circuito con múltiples resistencias

> **Datos:** $R_1=100;\ R_2=200;\ R_3=150;\ R_4=10;\ R_5=5;\ R_6=50\ \Omega;\ E_1=50\ V;\ E_2=100\ V$

$$I_1=0{,}4257\ A,\quad I_2=0{,}4046\ A$$

Calor en $R_1$ en $10\ s$: $Q=181{,}2\ J = 43{,}3\ cal$

Potencia: $P(E_1)=21{,}3\ W$, $P(E_2)=40{,}5\ W$

---


