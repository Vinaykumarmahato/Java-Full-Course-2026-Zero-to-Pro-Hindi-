/**
 * Video 52: Immutable String | String Constant Pool (SCP) vs Heap Memory
 * Java Full Course 2026: Zero to Pro
 */
public class _03_SCPVsHeapDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. String Constant Pool (SCP) Mechanics ===");
        // When using String Literals:
        // JVM checks SCP: if "Java" already exists, it reuses the same memory reference!
        String s1 = "Java";
        String s2 = "Java";

        // Both s1 and s2 point to the EXACT same object inside SCP
        System.out.println("s1 == s2 (Both Literals in SCP): " + (s1 == s2)); // true

        System.out.println("\n=== 2. 'new' Keyword Creates 2 Objects ===");
        // When using 'new String("Java")', 2 objects are created:
        // 1. One in normal Heap memory (pointed to by s3)
        // 2. One in SCP (if "Java" is not already present)
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("s3 == s4 (Two separate objects in Heap): " + (s3 == s4)); // false
        System.out.println("s1 == s3 (SCP vs Heap Object): " + (s1 == s3)); // false

        System.out.println("\n=== 3. The .intern() Method ===");
        // .intern() retrieves the canonical reference from the SCP
        String s5 = s3.intern();
        System.out.println("s1 == s3.intern() (SCP match): " + (s1 == s5)); // true
    }
}
