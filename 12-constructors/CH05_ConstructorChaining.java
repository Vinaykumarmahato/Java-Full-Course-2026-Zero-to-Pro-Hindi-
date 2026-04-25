// ⏱️ Timestamp: 00:46:37 & 00:53:36
// Topic: Constructor Chaining & The 3-Rooms Analogy
// Solves the DRY (Don't Repeat Yourself) violation in Overloading

public class CH05_ConstructorChaining {
    public static void main(String[] args) {
        
        System.out.println("---- Constructor Chaining (3 Rooms Analogy) ----");

        // Case 1: Student visits Room 1 (Has only Roll Number)
        StudentChaining s1 = new StudentChaining(101);
        s1.printInfo();
    }
}

class StudentChaining {
    int rollNumber;
    String name;
    String city;

    // Room 1 (R1)
    StudentChaining(int rollNumber) {
        // Redirection must be the FIRST statement
        this(rollNumber, "Unknown"); 
        System.out.println("Room 1 Visited: Forwarded to Room 2.");
    }

    // Room 2 (R2)
    StudentChaining(int rollNumber, String name) {
        // Redirection must be the FIRST statement
        this(rollNumber, name, "Unknown City");
        System.out.println("Room 2 Visited: Forwarded to Room 3.");
    }

    // Room 3 (R3 - Final Master Constructor)
    StudentChaining(int rollNumber, String name, String city) {
        System.out.println("Room 3 Visited: Original Assignment happens here!");
        // We only write this initialization logic ONCE! (DRY Principle)
        this.rollNumber = rollNumber;
        this.name = name;
        this.city = city;
    }

    public void printInfo() {
        System.out.println("Roll: " + this.rollNumber + " | Name: " + this.name + " | City: " + this.city);
    }
}
