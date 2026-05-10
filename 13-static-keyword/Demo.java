public class Demo {
    static int age; // Static variable

    // Static Initialization Block
    static {
        age = 10;
        System.out.println("I am in static block");
    }

    public static void main(String[] args) {
        System.out.println("I am in main method");
        System.out.println("Age: " + age);

        // Calling a static method
        show1();
    }

    // Static Method
    static void show1() {
        System.out.println("Control in static method show1");
    }
}
