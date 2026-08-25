/**
 * Video 48: Array of Objects in Java | Real-Life OOP Integration
 * Java Full Course 2026: Zero to Pro
 */

class Student {
    int rollNo;
    String name;
    double marks;

    // Parameterized Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Marks: " + marks + "%");
    }
}

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Creating Array of Objects ===");
        // Step 1: Create the array of references (Capacity for 3 Student references)
        // NOTE: This does NOT create 3 Student objects yet! It fills the array with null!
        Student[] batch = new Student[3];

        System.out.println("Initial value before object initialization: " + batch[0]); // prints null

        // Step 2: Initialize individual Student objects
        batch[0] = new Student(101, "Aman Kumar", 89.5);
        batch[1] = new Student(102, "Priya Sharma", 94.0);
        batch[2] = new Student(103, "Rohan Verma", 76.2);

        // Step 3: Traversal using Enhanced For Loop
        System.out.println("\n--- Batch Details ---");
        for (Student s : batch) {
            s.displayInfo();
        }

        System.out.println("\n=== 2. Direct Literal Array of Objects ===");
        Student[] topPerformers = {
            new Student(1, "Sneha", 98.4),
            new Student(2, "Vikram", 96.1)
        };

        for (Student s : topPerformers) {
            System.out.println("Top Performer: " + s.name + " (" + s.marks + "%)");
        }
    }
}
