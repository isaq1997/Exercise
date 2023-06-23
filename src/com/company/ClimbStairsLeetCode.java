package com.company;

public class ClimbStairsLeetCode {
    public static int climbStairs(int n) {
        int a1 = 1;
        int a2 = 2;
        int res = 0;
        //int n=3;

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        for (int i = 1; i <= n - 2; i++) {
            res = a1 + a2;
            a1 = a2;
            a2 = res;
        }
        return res;
    }
        public static void main(String[] args) {
            System.out.println(climbStairs(6));

    }
}
