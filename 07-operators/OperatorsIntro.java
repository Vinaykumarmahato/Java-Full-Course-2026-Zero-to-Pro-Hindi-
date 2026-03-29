// File: OperatorsIntro.java

public class OperatorsIntro {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Why Operators are basic building blocks ===");
        
        // Operands
        int a = 10;
        int b = 20;

        // Operator '+' performing an operation (addition) 
        // Operator '=' assigning the result into 'sum'
        int sum = a + b;
        
        System.out.println("The value of a + b is: " + sum);
        
        
        System.out.println("\n=== 2. Real-World Logic Example (Age Verification) ===");
        
        int userAge = 22;
        int minimumRequirement = 18;
        
        // Here '>=' is a Relational Operator checking a condition
        boolean isEligible = userAge >= minimumRequirement;
        
        System.out.println("User is 22. Is user eligible to vote? " + isEligible);


        System.out.println("\n=== 3. What's Next? ===");
        System.out.println("Java has 8 types of Operators which we will dive into deeply in the upcoming lectures!");
    }
}
