// ⏱️ Timestamp: 00:01:00
// Topic: The Problem Statement (Why do we need a Constructor?)

public class CH01_TheProblemWithoutConstructor {
    public static void main(String[] args) {
        
        // Student 1 (S1 in Stack, Data in Heap)
        StudentUnsafe s1 = new StudentUnsafe();
        s1.rollNumber = 101;
        s1.name = "Rahul";
        s1.city = "Delhi"; // 3 lines of code for 1 student data

        // Student 2: The Programmer forgot to add the city!
        StudentUnsafe s2 = new StudentUnsafe();
        s2.rollNumber = 102;
        s2.name = "Priya";
        // FORGOT TO ADD CITY! Java says nothing. No Error.

        // Printing values
        System.out.println("S1 -> Roll: " + s1.rollNumber + ", Name: " + s1.name + ", City: " + s1.city);
        System.out.println("S2 -> Roll: " + s2.rollNumber + ", Name: " + s2.name + ", City: " + s2.city); 
        // Problem: S2 city is 'null'. If we try to do operations on it, it will cause NullPointerException!
    }
}

class StudentUnsafe {
    // Instance Variables (Memory allocated in Heap)
    int rollNumber;
    String name;
    String city;
}
