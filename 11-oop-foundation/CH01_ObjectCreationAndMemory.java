// ⏱️ Timestamp: 00:01:32
// Topic: Object Creation & JRE Memory (Method Area, Stack Area, Heap Area)

public class CH01_ObjectCreationAndMemory {
    public static void main(String[] args) {
        
        System.out.println("---- Object Creation & Memory Linking ----");
        
        /* 
         * 1. Method Area: The 'CH01_ObjectCreationAndMemory.class' & 'TestCode.class' are loaded here.
         * 2. Stack Area: The reference variable 'obj' is created here.
         * 3. Heap Area: The 'new TestCode()' creates the actual dynamic object here.
         */
        
        // Structure: Type | Ref_Variable | = | new | ClassName()
        TestCode obj = new TestCode(); 
        
        // Outputting memory address representation (hash code)
        // Note: Java handles actual addresses internally, we just see a reference via obj
        System.out.println("Object created in Heap! Address Link (Hash): " + obj);

        // Printing default values stored in Heap Area
        System.out.println("Default value of a (Integer): " + obj.a);
        System.out.println("Default value of name (String): " + obj.name);
    }
}

class TestCode {
    // Variable Declarations (Object knows these)
    int a;
    String name;
    
    // Methods (Object can do these)
    public void run() {
        System.out.println("Running...");
    }
}
