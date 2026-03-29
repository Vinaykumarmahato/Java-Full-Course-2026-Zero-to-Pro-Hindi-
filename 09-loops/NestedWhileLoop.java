public class NestedWhileLoop {
    public static void main(String[] args) {
        
        int i = 1; // Outer Loop Variable Wrapper
        
        System.out.println("==== Nested While Loop Execution ====");
        // Understanding concept via Analogy: i is 'Week', j is 'Hours/Days inside Week'
        
        while (i <= 5) {
            // First prints Outer operation
            System.out.println("Hello World " + i);
            
            // Inner Loop Block
            int j = 1; // Inner Loop Variable initialized inside the outer wrapper to reset logic correctly
            while (j <= 5) {
                System.out.println("    India " + j);
                j++; // Increment inner to avoid inner infinite lockdown
            }
            
            // Increment outer loop to avoid outer infinite lockdown
            i++; 
        }
        
        System.out.println("=====================================");
    }
}
