public class ConstructorChaining {
    public static void main(String[] args) {
        System.out.println("==== Testing Constructor Chaining (The 3 Rooms Analogy) ====\n");

        // Case 1: Student visits Room 1 (Has only Roll Number)
        System.out.println("--> Case 1: passing 1 value");
        Student s1 = new Student(101);
        s1.printData();
        System.out.println();

        // Case 2: Student visits Room 2 (Has Roll Number and Name)
        System.out.println("--> Case 2: passing 2 values");
        Student s2 = new Student(102, "Vinay");
        s2.printData();
        System.out.println();

        // Case 3: Student directly visits Room 3 (Has all Data)
        System.out.println("--> Case 3: passing 3 values");
        Student s3 = new Student(103, "Rahul", "Delhi");
        s3.printData();
    }
}

class Student {
    int rollNumber;
    String name;
    String city;

    // Room 1 (R1)
    Student(int rollNumber) {
        // Must be the FIRST statement
        this(rollNumber, "Unknown"); 
        System.out.println("Room 1 Visited: Forwarded to Room 2.");
    }

    // Room 2 (R2)
    Student(int rollNumber, String name) {
        // Must be the FIRST statement
        this(rollNumber, name, "Unknown City");
        System.out.println("Room 2 Visited: Forwarded to Room 3.");
    }

    // Room 3 (R3 - Final Master Constructor)
    Student(int rollNumber, String name, String city) {
        System.out.println("Room 3 Visited: Original Assignment happens here!");
        // We only write this initialization logic ONCE! (DRY Principle)
        this.rollNumber = rollNumber;
        this.name = name;
        this.city = city;
    }

    // Helper Method
    public void printData() {
        System.out.println("Data Successfully Stored => Roll: " + rollNumber + " | Name: " + name + " | City: " + city);
    }
}
