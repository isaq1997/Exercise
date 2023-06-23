package com.company;

public class LambdaSumm {
    public static void main(String[] args) {
        SumCalculator sum=(a,b)->a+b;
        int result = sum.getSum(4,5);
        System.out.println(result);

    }

}
