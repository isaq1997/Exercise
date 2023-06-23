package com.company;

public class SecondLargest
{
    public static void main(String[] args) {
        int arr[] = {11,3, 6,2, 4,9, 1, 5, 7,8,10};
        int n = arr[0];
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int x=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=x;
                    //System.out.println(arr[i]);
                }

            }

        }

            System.out.println(arr[arr.length-2]);



    }

}
