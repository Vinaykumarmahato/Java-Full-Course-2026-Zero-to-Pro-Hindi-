// ⏱️ Timestamp: 00:41:35
// Topic: Constructor Overloading

public class CH04_ConstructorOverloading {
    public static void main(String[] args) {
        
        System.out.println("---- Constructor Overloading ----");

        // Passing 1 Argument -> Calls Constructor 1
        StudentOverload s1 = new StudentOverload(1);
        s1.printInfo();

        // Passing 2 Arguments -> Calls Constructor 2
        StudentOverload s2 = new StudentOverload(2, "Vinay");
        s2.printInfo();

        // Passing 3 Arguments -> Calls Constructor 3
        StudentOverload s3 = new StudentOverload(3, "Rahul", "Delhi");
        s3.printInfo();
    }
}

class StudentOverload {
    int rollNumber;
    String name;
    String city;

    // Constructor 1: Only Roll Number
    StudentOverload(int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = "Unknown";
        this.city = "Unknown";
    }

    // Constructor 2: Roll Number + Name
    StudentOverload(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.city = "Unknown";
    }

    // Constructor 3: Complete Data
    StudentOverload(int rollNumber, String name, String city) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.city = city;
    }

    public void printInfo() {
        System.out.println("Roll: " + this.rollNumber + " | Name: " + this.name + " | City: " + this.city);
    }
}
