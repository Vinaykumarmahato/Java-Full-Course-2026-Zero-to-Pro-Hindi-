// ⏱️ Topic: Copy Constructor & Private Constructor
// (These are usually discussed right after Chaining as the 6th and 7th types)

public class CH06_CopyAndPrivateConstructor {
    public static void main(String[] args) {
        
        System.out.println("---- Copy Constructor ----");
        // Creating Original Object
        StudentCopy original = new StudentCopy("Rahul", 22);
        
        // Cloning Original into a completely new Object
        StudentCopy clone = new StudentCopy(original);
        System.out.println("Original: " + original.name);
        System.out.println("Clone: " + clone.name);

        System.out.println("\n---- Private Constructor ----");
        // SecretDatabase db = new SecretDatabase(); // ERROR! Cannot create object directly.
        
        // Must use the static method to get an instance
        SecretDatabase db = SecretDatabase.getInstance();
        db.showMessage();
    }
}

// ---- Type 6: Copy Constructor ----
class StudentCopy {
    String name;
    int age;

    // Normal Parameterized Constructor
    StudentCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 🌟 Copy Constructor
    StudentCopy(StudentCopy oldObj) {
        this.name = oldObj.name;
        this.age = oldObj.age;
    }
}

// ---- Type 7: Private Constructor ----
class SecretDatabase {
    // 🌟 Private Constructor
    private SecretDatabase() {
        System.out.println("Secret Database object created internally.");
    }

    public static SecretDatabase getInstance() {
        // Can access private constructor since it's within the same class
        return new SecretDatabase();
    }

    public void showMessage() {
        System.out.println("Secure connection established.");
    }
}
