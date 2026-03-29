public class IfElseIfStatement {
    public static void main(String[] args) {
        
        // Let's create a dynamic variable 'marks' representing the student's final score
        // We are going to test this logic by shifting the marks from 95 -> 75
        int marks = 75; 

        System.out.println("Processing Result for Marks: " + marks);
        System.out.println("------------------------------------");

        // The if-else-if Ladder (Grading System)
        if (marks >= 90) {
            // Condition 1 checks if marks are 90 or above
            System.out.println("Result: Grade A");
            
        } else if (marks >= 75) {
            // Condition 2 checks if marks are 75 or above
            // When marks = 75, THIS is the condition that becomes TRUE!
            System.out.println("Result: Grade B");
            
        } else if (marks >= 60) {
            // Condition 3 checks if marks are 60 or above
            System.out.println("Result: Grade C");
            
        } else {
            // If ALL the above conditions evaluate to FALSE, the 'else' block runs.
            System.out.println("Result: Fail");
        }

        System.out.println("------------------------------------");
        System.out.println("Execution logic complete. Terminal Exiting.");
        
        /*
         * MENTAL TRACE (For marks = 75):
         * 1. Does marks >= 90? (75 >= 90) -> FALSE. Move to next.
         * 2. Does marks >= 75? (75 >= 75) -> TRUE! 
         * 3. Print "Grade B". 
         * 4. IGNORE all remaining 'else if' and 'else' blocks. Step out of the whole ladder.
         */
    }
}
