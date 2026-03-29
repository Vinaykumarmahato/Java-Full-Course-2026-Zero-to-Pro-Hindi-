// File: Simple.java -> Code created from the Variables Transcript

class Simple {
    
    // 2. INSTANCE VARIABLE
    // Declared inside the class but outside any method. 
    // Needs an Object to be accessed!
    String name = "John";
    
    // 3. STATIC VARIABLE
    // Has the 'static' keyword. 
    // Does NOT need an Object to be accessed! (Saves memory)
    static String country = "USA";

    // Main Method (Starting Point)
    public static void main(String[] args) {
        
        // 1. LOCAL VARIABLE
        // Declared within a method.
        int age = 10;
        System.out.println("Local Variable (age): " + age);
        
        // ----------------------------------------------------
        
        // Accessing Instance Variable:
        // We MUST create an object to give 'life' to the class and access the variable.
        Simple obj = new Simple(); // Creating object 'obj'
        System.out.println("Instance Variable (name): " + obj.name);
        
        // ----------------------------------------------------
        
        // Accessing Static Variable:
        // No object required! We just tell the Class to fetch it.
        System.out.println("Static Variable (country): " + Simple.country);
    }
}
