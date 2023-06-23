package com.company;

import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> paths = new ArrayList<ArrayList<String>>();
        ArrayList<String>nums=new ArrayList<>();
        ArrayList<String>nums1=new ArrayList<>();
        paths.add(new ArrayList<>(Arrays.asList("Lima","Sao Paulo")));
        int k=0;

        paths.add(new ArrayList<>(Arrays.asList("London","New York")));
        paths.add(new ArrayList<>(Arrays.asList("New York","Lima")));
        for (int i=0;i< paths.size();i++){
            nums.add(paths.get(i).get(0));
            nums.add(paths.get(i).get(1));
        }
        for (int k1=0;k1< nums.size();k1++) {
            int b=Collections.frequency(nums, nums.get(k1));
            if((b==1)&&(k1%2==1))
                nums1.add(nums.get(k1));
            }
        System.out.println(nums1.get(0));
        }


        }


