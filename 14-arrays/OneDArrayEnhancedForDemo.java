/**
 * Video 44: 1D Array in Java | Enhanced For Loop (for-each) Explained
 * Java Full Course 2026: Zero to Pro
 */
public class OneDArrayEnhancedForDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Standard 1D Array Traversal (Traditional for-loop) ===");
        int[] scores = { 95, 88, 72, 99, 64 };

        // Normal for loop: Gives access to index i
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " (Index " + i + "): " + scores[i]);
        }

        System.out.println("\n=== 2. Enhanced For-Loop (for-each) Traversal ===");
        // Syntax: for (DataType variableName : arrayName)
        // Benefit: No index management, no off-by-one errors (ArrayIndexOutOfBoundsException)
        int totalScore = 0;
        for (int score : scores) {
            System.out.println("Score value: " + score);
            totalScore += score;
        }
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + ((double) totalScore / scores.length));

        System.out.println("\n=== 3. Limitations of Enhanced For-Loop ===");
        // Limitation 1: Cannot modify array elements directly using for-each variable
        int[] numbers = { 10, 20, 30 };
        for (int num : numbers) {
            num = num * 2; // Only modifies local copy, NOT the array in Heap!
        }
        System.out.println("After for-each modification attempt (Numbers unchanged):");
        for (int num : numbers) {
            System.out.print(num + " "); // Prints: 10 20 30
        }
        System.out.println();

        // How to actually modify elements: Use traditional for-loop with index
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println("After traditional for-loop modification:");
        for (int num : numbers) {
            System.out.print(num + " "); // Prints: 20 40 60
        }
        System.out.println();

        // Limitation 2: Cannot traverse backwards or skip steps
        System.out.println("\nReverse Traversal (Requires Traditional Loop):");
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }
}
