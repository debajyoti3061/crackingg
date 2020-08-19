package com.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestNonrepeatingSubString {
    public static void main(String args[]){
        String x= "babbbb";
        System.out.println(findlongest(x));
    }

    private static int findlongest(String s) {
        int n=s.length();
        Set<Character> set=new HashSet<Character>();
        int i=0;
        int j=0;
        int ans=0;
        while(i<n && j<n){

            if(set.add(s.charAt(j))){
                ans=Math.max(ans, j-i+1);
                j++;
            } else{
                set.remove(s.charAt(i));
                i++;
            }

        }

        return ans;
    }

}
