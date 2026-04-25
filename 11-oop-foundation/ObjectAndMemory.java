class Test {
    // Instance Variables (Declared inside class, outside methods)
    // Created when object is created, destroyed when object is destroyed.
    // Stored in HEAP memory.
    int a = 4;
    String name = "Vinay";

    public static void main(String[] args) {
        // Local Variables (Declared inside method)
        // Stored in STACK memory.
        int num = 10;
        
        // Object Creation:
        // Test -> Object Type (Class Name)
        // obj1 -> Reference Variable (Stored in STACK)
        // new Test() -> Actual Object (Stored in HEAP)
        Test obj1 = new Test();
        
        // Accessing Instance Variables using Reference Variable
        System.out.println("Object 1 - Initial Data:");
        System.out.println(obj1.a);
        System.out.println(obj1.name);

        // Modifying Instance Variable for specific object
        obj1.name = "Rahul";
        System.out.println("\nObject 1 - Updated Name:");
        System.out.println(obj1.name);

        // Multiple Objects creation
        Test obj2 = new Test();
        System.out.println("\nObject 2 - Default Data (Unchanged by obj1):");
        System.out.println(obj2.name); // Will print "Vinay"
        
        // Printing Local Variable
        System.out.println("\nLocal Variable num: " + num);
    }
}
