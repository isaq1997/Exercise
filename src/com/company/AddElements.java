package com.company;

public class AddElements {
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        String a="";
        for (int i=s.length();i<t.length();i++){
            a=a+t.charAt(i);
        }
        System.out.println(a);
    }
}
