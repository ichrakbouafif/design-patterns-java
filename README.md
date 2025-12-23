# Design Patterns Java

## Overview

This repository contains **real-world implementations of classic software design patterns** in Java. Each pattern is implemented as a small, independent project or package with **clear, production-ready code**.

The goal of this repository is to:
- Learn and practice design patterns in Java.
- Demonstrate clean object-oriented programming (OOP) principles.
- Provide ready-to-run examples for learning and interviews.

---

## Structure

The repository is organized by **pattern type**:
````markdown
design-patterns-java/
│
├── creational/ # Patterns focused on object creation
│ ├── factory/
│ ├── abstract-factory/
│ ├── singleton/
│ └── builder/
│
├── structural/ # Patterns focused on class and object composition
│ ├── adapter/
│ ├── decorator/
│ └── facade/
│
├── behavioral/ # Patterns focused on object interaction and responsibility
│ ├── strategy/
│ ├── observer/
│ └── command/
│
└── README.md # This file
````

Each pattern folder contains:
- A clear **package structure**
- **Interface(s)** and **concrete class implementations**
- A **factory or client code** (if applicable)
- A **README.md** specific to the pattern with explanation, UML diagram instructions, and examples

---

## Why Java?

- Design patterns were originally defined in an **OOP context**.
- Java’s **static typing, interfaces, and abstract classes** make patterns **easy to understand and implement**.
- Industry standard: most design pattern references, books, and interviews use Java.

---

## Approach

1. **Real-world mini-projects:** Each pattern is demonstrated with a real-world scenario (e.g., Notification Service for Factory Pattern, Database Connection for Singleton).
2. **Clean architecture:** Interface segregation, decoupling, and SOLID principles are followed.
3. **Extensible:** Adding a new class or behavior does not require changing existing client code.
4. **Professional commits:** Each pattern is committed with descriptive messages (`feat(factory): add notification service example`).

---

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/yourusername/design-patterns-java.git
```

2. Open in IntelliJ IDEA.

3. Navigate to the pattern folder you want to explore (e.g., creational/factory/notification).

4. Run the Main.java class to see the pattern in action.

## Examples of Implemented Patterns
**Creational**

- Factory Pattern – Notification Service
- Singleton – Database Connection
- Builder – Product Configuration

**Structural**

- Adapter – Legacy Payment Gateway Integration
- Decorator – Customizable Logging
- Facade – Simplified Bank API

**Behavioral**

- Strategy – Sorting Algorithm Selector
- Observer – Stock Price Alert System
- Command – Remote Control System

## Contribution

Contributions are welcome!
- Add missing patterns with real-world mini-projects.
- Maintain consistent package and class naming conventions.
- Follow clean code and SOLID principles.

