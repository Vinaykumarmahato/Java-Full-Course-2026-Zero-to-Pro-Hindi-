// ⏱️ Timestamp: 00:28:40 & 00:31:36
// Topic: The 'this' Keyword & Parameterized Constructor

public class CH03_Parameterized_ThisKeyword {
    public static void main(String[] args) {
        
        System.out.println("---- Parameterized Constructor ----");

        // Object Creation + Mandatory Data Injection at the same time!
        // Rejects if data is missing (Solves the NULL city problem).
        StudentParam s1 = new StudentParam(22, "Vinay", "Mumbai");
        StudentParam s2 = new StudentParam(23, "Arjun", "Delhi");

        // Data stored successfully
        s1.printInfo();
        s2.printInfo();
    }
}

class StudentParam {
    int age;        // Instance Variable
    String name;    // Instance Variable
    String city;    // Instance Variable

    // Parameterized Constructor
    StudentParam(int age, String name, String city) {
        
        // The 'this' keyword removes ambiguity between Class variable (Instance) and Local parameter
        this.age = age;       // this.age = Object's Memory | age = Local Argument Value
        this.name = name;
        this.city = city;
    }

    public void printInfo() {
        System.out.println(this.name + " (" + this.age + ") from " + this.city);
    }
}
