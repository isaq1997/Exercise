package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPref {


    public static void main(String[] args) {
        String []strs={"flow","fofoflight","fffffffffffffffloor"};

        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        System.out.println(s1+" "+s2);
        int i=0;
        while (i<s1.length()&&i<s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else
            {
                break;
            }

        }
        System.out.println(s1.substring(0,i));

    }
}
