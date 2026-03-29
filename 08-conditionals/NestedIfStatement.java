public class NestedIfStatement {
    public static void main(String[] args) {

        System.out.println("====== Weather Decision App ======");
        
        // You can change these values to test all 3 scenarios:
        // Scenario 1: temp = 32, humidity = 80 -> Output: "खराब मौसम"
        // Scenario 2: temp = 35, humidity = 50 -> Output: "बढ़िया मौसम"
        // Scenario 3: temp = 20, humidity = 80 -> Output: "नॉर्मल मौसम" (Ignores humidity entirely)
        
        int temperature = 32; 
        int humidity = 80;    

        System.out.println("Processing Temp: " + temperature + " and Humidity: " + humidity);
        System.out.println("----------------------------------");

        // OUTER IF: Check Temperature first
        if (temperature > 30) {
            
            // We only enter this block if temperature is strictly greater than 30!
            
            // INNER IF: Now check Humidity
            if (humidity > 70) {
                System.out.println("Result: मौसम बहुत खराब है (High Heat + High Humidity)");
            } else {
                System.out.println("Result: मौसम बढ़िया है (Warm, but manageable)");
            }

        } else {
            // If the Outer condition fails (temp <= 30), we jump straight down here!
            // The inner if-else block is completely ignored.
            System.out.println("Result: मौसम नॉर्मल है (Cool/Moderate)");
        }

        System.out.println("==================================");
    }
}
