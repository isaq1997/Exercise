package com.company;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class GroupAnagrams {

    public static double get_ascii_sum(String strs){
        int sum=0;
        double a=0;

        for (int i=0;i< strs.length();i++){
            sum=sum+strs.charAt(i);
            a=a+ (double) 1 /strs.charAt(i);

        }
        return sum+a;
    }
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        Map<Double, List<String>> mpp=new HashMap<>();

        List<String>arr=new ArrayList<>();
        List<List<String>> words=new ArrayList<>();
        double sum;
        for (String str : strs) {

            sum = get_ascii_sum(str);

            if (mpp.get(sum) == null) {
                arr = new ArrayList<>();
            } else {
                arr = mpp.get(sum);
            }


            mpp.getOrDefault(sum, arr).add(str);

            mpp.put(sum, arr);
        }
        for (Double key : mpp.keySet()) {
            words.add(mpp.get(key));
        }
        System.out.println(words);
    }
}