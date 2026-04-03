public class ForLoopTraps {
    public static void main(String[] args) {
        
        // TRAP 1: False Initial Condition
        System.out.println("\n=== Trap 1: False Condition ===");
        for(int i = 1; i >= 5; i++) {
            System.out.println("This will never print!");
        }
        System.out.println("Trap 1 done (Output was empty).");

        // TRAP 2: The Semicolon Trap
        System.out.println("\n=== Trap 2: The Semicolon Trap ===");
        for(int i = 0; i < 3; i++) ;  // The Semicolon kills the loop sequence right here!
        {
            // This is just considered an anonymous block of code now.
            System.out.println("Hello"); // Prints ONLY ONCE, not 3 times.
        }
        
        // TRAP 3: < vs <=
        System.out.println("\n=== Trap 3: Operator Confusion ===");
        
        System.out.print("Using < 5: ");
        for(int i = 0; i < 5; i++) {
            System.out.print("Hi "); // Prints 5 times
        }
        
        System.out.print("\nUsing <= 5: ");
        for(int i = 0; i <= 5; i++) {
            System.out.print("Hi "); // Prints 6 times
        }

        // TRAP 4: Loop Flexibility
        System.out.println("\n\n=== Trap 4: For Loop masquerading as a While Loop ===");
        int flex = 0;
        for(; flex < 3; ) {
            System.out.println("Flexible For Loop Count: " + flex);
            flex++;
        }

        /* 
        WARNING: Infinite loops. Uncomment to test crashing.
        
        for(int i = 1; ; i++) {
            System.out.println("I will never stop because Java assumes empty conditions are TRUE!");
        }

        for(;;) {
            System.out.println("Absolute infinite loop.");
        }
        */
    }
}
