public class All7Constructors {
    public static void main(String[] args) {
        System.out.println("==== Testing All 7 Types of Constructors ====\n");

        // Type 1 & 2: No-Argument / Default Constructor
        System.out.println("--> Calling No-Argument Constructor:");
        Student s1 = new Student();
        s1.printData();
        System.out.println();

        // Type 3: Parameterized Constructor
        // Type 4: Constructor Overloading (Multiple signatures)
        System.out.println("--> Calling Parameterized Constructor (Overloaded - 1 Param):");
        Student s2 = new Student(101);
        s2.printData();
        System.out.println();

        // Type 5: Constructor Chaining (Using this())
        // The implementation inside Student(int) redirects to Student(int, String) then to Student(int, String, String)
        System.out.println("--> Calling Parameterized Constructor (Overloaded - 2 Params with Chaining):");
        Student s3 = new Student(102, "Vinay");
        s3.printData();
        System.out.println();

        // Target Master Constructor (3 Params)
        System.out.println("--> Calling Target Master Constructor (3 Params):");
        Student s4 = new Student(103, "Rahul", "Delhi");
        s4.printData();
        System.out.println();

        // Type 6: Copy Constructor
        System.out.println("--> Calling Copy Constructor (Cloning s4 into s5):");
        Student s5 = new Student(s4); 
        s5.printData();
        System.out.println();

        // Type 7: Private Constructor
        System.out.println("--> Testing Private Constructor:");
        // Normal object creation like 'new SecretDatabase()' will fail outside its own class.
        // We instead call a static method that handles it internally.
        SecretDatabase db = SecretDatabase.getInstance();
        db.showMessage();
    }
}

// ------------------------------------
// CLASS 1: Representing Types 1 to 6
// ------------------------------------
class Student {
    int rollNumber;
    String name;
    String city;

    // Type 2: No-Argument Constructor
    // Note: If we don't write this, Java provides Type 1 (Default Constructor)
    Student() {
        System.out.println("No-Argument Constructor called! Setting default values.");
        this.rollNumber = 0;
        this.name = "Not Assigned";
        this.city = "Not Assigned";
    }

    // Type 4: Overloading & Type 5: Chaining (Room 1)
    Student(int rollNumber) {
        // Redirection must be FIRST statement
        this(rollNumber, "Unknown Name"); 
    }

    // Type 3: Parameterized, Type 4: Overloading & Type 5: Chaining (Room 2)
    Student(int rollNumber, String name) {
        // Redirection must be FIRST statement
        this(rollNumber, name, "Unknown City");
    }

    // Master Constructor (Room 3)
    Student(int rollNumber, String name, String city) {
        // Here we assign the 'this' keyword to differentiate Instance vs Parameter variables
        this.rollNumber = rollNumber;
        this.name = name;
        this.city = city;
    }

    // Type 6: Copy Constructor
    // Takes another Student object to clone its values
    Student(Student oldObject) {
        System.out.println("Copy Constructor executing... Cloning object!");
        this.rollNumber = oldObject.rollNumber;
        this.name = oldObject.name;
        this.city = oldObject.city;
    }

    public void printData() {
        System.out.println("Roll: " + this.rollNumber + " | Name: " + this.name + " | City: " + this.city);
    }
}

// ------------------------------------
// CLASS 2: Representing Type 7
// ------------------------------------
class SecretDatabase {
    // Type 7: Private Constructor
    // Restricts object creation from outside this class. Very useful in Singleton Pattern.
    private SecretDatabase() {
        System.out.println("Private Constructor called! Connection to database established internally.");
    }

    // The only way to get an instance is through a public static method (Singleton logic)
    public static SecretDatabase getInstance() {
        return new SecretDatabase();
    }

    public void showMessage() {
        System.out.println("Welcome to the Secure Database System.");
    }
}
