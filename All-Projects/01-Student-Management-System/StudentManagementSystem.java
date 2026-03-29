public class StudentManagementSystem {

    // Variable to track the total number of students
    static int totalStudents = 0;

    // Method to add and display single student data
    public static void addStudentData(String name, int rollNumber, int age, float marks) {
        totalStudents++; // Increment the student count by 1 whenever method is called
        
        System.out.println("Student Data Added Successfully");
        System.out.println("_______________________________");
        System.out.println("Student Name is: " + name);
        System.out.println("Student Roll Number is: " + rollNumber);
        System.out.println("Student Age is: " + age);
        System.out.println("Student Marks is: " + marks);
        System.out.println();
    }

    // Method to print the total count of students
    public static void totalNumberOfStudent() {
        System.out.println("The Total Number of Student is: " + totalStudents);
    }

    public static void main(String[] args) {
        // App Header
        System.out.println("Student Management System");
        System.out.println("=========================");

        // Data Insertion via Method Calling
        addStudentData("Vinay", 1, 22, 96.5f);
        addStudentData("Arjun Sahni", 2, 22, 77f);
        addStudentData("Ravi", 3, 23, 85.5f);

        // Fetch Total Students after all records are added
        totalNumberOfStudent();
    }
}
