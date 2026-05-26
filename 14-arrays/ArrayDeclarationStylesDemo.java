/**
 * Phase 14: Arrays - Declaration & Initialization Deep Dive
 * Video: Array Declaration vs Initialization, 3 Declaration Styles, Memory Concepts
 * 
 * इस वीडियो में हम लोगों ने समझा:
 * 1. Declaration (डिक्लेरेशन) vs Initialization (इनिशियलाइजेशन) का मतलब क्या है
 * 2. Array declare करने के 3 तरीके (3 Declaration Styles)
 * 3. Interview Trap: int[] a, b vs int a[], b
 * 4. new keyword क्या करता है Memory (Heap) में
 * 5. Direct value assignment with curly braces {}
 */
public class ArrayDeclarationStylesDemo {
    public static void main(String[] args) {

        // =====================================================================
        // PART 1: Declaration vs Initialization — Normal Variables se samjho
        // =====================================================================
        System.out.println("========================================");
        System.out.println("PART 1: Declaration vs Initialization");
        System.out.println("========================================");

        // Declaration: Sirf naam de rahe hain, memory mein ek space mil jaata hai
        // लेकिन value abhi nahi di
        int a;          // Declaration — Stack mein 'a' naam ka variable ban gaya
        String name;    // Declaration — Stack mein 'name' naam ka variable ban gaya

        // Initialization: Ab actual value de rahe hain us variable ko
        a = 20;             // Initialization — ab 'a' ke paas value hai: 20
        name = "Venu";      // Initialization — ab 'name' ke paas value hai: "Venu"

        System.out.println("int a = " + a);         // Output: 20
        System.out.println("String name = " + name); // Output: Venu
        System.out.println();


        // =====================================================================
        // PART 2: Array Declaration — Sirf Declare karna (Memory nahi milti)
        // =====================================================================
        System.out.println("========================================");
        System.out.println("PART 2: Array Declaration (No Memory)");
        System.out.println("========================================");

        // Jab hum array declare karte hain, hum compiler ko batate hain:
        //   1. Ek array AANE WALA hai (aaya nahi hai, aane wala hai)
        //   2. Uska NAAM kya hoga
        //   3. Kis TYPE ka data aayega (int, String, double, etc.)
        //
        // Memory mein kya hota hai?
        //   Stack: Sirf variable ka naam aata hai (null / no address)
        //   Heap:  Bilkul khaali — koi space nahi mila

        // --- Style 1: Brackets with Type (PREFERRED / सबसे ज्यादा यूज़ होने वाला) ---
        int[] arr;          // ✅ int type ka array, naam: arr
        String[] names;     // ✅ String type ka array, naam: names

        // --- Style 2: Brackets with Variable Name (C-style, also valid) ---
        int num[];          // ✅ int type ka array, naam: num
        double marks[];     // ✅ double type ka array, naam: marks

        // Dono style bilkul valid hain — aap koi bhi use kar sakte ho!

        // ⚠️ Abhi sirf declare hua hai:
        //   - Stack mein: arr, names, num, marks — sab null hain
        //   - Heap mein: Kuch nahi hua, bilkul khaali
        //   - Agar hum arr[0] access karein toh NullPointerException aayega!

        // Uncommenting below line would cause: NullPointerException
        // System.out.println(arr[0]); // ❌ Error! No memory allocated yet

        System.out.println("Style 1: int[] arr;     → Declared (Stack mein naam, Heap khaali)");
        System.out.println("Style 2: int num[];     → Declared (Stack mein naam, Heap khaali)");
        System.out.println();


        // =====================================================================
        // PART 3: Interview Trap! — 3rd Declaration Style (Multiple Variables)
        // =====================================================================
        System.out.println("========================================");
        System.out.println("PART 3: Interview Trap — Multiple Vars");
        System.out.println("========================================");

        // --- Case A: int[] a, b → DONO array hain ✅ ---
        // Jab brackets TYPE ke saath hain, toh comma ke baad bhi array hi banega
        int[] arrA, arrB;
        arrA = new int[]{10, 20, 30};
        arrB = new int[]{40, 50, 60};

        System.out.println("int[] arrA, arrB; → Dono ARRAY hain!");
        System.out.println("  arrA[0] = " + arrA[0]);  // 10
        System.out.println("  arrB[0] = " + arrB[0]);  // 40

        // --- Case B: int a[], b → Sirf 'a' array hai, 'b' normal int hai! ⚠️ ---
        // Jab brackets VARIABLE ke saath hain, toh sirf usi variable ka array banega
        int arrC[], normalInt;
        arrC = new int[]{70, 80, 90};
        normalInt = 100;  // Ye ek normal int variable hai, array NAHI hai!

        System.out.println("\nint arrC[], normalInt; → arrC is ARRAY, normalInt is just int!");
        System.out.println("  arrC[0] = " + arrC[0]);         // 70
        System.out.println("  normalInt = " + normalInt);      // 100 (simple int)

        // --- Case C: int[] arrD, arrE[], normalVar → Mixed declaration ---
        // arrD → array (brackets type ke saath)
        // arrE → array (brackets variable ke saath bhi)
        // normalVar → ❌ Ye bhi actually array hai kyunki int[] type apply hota hai!
        // Actually: int[] arrD, arrE[], normalVar mein SABHHI arrays hain
        // But: int arrD[], arrE, normalVar mein sirf arrD array hai!

        int arrF[], simpleE, simpleF;
        arrF = new int[]{1, 2, 3};
        simpleE = 5;   // Normal int — array nahi hai
        simpleF = 10;  // Normal int — array nahi hai

        System.out.println("\nint arrF[], simpleE, simpleF;");
        System.out.println("  arrF is ARRAY: arrF[0] = " + arrF[0]);
        System.out.println("  simpleE is just int: " + simpleE);
        System.out.println("  simpleF is just int: " + simpleF);
        System.out.println();


        // =====================================================================
        // PART 4: Initialization — Memory se Rishta Jodna (new keyword)
        // =====================================================================
        System.out.println("========================================");
        System.out.println("PART 4: Initialization (new keyword)");
        System.out.println("========================================");

        // Jab hum 'new' keyword likhte hain:
        //   → Hum Java se bol rahe hain: "Heap area mein ek OBJECT bana do"
        //   → Us object ke andar itni jagah (size) do
        //   → Us jagah ka ADDRESS stack variable ko de do

        // Declaration + Initialization ek saath:
        int[] myArr = new int[5];

        // Memory mein kya hua?
        //   Stack: myArr → holds address (e.g., 0x0101H)
        //   Heap:  [0][0][0][0][0]  ← 5 spaces, default value 0 (int ke liye)
        //          Index: 0  1  2  3  4

        System.out.println("int[] myArr = new int[5];");
        System.out.println("  Stack: myArr holds Heap address");
        System.out.println("  Heap:  5 spaces created, all filled with default 0");
        System.out.println("  myArr[0] = " + myArr[0]);  // 0 (default)
        System.out.println("  myArr[4] = " + myArr[4]);  // 0 (default)
        System.out.println("  myArr.length = " + myArr.length);  // 5

        // String array ka default value: null
        String[] nameArr = new String[5];
        System.out.println("\nString[] nameArr = new String[5];");
        System.out.println("  nameArr[0] = " + nameArr[0]);  // null (default for String)
        System.out.println();


        // =====================================================================
        // PART 5: Declaration alag, Initialization alag (2-step process)
        // =====================================================================
        System.out.println("========================================");
        System.out.println("PART 5: Separate Declaration & Init");
        System.out.println("========================================");

        // Step 1: Sirf declare karo
        int[] scores;
        // Abhi Stack mein: scores = null, Heap mein: kuch nahi

        // Step 2: Baad mein initialize karo
        scores = new int[10];
        // Ab Stack mein: scores = [address], Heap mein: 10 spaces with default 0

        System.out.println("Step 1: int[] scores;          → Declaration (null)");
        System.out.println("Step 2: scores = new int[10];  → Initialization (memory allocated)");
        System.out.println("  scores.length = " + scores.length);  // 10
        System.out.println("  scores[0] = " + scores[0]);          // 0
        System.out.println();


        // =====================================================================
        // PART 6: Direct Value Assignment (Curly Braces {})
        // =====================================================================
        System.out.println("========================================");
        System.out.println("PART 6: Direct Values with {}");
        System.out.println("========================================");

        // Agar pehle se pata hai ki kya values deni hain, toh directly do!
        int[] numbers = {1, 10, 20, 30, 40};
        System.out.println("int[] numbers = {1, 10, 20, 30, 40};");
        System.out.println("  numbers[0] = " + numbers[0]);  // 1
        System.out.println("  numbers[4] = " + numbers[4]);  // 40
        System.out.println("  numbers.length = " + numbers.length);  // 5

        // String array with direct values
        String[] friends = {"Vinu", "Ram", "Rahul"};
        System.out.println("\nString[] friends = {\"Vinu\", \"Ram\", \"Rahul\"};");
        System.out.println("  friends[0] = " + friends[0]);  // Vinu
        System.out.println("  friends[1] = " + friends[1]);  // Ram
        System.out.println("  friends[2] = " + friends[2]);  // Rahul
        System.out.println();


        // =====================================================================
        // PART 7: Default Values Table — Different Data Types
        // =====================================================================
        System.out.println("========================================");
        System.out.println("PART 7: Default Values in Arrays");
        System.out.println("========================================");

        int[] intArr = new int[1];
        double[] doubleArr = new double[1];
        boolean[] boolArr = new boolean[1];
        String[] strArr = new String[1];

        System.out.println("Data Type      | Default Value");
        System.out.println("---------------|---------------");
        System.out.println("int            | " + intArr[0]);       // 0
        System.out.println("double         | " + doubleArr[0]);    // 0.0
        System.out.println("boolean        | " + boolArr[0]);      // false
        System.out.println("String (Object)| " + strArr[0]);       // null

        System.out.println();
        System.out.println("🎯 Summary:");
        System.out.println("  Declaration = Sirf naam dena (Stack mein entry, Heap khaali)");
        System.out.println("  Initialization = new keyword se memory dena (Heap mein space banta hai)");
        System.out.println("  new keyword = Java se bolna: Heap mein ek object bana do!");
    }
}
