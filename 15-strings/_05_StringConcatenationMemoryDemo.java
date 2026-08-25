/**
 * Video 54: String Concatenation in Java | Heap Memory & SCP
 * Difference between '+' operator and '.concat()'
 * Java Full Course 2026: Zero to Pro
 */
public class _05_StringConcatenationMemoryDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Concatenation using '+' Operator ===");
        // When using '+' with String literals, compiler optimizes at compile time!
        String s1 = "Hello" + "World"; // Compiler converts directly to "HelloWorld" in SCP
        String s2 = "HelloWorld";
        System.out.println("s1 == s2 (Literal + Literal optimization): " + (s1 == s2)); // true

        // When variables are involved in '+':
        String a = "Hello";
        String s3 = a + "World"; // Computed at RUNTIME using StringBuilder; creates NEW object in Heap!
        System.out.println("s2 == s3 (Variable + Literal at Runtime): " + (s2 == s3)); // false

        System.out.println("\n=== 2. Concatenation using '.concat()' Method ===");
        String s4 = a.concat("World"); // Always creates a new String object in Heap!
        System.out.println("s2 == s4 (.concat() object): " + (s2 == s4)); // false

        System.out.println("\n=== 3. Mixed Types Concatenation with '+' ===");
        // '+' is evaluated from left to right:
        System.out.println("10 + 20 + \"Java\": " + (10 + 20 + "Java")); // "30Java"
        System.out.println("\"Java\" + 10 + 20: " + ("Java" + 10 + 20)); // "Java1020"
        System.out.println("\"Java\" + (10 + 20): " + ("Java" + (10 + 20))); // "Java30"
    }
}
