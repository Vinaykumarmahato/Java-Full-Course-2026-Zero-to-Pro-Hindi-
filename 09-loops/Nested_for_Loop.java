public class Nested_for_Loop {

    public static void main(String[] args) {

        System.out.println("==== Nested For Loop Execution ====");
        // Concept: "Kaam ke andar Kaam" (Task inside a Task)
        // Analogy: Outer loop is 'Day', Inner loop is 'Tasks per Day'

        // Outer Loop (Handles Days: 1 to 5)
        for(int i = 1; i <= 5; i++) {
            
            // Inner Loop (Handles Tasks: 1 to 3 for the specific Day)
            for(int j = 1; j <= 3; j++) {
                
                // Print the result by concatenating Days and Tasks
                System.out.println("Day: " + i + "  Task: " + j);
                
            }
            // Optional: You can print a blank line here to separate days visually
            // System.out.println(); 
        }

        System.out.println("===================================");
    }
}
