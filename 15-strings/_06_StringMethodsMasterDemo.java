/**
 * Video 55: Java String Methods Complete Master Tutorial
 * Inbuilt String Methods Cheat-Sheet with Practical Code
 * Java Full Course 2026: Zero to Pro
 */
public class _06_StringMethodsMasterDemo {
    public static void main(String[] args) {
        String msg = "  Learn Java with Zero to Pro!  ";

        System.out.println("Original String: '" + msg + "'");

        System.out.println("\n=== 1. Inspection Methods ===");
        System.out.println("length(): " + msg.length());
        System.out.println("charAt(8): " + msg.charAt(8)); // Character at 0-based index 8
        System.out.println("indexOf('Java'): " + msg.indexOf("Java"));
        System.out.println("lastIndexOf('o'): " + msg.lastIndexOf('o'));
        System.out.println("contains('Pro'): " + msg.contains("Pro"));
        System.out.println("startsWith('  Learn'): " + msg.startsWith("  Learn"));
        System.out.println("endsWith('!  '): " + msg.endsWith("!  "));
        System.out.println("isEmpty(): " + msg.isEmpty());
        System.out.println("isBlank() [Java 11+]: " + "   ".isBlank());

        System.out.println("\n=== 2. Transformation Methods (Return New Strings) ===");
        String trimmed = msg.trim();
        System.out.println("trim(): '" + trimmed + "'");
        System.out.println("toUpperCase(): " + trimmed.toUpperCase());
        System.out.println("toLowerCase(): " + trimmed.toLowerCase());
        System.out.println("replace('Java', 'Python'): " + trimmed.replace("Java", "Python"));
        System.out.println("substring(6): " + trimmed.substring(6)); // From index 6 to end
        System.out.println("substring(6, 10): " + trimmed.substring(6, 10)); // [6, 10) -> "Java"

        System.out.println("\n=== 3. Conversion & Splitting Methods ===");
        // toCharArray()
        char[] chars = trimmed.toCharArray();
        System.out.println("First char from toCharArray(): " + chars[0]);

        // split()
        String csv = "Java,Python,JavaScript,C++,Go";
        String[] languages = csv.split(",");
        System.out.println("split(',') output:");
        for (String lang : languages) {
            System.out.println(" - " + lang);
        }

        // join()
        String joined = String.join(" | ", languages);
        System.out.println("String.join(): " + joined);

        // valueOf()
        int number = 2026;
        String strNum = String.valueOf(number);
        System.out.println("String.valueOf(2026) length: " + strNum.length());
    }
}
