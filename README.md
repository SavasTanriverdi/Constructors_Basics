# Constructors_Basics

This project introduces constructors in Java. A constructor is a special method used to initialize objects. The project demonstrates both default and parameterized constructors, showcasing their usage in a simple `User` class.

---

## Features
- **Default Constructor**: Initializes object attributes with default values.
- **Parameterized Constructor**: Allows attributes to be initialized with specific values.
- **Object Initialization**: Demonstrates how constructors are invoked automatically during object creation.
- Includes a method `displayUserInfo()` to print object details.

---

## Code Overview

### 1. `User` Class
- **Attributes**: `name` (String) and `age` (int) to store user details.
- **Default Constructor**:
    - Initializes `name` with `"Default Name"` and `age` with `0`.
    - Prints a message indicating the default constructor was called.
- **Parameterized Constructor**:
    - Initializes `name` and `age` with provided values.
    - Prints a message indicating the parameterized constructor was called.
- **Method**:
    - `displayUserInfo()` - Prints the user's name and age.

### 2. `ConstructorsBasics` Class
- Contains the `main` method, which:
    - Creates an object using the default constructor.
    - Creates an object using the parameterized constructor.
    - Calls the `displayUserInfo()` method to display object details.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `ConstructorsBasics.java` file.

---

## Sample Output

```plaintext
Default constructor called.
Name: Default Name, Age: 0
Parameterized constructor called.
Name: Alice, Age: 25
