package javadev;

public class SumCalculator {

    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Please, input number > 0");
        }
        if (n == 1) return 1;

        return n + sum(n - 1);
    }
}