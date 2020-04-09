import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator systemUnderTest = new Calculator();

    @DisplayName("Should return 10 when limit is 9")
    @Test
    void shouldReturnTenWhenLimitIsNine(){
        //give
        final int LIMIT = 9;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(LIMIT);
        long expectedValue = 10;

        //then
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Should return 188 when limit is 100")
    @Test
    void shouldReturn188WhenLimitIsOneHundred(){
        //give
        final int LIMIT = 100;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(LIMIT);
        long expectedValue = 188;

        //then
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Should return 0 when limit is -1")
    @Test
    void shouldReturnZeroWhenLimitIsMinusOne() {
        //give
        final int LIMIT = -1;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(LIMIT);
        long expectedValue = 0;

        //then
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Should return 0 when limit is 0")
    @Test
    void shouldReturnZeroWhenLimitIsZero() {
        //give
        final int LIMIT = 0;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(LIMIT);
        long expectedValue = 0;

        //then
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Should return 4613732 when limit is 4_000_000")
    @Test
    void shouldReturn4613732WhenLimitIsFourMillions() {
        //give
        final int LIMIT = 4000000;

        // when
        long result = systemUnderTest.sumOfEvenNumbersInFibonacciSequenceToLimit(LIMIT);
        long expectedValue = 4613732;

        //then
        Assertions.assertEquals(expectedValue, result);
    }
}
