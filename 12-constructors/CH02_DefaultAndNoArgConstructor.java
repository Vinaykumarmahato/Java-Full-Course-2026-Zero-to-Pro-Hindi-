// ⏱️ Timestamp: 00:25:34
// Topic: Default Constructor & No-Arguments Constructor

public class CH02_DefaultAndNoArgConstructor {
    public static void main(String[] args) {
        System.out.println("---- Default vs No-Arg ----");

        // Object creation automatically calls the constructor
        StudentNoArg s3 = new StudentNoArg(); 
        
        // Since we explicitly wrote a No-Arg constructor, the Java Default Constructor is removed.
        System.out.println("S3 -> Age: " + s3.age + ", Name: " + s3.name);
    }
}

class StudentNoArg {
    int age;
    String name;

    // NO-ARGUMENTS CONSTRUCTOR (Type 2)
    // If we comment this out, Java provides the Default Constructor (Type 1)
    StudentNoArg() {
        System.out.println("Auto-Called: No-Argument Constructor Executed!");
        // We can set default starting values here if we want
    }
}
