/**
 * ================================================================
 *  OopSolution.java — How OOP Solves Every POP Problem
 * ================================================================
 * 
 * Same Student Management scenario — but now using OOP principles.
 * 
 * 🔑 Solutions Demonstrated:
 *   1. Data is PRIVATE → No direct outside access (Encapsulation)
 *   2. Changes only via setter methods → Validation enforced
 *   3. Data + Functions TOGETHER in one class → Connection!
 *   4. Invalid/corrupt data → REJECTED automatically
 *   5. Organized, structured, maintainable code
 * 
 * Episode: Need of OOPs — Java Full Course 2026
 */

// ================================================================
// 🏗️ CLASS = Blueprint (अभी इतना समझो कि यह एक template है)
//    Data + Functions = एक साथ bundled inside one class
// ================================================================
class Student {

    // ════════════════════════════════════════════════════════
    // 🔒 PRIVATE DATA — No one outside this class can touch!
    // ════════════════════════════════════════════════════════
    // POP Problem:  Data was global → anyone could change
    // OOP Solution: Data is private → only THIS class controls it
    // ════════════════════════════════════════════════════════
    private String name;
    private int age;
    private int marks;

    // ════════════════════════════════════════════════════════
    // 🏭 Constructor — Initializing data with VALIDATION
    // ════════════════════════════════════════════════════════
    // (Don't worry about constructor syntax yet — 
    //  just understand that it creates a Student safely)
    // ════════════════════════════════════════════════════════
    public Student(String name, int age, int marks) {
        this.name = name;
        setAge(age);     // Use setter → validation happens!
        setMarks(marks); // Use setter → validation happens!
    }

    // ════════════════════════════════════════════════════════
    // ✅ Setter for Marks — CONTROLLED ACCESS with VALIDATION
    // ════════════════════════════════════════════════════════
    // POP Problem:  marks = -99 was accepted silently
    // OOP Solution: Invalid marks (< 0 or > 100) → REJECTED!
    // ════════════════════════════════════════════════════════
    public void setMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
            System.out.println("   ✅ Marks updated to: " + newMarks);
        } else {
            System.out.println("   ❌ REJECTED! Invalid marks: " + newMarks 
                + " (Must be 0-100)");
        }
    }

    // ════════════════════════════════════════════════════════
    // ✅ Setter for Age — CONTROLLED ACCESS with VALIDATION
    // ════════════════════════════════════════════════════════
    // POP Problem:  age = -5 was accepted silently
    // OOP Solution: Negative age → REJECTED!
    // ════════════════════════════════════════════════════════
    public void setAge(int newAge) {
        if (newAge > 0 && newAge <= 150) {
            this.age = newAge;
            System.out.println("   ✅ Age updated to: " + newAge);
        } else {
            System.out.println("   ❌ REJECTED! Invalid age: " + newAge 
                + " (Must be 1-150)");
        }
    }

    // ════════════════════════════════════════════════════════
    // 📋 Display Student Info — Connected to THIS student's data
    // ════════════════════════════════════════════════════════
    // POP Problem:  Function was SEPARATE from data
    // OOP Solution: Function lives INSIDE the class with the data
    // ════════════════════════════════════════════════════════
    public void displayInfo() {
        System.out.println("📋 Student Information:");
        System.out.println("   Name  : " + this.name);
        System.out.println("   Age   : " + this.age);
        System.out.println("   Marks : " + this.marks);
        System.out.println();
    }
}

// ================================================================
// 🚀 Main Class — Testing the OOP Solution
// ================================================================
public class OopSolution {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  OOP Approach — All Problems SOLVED!    ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();

        // --- Step 1: Create a Student object (safely) ---
        System.out.println("🏗️ Creating Student with valid data...");
        Student s1 = new Student("Vinay", 20, 85);
        System.out.println();

        s1.displayInfo();

        // --- Step 2: Try setting INVALID marks (-99) ---
        System.out.println("⚠️  Attempting to set marks = -99...");
        s1.setMarks(-99);  // ❌ This will be REJECTED!
        System.out.println();

        s1.displayInfo();  // Marks remain 85 — data is SAFE! ✅

        // --- Step 3: Try setting INVALID age (-5) ---
        System.out.println("⚠️  Attempting to set age = -5...");
        s1.setAge(-5);     // ❌ This will be REJECTED!
        System.out.println();

        s1.displayInfo();  // Age remains 20 — data is SAFE! ✅

        // --- Step 4: Try setting VALID marks ---
        System.out.println("✅ Setting valid marks = 92...");
        s1.setMarks(92);   // ✅ This will be ACCEPTED!
        System.out.println();

        s1.displayInfo();  // Marks updated to 92 ✅

        // --- Step 5: Direct access? IMPOSSIBLE! ---
        // Uncomment the line below and see the compile error:
        // s1.marks = -99;  // ❌ COMPILE ERROR: marks has private access
        // s1.age = -5;     // ❌ COMPILE ERROR: age has private access

        System.out.println("─────────────────────────────────────────────");
        System.out.println("🟢 CONCLUSION:");
        System.out.println("   ✅ Data is PRIVATE → Cannot access directly");
        System.out.println("   ✅ Setters VALIDATE → Invalid data REJECTED");
        System.out.println("   ✅ Data + Functions → TOGETHER in one class");
        System.out.println("   ✅ Data corruption → IMPOSSIBLE!");
        System.out.println("   ✅ Code is STRUCTURED → Easy to maintain");
        System.out.println("─────────────────────────────────────────────");
    }
}
