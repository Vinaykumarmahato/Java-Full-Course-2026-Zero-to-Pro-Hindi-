// File: TypeCasting.java

public class TypeCasting {
    public static void main(String[] args) {
        
        System.out.println("=== 1. IMPLICIT TYPE CASTING ===");
        byte a = 10;
        int b = a; // No issue, moving 1 byte into 4 bytes.
        System.out.println("Implicit Cast (byte to int): " + b);
        
        
        System.out.println("\n=== 2. EXPLICIT TYPE CASTING ===");
        int intValue = 10;
        // byte byteValue = intValue; // ERROR: Type mismatch: cannot convert from int to byte
        byte byteValue = (byte) intValue; // Explicit declaration "Trust me, I know what I'm doing"
        System.out.println("Explicit Cast (int to byte): " + byteValue);
        
        
        System.out.println("\n=== 3. OUT OF RANGE CASTING (WRAP AROUND) ===");
        int bigValue1 = 256;
        byte forcedByte1 = (byte) bigValue1; // 256 % 256 = 0
        System.out.println("256 casted to byte: " + forcedByte1);
        
        int bigValue2 = 576;
        byte forcedByte2 = (byte) bigValue2; // 576 % 256 = 64
        System.out.println("576 casted to byte: " + forcedByte2);
        
        
        System.out.println("\n=== 4. TRUNCATION (Rounding towards zero) ===");
        float floatNum = 5.6f;
        int truncInt = (int) floatNum; // The .6 gets truncated off!
        System.out.println("Float 5.6f casted to int: " + truncInt);
        

        System.out.println("\n=== 5. INTEGER DIVISION TRUNCATION ===");
        int n1 = 12;
        int n2 = 5;
        // Even though it's stored in a float, (12/5) operation stays as int initially!
        float divideResult = n1 / n2; 
        System.out.println("Result of (int 12 / int 5) stored in float: " + divideResult); // Prints 2.0 instead of 2.4
        
        
        System.out.println("\n=== 6. TYPE PROMOTION ===");
        byte byteX = 30;
        byte byteY = 40;
        // byteX * byteY equals 1200. Even though they are bytes, JVM promotes them to int!
        int multiplicationResult = byteX * byteY;
        System.out.println("Type Promotion (byte * byte stored in int): " + multiplicationResult);
    }
}
