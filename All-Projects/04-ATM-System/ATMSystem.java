import java.util.Scanner;

public class ATMSystem {

    // Shared Data (Static Variables accessible across all methods inside the class)
    static double balance = 10000.0;
    static int pin = 1234;
    static String accountHolder = "Rahul Sharma";
    static String accountNumber = "XXXX-XXXX-1234";

    public static void main(String[] args) {
        // Step 1: Initialization
        Scanner sc = new Scanner(System.in);
        
        printWelcome();

        // Step 2: Pin Verification
        boolean isLoggedIn = verifyPin(sc);
        
        if (!isLoggedIn) {
            System.out.println("Too many failed attempts. Card Blocked!");
            sc.close(); // Closing the stream buffer 
            return; // Stops JVM from executing further lines in main method
        }

        // Step 3: Show Menu
        while (true) {
            int choice = showMenu(sc);
            
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(sc);
                    break;
                case 3:
                    withdrawMoney(sc);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us. Good bye!");
                    sc.close();
                    return; // Terminates the infinite while-loop by directly exiting the method
                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        }
    }

    public static void printWelcome() {
        System.out.println("\n====================================");
        System.out.println("     Welcome to ADB Bank ATM        ");
        System.out.println("====================================");
    }

    public static boolean verifyPin(Scanner sc) {
        int attempts = 0;
        
        // Using do-while loop because the ATM must ask for the PIN at least ONCE
        do {
            System.out.print("\nEnter PIN: ");
            int enteredPin = sc.nextInt();
            
            if (enteredPin == pin) {
                System.out.println("Login Successfully.");
                System.out.println("Welcome " + accountHolder + "!");
                return true; // Exits the method immediately, signaling success
            } else {
                attempts++;
                System.out.println("Wrong PIN. Attempts left: " + (3 - attempts));
            }
        } while (attempts < 3);
        
        return false; // Reached only if all 3 attempts fail
    }

    public static int showMenu(Scanner sc) {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
        return sc.nextInt();
    }

    public static void checkBalance() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs " + balance);
    }

    public static void depositMoney(Scanner sc) {
        System.out.print("\nEnter deposit amount: Rs ");
        double amount = sc.nextDouble();
        
        // Validation check for negative deposits
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Rs " + amount + " deposited successfully.");
            System.out.println("Updated Balance: Rs " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a value greater than 0.");
        }
    }

    public static void withdrawMoney(Scanner sc) {
        System.out.print("\nEnter withdrawal amount: Rs ");
        double amount = sc.nextDouble();
        
        // Logical verification cascade
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a value greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance available. Current Balance: Rs " + balance);
        } else {
            balance = balance - amount;
            System.out.println("Rs " + amount + " dispensed. Please collect your cash.");
            System.out.println("Remaining Balance: Rs " + balance);
        }
    }
}
