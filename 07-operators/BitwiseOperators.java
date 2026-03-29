// File: BitwiseOperators.java

public class BitwiseOperators {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Core Bitwise Basics (&, |, ^, ~) ===");
        int a = 5; // Binary: 000...0101
        int b = 3; // Binary: 000...0011

        System.out.println("5 & 3 (AND): " + (a & b)); // Expected: 1
        System.out.println("5 | 3 (OR): " + (a | b));  // Expected: 7
        System.out.println("5 ^ 3 (XOR): " + (a ^ b)); // Expected: 6
        System.out.println("~5 (NOT): " + (~a));       // Expected: -6


        System.out.println("\n=== 2. Left Shift (<<) ===");
        // Shifts bits left, fills right with 0s. Effectively multiplies by 2.
        int leftShiftOne = 5 << 1; 
        System.out.println("5 << 1 (Multiplied by 2 once): " + leftShiftOne); // Expected: 10
        
        int leftShiftTwo = 5 << 2;
        System.out.println("5 << 2 (Multiplied by 2 twice): " + leftShiftTwo); // Expected: 20


        System.out.println("\n=== 3. Signed Right Shift (>>) ===");
        // Shifts bits right, maintains sign (positive gets 0s, negative gets 1s on left)
        int rightShiftOne = 5 >> 1;
        System.out.println("5 >> 1 (Divided by 2 once): " + rightShiftOne); // Expected: 2
        

        System.out.println("\n=== 4. Unsigned Right Shift (>>>) vs Signed (>>) ===");
        int negativeNum = -5;
        
        // Print the binary string to actually "look" inside the computer's brain
        System.out.println("Binary of -5: " + Integer.toBinaryString(negativeNum));
        
        // Signed Shift fills with 1s because it's negative
        int signedShift = negativeNum >> 2;
        System.out.println("\n-5 >> 2 (Signed Shift Result): " + signedShift);
        System.out.println("Binary of Signed Shift  : " + Integer.toBinaryString(signedShift));
        
        // Unsigned Shift FORCES 0s on the left, destroying the negative sign
        int unsignedShift = negativeNum >>> 2;
        System.out.println("\n-5 >>> 2 (Unsigned Shift Result): " + unsignedShift);
        
        // Note: Missing zeroes on the left are implicitly there in Java's print functionality
        System.out.println("Binary of Unsigned Shift: " + Integer.toBinaryString(unsignedShift));
    }
}
