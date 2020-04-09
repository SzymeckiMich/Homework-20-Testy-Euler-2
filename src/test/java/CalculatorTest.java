import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator systemUnderTest = new Calculator();

    @DisplayName("Should return 10 when limit is 9")
    @Test
    void shouldReturnTenWhenLimitIsNine(){
        //given
        final int limit = 9;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(limit);
        //then
        long expectedValue = 10;

        assertEquals(expectedValue, result);
    }

    @DisplayName("Should return 188 when limit is 100")
    @Test
    void shouldReturn188WhenLimitIsOneHundred(){
        //given
        final int limit = 100;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(limit);
        //then
        long expectedValue = 44;

        assertEquals(expectedValue, result);
    }

    @DisplayName("Should return 0 when limit is -1")
    @Test
    void shouldReturnZeroWhenLimitIsMinusOne() {
        //given
        final int limit = -1;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(limit);
        //then
        long expectedValue = 0;

        assertEquals(expectedValue, result);
    }

    @DisplayName("Should return 0 when limit is 0")
    @Test
    void shouldReturnZeroWhenLimitIsZero() {
        //given
        final int limit = 0;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(limit);
        //then
        long expectedValue = 0;

        assertEquals(expectedValue, result);
    }

    @DisplayName("Should return 4613732 when limit is 4_000_000")
    @Test
    void shouldReturn4613732WhenLimitIsFourMillions() {
        //given
        final int limit = 4000000;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(limit);
        //then
        long expectedValue = 4613732;

        assertEquals(expectedValue, result);
    }
}
