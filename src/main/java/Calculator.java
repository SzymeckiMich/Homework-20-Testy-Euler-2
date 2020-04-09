public class Calculator {

    public long sumOfEvenNumbersToLimit(long limit) {
        long firstNumber = 0;
        long secondNumber = 1;
        long sum = 0;
        long evenSum = 0;

        while (sum <= limit) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            if (sum % 2 == 0) {
                evenSum += sum;
            }
        }
        return evenSum;
    }

}
