package com.company;

import java.util.ArrayList;

public class SumTargetNum {
    public static void main(String[] args) {
        int []arr={1,2,3,5,6,10,7,23};
        int target=9;

        ArrayList<ArrayList<Integer>> arr2=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            ArrayList<Integer>arr1=new ArrayList<Integer>();
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    arr1.add(arr[i]);
                    arr1.add(arr[j]);
                    arr2.add(arr1);
                }
            }
        }
        System.out.println(arr2);

    }
}
