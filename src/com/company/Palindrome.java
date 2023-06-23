package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
      //  int ga[]={1,2,32,44};
        String a="12133121";
        int k=0;
        for (int i=0;i<a.length()/2;i++){
            if(a.charAt(i)==a.charAt(a.length()-i-1)){
                k++;


            }
        }
        if (k==a.length()/2){

            System.out.println("Yes");
        }
        else {
            System.out.println("Yesn't");

        }

     //   System.out.println(Arrays.stream(ga).count());


    }
}
