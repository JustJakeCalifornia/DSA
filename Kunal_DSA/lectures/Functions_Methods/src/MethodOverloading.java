public class MethodOverloading {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int intSum = sum(1, 2);                     // calls the first method
        double doubleSum = sum(1.5, 2.5);          // calls the second method
        System.out.println("intSum: " + intSum);        // prints: 3
        System.out.println("doubleSum: " + doubleSum); // prints: 4.0
    }
}
