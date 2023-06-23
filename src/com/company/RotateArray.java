package com.company;

public class RotateArray {
    public static void main(String[] args) {
        int []arr={3,4,1,2,6};
        int []arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[(i+1)%arr.length]=arr[i];
        }

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
