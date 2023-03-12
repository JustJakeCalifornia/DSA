package main.test;

import main.MaximumMinimumNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.*;

public class MaximumMinimumNumbersTest {
    @Test
    public void testThreeGivenNumbersWhenValidatingMaximum() {
        int[] numbers = {3, 5, 1};
        int actualValue = MaximumMinimumNumbers.getMaximum(numbers);
        int expectedValue = 5;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFourGivenNumbersWhenValidatingMaximum() {
        int[] numbers = {3, 5, 1, 4};

        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            MaximumMinimumNumbers.getMaximum(numbers);
        });

        String actualMessage = exception.getMessage();
        String expectedMessage = "You are not allowed to pass more than 3 numbers at a time!";

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testThreeGivenNumbersWhenValidatingMinimum() {
        int[] numbers = {3, 5, 1};
        int actualValue = MaximumMinimumNumbers.getMinimum(numbers);
        int expectedValue = 1;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFourGivenNumbersWhenValidatingMinimum() {
        int[] numbers = {3, 5, 1, 4};

        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            MaximumMinimumNumbers.getMinimum(numbers);
        });

        String actualValue = exception.getMessage();
        String expectedValue = "You are not allowed to pass more than 3 numbers at a time!";

        Assertions.assertTrue(actualValue.contains(expectedValue));
    }
}
