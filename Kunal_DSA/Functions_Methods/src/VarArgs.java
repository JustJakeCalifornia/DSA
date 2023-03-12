public class VarArgs {
    public static void printNames(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        printNames("Alice", "Bob", "Charlie"); // prints "Alice", "Bob", "Charlie"
        printNames("Dave"); // prints "Dave"
        printNames(); // prints nothing
    }
}
