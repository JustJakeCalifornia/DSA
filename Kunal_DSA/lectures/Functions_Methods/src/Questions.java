import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean isPrime = isPrime(n);
        System.out.println("isPrime: " + isPrime);

        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println("isAmstrong: " + i);
            }
        }
    }

    // based on previous flow chart of this algorithm
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    // Armstrong numbers: Print all the 3 digits armstrong numbers
    private static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
            sum += remainder*remainder*remainder;
        }
        return sum == original;
    }
}
