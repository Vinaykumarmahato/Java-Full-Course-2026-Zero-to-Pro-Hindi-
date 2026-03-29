import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        // ===============================================
        // PART 1: The Basics (Various Data Types)
        // ===============================================
        
        // String Example: Even/Odd
        int num = 6;
        String stringResult = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + num + " is: " + stringResult);

        // Boolean Example
        boolean booleanResult = (2 > 3) ? true : false;
        System.out.println("Is 2 greater than 3? " + booleanResult);

        // Integer Example
        int number = 30;
        int intResult = (number > 40) ? 100 : 200;
        System.out.println("Result variable holds: " + intResult + " (Because 30 is not > 40)");

        System.out.println("\n===============================================\n");

        // ===============================================
        // PART 2: Interview Question - Largest of 3 Numbers
        // ===============================================
        System.out.println("🔥 Interview Question: Largest of 3 Numbers");
        
        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter Third Number: ");
        int num3 = sc.nextInt();

        // Step 1: Fight between num1 and num2. Store the winner in a temporary variable
        int temp = (num1 > num2) ? num1 : num2;

        // Step 2: Fight between the winner (temp) and num3. Store the final winner.
        int largestNumber = (temp > num3) ? temp : num3;

        // Output Final Result
        System.out.println("The Largest Number is: " + largestNumber);

        sc.close();
    }
}
