class Student {
    static int age;
    
    static {
        age = 20;
        System.out.println("Student class: Static block executed. Age initialized to 20.");
    }

    static void show1() {
        System.out.println("Student class: Control in static method show1");
    }

    void show2() {
        System.out.println("Student class: Control in non-static method show2");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // 1. Accessing static member using Class Name (Recommended)
        System.out.println("Accessing static age via class name: " + Student.age);
        Student.show1();

        // 2. Accessing non-static member requires an object
        Student s1 = new Student();
        s1.show2();

        // 3. Accessing static member via object reference (Possible but not recommended)
        s1.show1(); 
        System.out.println("Accessing static age via object: " + s1.age);
    }
}
