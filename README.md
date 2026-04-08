# 🧮 Scientific Calculator — Java

A console-based scientific calculator built in **Semester 1** as a Java programming assignment. The project demonstrates core Java concepts including control flow, methods, exception handling, and — most notably — **manual implementation of mathematical series** without relying on `java.lang.Math`.

A **GUI-based version (v2.0)** is currently in development and will be added to this repo soon.

---

## 📌 Features

### Arithmetic
| # | Operation |
|---|-----------|
| 1 | Addition |
| 2 | Subtraction |
| 3 | Multiplication |
| 4 | Division (with divide-by-zero guard) |
| 5 | Modulus |
| 6 | Absolute Value |

### Powers & Roots
| # | Operation |
|---|-----------|
| 7 | Square (x²) |
| 8 | Cube (x³) |
| 9 | Square Root — Newton's Method |
| 10 | Cube Root — Newton's Method |
| 11 | Power (xⁿ, integer exponent, supports negatives) |
| 12 | Exponential (eˣ) — Maclaurin Series |

### Logarithms
| # | Operation |
|---|-----------|
| 13 | log₁₀(x) — Series Approximation |
| 14 | ln(x) — Mercator Series |

### Trigonometry (input in degrees)
| # | Operation |
|---|-----------|
| 15 | sin(x) — Taylor Series |
| 16 | cos(x) — Taylor Series |
| 17 | tan(x) — sin/cos |
| 18 | cosec(x) |
| 19 | sec(x) |
| 20 | cot(x) |
| 21 | arcsin(x) — Power Series |
| 22 | arccos(x) — via arcsin |
| 23 | arctan(x) — Taylor Series |

### Other
| # | Operation |
|---|-----------|
| 24 | Factorial (n!) |
| 25 | Constant: π |
| 26 | Constant: e |
| 27 | Degrees → Radians |
| 28 | Radians → Degrees |

**Total: 28 functionalities** (exceeds the assignment requirement of 20)

---

## 🧠 What Makes This Interesting

Most calculator implementations call `Math.sin()`, `Math.log()`, etc. This project avoids that entirely — every transcendental function is computed from scratch using mathematical series:

- **eˣ** → Maclaurin series: `Σ xⁿ/n!`
- **sin(x), cos(x)** → Taylor series around 0
- **ln(x)** → Mercator series via `(x-1)/(x+1)`
- **arcsin(x)** → Power series with 1000-term convergence
- **arctan(x)** → Taylor series with range reduction for |x| > 1
- **√x, ∛x** → Newton's method (30 iterations)

This was a deliberate choice to understand *how* these functions work mathematically, not just how to call them.

---

## 🗂️ Project Structure

```
scientific-calculator/
│
├── v1-console/
│   └── ScientificCalculator.java    ← Sem 1 console version (this file)
│
├── v2-gui/                          ← Coming soon
│   └── ...
│
└── README.md
```

---

## ▶️ How to Run (Console Version)

**Requirements:** Java 8 or above

```bash
# Compile
javac ScientificCalculator.java

# Run
java ScientificCalculator
```

You'll be prompted to enter an initial value. The calculator keeps a running current value (`num`) which each operation updates — similar to how a real calculator works.

```
Enter initial value to switch on scientific calculator: 5

=== Scientific Calculator ===

 1. Addition                   11. Power (x^y)                  21. Inverse Sine
 2. Subtraction                12. Exponential (e^x)            22. Inverse Cosine
...

Enter option number: 9
Operation: Square Root
sqrt(5.0) = 2.23606797749979
```

---

## 🏗️ Design Approach

- **Stateful accumulator model**: a single `num` variable holds the running result, updated by each operation — mimicking physical calculator behaviour.
- **Modular methods**: every operation is a separate `static` method, keeping the `switch` in `main` clean.
- **Sub-menu system**: functions that produce an intermediate result (trig, log, exp, constants) open a sub-menu letting you add/subtract/multiply/divide that result into the current value, or replace it outright.
- **Exception handling**: division by zero, negative square roots, non-integer factorials, out-of-range arcsin/arccos inputs, and negative logarithm inputs are all caught with descriptive messages.

---

## 📚 Series References

| Function | Method | Reference |
|----------|--------|-----------|
| eˣ | Maclaurin series | [Wikipedia](https://en.wikipedia.org/wiki/Exponential_function#Series_representation) |
| ln(x) | Mercator series | [Wikipedia](https://en.wikipedia.org/wiki/Natural_logarithm#Computational_methods) |
| log₁₀(x) | Change-of-base from ln | [Wikipedia](https://en.wikipedia.org/wiki/Logarithm#Change_of_base) |
| sin(x), cos(x) | Taylor series | [Wikipedia](https://en.wikipedia.org/wiki/Taylor_series#Trigonometric_functions) |
| arcsin(x) | Power series | [Wikipedia](https://en.wikipedia.org/wiki/Inverse_trigonometric_functions#Series_expansions) |
| arccos(x) | arcsin relationship | [Wikipedia](https://en.wikipedia.org/wiki/Inverse_trigonometric_functions#Relations_between_inverse_trig_functions) |
| arctan(x) | Taylor series + range reduction | [Wikipedia](https://en.wikipedia.org/wiki/Inverse_trigonometric_functions#Series_expansions) |
| √x, ∛x | Newton's method | [Wikipedia](https://en.wikipedia.org/wiki/Newton%27s_method#Square_root_and_nth_root) |

---

## 🚧 Roadmap

- [x] v1.0 — Console-based calculator (28 operations)
- [ ] v2.0 — GUI version using Java Swing/JavaFX *(in progress)*
  - Clickable button interface
  - Expression input bar
  - History panel
  - Radian/Degree toggle

---

## 📝 Assignment Context

This was submitted as **Assignment 1** for the CSE Java Programming course (Semester 1). The requirement was to implement at least 20 operations in a menu-driven console application. The submitted version implements 28, including all 6 trig functions (not just sin/cos/tan), and all 3 inverse trig functions via hand-coded series.

---

## 👤 Author

**Arhaan Arora**
B.Tech CSE — Semester 1
Shiv Nadar University

---

*v1.0 — Console | v2.0 GUI coming soon*
