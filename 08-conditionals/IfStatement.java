public class IfStatement {
    public static void main(String[] args) {

        // ==========================================
        // Example 1: The "Ram & Rs 10" Analogy
        // ==========================================
        int ramMoney = 10;
        
        System.out.println("Checking Ram's Money...");
        
        if (ramMoney == 10) {
            System.out.println("Yes, Ram is having ₹10");
        }

        System.out.println("--------------------------------");

        // ==========================================
        // Example 2: The Voting Eligibility System
        // ==========================================
        int age = 18; // Change this to 17 to see the False scenario

        System.out.println("Checking Voting Eligibility for age: " + age);

        // Condition Check: Is age strictly greater than or equal to 18?
        if (age >= 18) {
            // This block executes ONLY if the condition is TRUE
            System.out.println("You can vote");
        }

        // Note: If you change age to 17, the condition (17 >= 18) becomes FALSE.
        // In that case, the block above is completely ignored and you won't get any output from it.
        
        System.out.println("\nProgram Execution Completed.");
    }
}
