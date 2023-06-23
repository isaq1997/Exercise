package com.company;

import java.util.Arrays;
import java.util.List;

public class LambdaSummProduct {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);
        int product=nums.stream().reduce(1,(x,y)->x*y);
        int summ=nums.stream().reduce(1,(x,y)->x+y);
        System.out.println(product);
        System.out.println(summ);
    }
}
