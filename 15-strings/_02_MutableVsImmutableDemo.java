/**
 * Video 51: Types of String in Java | Mutable vs Immutable
 * Why String is Immutable in Java?
 * Java Full Course 2026: Zero to Pro
 */
public class _02_MutableVsImmutableDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. String Immutability (अपरिवर्तनीयता) ===");
        // Once a String object is created in Java, its state/content CANNOT be modified.
        String original = "Hello";
        
        // Calling concat returns a BRAND NEW String object in Heap; original remains unchanged!
        original.concat(" World");
        
        System.out.println("Original String after concat without re-assignment: " + original); // Prints: Hello

        // To keep the change, we must explicitly re-assign the reference:
        original = original.concat(" World");
        System.out.println("Original String after re-assignment: " + original); // Prints: Hello World

        System.out.println("\n=== 2. Mutable Alternative: StringBuilder / StringBuffer ===");
        // Unlike String, StringBuilder allows in-place modifications without creating new objects
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies same object in Heap!
        System.out.println("StringBuilder modified in-place: " + sb);

        System.out.println("\n=== 3. Why is String Immutable in Java? ===");
        System.out.println("1. Security: Database usernames, passwords & Network URLs cannot be hijacked.");
        System.out.println("2. Thread Safety: Multiple threads can safely read shared strings without synchronization.");
        System.out.println("3. String Constant Pool (SCP): Sharing identical strings saves huge memory.");
        System.out.println("4. HashCode Caching: Safe for use as Keys in HashMap and HashSet.");
    }
}
