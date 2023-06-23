package com.company;

public class FirstPalindrome {
    public static String reverseString(String s){
        char ch;
        String nstr="";

        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        return nstr;
    }
    public static void main(String[] args) {
        String[] words={"abc","a","car","ada","racecar","cool"};
        String u="";
        m:for (int i=0;i<words.length;i++) {
            for (int j=0;j<words[i].length();j++) {
                 if(words[i].equals(reverseString(words[i]))){
                     u=words[i];
                     break m;
                 }
            }
        }
        System.out.println(u);
    }
}
