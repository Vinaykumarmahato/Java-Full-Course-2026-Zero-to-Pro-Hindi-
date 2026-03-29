// File: DataTypeInJava.java -> Code created from the Data Types Transcript

class DataTypeInJava {
    public static void main(String[] args) {
        
        // 1. byte (1 byte = 8 bits) - Great for small numbers
        byte age = 10;
        System.out.println("Age (byte): " + age);
        
        // 2. short (2 bytes = 16 bits) - Medium size numbers
        short students = 10000;
        System.out.println("Total Students (short): " + students);
        
        // 3. int (4 bytes = 32 bits) - Default integer type for standard numbers
        int population = 24000;
        System.out.println("City Population (int): " + population);
        
        // 4. long (8 bytes = 64 bits) - Notice the 'L' at the end for huge numbers!
        long largePopulation = 8000000000L; 
        System.out.println("World Population (long): " + largePopulation);
        
        // 5. String (Non-primitive) - For text / characters sequence
        String name = "Vinay";
        System.out.println("Name (String): " + name);
        
        // 6. boolean (1 bit logical) - For True/False checks
        boolean isOn = true;
        System.out.println("Is the switch ON? (boolean): " + isOn);
    }
}
