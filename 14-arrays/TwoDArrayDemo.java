/**
 * Video 45: 2D Array in Java Tutorial | Matrix & Grid Representation
 * Java Full Course 2026: Zero to Pro
 */
public class TwoDArrayDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. 2D Array Creation & Memory Mapping ===");
        // Syntax 1: Explicit Declaration with dimensions (3 rows, 4 columns)
        int[][] matrix = new int[3][4];

        // Populate the 2D array
        int count = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = count++;
            }
        }

        // Print row by row (Traditional nested for-loops)
        System.out.println("Matrix elements (3x4):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n=== 2. Direct Literal Initialization of 2D Array ===");
        int[][] marks = {
            { 85, 90, 78 }, // Student 0
            { 76, 88, 95 }, // Student 1
            { 92, 79, 89 }  // Student 2
        };

        System.out.println("Student Marks Table (Using Enhanced For-Loop):");
        int studentId = 1;
        for (int[] row : marks) {
            System.out.print("Student " + studentId++ + ": ");
            int total = 0;
            for (int mark : row) {
                System.out.print(mark + " ");
                total += mark;
            }
            System.out.println("| Total: " + total);
        }

        System.out.println("\n=== 3. Behind the Scenes: Length in 2D Array ===");
        System.out.println("marks.length (Number of Rows): " + marks.length);
        System.out.println("marks[0].length (Columns in Row 0): " + marks[0].length);
    }
}
