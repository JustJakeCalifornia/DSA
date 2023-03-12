public class Shadowing {
    int x = 5; // outer variable

    public void printX() {
        System.out.println("Outer x: " + x); // prints "Outer x: 5"
        int x = 10; // inner variable
        System.out.println("Inner x: " + x); // prints "Inner x: 10"
    }

    public static void main(String[] args) {
        Shadowing example = new Shadowing();
        example.printX();
    }
}
