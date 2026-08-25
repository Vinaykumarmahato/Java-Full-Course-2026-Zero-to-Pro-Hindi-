/**
 * Video 46: Jagged Arrays in Java Explained (Uneven / Ragged Arrays)
 * Java Full Course 2026: Zero to Pro
 */
public class JaggedArrayDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. What is a Jagged Array? (Ragged Array) ===");
        // A Jagged Array is an array of arrays where each member array can have a DIFFERENT length.
        // Step 1: Declare the number of rows only! (Columns remain unspecified)
        int[][] collegeBranches = new int[3][];

        // Step 2: Allocate memory for each row individually
        collegeBranches[0] = new int[2]; // Branch 0 (e.g. AI/ML - 2 students)
        collegeBranches[1] = new int[4]; // Branch 1 (e.g. CSE - 4 students)
        collegeBranches[2] = new int[3]; // Branch 2 (e.g. ECE - 3 students)

        // Assign sample roll numbers
        int roll = 101;
        for (int i = 0; i < collegeBranches.length; i++) {
            for (int j = 0; j < collegeBranches[i].length; j++) {
                collegeBranches[i][j] = roll++;
            }
        }

        // Print Jagged Array
        System.out.println("College Branches Roster:");
        for (int i = 0; i < collegeBranches.length; i++) {
            System.out.print("Branch " + i + " (Size " + collegeBranches[i].length + "): ");
            for (int j = 0; j < collegeBranches[i].length; j++) {
                System.out.print(collegeBranches[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== 2. Direct Literal Jagged Array Initialization ===");
        int[][] skillsLevel = {
            { 1 },
            { 1, 2, 3 },
            { 1, 2, 3, 4, 5 },
            { 1, 2 }
        };

        for (int[] row : skillsLevel) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
