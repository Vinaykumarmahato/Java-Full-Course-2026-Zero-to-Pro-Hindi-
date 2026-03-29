// File: ArithmeticOperators.java

public class ArithmeticOperators {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        System.out.println("=== 1. Basic Arithmetic Operations ===");
        
        // Addition
        int sum = a + b;
        System.out.println("a + b = " + sum); // 30
        
        // Subtraction
        int diff = a - b;
        System.out.println("a - b = " + diff); // -10
        
        // Multiplication
        int mult = a * b;
        System.out.println("a * b = " + mult); // 200
        
        // Division
        int div = 30 / 10;
        System.out.println("30 / 10 = " + div); // 3

        
        System.out.println("\n=== 2. The Modulo Operator (%) ===");
        // Returns the remainder
        int remainder = 12 % 5;
        System.out.println("Remainder of 12 % 5 is: " + remainder); // 2
        

        System.out.println("\n=== 3. Division Trap (Integer vs Double) ===");
        int x = 7;
        int y = 2;
        System.out.println("Integer Division (7 / 2): " + (x / y)); // Prints 3 (Trunacted)
        
        double doubleNum = 7.0;
        System.out.println("Double Division (7.0 / 2): " + (doubleNum / y)); // Prints 3.5
        
        
        System.out.println("\n=== 4. Operator Precedence (Priority) ===");
        
        // Scenario 1: Without Brackets
        int res1 = 10 + 5 * 2; 
        // Multiplication (*) has higher priority, so (5 * 2) happens first.
        System.out.println("Result of (10 + 5 * 2): " + res1); // 20
        
        // Scenario 2: With Brackets
        int res2 = (10 + 5) * 2;
        // Brackets force addition to happen first
        System.out.println("Result of (10 + 5) * 2: " + res2); // 30
    }
}
