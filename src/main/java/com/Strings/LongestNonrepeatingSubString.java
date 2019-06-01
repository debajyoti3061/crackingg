package com.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestNonrepeatingSubString {
    public static void main(String args[]){
        String x= "abcdedf";
        System.out.println(findlongest(x));
    }

    private static int findlongest(String x) {
        int start =0;
        int end=0;
        int max=0;
        Set<Character> set= new HashSet<>();
        while(end<x.length()){
            if(set.add(x.charAt(end))){
                max = Math.max(max,end-start);
            }else{
                set.remove(x.charAt(start));
                start++;
            }
            end++;
        }

        return max;
    }

}
