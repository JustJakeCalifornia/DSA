package main;

import javax.management.RuntimeErrorException;
import java.lang.*;
import java.util.Scanner;

public class MaximumMinimumNumbers {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1};

        int maximumResult = getMaximum(numbers);
        System.out.println("Maximum: " + maximumResult);

        int minimumResult = getMinimum(numbers);
        System.out.println("Minimum: " + minimumResult);
    }

    public static int getMaximum(int[] numbers) {
        checkTestNumbersLength(numbers);

        int temp = numbers[0];
        int result = 0;

        if (temp < numbers[1]) {
            temp = numbers[1];
        }
        if (temp < numbers[2]) {
            temp = numbers[2];
        }
        result = temp;
        return result;
    }

    public static int getMinimum(int[] numbers) {
        checkTestNumbersLength(numbers);

        int temp = numbers[0];
        int result = 0;

        if (temp > numbers[1]) {
            temp = numbers[1];
        }
        if (temp > numbers[2]) {
            temp = numbers[2];
        }
        result = temp;
        return result;
    }

    private static void checkTestNumbersLength(int[] numbers) {
        if (numbers.length > 3) {
            throw new RuntimeException("You are not allowed to pass more than 3 numbers at a time!");
        }
    }
}
