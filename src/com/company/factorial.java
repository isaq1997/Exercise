package com.company;

import java.util.function.LongUnaryOperator;

interface factorialint{

}

public class factorial {
    public static void main(String[] args) {
        LongUnaryOperator factorial = n -> {
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        // Calculate the factorial of a number using the lambda expression
        long n = 7;
        long factorial_result = factorial.applyAsLong(n);
        System.out.println(factorial_result);
    }
}
