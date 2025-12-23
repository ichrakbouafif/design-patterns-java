# Singleton Design Pattern – Database Connection

## Overview
This package demonstrates the **Singleton Design Pattern** using a real-world scenario: a **Database Connection Manager**. The Singleton pattern ensures **only one instance** of a class exists and provides a **global access point**.

---

## Design Pattern: Singleton
- **Type:** Creational
- **Intent:** Ensure a class has only one instance and provide a global point of access.
- **Use Cases:**
    - Database connections
    - Logging
    - Configuration managers
    - Thread pools

---

## How This Package Works

1. **DatabaseConnection class**
    - Private constructor prevents multiple instances.
    - `getInstance()` method provides access to the single instance.

2. **Client code (`Main.java`)**
    - Retrieves the instance using `getInstance()`.
    - Demonstrates that multiple references point to the **same object**.

---

## UML Class Diagram

![SingletonClassDiagram.png](SingletonClassDiagram.png)
## Example Usage

```java
DatabaseConnection connection1 = DatabaseConnection.getInstance();
DatabaseConnection connection2 = DatabaseConnection.getInstance();

System.out.println(connection1 == connection2); // true

connection1.query("SELECT * FROM users");
```

**Output:**
````sql
DatabaseConnection instance created.
true
Executing query: SELECT * FROM users
````

## Benefits of Singleton Pattern
- Guarantees only one instance exists
- Global access point for shared resources
- Saves memory and avoids unnecessary instantiations
- Ensures consistency across the application

