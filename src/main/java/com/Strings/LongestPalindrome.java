package com.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

  public static int longestPalindrome(String s) {
    if(s==null || s.length()==0) return 0;
    Set<Character> hs = new HashSet<>();
    int count = 0;
    for(int i=0; i<s.length(); i++){
      if(hs.contains(s.charAt(i))){
        hs.remove(s.charAt(i));
        count++;
      }else{
        hs.add(s.charAt(i));
      }
    }
    if(!hs.isEmpty()) return count*2+1;
    return count*2;
  }

  public  static void main(String[] args){
    System.out.println(longestPalindrome("helloe"));
  }
}
