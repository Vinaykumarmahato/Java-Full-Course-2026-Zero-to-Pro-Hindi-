public class ConstructorExample {

    public static void main(String[] args) {
        System.out.println("==== Testing Constructor Rules & Overloading ====");

        // 1. Calling No-Argument Constructor
        Student s1 = new Student();
        
        // 2. Calling Parameterized Constructor (Single Parameter)
        Student s2 = new Student(101);
        
        // 3. Calling Parameterized Constructor (Double Parameter)
        Student s3 = new Student(102, "Vinay");

        // 4. Calling Parameterized Constructor (Three Parameters)
        Student s4 = new Student(103, "Rahul", "Delhi");

        System.out.println("\n--- Printing Data ---");
        s1.printStudentData();
        s2.printStudentData();
        s3.printStudentData();
        s4.printStudentData();
    }
}

class Student {
    // Instance Variables (Memory is allocated in Heap for each Object)
    int rollNumber;
    String name;
    String city;

    // 1. No-Argument Constructor
    public Student() {
        System.out.println("Auto-Called: No-Argument Constructor");
        this.rollNumber = 0;
        this.name = "Unknown";
        this.city = "Unknown";
    }

    // 2. Constructor Overloading (1 Parameter)
    public Student(int rollNumber) {
        System.out.println("Auto-Called: Constructor with 1 Arg");
        this.rollNumber = rollNumber;
        this.name = "Unknown";
        this.city = "Unknown";
    }

    // 3. Constructor Overloading (2 Parameters)
    public Student(int rollNumber, String name) {
        System.out.println("Auto-Called: Constructor with 2 Args");
        this.rollNumber = rollNumber;
        this.name = name;
        this.city = "Unknown";
    }

    // 4. Fully Parameterized Constructor (3 Parameters)
    // Resolving ambiguity using 'this' keyword
    public Student(int rollNumber, String name, String city) {
        System.out.println("Auto-Called: Fully Parameterized Constructor");
        this.rollNumber = rollNumber;
        this.name = name;
        this.city = city;
    }

    // Helper method to display data
    public void printStudentData() {
        System.out.println("Roll: " + this.rollNumber + " | Name: " + this.name + " | City: " + this.city);
    }
}
