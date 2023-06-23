package com.company;

public class SelectionSort {
    public static void main(String[] args){
        int[]arr={0,2,3,1,7,6,5};
        int n=arr.length;
        int minindx=0;
        for(int i=0;i<n-1;i++){
            minindx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindx]){
                    minindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindx];
            arr[minindx]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
