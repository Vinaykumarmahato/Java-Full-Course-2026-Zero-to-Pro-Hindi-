// ⏱️ Timestamp: 00:13:57
// Topic: Instance Variable vs Local Variable & Garbage Collection

public class CH02_InstanceVsLocalVariables {
    public static void main(String[] args) {
        
        System.out.println("---- Local Variable Demo ----");
        
        // Local Variable (Inside a method, stored in Stack)
        int num;
        
        // System.out.println(num); 
        // ❌ ERROR: The local variable num may not have been initialized!
        // Local variables DO NOT get default values. We must initialize them:
        num = 10;
        System.out.println("Local Variable 'num': " + num);

        System.out.println("\n---- Instance Variable & Multiple Objects ----");
        
        // Creating Object 1
        TestVariable obj1 = new TestVariable();
        // Creating Object 2
        TestVariable obj2 = new TestVariable();

        // Object 1 modifications
        obj1.a = 5;
        obj1.name = "Rahul";

        // Object 2 remains unaffected (still has default initialized values)
        System.out.println("OBJ 1 -> a: " + obj1.a + " | name: " + obj1.name);
        System.out.println("OBJ 2 -> a: " + obj2.a + " | name: " + obj2.name);
        // Both exist separately in Heap Memory

        System.out.println("\n(Once method ends, Garbage Collector will clean these up from Heap as Stack references are destroyed!)");
    }
}

class TestVariable {
    // Instance Variables (Inside class, outside methods. Stored in Heap)
    // Have default values: a=4, name="Vinay" since we pre-assigned them
    int a = 4;
    String name = "Vinay";
}
