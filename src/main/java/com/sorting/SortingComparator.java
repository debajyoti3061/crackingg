package com.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortingComparator {
    public static void main(String args[]){
        String a[] = {"abc","skee","fdsen","dsfu","aa"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        /*Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });*/

        Arrays.sort(a,(o1,o2)->Integer.compare(o1.length(),o2.length()));
        System.out.println(Arrays.toString(a));

    }
}
