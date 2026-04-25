/**
 * ================================================================
 *  PopExample.java — Demonstrating POP Problems (in Java Syntax)
 * ================================================================
 * 
 * This file simulates how things worked in Procedural Oriented
 * Programming (POP) like C Language. We use Java syntax here 
 * just for demonstration — the CONCEPT is what matters.
 * 
 * 🔑 Key Problems Shown:
 *   1. Global data — accessible and modifiable by ANY function
 *   2. No validation — invalid data is accepted silently
 *   3. No connection between data and functions
 *   4. Data corruption is easy and unchecked
 * 
 * Episode: Need of OOPs — Java Full Course 2026
 */

public class PopExample {

    // ============================================================
    // 🌍 GLOBAL DATA — Accessible by EVERYONE, No Protection!
    // ============================================================
    // यह Global Variables हैं — कोई भी function इनको access और
    // change कर सकता है बिना किसी permission या check के।
    // ============================================================
    static String studentName = "Vinay";
    static int studentAge = 20;
    static int studentMarks = 85;

    // ============================================================
    // Function 1: Display Student Info
    // ============================================================
    // यह function simply data को print कर रहा है।
    // Data से इसका कोई direct connection नहीं है — बस access कर रहा है।
    // ============================================================
    static void displayStudentInfo() {
        System.out.println("📋 Student Information:");
        System.out.println("   Name  : " + studentName);
        System.out.println("   Age   : " + studentAge);
        System.out.println("   Marks : " + studentMarks);
        System.out.println();
    }

    // ============================================================
    // Function 2: Update Marks
    // ============================================================
    // कोई भी check नहीं हो रहा। Direct change हो रहा है।
    // -99 marks दे दो, -500 दे दो — सब accept हो जाएगा!
    // ============================================================
    static void updateMarks(int newMarks) {
        studentMarks = newMarks; // ❌ No validation! Direct change!
    }

    // ============================================================
    // Function 3: Corrupt Data — The Real Danger! ⚠️
    // ============================================================
    // यह function data को corrupt कर रहा है:
    //   marks = -99 (Invalid! Marks can't be negative)
    //   age   = -5  (Invalid! Age can't be negative)
    // 
    // But the program WON'T complain. It will run perfectly fine.
    // This was the BIGGEST issue of POP → No Control Over Data.
    // ============================================================
    static void corruptData() {
        studentMarks = -99; // ❌ Invalid marks — but no error!
        studentAge = -5;    // ❌ Invalid age — but no error!
    }

    // ============================================================
    // Main Method — Execution Flow
    // ============================================================
    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  POP (Procedural) Approach — Problems   ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();

        // --- Step 1: Display original data ---
        System.out.println("✅ BEFORE any changes:");
        displayStudentInfo();

        // --- Step 2: Update marks with invalid data ---
        System.out.println("⚠️  Updating marks to -99 (Invalid!)...");
        updateMarks(-99);
        displayStudentInfo();

        // --- Step 3: Corrupt data directly ---
        System.out.println("⚠️  Calling corruptData()...");
        corruptData();

        System.out.println("❌ AFTER corruption:");
        displayStudentInfo();

        // --- Step 4: Anyone can directly change global data ---
        System.out.println("⚠️  Direct global access: setting age = -100...");
        studentAge = -100; // ❌ Direct access — no function needed!
        displayStudentInfo();

        System.out.println("─────────────────────────────────────────");
        System.out.println("🔴 CONCLUSION: Data is OPEN, UNPROTECTED,");
        System.out.println("   and any function can CORRUPT it freely.");
        System.out.println("   This is why OOPs was needed!");
        System.out.println("─────────────────────────────────────────");
    }
}
