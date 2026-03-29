public class WhileLoopConcept {
    public static void main(String[] args) {
        
        // Example 1: Basic While Loop Printing "Hello World" 5 times
        int i = 1; // Initialization
        
        System.out.println("--- Basic While Loop Execution ---");
        
        while (i <= 5) { // Condition Checking
            System.out.println("Hello World " + i);
            i++; // Incrementing so the loop breaks eventually at 6
        }

        System.out.println("Loop stopped because i became: " + i);
        System.out.println("----------------------------------\n");

        
        /* 
        // Example 2: INFINITE LOOP (Avoid doing this!)
        // If we don't increase the counter, or set truthy condition straight up:
        
        while (true) {
            System.out.println("This will keep compiling forever!");
        }
        */
    }
}
