/**
 * Video 50: String in Java Explained | Class, Object & Heap Memory
 * Java Full Course 2026: Zero to Pro
 */
public class _01_StringBasicsHeapDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. What is a String in Java? ===");
        // String is NOT a primitive data type; it is a CLASS in java.lang package.
        // Behind the scenes (historically), String encapsulates a char[] array.

        // Way 1: String Literal (Stored in String Constant Pool)
        String str1 = "Java2026";

        // Way 2: Using 'new' Keyword (Stored in normal Heap area + SCP)
        String str2 = new String("Java2026");

        // Way 3: From Character Array
        char[] charArr = { 'H', 'e', 'l', 'l', 'o' };
        String str3 = new String(charArr);

        System.out.println("str1 (Literal): " + str1);
        System.out.println("str2 (new keyword): " + str2);
        System.out.println("str3 (from char[]): " + str3);

        System.out.println("\n=== 2. Memory References Check ===");
        // str1 points to SCP, str2 points to Heap
        System.out.println("Are str1 and str2 pointing to same memory address? " + (str1 == str2)); // false
        System.out.println("Is content of str1 and str2 equal? " + str1.equals(str2)); // true
    }
}
