package com.company;

public class insertToIndex {
    public static void main(String[] args) {
        int []arr={3,2,4,5,6};
        int []arr2=new int[arr.length+1];
        int idx=2;
        int n=7;
       for(int i=idx+1, y=0;i<arr.length+1;y++,i++){
            arr2[y]=arr[y];
            arr2[i]=arr[i-1];
           System.out.println("i "+i);
           System.out.println("y "+y);

        }
        arr2[idx]=n;
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
}
