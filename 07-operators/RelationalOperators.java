// File: RelationalOperators.java

public class RelationalOperators {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Basic Relational Checks ===");
        int a = 10;
        int b = 20;

        // Since relational operators return boolean, we can store them in a boolean variable
        boolean isGreater = a > b;
        System.out.println("Is 'a' greater than 'b'? " + isGreater); // false
        
        boolean isLess = a < b;
        System.out.println("Is 'a' less than 'b'? " + isLess); // true
        
        
        System.out.println("\n=== 2. Equality and Inequality Checks ===");
        // Checking if a equals b (==)
        boolean isEqual = (a == b);
        System.out.println("Is 'a' equal to 'b'? " + isEqual); // false
        
        // Checking if a is NOT equal to b (!=)
        boolean isNotEqual = (a != b);
        System.out.println("Is 'a' NOT equal to 'b'? " + isNotEqual); // true


        System.out.println("\n=== 3. Greater/Less Than OR Equal To ===");
        int passMarks = 33;
        int studentMarks = 33;
        
        // >= means check if it's greater OR if it's strictly equal. Only ONE needs to be true.
        boolean hasPassed = studentMarks >= passMarks;
        System.out.println("Did the student pass? " + hasPassed); // true (because 33 == 33)
        

        System.out.println("\n=== 4. Industry Real-Time Use Case (Login Logic Mockup) ===");
        // The password in Database vs password entered by user
        int dbPasswordPin = 1234;
        int userInputPin = 1234;
        
        // Login Validation
        boolean isLoginSuccessful = (userInputPin == dbPasswordPin);
        System.out.println("Login status (Valid credentials?): " + isLoginSuccessful); // true
    }
}
