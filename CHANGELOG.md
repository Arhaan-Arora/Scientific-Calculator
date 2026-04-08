# Changelog

All notable changes to this project will be documented here.

---

## [1.0.0] — Semester 1 Submission

### Added
- 28 console-based calculator operations
- Stateful accumulator model (`num` variable persists across operations)
- Sub-menu system for chaining intermediate results
- Hand-coded mathematical series (no `java.lang.Math` usage):
  - eˣ via Maclaurin series
  - sin(x), cos(x) via Taylor series
  - ln(x) via Mercator series
  - arcsin(x), arctan(x) via power/Taylor series
  - √x, ∛x via Newton's method
- Exception handling for: division by zero, negative roots, invalid factorial inputs, out-of-range inverse trig inputs, negative logarithm inputs
- Columnar menu layout for compact display

---

## [2.0.0] — *Planned (GUI Version)*

### Planned
- Java Swing / JavaFX graphical interface
- Expression input bar with live evaluation
- Clickable button layout
- Calculation history panel
- Radian / Degree mode toggle
- Keyboard input support
