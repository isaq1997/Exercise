package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,1};
        List<Integer> list =Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> list1 = new HashSet<>(list);
       // Collections.addAll(list1, nums);

        if (list1.size()!=list.size()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println(list);
    }
}
