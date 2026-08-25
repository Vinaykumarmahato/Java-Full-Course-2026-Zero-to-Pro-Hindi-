/**
 * Video 53: String Comparison in Java
 * '==' vs '.equals()' vs '.equalsIgnoreCase()' vs '.compareTo()'
 * Java Full Course 2026: Zero to Pro
 */
public class _04_StringComparisonDemo {
    public static void main(String[] args) {
        String a = "Code";
        String b = "Code";
        String c = new String("Code");
        String d = "code";

        System.out.println("=== 1. '==' Operator (Address / Reference Comparison) ===");
        // Checks if two references point to the EXACT same memory address
        System.out.println("a == b (Same SCP Address): " + (a == b)); // true
        System.out.println("a == c (SCP vs Heap Address): " + (a == c)); // false

        System.out.println("\n=== 2. '.equals()' Method (Content / Value Comparison) ===");
        // Overridden in String class to check character-by-character content
        System.out.println("a.equals(b) (Content check): " + a.equals(b)); // true
        System.out.println("a.equals(c) (Content check): " + a.equals(c)); // true
        System.out.println("a.equals(d) (Case sensitive): " + a.equals(d)); // false

        System.out.println("\n=== 3. '.equalsIgnoreCase()' (Case Insensitive Content Check) ===");
        System.out.println("a.equalsIgnoreCase(d): " + a.equalsIgnoreCase(d)); // true

        System.out.println("\n=== 4. '.compareTo()' (Lexicographical / Dictionary Order) ===");
        // Returns:
        // 0 if equal
        // > 0 if string is lexicographically greater
        // < 0 if string is lexicographically smaller
        System.out.println("'Apple'.compareTo('Banana'): " + "Apple".compareTo("Banana")); // Negative value (-1)
        System.out.println("'Banana'.compareTo('Apple'): " + "Banana".compareTo("Apple")); // Positive value (1)
        System.out.println("'Code'.compareTo('Code'): " + "Code".compareTo("Code"));       // 0
    }
}
