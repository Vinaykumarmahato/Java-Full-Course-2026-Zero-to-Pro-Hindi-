public class DoWhileLoopConcept {
    public static void main(String[] args) {
        
        System.out.println("=== Testing Normal While Loop (False Condition) ===");
        int j = 10;
        
        // This will NOT execute because 10 is naturally NOT <= 5
        while (j <= 5) {
            System.out.println("Hi from While Loop");
            j++;
        }
        System.out.println("While loop executed 0 times.\n");


        System.out.println("=== Testing Do-While Loop (False Condition) ===");
        int i = 10;
        
        // This WILL execute exactly ONE time before verifying the false condition
        do {
            System.out.println("Hi from Do-While Loop! (Executing at least once)");
            i++;
        } while (i <= 5); // Condition fails here, loop breaks immediately after first run
        
        System.out.println("Do-While loop executed 1 time despite false condition.");
        System.out.println("===============================================");
    }
}
