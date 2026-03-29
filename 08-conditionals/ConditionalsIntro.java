public class ConditionalsIntro {
    public static void main(String[] args) {
        
        System.out.println("=== Real World Conditional Logic Example ===");
        
        // Example 1: Age Eligibility (Voting)
        int age = 20;
        
        System.out.println("Checking Voting Eligibility for Age: " + age);
        
        // This is a sneak peek into 'if-else' which we will master next
        if (age >= 18) {
            System.out.println("Result: You are eligible to vote. 🗳️");
        } else {
            System.out.println("Result: You are NOT eligible to vote. 🚫");
        }

        System.out.println("\n---------------------------------------------\n");
        
        // Example 2: E-Commerce Payment
        boolean isPaymentSuccessful = false;
        
        System.out.println("Processing Amazon Order...");
        
        if (isPaymentSuccessful) {
            System.out.println("Order Confirmed! Your package is shipping soon. 📦");
        } else {
            System.out.println("Payment Failed! Please try again. 💳");
        }
    }
}
