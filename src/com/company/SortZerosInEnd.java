package com.company;

public class SortZerosInEnd {
    public static void main(String[] args) {
        int arr[]={0,3,2,0,4,1,5,3};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
