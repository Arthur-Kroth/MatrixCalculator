# Matrix Calculator

A console-based Java application that performs **addition, subtraction, and multiplication** between two matrices of any compatible dimensions.

---

## About

**Matrix Calculator** is a Maven-based Java project that allows users to define two matrices interactively via the terminal and then perform arithmetic operations on them. The project is structured with a clean separation between the entry point (`Main`) and the business logic (`Operations`), following basic object-oriented design principles.

---

## Features

- Define custom dimensions for two matrices (A and B)
- Fill each matrix element by element via terminal input
- Perform **addition** (A + B)
- Perform **subtraction** (A − B or B − A)
- Perform **multiplication** (A × B or B × A)
- Display matrix A or matrix B at any time
- Input validation with descriptive error messages for incompatible operations
- Interactive loop — perform multiple operations without restarting

---

## Project Structure

```
MatrixCalculator/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── org/
                ├── model/
                │   └── Operations.java   # Matrix operation logic
                └── principal/
                    └── Main.java         # Entry point & user interaction
```

### Key Classes

| Class | Package | Responsibility |
|---|---|---|
| `Main` | `org.principal` | Reads user input, builds matrices, calls operations |
| `Operations` | `org.model` | Implements add, subtract, multiply, showMatrix, and validation |

---

## Prerequisites

- **Java 25** (as configured in `pom.xml`)
- **Apache Maven 3.6+**

To verify your installation:

```bash
java -version
mvn -version
```

---

## How to Run

**1. Clone the repository:**

```bash
git clone https://github.com/Arthur-Kroth/MatrixCalculator.git
cd MatrixCalculator
```

**2. Compile the project:**

```bash
mvn compile
```

**3. Run the application:**

```bash
mvn exec:java -Dexec.mainClass="org.principal.Main"
```

Or compile and package first, then run:

```bash
mvn package
java -cp target/MatrixCalculator-1.0-SNAPSHOT.jar org.principal.Main
```

---

## Usage

When launched, the program will prompt you to define the dimensions and fill each matrix:

```
=================
Matrix Calculator
=================

How many columns will matrix A have: 2
How many rows will matrix A have: 2

Write the number of row 0 and column 0: 1
Write the number of row 0 and column 1: 2
Write the number of row 1 and column 0: 3
Write the number of row 1 and column 1: 4
```

After filling both matrices, an interactive menu appears:

```
=================
[1] Add
[2] Subtract
[3] Multiply
[4] Show matrix A
[5] Show matrix B
[6] Quit
=================
Which operation do you want to perform:
```

Select an option and the result is printed immediately. The menu loops until you choose `[6] Quit`.

---

## Operations

### Addition (A + B)
Requires matrices with the **same number of rows and columns**.

### Subtraction (A − B or B − A)
Also requires matrices with the **same dimensions**. You choose the order.

### Multiplication (A × B or B × A)
Requires that the **number of columns in the first matrix equals the number of rows in the second**. You choose the order.

All operations throw an `IllegalArgumentException` with a descriptive message if the matrices are incompatible.
