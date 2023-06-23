package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaOddEven {
    public static void main(String[] args) {
        List nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
       /* for (Object x : nums) {
            System.out.print(x+ " ");
        }

        List evenNums=nums.stream().filter(n->n%2==0).collect(Collectors.toList());
        */
    }
}
