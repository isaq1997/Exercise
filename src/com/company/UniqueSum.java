package com.company;

import java.util.ArrayList;

public class UniqueSum {
    public static void main(String[] args) {
        int arr[]={7,4,2,3,2};
        int sum=0;
        ArrayList<Integer>arr1=new ArrayList<Integer>();
        int k;
        for (int i=0;i<arr.length;i++){
            k=0;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]!=arr[j]){

                    k++;
                    if ( k==arr.length-i-1){
                        arr1.add(arr[i]);
                  }
                }


            }
        }
        for (int i=0;i<arr1.size();i++) {

            sum=sum+arr1.get(i);

        }
        System.out.println(sum);
    }
}
