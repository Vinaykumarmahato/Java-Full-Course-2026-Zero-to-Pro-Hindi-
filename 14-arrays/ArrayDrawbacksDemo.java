/**
 * Video 49: Drawbacks & Limitations of Arrays in Java
 * (Why we need Java Collections Framework / ArrayList)
 * Java Full Course 2026: Zero to Pro
 */
public class ArrayDrawbacksDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Drawback 1: Fixed Size (Static Allocation) ===");
        int[] fixedArray = new int[3];
        fixedArray[0] = 10;
        fixedArray[1] = 20;
        fixedArray[2] = 30;

        System.out.println("Array size fixed at: " + fixedArray.length);
        // Trying to add 4th element throws ArrayIndexOutOfBoundsException:
        // fixedArray[3] = 40; // ERROR at runtime!

        System.out.println("\n=== 2. Drawback 2: Homogeneous Data Type Only ===");
        // An int array cannot hold Strings or Booleans!
        // int[] mixed = { 10, "Hello", true }; // COMPILE TIME ERROR!

        System.out.println("\n=== 3. Drawback 3: Contiguous Memory Requirement ===");
        // Java requires a continuous uninterrupted block of Heap memory.
        // Even if 1GB total RAM is free in fragments, allocating a large continuous array might throw OutOfMemoryError.

        System.out.println("\n=== 4. Drawback 4: Lack of Built-in Ready Methods ===");
        // No built-in methods to directly insert at index 0, delete, sort without manual shift or utility libraries.
        System.out.println("To insert or delete, we must manually shift all elements!");

        System.out.println("\n💡 Solution Preview: Java Collections Framework (ArrayList, LinkedList, etc.)!");
    }
}
