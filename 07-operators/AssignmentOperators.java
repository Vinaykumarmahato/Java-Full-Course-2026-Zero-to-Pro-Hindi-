// File: AssignmentOperators.java

public class AssignmentOperators {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Basic Assignment & Chaining ===");
        int a = 20; // Basic Assignment
        
        // Chaining Concept: Evaluates Right to Left
        int x, y, z;
        x = y = z = 100;
        System.out.println("x: " + x + ", y: " + y + ", z: " + z); // All print 100

        
        System.out.println("\n=== 2. Compound Assignment Operators ===");
        int num1 = 100;
        
        // Adding using compound operator (Instead of num1 = num1 + 200)
        num1 += 200; 
        System.out.println("num1 after += 200: " + num1); // 300
        
        num1 -= 50; 
        System.out.println("num1 after -= 50: " + num1); // 250
        
        num1 *= 2; 
        System.out.println("num1 after *= 2: " + num1);  // 500
        
        num1 /= 10; 
        System.out.println("num1 after /= 10: " + num1); // 50
        
        num1 %= 3; 
        System.out.println("num1 after %= 3: " + num1);  // 50 / 3 gives remainder 2

        
        System.out.println("\n=== 3. Tricky Interview Questions ===");
        // Trick 1: Precedence
        int trk1 = 5;
        trk1 += 10 * 2; // (10 * 2) evaluates first -> 20. Then 5 + 20.
        System.out.println("Result of trk1 += 10 * 2 : " + trk1); // 25
        
        // Trick 2: Double Assignment
        int trk2 = 5;
        trk2 += trk2 += 5; // Evaluates Right to Left
        System.out.println("Result of trk2 += trk2 += 5 : " + trk2); // 15
        
        
        System.out.println("\n=== 4. Industry Real-Time Use Case (Banking System) ===");
        int balance = 1000;
        System.out.println("Initial Bank Balance: rs" + balance);
        
        // Deposit
        balance += 500;
        System.out.println("After Deposit of rs500, Balance: rs" + balance);
        
        // Withdrawal
        balance -= 200;
        System.out.println("After Withdrawal of rs200, Balance: rs" + balance);
    }
}
