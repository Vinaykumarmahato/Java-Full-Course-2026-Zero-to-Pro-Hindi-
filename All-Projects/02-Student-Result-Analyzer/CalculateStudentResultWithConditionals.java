import java.util.Scanner;

public class CalculateStudentResultWithConditionals {

    public static void main(String[] args) {
        takeUserInput();
    }

    // Master Method performing all operations
    static void takeUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Physics Marks: ");
        int physics = sc.nextInt();

        System.out.println("Enter Chemistry Marks: ");
        int chemistry = sc.nextInt();

        System.out.println("Enter Math Marks: ");
        int math = sc.nextInt();

        System.out.println("Enter Hindi Marks: ");
        int hindi = sc.nextInt();

        System.out.println("Enter English Marks: ");
        int english = sc.nextInt();

        // Calling other methods and storing returned values
        int total = calculateTotal(physics, chemistry, math, hindi, english);
        double percentage = calculatePercentage(total);

        // Printing Result
        showReport(name, physics, chemistry, math, hindi, english, total, percentage);
    }

    // Method to calculate total marks
    static int calculateTotal(int a, int b, int c, int d, int e) {
        int totalMarks = a + b + c + d + e;
        return totalMarks;
    }

    // Method to calculate percentage
    static double calculatePercentage(int totalMarks) {
        int totalSubjects = 5;
        int marksPerSubject = 100;
        int totalMaximumMarks = totalSubjects * marksPerSubject;
        
        // Multiplying by 100.0 ensures we get a double result with decimals
        double percentage = (totalMarks * 100.0) / totalMaximumMarks;
        return percentage;
    }

    // Method to format and print the report
    static void showReport(String name, int physics, int chemistry, int math, int hindi, int english, int total, double percentage) {
        System.out.println("\n================ Student Result ================");
        System.out.println("Name         - " + name);
        System.out.println("Physics      - " + physics);
        System.out.println("Chemistry    - " + chemistry);
        System.out.println("Math         - " + math);
        System.out.println("Hindi        - " + hindi);
        System.out.println("English      - " + english);
        System.out.println("------------------------------------------------");
        System.out.println("Total Marks  - " + total);
        System.out.println("Percentage   - " + percentage + "%");
        
        // Logical evaluation using Conditionals and OR / AND operators
        if (physics < 33 || chemistry < 33 || math < 33 || hindi < 33 || english < 33) {
            System.out.println("Status       - Fail");
        } else if (physics >= 95 && physics <= 100 && chemistry >= 95 && chemistry <= 100 && math >= 95 && math <= 100 && hindi >= 95 && hindi <= 100 && english >= 95 && english <= 100) {
            System.out.println("Status       - Topper");
        } else {
            System.out.println("Status       - Pass");
        }
        
        System.out.println("================================================\n");
    }
}
