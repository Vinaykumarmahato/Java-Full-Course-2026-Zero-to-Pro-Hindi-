// File: LogicalOperators.java

public class LogicalOperators {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int x = 30;
        int y = 40;

        System.out.println("=== 1. Logical AND (&&) ===");
        // ALL conditions must be true
        boolean condition1 = (a < b); // 10 < 20 (true)
        boolean condition2 = (a < x); // 10 < 30 (true)
        boolean resultAnd = condition1 && condition2;
        System.out.println("Result of (a < b && a < x): " + resultAnd); // Output: true

        // If even one is false, everything becomes false.
        boolean falseAndResult = (a > b) && (a < x) && (y > x); 
        System.out.println("Result of (a > b && a < x && y > x): " + falseAndResult); // Output: false


        System.out.println("\n=== 2. Logical OR (||) ===");
        // ONLY ONE condition needs to be true
        // condition (a > b) is false, (b > a) is true, (x > y) is false
        boolean resultOr = (a > b) || (b > a) || (x > y);
        System.out.println("Result of (a > b || b > a || x > y): " + resultOr); // Output: true
        
        // Let's test all false conditions
        boolean falseOrResult = (a > b) || (a > x) || (x > y);
        System.out.println("Result of (a > b || a > x || x > y): " + falseOrResult); // Output: false


        System.out.println("\n=== 3. Logical NOT (!) ===");
        // Flips the boolean result
        boolean result = true;
        System.out.println("Original Result: " + result); // true
        System.out.println("With NOT (!result): " + !result); // false
        
        // Practical test
        boolean isLoggedIn = false;
        if (!isLoggedIn) {
            System.out.println("User is NOT logged in. Redirecting to login page...");
        }
    }
}
