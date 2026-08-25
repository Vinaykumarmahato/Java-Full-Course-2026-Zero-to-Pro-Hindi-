/**
 * Video 47: Multidimensional Array in Java (3D Array with Memory Map)
 * Java Full Course 2026: Zero to Pro
 */
public class ThreeDArrayMemoryDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. 3D Array Creation & Concept ===");
        // Mental Model: A 3D Array is an "Array of 2D Arrays" (or a Book of Pages/Tables)
        // [Blocks/Pages][Rows][Columns]
        // 2 Blocks (Colleges), 3 Rows (Classes), 2 Columns (Students)
        int[][][] university = new int[2][3][2];

        int score = 50;
        for (int b = 0; b < university.length; b++) {
            for (int r = 0; r < university[b].length; r++) {
                for (int c = 0; c < university[b][r].length; c++) {
                    university[b][r][c] = score++;
                }
            }
        }

        // Print 3D Array block-by-block
        for (int b = 0; b < university.length; b++) {
            System.out.println("--- Campus / Block " + (b + 1) + " ---");
            for (int r = 0; r < university[b].length; r++) {
                System.out.print("Class " + (r + 1) + ": ");
                for (int c = 0; c < university[b][r].length; c++) {
                    System.out.print(university[b][r][c] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("\n=== 2. Memory References in 3D Array ===");
        System.out.println("university Reference: " + university);
        System.out.println("university[0] (Points to 2D Array): " + university[0]);
        System.out.println("university[0][0] (Points to 1D Array): " + university[0][0]);
        System.out.println("university[0][0][0] (Actual Value): " + university[0][0][0]);
    }
}
