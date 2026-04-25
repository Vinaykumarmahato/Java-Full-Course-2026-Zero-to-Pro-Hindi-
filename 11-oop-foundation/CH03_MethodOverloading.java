// ⏱️ Timestamp: 00:34:38
// Topic: Method Overloading (Compile-Time Polymorphism)

public class CH03_MethodOverloading {
    public static void main(String[] args) {
        
        System.out.println("---- Method Overloading Demo ----");
        
        Calc obj = new Calc();
        
        // Passing 2 Integers
        int res1 = obj.add(5, 2);
        System.out.println("Sum of 2 ints: " + res1);
        
        // Passing 3 Integers -> Java automatically maps it to the 3-parameter method!
        int res2 = obj.add(5, 5, 10);
        System.out.println("Sum of 3 ints: " + res2);
        
        // Passing 4 Integers
        int res3 = obj.add(2, 5, 6, 7);
        System.out.println("Sum of 4 ints: " + res3);

        // Passing 'double' values (Point Values)
        // If we passed doubles to the normal 'add', it would crash/error out!
        double res4 = obj.addDouble(2.5, 4.5, 5.6);
        System.out.println("Sum of doubles: " + res4);

        System.out.println("\n(This ensures clean code without needing 'add1', 'add2', 'add3' names!)");
    }
}

class Calc {
    
    // Method 1: Takes 2 parameters
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    // Method 2: Takes 3 parameters (OVERLOADING)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Takes 4 parameters
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Professional Tip: Handling different Data Types
    // Using a different method logic/signature to handle decimal numbers
    public double addDouble(double a, double b, double c) {
        return a + b + c;
    }
}
