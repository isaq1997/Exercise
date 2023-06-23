package com.company;

public class ReverseKtimes {
    public static void main(String[] args) {
        int arr[]={3,4,5,6};
        for (int k=1;k<=3;k++) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = arr[(arr.length - 1)];
                arr[(arr.length - 1)] = temp;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
