// File: UnaryOperators.java

public class UnaryOperators {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Unary Plus & Minus ===");
        int positiveValue = +10; // Explicitly positive
        int bankBalance = 100;
        int debit = -bankBalance; // Inverts the sign
        System.out.println("Positive Value: " + positiveValue);
        System.out.println("Debited Balance: " + debit);

        
        System.out.println("\n=== 2. Pre-Increment vs Post-Increment ===");
        // Pre-Increment (++a) -> First Update, Then Use
        int preA = 50;
        System.out.println("Pre-Increment output: " + (++preA)); // Outputs 51 immediately
        
        // Post-Increment (a++) -> First Use, Then Update
        int postX = 10;
        System.out.println("Post-Increment output (first print): " + (postX++)); // Outputs 10
        System.out.println("Post-Increment output (after update check): " + postX); // Now it's 11


        System.out.println("\n=== 3. Pre-Decrement vs Post-Decrement ===");
        // Pre-Decrement (--a)
        int preY = 100;
        System.out.println("Pre-Decrement output: " + (--preY)); // Outputs 99 immediately
        
        // Post-Decrement (a--)
        int postR = 30;
        System.out.println("Post-Decrement output (first print): " + (postR--)); // Outputs 30
        System.out.println("Post-Decrement output (after update check): " + postR); // Now it's 29
        
        
        System.out.println("\n=== 4. Tilde Operator (~) ===");
        // Formula: -(x + 1)
        int f = 10;
        int tildeResult = ~f;
        System.out.println("Tilde Result of ~10 is: " + tildeResult); // Produces -11

        
        System.out.println("\n=== 5. Logical NOT (!) ===");
        boolean isDarkModeOn = true;
        // The ! operator flips the boolean
        System.out.println("Is Dark Mode On originally? " + isDarkModeOn); // true
        System.out.println("After applying '!': " + !isDarkModeOn); // false
    }
}
