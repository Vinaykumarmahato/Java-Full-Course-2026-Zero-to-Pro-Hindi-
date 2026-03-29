import java.util.Scanner;

public class FloorSelectionSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Project Menu & Instructions
        System.out.println("===============================");
        System.out.println("🏢 Welcome to Dhurandar Building");
        System.out.println("===============================");
        System.out.println("Floor Selection System Active.");
        System.out.print("Please enter a floor number (0 to 7): ");
        
        // Take User Input
        int floor = sc.nextInt();
        
        System.out.println("-------------------------------");

        // Switch Statement directing the Lift
        switch (floor) {
            case 0:
                System.out.println("You are on Ground Floor (Lobby).");
                break;
            case 1:
                System.out.println("You have selected Floor 1. Going Up! ⬆️");
                break;
            case 2:
                System.out.println("You have selected Floor 2. Going Up! ⬆️");
                break;
            case 3:
                System.out.println("You have selected Floor 3. Going Up! ⬆️");
                break;
            case 4:
                System.out.println("You have selected Floor 4. Going Up! ⬆️");
                break;
            case 5:
                System.out.println("You have selected Floor 5. Going Up! ⬆️");
                break;
            case 6:
                System.out.println("You have selected Floor 6. Going Up! ⬆️");
                break;
            case 7:
                System.out.println("You have selected Floor 7. The Penthouse! 💎");
                break;
            default:
                // If user enters 8, 99, -5, etc.
                System.out.println("Error: Please enter a VALID floor number between 0 and 7. ❌");
                break;
        }

        System.out.println("===============================");
        sc.close();
    }
}
