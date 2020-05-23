package com.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * backtracking
 */

public class PalindromePartition {

    public static void main(String args[]){
        partition("aaba").stream().forEach(x-> System.out.println(x));
    }

    public static  List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s, 0);
        return list;
    }

    public static void backtrack(List<List<String>> list, List<String> tempList, String s, int pos){
        if(pos == s.length())
            list.add(new ArrayList<>(tempList));
        else{
            for(int i = pos; i < s.length(); i++){
                if(isPalindrome(s, pos, i)){
                    tempList.add(s.substring(pos, i + 1));
                    backtrack(list, tempList, s, i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    public static boolean isPalindrome(String s, int low, int high){
        while(low < high)
            if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;
    }
}
