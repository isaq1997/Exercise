package com.company;

import java.util.HashMap;

public class CountLetterInWord {
    public static void main(String[] args) {
        String s="salamm";
        int k=0;
        HashMap<Character,Integer>hashMap=new HashMap<Character, Integer>();
        for (int i=0;i<s.length();i++){
            for (int j=0;j<s.length();j++){
                 if(s.charAt(i)==s.charAt(j)){
                     k++;
                 }
            }
            hashMap.put(s.charAt(i),k);
            k=0;
        }
        System.out.println(hashMap);
    }
}
