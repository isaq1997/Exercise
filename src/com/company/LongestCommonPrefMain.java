package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class LongestCommonPrefMain {


    public static void main(String[] args) {
        int k=0;
        String a="";
        String []strs={"aa","aa"};
        ArrayList<String>arr=new ArrayList<String>();
        ArrayList<String>arr1=new ArrayList<String>();
        for (int i=0;i<strs.length;i++){
            for (int j=0;j<strs[i].length();j++) {

                arr.add(strs[i].substring(0, j+1));
            }
        }

        Set<String> distinct = new HashSet<>(arr);
        for (String s: distinct) {
            int b=Collections.frequency(arr, s);
            if(b==strs.length){
                arr1.add(s);
            }
        }
        if (arr1.size()==0) {
            System.out.println("");
        }
        else {
            System.out.println(arr1.stream().max(Comparator.comparingInt(String::length)).get());
        }

    }
}
