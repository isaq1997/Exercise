package com.company;

import java.util.ArrayList;

public class SumTargetNum2 {
    public static  int[]twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int k=0;
        for (int i=0;i<nums.length;i++){

            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;


                }
            }
        }
        return a;

    }
    public static void main(String[] args) {
        int []arr={1,3,5,6,10,7,23};
        int target=9;

        for (int i=0;i<twoSum(arr,target).length;i++) {
            System.out.println(twoSum(arr,target)[i]);
        }
        String string="3";
       int intValue = Integer.parseInt(string);

    }
}
