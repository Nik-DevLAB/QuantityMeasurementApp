# 📏 Quantity Measurement App

## 📌 Overview

The **Quantity Measurement App** is a Java-based application that compares different physical quantities (like length, weight, etc.), performs unit conversions, and supports arithmetic operations on quantities.

The application is developed **incrementally using Test-Driven Development (TDD)** along with the traditional **Design → Develop → Test (DDT)** approach.

---

## 🎯 Features

* ✅ Compare quantities (e.g., 1 feet == 12 inches)
* 🔄 Unit conversion between different measurement units
* ➕ Quantity arithmetic (addition, subtraction) *(planned)*
* ⚠️ Input validation and edge case handling
* 🧪 High test coverage using JUnit

---

## 🧠 Development Approach

This project follows a hybrid approach:

### 🔹 Test-Driven Development (TDD)

* Write test cases first
* Implement minimal code to pass tests
* Refactor safely

### 🔹 Design → Develop → Test (DDT)

* High-level system design first
* Feature-wise development
* Final integration testing

---

## 🏗️ Project Structure

```
QuantityMeasurementApp/
│
├── src/
│   ├── main/
│   │   └── java/com/quantity/
│   │       └── Quantity.java
│   │
│   └── test/
│       └── java/com/quantity/
│           └── QuantityTest.java
│
├── .gitignore
└── README.md
```

---

## 🌿 Git Workflow

This project follows a structured Git workflow:

* `main` → Stable production-ready code
* `dev` → Integration branch
* `feature/*` → Individual use cases

### Example:

```
feature/UC1-FeetEquality
feature/UC2-UnitConversion
```

### Workflow Steps:

1. Create feature branch
2. Implement feature
3. Commit & push
4. Merge into `dev`
5. Merge `dev` into `main`

---

## 🚀 Getting Started

### 🔧 Prerequisites

* Java (JDK 8 or above)
* IntelliJ IDEA
* Git

---

### ▶️ Run the Project

1. Clone the repository:

```
git clone https://github.com/YOUR_USERNAME/QuantityMeasurementApp.git
```

2. Open in IntelliJ IDEA

3. Run test cases:

* Right-click `QuantityTest` → Run

---

## 🧪 Sample Test Case

```java
@Test
void shouldReturnTrueForSameFeet() {
    Quantity q1 = new Quantity(1, "feet");
    Quantity q2 = new Quantity(1, "feet");

    assertEquals(q1, q2);
}
```

---

## 📈 Development Progress

| Use Case | Description           | Status        |
| -------- | --------------------- | ------------- |
| UC1      | Feet Equality         | ✅ Done        |
| UC2      | Unit Conversion       | ⏳ In Progress |
| UC3      | Arithmetic Operations | ⏳ Pending     |

---

## ⚠️ Guidelines

* Stick to **one use case at a time**
* Do not over-engineer features
* Ensure all test cases pass before moving forward
* Maintain clean and readable code

---

## 👨‍💻 Author

Developed as part of academic learning on:

* Software Engineering
* Test-Driven Development
* Git Workflow Practices

---

## 📌 Future Enhancements

* GUI (JavaFX / Web)
* Support for more unit types (weight, temperature)
* REST API integration
