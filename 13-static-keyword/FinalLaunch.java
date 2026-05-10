class Demo {
    static int a;
    static int b;
    
    int x;
    int y;

    // Static Block
    static {
        a = 20;
        b = 30;
        System.out.println("Control in static block");
        System.out.println("Addition of a and b in static block: " + (a + b));
    }

    // Non-Static Block (Initialization Block)
    {
        x = 100;
        y = 30;
        System.out.println("Control in non-static block");
        System.out.println("Addition of x and y in non-static block: " + (x + y));
    }

    static void show1() {
        System.out.println("Control in static method show1");
    }

    void show2() {
        System.out.println("Control in non-static method show2");
    }
}

public class FinalLaunch {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Static members are already initialized during class loading
        Demo.show1();

        System.out.println("-------------------------");
        
        // Creating object triggers non-static block
        Demo d = new Demo();
        d.show2();
        
        System.out.println("Main method ended");
    }
}
