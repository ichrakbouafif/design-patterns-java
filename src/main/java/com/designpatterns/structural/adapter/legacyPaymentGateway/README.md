# Adapter Design Pattern – Legacy Payment Gateway Integration

## Overview
This package demonstrates the **Adapter Design Pattern** using a real-world scenario: integrating a **legacy payment gateway** into a new system without modifying the legacy code.

The Adapter Pattern allows **incompatible interfaces to work together**, enabling the client to use a unified interface.

---

## Design Pattern: Adapter

- **Type:** Structural  
- **Intent:** Convert the interface of a class into another interface expected by the client.  
- **When to Use:**
    - When a client expects a different interface than what a class provides.
    - To integrate legacy systems without modifying their code.
    - To create a bridge between two incompatible interfaces.

---

## How This Package Works

1. **Target interface (`PaymentProcessor`)** defines the expected method `pay(double amount)`.
2. **Adaptee (`LegacyPaymentGateway`)** is the existing system with an incompatible interface.
3. **Adapter (`PaymentAdapter`)** implements `PaymentProcessor` and internally uses `LegacyPaymentGateway`, converting data if needed.
4. **Client (`Main.java`)** interacts only with `PaymentProcessor`, unaware of the legacy system.

---

## UML Class Diagram

![PaymentAdapterDiagram.png](AdapterClassDiagram.png)

---

## Example Usage

```java
LegacyPaymentGateway legacyGateway = new LegacyPaymentGateway();
PaymentProcessor processor = new PaymentAdapter(legacyGateway);
processor.pay(49.99);
````

**Output:**

```yaml
Processing payment of 4999.0 cents via legacy gateway.
```

---

## Benefits of the Adapter Pattern

* Allows integration of legacy systems without modification.
* Decouples client code from specific implementations.
* Makes code more reusable and flexible.
* Supports the Open/Closed Principle.
* Provides a clean structure for extending functionality professionally.
