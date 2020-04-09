public class Calculator {

    public long sumOfEvenNumbersInFibonacciSequenceToLimit(long limit) {
        long firstNumber = 0;
        long secondNumber = 1;
        long sum = 0;
        long evenSum = 0;

        while (true) {
            sum = firstNumber + secondNumber;
            if (sum > limit) {
                return evenSum;
            } else {
                if (sum % 2 == 0) {
                    evenSum += sum;
                }
                firstNumber = secondNumber;
                secondNumber = sum;
            }
        }
    }

}
