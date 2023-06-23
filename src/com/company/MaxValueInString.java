package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxValueInString {
    public static boolean isNumeric(String string) {
        int intValue;


        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        String []strs = {"alic3","bob","3","4","00000"};
        for (int i=0;i< strs.length;i++){
            if (isNumeric(strs[i])) {
                arr.add(Integer.valueOf(strs[i]));
            }
            else{
                arr.add(strs[i].length());

            }

        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));

    }
}
