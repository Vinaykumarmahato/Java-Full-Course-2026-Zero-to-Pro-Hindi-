import java.util.Scanner;

public class CalculateStudentResult {

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
        showReport(name, total, percentage);
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
    static void showReport(String name, int total, double percentage) {
        System.out.println("\n================ Student Result ================");
        System.out.println("Name         - " + name);
        System.out.println("Total Marks  - " + total);
        System.out.println("Percentage   - " + percentage + "%");
        System.out.println("================================================\n");
    }
}
