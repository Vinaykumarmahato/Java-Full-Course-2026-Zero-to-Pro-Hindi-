# 🔨 Java Mini Project #1 — Student Management System (CLI)

## 🎯 About the Project
This is the very first project of the **Java Full Course 2026** playlist! After learning about Variables, Data Types, and Methods, it's time to build a real-world Console-Based application.

In this project, we solve a real problem: **Managing student data without using a physical register!** Our program will act as a digital register where we can add students, display their details, and keep track of the total number of students.

## ⚙️ Features Implemented
1. **Add Student Data:** Uses a parameterized method `addStudentData(name, rollNumber, age, marks)`.
2. **Display Student Data:** Prints the stored data beautifully in the console.
3. **Count Total Students:** Uses a `static int` variable to keep track of how many students are stored.

---

## 🧠 Concepts Applied (Connected Phase: Methods)
This project perfectly interconnects the topics we learned in the previous phases:
- **Phase 04 (Variables & Data Types):** We utilized `String`, `int`, and `float` data types to perfectly match our data storage needs.
- **Phase 05 (Methods):** We built modular methods to add students (`addStudentData`) and count students (`totalNumberOfStudent`) without repeating code. We also saw why the `static` keyword empowers methods to run directly without creating objects.
- **Execution Flow:** We witnessed how JVM starts executing from the `main` method, jumping to other methods when called, and returning back.

---

## 💻 Java Source Code

```java
// StudentManagementSystem.java

public class StudentManagementSystem {

    // Static variable shared across the class to keep track of total students
    static int totalStudents = 0;

    // Method: Add Student Data
    public static void addStudentData(String name, int rollNumber, int age, float marks) {
        totalStudents++; // Increment the counter
        
        System.out.println("Student Data Added Successfully");
        System.out.println("_______________________________");
        System.out.println("Student Name is: " + name);
        System.out.println("Student Roll Number is: " + rollNumber);
        System.out.println("Student Age is: " + age);
        System.out.println("Student Marks is: " + marks);
        System.out.println();
    }

    // Method: Display Total Students
    public static void totalNumberOfStudent() {
        System.out.println("The total number of student is: " + totalStudents);
    }

    // JVM Starting Point
    public static void main(String[] args) {
        System.out.println("Student Management System");
        System.out.println("=========================");

        // Calling Method to add data
        addStudentData("Vinay", 1, 22, 96.5f);
        addStudentData("Arjun Sahni", 2, 22, 77.0f);
        addStudentData("Ravi", 3, 23, 85.5f);

        // Calling Method to check total count
        totalNumberOfStudent();
    }
}
```

## 🚀 How to Run The Project
1. Open your terminal in this directory.
2. Compile the file: 
   ```bash
   javac StudentManagementSystem.java
   ```
3. Run the compiled byte-code:
   ```bash
   java StudentManagementSystem
   ```
