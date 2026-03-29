import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        
        // Creating Scanner Object to take Input from User
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // ===============================================
        // Scenario 1: Even or Odd Program (Using Blocks)
        // ===============================================
        
        // Condition: (num % 2 == 0) 
        // '%' gets the remainder (शेषफल), '==' compares it to 0
        if (num % 2 == 0) {
            System.out.println("The number you entered is Even");
            System.out.println("Good Morning"); // Demonstrating multiple lines inside a block
        } else {
            System.out.println("The number you entered is Odd");
            System.out.println("Good Evening");
        }

        System.out.println("----------------------------------------");


        // ===============================================
        // Scenario 2: Omitting Curly Braces (Single Statement Only)
        // ===============================================
        System.out.println("Executing Braceless if-else:");
        
        if (num % 2 == 0)
            System.out.println("Output from braceless: EVEN");
        else 
            System.out.println("Output from braceless: ODD");

        
        // Closing scanner
        sc.close();
    }
}
