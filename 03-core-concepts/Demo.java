// File: Demo.java -> Example of Statically Typed Language (Java)
class Demo {
    public static void main(String[] args) {
        // We MUST declare the Data Type (String, int) before using the variable!
        String name = "Vinay";
        System.out.println(name);
        
        int a = 10;
        System.out.println(a);
        
        // --- Compile Time Error Example ---
        // If we try to assign a String to an integer variable like this:
        // a = "Kumar"; 
        // Java will immediately throw an error before the program even runs!
        // This makes Java "Statically Typed".
    }
}
