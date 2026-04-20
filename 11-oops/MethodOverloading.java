class Calc {
    // Method with 2 int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method Overloading: Same name 'add', but 3 int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method Overloading: Same name 'add', but 4 int parameters
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Method Overloading: Different data types (double)
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calc obj = new Calc();

        // Calling 2-parameter int add
        int res1 = obj.add(2, 5);
        System.out.println("Sum of 2 numbers: " + res1);

        // Calling 3-parameter int add
        int res2 = obj.add(2, 5, 5);
        System.out.println("Sum of 3 numbers: " + res2);

        // Calling 4-parameter int add
        int res3 = obj.add(2, 5, 6, 7);
        System.out.println("Sum of 4 numbers: " + res3);

        // Calling 3-parameter double add
        double res4 = obj.add(2.5, 4.5, 5.6);
        System.out.println("Sum of 3 doubles: " + res4);
    }
}
